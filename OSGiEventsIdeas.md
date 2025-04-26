# OSGi Events with ILCD


# OSGi Events in SCR Framework: Practical Use Cases & Examples

This document collects advanced, real-world ways to use OSGi events in your CPI SCR Framework, with code examples using the new `Framework_API.fireOSGiEvent` and `registerOSGiEventHandler` methods.

---

## 1. Centralized Audit/Event Trail
**Pattern:** Decouple audit logging from your main flows. Capture all errors, warnings, or business events in one place—even if the iFlow terminates early.

**Integration Point:**
```groovy
// In Framework_Logger.groovy or Framework_ExceptionHandler.groovy
Framework_API.fireOSGiEvent("SCR.Audit", [
    messageId: message.getProperty("SAP_MessageProcessingLogID"),
    eventType: "ERROR",
    errorMessage: logEntry.text,
    timestamp: System.currentTimeMillis()
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.Audit") { event ->
    saveAuditEvent(event.properties)
}
```

---

## 2. Dynamic Feature Toggles / Runtime Configuration
**Pattern:** Change logging level, enable/disable features, or update value maps at runtime—across all iFlows—without redeployment.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.ConfigUpdate", [
    configKey: "logLevel",
    newValue: "DEBUG"
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.ConfigUpdate") { event ->
    if (event.properties.configKey == "logLevel") {
        GLOBAL_LOG_LEVEL.value = event.properties.newValue
    }
}
```

---

## 3. Cross-iFlow or Cross-Process Correlation
**Pattern:** Coordinate compensation, rollback, or notification logic across multiple iFlows (e.g., after a soft error in one, trigger a cleanup in another).

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.Correlation", [
    correlationId: message.getProperty("OrderID"),
    eventType: "SoftError",
    details: "Order validation failed"
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.Correlation") { event ->
    if (event.properties.eventType == "SoftError") {
        triggerCompensation(event.properties.correlationId)
    }
}
```

---

## 4. Asynchronous Notification/Alerting
**Pattern:** Send notifications (email, SMS, webhook) on critical events without blocking your main process.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.Alert", [
    alertType: "ValidationFailure",
    payload: message.getBody(String),
    timestamp: System.currentTimeMillis()
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.Alert") { event ->
    sendAlert(event.properties.alertType, event.properties.payload)
}
```

---

## 5. Custom Metrics and Health Monitoring
**Pattern:** Emit metrics for monitoring (e.g., error rates, processing time, validation pass/fail) to a dashboard.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.Metric", [
    metric: "SoftErrorCount",
    value: 1,
    timestamp: System.currentTimeMillis()
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.Metric") { event ->
    incrementMetric(event.properties.metric, event.properties.value)
}
```

---

## 6. Distributed Cache Invalidation
**Pattern:** When a value map or config changes in one iFlow, invalidate cached values in all others.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.CacheInvalidation", [
    cacheKey: "ValueMap:MyMap"
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.CacheInvalidation") { event ->
    CACHE.invalidate(event.properties.cacheKey)
}
```

---

## 7. Distributed Transaction/Workflow Coordination
**Pattern:** Orchestrate multi-step, multi-iFlow processes (e.g., saga pattern) by emitting and listening for workflow events.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.WorkflowStep", [
    sagaId: "SAGA-123",
    step: "PaymentCompleted"
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.WorkflowStep") { event ->
    if (event.properties.step == "PaymentCompleted") {
        continueSaga(event.properties.sagaId)
    }
}
```

---

## 8. Real-time Debug/Trace Hook
**Pattern:** Enable deep, on-demand tracing in production by firing trace events only when a debug flag is set.

**Integration Point:**
```groovy
if (DEBUG_ENABLED) {
    Framework_API.fireOSGiEvent("SCR.Trace", [
        tracePoint: "beforeValidation",
        payload: message.getBody(String)
    ])
}
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.Trace") { event ->
    logTrace(event.properties.tracePoint, event.properties.payload)
}
```

---

## 9. Automated Test/Replay Hooks
**Pattern:** Capture events during production runs for later automated replay/testing.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.TestReplay", [
    step: "validation",
    input: message.getBody(String),
    timestamp: System.currentTimeMillis()
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.TestReplay") { event ->
    saveForReplay(event.properties)
}
```

---

## 10. Self-Healing/Auto-Remediation
**Pattern:** When a recurring error is detected, fire an event that triggers a self-healing script or iFlow.

**Integration Point:**
```groovy
Framework_API.fireOSGiEvent("SCR.SelfHeal", [
    errorType: "DBConnectionLost",
    context: ...
])
```
**Handler Example:**
```groovy
Framework_API.registerOSGiEventHandler("SCR.SelfHeal") { event ->
    attemptRemediation(event.properties.errorType, event.properties.context)
}
```

---

## Summary Table

| Use Case                       | Event Topic             | Example Handler Action                 |
|--------------------------------|------------------------|----------------------------------------|
| Centralized Audit Trail         | SCR.Audit              | Write to DB/file/API                   |
| Dynamic Config/Feature Toggle   | SCR.ConfigUpdate       | Update in-memory config                |
| Cross-iFlow Correlation         | SCR.Correlation        | Trigger compensation/cleanup           |
| Async Notification/Alerting     | SCR.Alert              | Send email/SMS/webhook                 |
| Custom Metrics/Health           | SCR.Metric             | Push to dashboard                      |
| Distributed Cache Invalidation  | SCR.CacheInvalidation  | Invalidate local cache                 |
| Workflow Coordination (Saga)    | SCR.WorkflowStep       | Continue/rollback workflow             |
| Real-time Debug/Trace           | SCR.Trace              | Log or stream trace info               |
| Automated Test/Replay           | SCR.TestReplay         | Save for replay/testing                |
| Self-Healing/Auto-Remediation   | SCR.SelfHeal           | Run remediation logic                  |

---

## Advanced Tips
- You can register for multiple topics at once by passing a list to `registerOSGiEventHandler`.
- Use event properties to pass context, correlation IDs, or payloads.
- Event handlers can be registered/unregistered dynamically at runtime.
- Combine with DataStore or external APIs for persistent, distributed state.
- Use OSGi events for "fire-and-forget" side effects, not for synchronous control flow in CPI scripts.

---

**With these patterns, your SCR Framework is ready for robust, decoupled, event-driven extensions in CPI and beyond!**



1. Centralized Audit/Event Trail for Error and Log Events
Pattern:

When The Framework_Logger or Framework_ExceptionHandler detects a soft error, validation error, or critical log event, fire an OSGi event with relevant context (error type, message ID, payload snippet, user, etc).
Register a custom OSGi event handler bundle that listens for these events and writes them to an external audit store (DB, file, HTTP endpoint, etc) or triggers alerts.
Why it fits:

Keeps your main iFlow lean; offloads heavy or non-critical audit logic to a decoupled handler.
Ensures all errors and important events are captured, even if the iFlow terminates early.
Example integration point:
In Framework_Logger.groovy, after logging an error:

```groovy
fireOSGiEvent("SCR.ErrorEvent", [
    messageId: message.getProperty("SAP_MessageProcessingLogID"),
    errorType: this.logLevel,
    errorMessage: logEntry.text,
    timestamp: getTimestamp()
])
```
Handler listens for "SCR.ErrorEvent" and processes as needed.

2. Dynamic Feature Toggles or Runtime Configuration
Pattern:

Use OSGi events to broadcast configuration changes (e.g., log level, feature enable/disable, value maps) to all running scripts/bundles.
Scripts listen for config change events and update their in-memory state or message properties accordingly.
Why it fits:

The framework already uses constants and value maps; this lets you update them at runtime without redeploying.
Useful for toggling debug logging, enabling/disabling strict error checks, or changing validation rules on the fly.
Example integration point:

When a config change is made (by admin or external system), fire an event like "SCR.ConfigUpdate".
Scripts/bundles listen and update their local config cache.
3. Cross-iFlow or Cross-Process Correlation
Pattern:

Use OSGi events to coordinate or correlate processing across multiple iFlows or local integration processes.
For example, when a soft error is detected in one iFlow, fire an event that triggers compensating logic or cleanup in another iFlow.
Why it fits:

The framework is modular and may be deployed in multiple iFlows that need to coordinate error handling or state.
Example integration point:

In Framework_ExceptionHandler.groovy, when a specific error is detected:
```groovy
fireOSGiEvent("SCR.CorrelationEvent", [
    correlationId: message.getProperty("SomeCorrelationID"),
    eventType: "SoftError",
    details: ...
])
```
Other scripts/bundles listen for "SCR.CorrelationEvent" and act accordingly.
4. Asynchronous Notification/Alerting
Pattern:

When certain events occur (e.g., repeated soft errors, validation failures, or threshold breaches), fire an OSGi event to trigger asynchronous notifications (email, SMS, webhook, etc).
Keeps notification logic out of the main iFlow and allows for richer, more flexible alerting.
Why it fits:

The framework already centralizes error handling; this extends it to real-time ops without blocking the main flow.
Example integration point:

In any critical error path, add:
```groovy
fireOSGiEvent("SCR.Alert", [
    alertType: "ValidationFailure",
    payload: message.getBody(String),
    context: ...
])
```
Handler sends email/SMS/HTTP notification.
5. Custom Metrics/Health Monitoring
Pattern:

Fire OSGi events for metrics (e.g., number of soft errors, validation passes/fails, processing durations).
A separate metrics handler aggregates and pushes to a dashboard or monitoring system.
Why it fits:

The framework is robust and reusable; adding metrics via events keeps it decoupled and extensible.
Example integration point:

At end of processData or after major steps:
```groovy
fireOSGiEvent("SCR.Metric", [
    metric: "SoftErrorCount",
    value: 1,
    timestamp: System.currentTimeMillis()
])
```
How to Integrate
Add a simple fireOSGiEvent(String topic, Map props) utility to The framework.
Use it in logger, exception handler, or anywhere you want to emit a decoupled event.
Write a handler bundle/script that registers for your custom topics and processes the events as needed.
Summary Table
| Use Case | Where to Integrate | Benefit | |------------------------------|------------------------------------------|------------------------------------------| | Centralized Audit Trail | Logger/ExceptionHandler | Decoupled, reliable audit/logging | | Dynamic Config/Feature Flags | ValueMaps, Logger, ExceptionHandler | Runtime flexibility, no redeploy needed | | Cross-iFlow Correlation | ExceptionHandler, iFlow routers | Distributed coordination | | Async Notification/Alerting | Logger, ExceptionHandler | Non-blocking, extensible notifications | | Custom Metrics/Health | Any major step, processData, Logger | Real-time monitoring, decoupled metrics |


Here’s how you can extend Framework_API to support OSGi event publishing and (optionally) subscribing, in a way that is flexible for future use cases and minimizes the need for future edits:

1. Add OSGi Event Utility Methods
Add the following methods to Framework_API.groovy:


```groovy
import org.osgi.framework.FrameworkUtil
import org.osgi.service.event.Event
import org.osgi.service.event.EventAdmin

class Framework_API {
    {{ ...existing code... }}

    /**
     * Publishes an OSGi event with the given topic and properties.
     * @param topic (String) The event topic, e.g. "SCR.ErrorEvent"
     * @param props (Map)   Properties to include in the event
     * @return true if published, false otherwise
     */
    static boolean fireOSGiEvent(String topic, Map props = [:]) {
        try {
            def bundleCtx = FrameworkUtil.getBundle(Framework_API).getBundleContext()
            def eventAdminRefs = bundleCtx.getServiceReferences(EventAdmin.class.name, null)
            if (eventAdminRefs && eventAdminRefs.size() > 0) {
                def eventAdmin = bundleCtx.getService(eventAdminRefs[0])
                def event = new Event(topic, props)
                eventAdmin.postEvent(event) // async, or use sendEvent for sync
                return true
            }
        } catch (Exception e) {
            // Optionally log or handle error
        }
        return false
    }

    /**
     * Registers an OSGi event handler for a given topic.
     * Handler should be a Closure or object with handleEvent(Event) method.
     * @param topic (String or List) Topic(s) to listen for
     * @param handler (Closure or Object) Handler to call on event
     * @return ServiceRegistration reference (for later unregister)
     */
    static def registerOSGiEventHandler(def topic, def handler) {
        try {
            def bundleCtx = FrameworkUtil.getBundle(Framework_API).getBundleContext()
            def eventHandler = [
                handleEvent: { Event event -> handler(event) }
            ] as org.osgi.service.event.EventHandler
            def props = new Hashtable()
            props.put("event.topics", topic instanceof List ? topic as String[] : topic)
            return bundleCtx.registerService(org.osgi.service.event.EventHandler.class.name, eventHandler, props)
        } catch (Exception e) {
            // Optionally log or handle error
        }
        return null
    }
}
```

2. Usage Patterns
To fire an event:

```groovy
Framework_API.fireOSGiEvent("SCR.ErrorEvent", [
    messageId: message.getProperty("SAP_MessageProcessingLogID"),
    errorType: "SOFT_ERROR",
    errorMessage: "Something went wrong",
    timestamp: System.currentTimeMillis()
])
To register a handler (optional, for advanced use):

```groovy
def reg = Framework_API.registerOSGiEventHandler("SCR.ErrorEvent") { event ->
    // Do something with event.properties
}
// Later, to unregister:
reg?.unregister()
```

3. Why This Design?
fireOSGiEvent is a generic, reusable publisher for any topic and properties.
registerOSGiEventHandler allows you to easily add listeners for new event types without modifying the API again.
Both methods are static and self-contained, so you can call them from anywhere in The framework or iFlows.
You can build higher-level helpers (e.g., fireErrorEvent, fireConfigUpdateEvent) on top of these if desired, but you won’t need to touch the core API again.