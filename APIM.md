## Key Value Maps

### KVM Entry Values

```bash
GET /apiportal/api/1.0/Management.svc/KeyMapEntries('ISInternal')/keyMapEntryValues
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<feed
	xmlns="http://www.w3.org/2005/Atom"
	xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata"
	xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices" xml:base="https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/">
	<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntryValues</id>
	<title type="text">KeyMapEntryValues</title>
	<updated>2025-05-20T16:31:32.463Z</updated>
	<author>
		<name></name>
	</author>
	<link href="KeyMapEntryValues" rel="self" title="KeyMapEntryValues"></link>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntryValues(map_name='ISInternal',name='password')</id>
		<title type="text">KeyMapEntryValues</title>
		<updated>2025-05-20T16:31:32.463Z</updated>
		<category term="apiportal.KeyMapEntryValue" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntryValues(map_name='ISInternal',name='password')" rel="edit" title="KeyMapEntryValue"></link>
		<link href="KeyMapEntryValues(map_name='ISInternal',name='password')/keyMapEntry" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntry" title="keyMapEntry" type="application/atom+xml;type=entry"></link>
		<content type="application/xml">
			<m:properties>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-12T17:01:12.349</d:changed_at>
					<d:changed_by>spodila@its.jnj.com</d:changed_by>
					<d:created_at>2025-03-08T15:37:00.287</d:created_at>
					<d:created_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:created_by>
				</d:life_cycle>
				<d:map_name>ISInternal</d:map_name>
				<d:name>password</d:name>
				<d:value>*****</d:value>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntryValues(map_name='ISInternal',name='userName')</id>
		<title type="text">KeyMapEntryValues</title>
		<updated>2025-05-20T16:31:32.463Z</updated>
		<category term="apiportal.KeyMapEntryValue" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntryValues(map_name='ISInternal',name='userName')" rel="edit" title="KeyMapEntryValue"></link>
		<link href="KeyMapEntryValues(map_name='ISInternal',name='userName')/keyMapEntry" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntry" title="keyMapEntry" type="application/atom+xml;type=entry"></link>
		<content type="application/xml">
			<m:properties>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-12T17:01:12.439</d:changed_at>
					<d:changed_by>spodila@its.jnj.com</d:changed_by>
					<d:created_at>2025-03-12T17:01:12.359</d:created_at>
					<d:created_by>spodila@its.jnj.com</d:created_by>
				</d:life_cycle>
				<d:map_name>ISInternal</d:map_name>
				<d:name>userName</d:name>
				<d:value>*****</d:value>
			</m:properties>
		</content>
	</entry>
</feed>
```

### All KVM Entries

```bash
GET /apiportal/api/1.0/Management.svc/KeyMapEntries
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<feed
	xmlns="http://www.w3.org/2005/Atom"
	xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata"
	xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices" xml:base="https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/">
	<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries</id>
	<title type="text">KeyMapEntries</title>
	<updated>2025-05-20T16:33:33.9Z</updated>
	<author>
		<name></name>
	</author>
	<link href="KeyMapEntries" rel="self" title="KeyMapEntries"></link>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('S4AP_TIME_SOAMAN')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('S4AP_TIME_SOAMAN')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('S4AP_TIME_SOAMAN')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-08T15:37:58.896</d:changed_at>
					<d:changed_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:changed_by>
					<d:created_at>2025-03-08T15:37:58.896</d:created_at>
					<d:created_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:created_by>
				</d:life_cycle>
				<d:name>S4AP_TIME_SOAMAN</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('ISInternal')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('ISInternal')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('ISInternal')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-12T17:01:12.488</d:changed_at>
					<d:changed_by>spodila@its.jnj.com</d:changed_by>
					<d:created_at>2025-03-08T15:37:00.287</d:created_at>
					<d:created_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:created_by>
				</d:life_cycle>
				<d:name>ISInternal</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('S4_TIME_SOAMAN')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('S4_TIME_SOAMAN')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('S4_TIME_SOAMAN')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-18T00:57:25.503</d:changed_at>
					<d:changed_by>speders8@its.jnj.com</d:changed_by>
					<d:created_at>2025-03-08T15:53:50.491</d:created_at>
					<d:created_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:created_by>
				</d:life_cycle>
				<d:name>S4_TIME_SOAMAN</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('ICSM_Credentials')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('ICSM_Credentials')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('ICSM_Credentials')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-04-09T20:01:27.531</d:changed_at>
					<d:changed_by>sbussu@its.jnj.com</d:changed_by>
					<d:created_at>2025-04-09T20:01:27.531</d:created_at>
					<d:created_by>sbussu@its.jnj.com</d:created_by>
				</d:life_cycle>
				<d:name>ICSM_Credentials</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('intas_key')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('intas_key')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('intas_key')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-04-14T13:07:38.563</d:changed_at>
					<d:changed_by>spodila@its.jnj.com</d:changed_by>
					<d:created_at>2024-12-12T22:12:14.458</d:created_at>
					<d:created_by>vravi5@its.jnj.com</d:created_by>
				</d:life_cycle>
				<d:name>intas_key</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('IdentityBridge')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('IdentityBridge')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('IdentityBridge')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-04-17T21:45:06.001</d:changed_at>
					<d:changed_by>speders8@its.jnj.com</d:changed_by>
					<d:created_at>2025-04-17T21:45:06.001</d:created_at>
					<d:created_by>speders8@its.jnj.com</d:created_by>
				</d:life_cycle>
				<d:name>IdentityBridge</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('KVM_CMO_ATLAS')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('KVM_CMO_ATLAS')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('KVM_CMO_ATLAS')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-05-04T10:27:42.275</d:changed_at>
					<d:changed_by>lsirisip@its.jnj.com</d:changed_by>
					<d:created_at>2025-04-28T15:00:17.724</d:created_at>
					<d:created_by>lsirisip@its.jnj.com</d:created_by>
				</d:life_cycle>
				<d:name>KVM_CMO_ATLAS</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/KeyMapEntries('KVM_RaritanMES_LegendS4')</id>
		<title type="text">KeyMapEntries</title>
		<updated>2025-05-20T16:33:33.9Z</updated>
		<category term="apiportal.KeyMapEntry" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="KeyMapEntries('KVM_RaritanMES_LegendS4')" rel="edit" title="KeyMapEntry"></link>
		<link href="KeyMapEntries('KVM_RaritanMES_LegendS4')/keyMapEntryValues" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/keyMapEntryValues" title="keyMapEntryValues" type="application/atom+xml;type=feed"></link>
		<content type="application/xml">
			<m:properties>
				<d:encrypted>true</d:encrypted>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-05-06T06:49:53.559</d:changed_at>
					<d:changed_by>ashingar@its.jnj.com</d:changed_by>
					<d:created_at>2025-05-02T13:04:26.03</d:created_at>
					<d:created_by>smisal2@its.jnj.com</d:created_by>
				</d:life_cycle>
				<d:name>KVM_RaritanMES_LegendS4</d:name>
				<d:scope>ENV</d:scope>
			</m:properties>
		</content>
	</entry>
</feed>
```











## Policies

```bash
GET /apiportal/api/1.0/Management.svc/APIProxies('${proxyName}')/policies
GET /apiportal/api/1.0/Management.svc/APIProxies('OAuthService_BTP_v1')/policies
```

<!-- GET /apiportal/api/1.0/Management.svc/APIProxies('OAuthService_BTP_v1')/policies returns: -->
```xml
<?xml version="1.0" encoding="utf-8"?>
<feed
	xmlns="http://www.w3.org/2005/Atom"
	xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata"
	xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices" xml:base="https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/">
	<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/Policies</id>
	<title type="text">Policies</title>
	<updated>2025-05-20T16:23:12.441Z</updated>
	<author>
		<name></name>
	</author>
	<link href="Policies" rel="self" title="Policies"></link>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/Policies('CBA08047-B770-4EDF-9031-F09E11C02E80')</id>
		<title type="text">Policies</title>
		<updated>2025-05-20T16:23:12.441Z</updated>
		<category term="apiportal.Policy" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="Policies('CBA08047-B770-4EDF-9031-F09E11C02E80')" rel="edit" title="Policy"></link>
		<link href="Policies('CBA08047-B770-4EDF-9031-F09E11C02E80')/apiProxy" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/apiProxy" title="apiProxy" type="application/atom+xml;type=entry"></link>
		<content type="application/xml">
			<m:properties>
				<d:FK_API_NAME>OAuthService_BTP_v1</d:FK_API_NAME>
				<d:id>CBA08047-B770-4EDF-9031-F09E11C02E80</d:id>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-08T16:39:59.512</d:changed_at>
					<d:changed_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:changed_by>
					<d:created_at>2025-03-08T16:39:59.512</d:created_at>
					<d:created_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:created_by>
				</d:life_cycle>
				<d:name>defaultRaiseFaultPolicy</d:name>
				<d:policy_content>&lt;RaiseFault async="false" continueOnError="false" enabled="true"
					xmlns="http://www.sap.com/apimgmt"&gt;
	&lt;FaultResponse&gt;
		&lt;Set&gt;
			&lt;StatusCode&gt;405&lt;/StatusCode&gt;
			&lt;ReasonPhrase&gt;Method Not Allowed&lt;/ReasonPhrase&gt;
		&lt;/Set&gt;
	&lt;/FaultResponse&gt;
	&lt;IgnoreUnresolvedVariables&gt;false&lt;/IgnoreUnresolvedVariables&gt;
&lt;/RaiseFault&gt;
				</d:policy_content>
				<d:type>RaiseFault</d:type>
			</m:properties>
		</content>
	</entry>
	<entry>
		<id>https://us10apiportal.cfapps.us10.hana.ondemand.com:443/apiportal/api/1.0/Management.svc/Policies('30D811A3-00F6-4673-AA67-1CA987CC07B3')</id>
		<title type="text">Policies</title>
		<updated>2025-05-20T16:23:12.441Z</updated>
		<category term="apiportal.Policy" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"></category>
		<link href="Policies('30D811A3-00F6-4673-AA67-1CA987CC07B3')" rel="edit" title="Policy"></link>
		<link href="Policies('30D811A3-00F6-4673-AA67-1CA987CC07B3')/apiProxy" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/apiProxy" title="apiProxy" type="application/atom+xml;type=entry"></link>
		<content type="application/xml">
			<m:properties>
				<d:FK_API_NAME>OAuthService_BTP_v1</d:FK_API_NAME>
				<d:id>30D811A3-00F6-4673-AA67-1CA987CC07B3</d:id>
				<d:life_cycle m:type="apiportal.History">
					<d:changed_at>2025-03-08T16:39:59.512</d:changed_at>
					<d:changed_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:changed_by>
					<d:created_at>2025-03-08T16:39:59.512</d:created_at>
					<d:created_by>sb-apiaccess_1741448205611!b342912|api-portal-xsuaa!b1711</d:created_by>
				</d:life_cycle>
				<d:name>GenerateToken</d:name>
				<d:policy_content>&lt;OAuthV2 async="false" continueOnError="false" enabled="true"
					xmlns="http://www.sap.com/apimgmt"&gt;
    &lt;Operation&gt;GenerateAccessToken&lt;/Operation&gt;
    &lt;GenerateResponse/&gt;
    &lt;SupportedGrantTypes&gt;
        &lt;GrantType&gt;client_credentials&lt;/GrantType&gt;
    &lt;/SupportedGrantTypes&gt;
&lt;/OAuthV2&gt;
				</d:policy_content>
				<d:type>OAuthV2</d:type>
			</m:properties>
		</content>
	</entry>
</feed>
```


## metadata

```xml
<?xml version="1.0" ?>
<edmx:Edmx
	xmlns:edmx="http://schemas.microsoft.com/ado/2007/06/edmx" Version="1.0">
	<edmx:DataServices m:DataServiceVersion="1.0"
		xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata">
		<Schema Namespace="apiportal"
			xmlns="http://schemas.microsoft.com/ado/2008/09/edm">
			<EntityType Name="ACLProductLinkage">
				<Key>
					<PropertyRef Name="ruleId"></PropertyRef>
				</Key>
				<Property Name="devportalRuleId" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="entityId" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="entityType" Type="Edm.String" Nullable="true" MaxLength="64"></Property>
				<Property Name="isPublished" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="operation" Type="Edm.String" Nullable="true" MaxLength="64"></Property>
				<Property Name="permissionSet" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="ruleId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
			</EntityType>
			<EntityType Name="APIProduct">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="isPublished" Type="Edm.Boolean"></Property>
				<Property Name="isRestricted" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="published_at" Type="Edm.DateTime"></Property>
				<Property Name="published_by" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="quotaCount" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="quotaInterval" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="quotaTimeUnit" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="true" MaxLength="4000"></Property>
				<Property Name="status_code" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="version" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<Property Name="title" Type="Edm.String" MaxLength="255"></Property>
				<Property Name="description" Type="Edm.String" MaxLength="16000"></Property>
				<Property Name="shortText" Type="Edm.String" MaxLength="255"></Property>
				<NavigationProperty Name="additionalProperties" Relationship="apiportal.APIProduct_APIProductAdditionalProperty_One_Many0" FromRole="APIProduct" ToRole="APIProductAdditionalProperty"></NavigationProperty>
				<NavigationProperty Name="apiProxies" Relationship="apiportal.APIProduct_APIProxy_Many_Many0" FromRole="APIProduct" ToRole="APIProxy"></NavigationProperty>
				<NavigationProperty Name="apiResources" Relationship="apiportal.APIProduct_APIResource_One_Many0" FromRole="APIProduct" ToRole="APIResource"></NavigationProperty>
				<NavigationProperty Name="applications" Relationship="apiportal.APIProduct_Application_Many_Many0" FromRole="APIProduct" ToRole="Application"></NavigationProperty>
				<NavigationProperty Name="ratePlans" Relationship="apiportal.APIProduct_RatePlan_Many_Many0" FromRole="APIProduct" ToRole="RatePlan"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.APIProduct_Resource_One_Many0" FromRole="APIProduct" ToRole="Resource"></NavigationProperty>
			</EntityType>
			<EntityType Name="APIProductAdditionalProperty">
				<Key>
					<PropertyRef Name="entityId"></PropertyRef>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="entityId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="value" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
			</EntityType>
			<EntityType Name="APIProvider">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="destType" Type="Edm.String" Nullable="true" MaxLength="30"></Property>
				<Property Name="isOnPremise" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="200"></Property>
				<Property Name="region" Type="Edm.String" Nullable="true" MaxLength="100"></Property>
				<Property Name="rt_auth" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="sslInfo" Type="apiportal.SSLInfo"></Property>
				<Property Name="url" Type="Edm.String"></Property>
				<Property Name="title" Type="Edm.String" MaxLength="255"></Property>
				<Property Name="description" Type="Edm.String" MaxLength="16000"></Property>
				<Property Name="host" Type="Edm.String" MaxLength="2048"></Property>
				<Property Name="port" Type="Edm.Int32"></Property>
				<Property Name="useSSL" Type="Edm.Boolean"></Property>
				<Property Name="trustAll" Type="Edm.Boolean"></Property>
				<Property Name="userName" Type="Edm.String" MaxLength="2048"></Property>
				<Property Name="password" Type="Edm.String" MaxLength="126"></Property>
				<Property Name="clientSecret" Type="Edm.String"></Property>
				<Property Name="clientId" Type="Edm.String"></Property>
				<Property Name="tokenUrl" Type="Edm.String"></Property>
				<Property Name="authType" Type="Edm.String" MaxLength="126"></Property>
				<Property Name="pathPrefix" Type="Edm.String" MaxLength="2048"></Property>
				<Property Name="timeout" Type="Edm.Int32"></Property>
				<Property Name="cockpit_url" Type="Edm.String"></Property>
				<Property Name="cloudConnectorLocation" Type="Edm.String" MaxLength="2048"></Property>
				<Property Name="orgSecret" Type="Edm.String"></Property>
				<Property Name="userSecret" Type="Edm.String"></Property>
				<Property Name="keystorePassword" Type="Edm.String"></Property>
				<Property Name="keystoreLocation" Type="Edm.String"></Property>
				<NavigationProperty Name="additionalProperties" Relationship="apiportal.APIProvider_APIProviderAdditionalProperty_One_Many0" FromRole="APIProvider" ToRole="APIProviderAdditionalProperty"></NavigationProperty>
				<NavigationProperty Name="apiProxies" Relationship="apiportal.APIProvider_APIProxy_One_Many0" FromRole="APIProvider" ToRole="APIProxy"></NavigationProperty>
				<NavigationProperty Name="envKVMs" Relationship="apiportal.APIProvider_KeyMapEntry_One_Many0" FromRole="APIProvider" ToRole="KeyMapEntry"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.APIProvider_Resource_One_Many0" FromRole="APIProvider" ToRole="Resource"></NavigationProperty>
				<NavigationProperty Name="targetEndPoints" Relationship="apiportal.APIProvider_APITargetEndPoint_Many_Many0" FromRole="APIProvider" ToRole="APITargetEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="APIProviderAdditionalProperty">
				<Key>
					<PropertyRef Name="entityId"></PropertyRef>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="entityId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="value" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
			</EntityType>
			<EntityType Name="APIProxy">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="FK_PROVIDERNAME" Type="Edm.String" Nullable="true" MaxLength="200"></Property>
				<Property Name="apiVersionGroup" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="cfBindingId" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_deploymentinfo_name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="hasChanges" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isCopy" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isPublished" Type="Edm.Boolean"></Property>
				<Property Name="isUnmanaged" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isVersioned" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="provider_name" Type="Edm.String" Nullable="true" MaxLength="200"></Property>
				<Property Name="releaseMetadata" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
				<Property Name="releaseStatus" Type="Edm.String" Nullable="true" MaxLength="15"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="revisionName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="service_code" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="state" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<Property Name="status_code" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="version" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<Property Name="policyTemplateNames" Type="Edm.String"></Property>
				<Property Name="title" Type="Edm.String" MaxLength="255"></Property>
				<Property Name="description" Type="Edm.String" MaxLength="16000"></Property>
				<Property Name="shortText" Type="Edm.String" MaxLength="255"></Property>
				<NavigationProperty Name="apiProducts" Relationship="apiportal.APIProduct_APIProxy_Many_Many0" FromRole="APIProxy" ToRole="APIProduct"></NavigationProperty>
				<NavigationProperty Name="apiProvider" Relationship="apiportal.APIProvider_APIProxy_One_Many0" FromRole="APIProxy" ToRole="APIProvider"></NavigationProperty>
				<NavigationProperty Name="contentPackage" Relationship="apiportal.APIProxy_ContentPackageMapper_One_ZeroToOne0" FromRole="APIProxy" ToRole="ContentPackageMapper"></NavigationProperty>
				<NavigationProperty Name="deploymentInfo" Relationship="apiportal.APIProxy_APIProxyDeployment_One_ZeroToOne0" FromRole="APIProxy" ToRole="APIProxyDeployment"></NavigationProperty>
				<NavigationProperty Name="fileResources" Relationship="apiportal.APIProxy_FileResource_Many_Many0" FromRole="APIProxy" ToRole="FileResource"></NavigationProperty>
				<NavigationProperty Name="policies" Relationship="apiportal.APIProxy_Policy_One_Many0" FromRole="APIProxy" ToRole="Policy"></NavigationProperty>
				<NavigationProperty Name="proxyEndPoints" Relationship="apiportal.APIProxy_APIProxyEndPoint_One_Many0" FromRole="APIProxy" ToRole="APIProxyEndPoint"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.APIProxy_Resource_One_Many0" FromRole="APIProxy" ToRole="Resource"></NavigationProperty>
				<NavigationProperty Name="successorAPI" Relationship="apiportal.APIProxy_APIProxy_One_One0" FromRole="APIProxy" ToRole="APIProxy2"></NavigationProperty>
				<NavigationProperty Name="successorAPIReferences" Relationship="apiportal.APIProxy_APIProxy_One_Many0" FromRole="APIProxy" ToRole="APIProxy2"></NavigationProperty>
				<NavigationProperty Name="targetAPIProxies" Relationship="apiportal.APIProxy_APITargetEndPoint_One_Many0" FromRole="APIProxy" ToRole="APITargetEndPoint"></NavigationProperty>
				<NavigationProperty Name="targetEndPoints" Relationship="apiportal.APIProxy_APITargetEndPoint_One_Many1" FromRole="APIProxy" ToRole="APITargetEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="APIProxyDeployment">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="state" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
			</EntityType>
			<EntityType Name="APIProxyEndPoint">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="FK_API_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="base_path" Type="Edm.String"></Property>
				<Property Name="FK_DEFAULTFAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isDefault" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_POSTCLIENTFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_POSTFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_PREFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="publishUrl" Type="Edm.String"></Property>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.APIProxy_APIProxyEndPoint_One_Many0" FromRole="APIProxyEndPoint" ToRole="APIProxy"></NavigationProperty>
				<NavigationProperty Name="apiResources" Relationship="apiportal.APIProxyEndPoint_APIResource_One_Many0" FromRole="APIProxyEndPoint" ToRole="APIResource"></NavigationProperty>
				<NavigationProperty Name="conditionalFlows" Relationship="apiportal.APIProxyEndPoint_ConditionalFlowRule_One_Many0" FromRole="APIProxyEndPoint" ToRole="ConditionalFlowRule"></NavigationProperty>
				<NavigationProperty Name="defaultFaultRule" Relationship="apiportal.APIProxyEndPoint_DefaultFaultRule_One_One0" FromRole="APIProxyEndPoint" ToRole="DefaultFaultRule"></NavigationProperty>
				<NavigationProperty Name="faultRules" Relationship="apiportal.APIProxyEndPoint_FaultRule_One_Many0" FromRole="APIProxyEndPoint" ToRole="FaultRule"></NavigationProperty>
				<NavigationProperty Name="postClientFlow" Relationship="apiportal.APIProxyEndPoint_FlowRule_One_One0" FromRole="APIProxyEndPoint" ToRole="FlowRule"></NavigationProperty>
				<NavigationProperty Name="postFlow" Relationship="apiportal.APIProxyEndPoint_FlowRule_One_One1" FromRole="APIProxyEndPoint" ToRole="FlowRule"></NavigationProperty>
				<NavigationProperty Name="preFlow" Relationship="apiportal.APIProxyEndPoint_FlowRule_One_One2" FromRole="APIProxyEndPoint" ToRole="FlowRule"></NavigationProperty>
				<NavigationProperty Name="properties" Relationship="apiportal.APIProxyEndPoint_EndPointProperty_One_Many0" FromRole="APIProxyEndPoint" ToRole="EndPointProperty"></NavigationProperty>
				<NavigationProperty Name="routeRules" Relationship="apiportal.APIProxyEndPoint_RouteRule_One_Many0" FromRole="APIProxyEndPoint" ToRole="RouteRule"></NavigationProperty>
				<NavigationProperty Name="virtualhosts" Relationship="apiportal.APIProxyEndPoint_VirtualHost_Many_Many0" FromRole="APIProxyEndPoint" ToRole="VirtualHost"></NavigationProperty>
			</EntityType>
			<EntityType Name="APIProxyEndPointRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_API_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="base_path" Type="Edm.String"></Property>
				<Property Name="FK_DEFAULTFAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isDefault" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_POSTCLIENTFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_POSTFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_PREFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="publishUrl" Type="Edm.String"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.APIProxyEndPointRevision_APIProxyRevision_Many_One0" FromRole="APIProxyEndPointRevision" ToRole="APIProxyRevision"></NavigationProperty>
				<NavigationProperty Name="apiResources" Relationship="apiportal.APIProxyEndPointRevision_APIResourceRevision_One_Many0" FromRole="APIProxyEndPointRevision" ToRole="APIResourceRevision"></NavigationProperty>
				<NavigationProperty Name="conditionalFlows" Relationship="apiportal.APIProxyEndPointRevision_ConditionalFlowRuleRevision_One_Many0" FromRole="APIProxyEndPointRevision" ToRole="ConditionalFlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="defaultFaultRule" Relationship="apiportal.APIProxyEndPointRevision_DefaultFaultRuleRevision_One_One0" FromRole="APIProxyEndPointRevision" ToRole="DefaultFaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="faultRules" Relationship="apiportal.APIProxyEndPointRevision_FaultRuleRevision_One_Many0" FromRole="APIProxyEndPointRevision" ToRole="FaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="postClientFlow" Relationship="apiportal.APIProxyEndPointRevision_FlowRuleRevision_One_One0" FromRole="APIProxyEndPointRevision" ToRole="FlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="postFlow" Relationship="apiportal.APIProxyEndPointRevision_FlowRuleRevision_One_One1" FromRole="APIProxyEndPointRevision" ToRole="FlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="preFlow" Relationship="apiportal.APIProxyEndPointRevision_FlowRuleRevision_One_One2" FromRole="APIProxyEndPointRevision" ToRole="FlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="properties" Relationship="apiportal.APIProxyEndPointRevision_EndPointPropertyRevision_One_Many0" FromRole="APIProxyEndPointRevision" ToRole="EndPointPropertyRevision"></NavigationProperty>
				<NavigationProperty Name="routeRules" Relationship="apiportal.APIProxyEndPointRevision_RouteRuleRevision_One_Many0" FromRole="APIProxyEndPointRevision" ToRole="RouteRuleRevision"></NavigationProperty>
				<NavigationProperty Name="virtualhosts" Relationship="apiportal.APIProxyEndPointRevision_VirtualHost_Many_Many0" FromRole="APIProxyEndPointRevision" ToRole="VirtualHost"></NavigationProperty>
			</EntityType>
			<EntityType Name="APIProxyRevision">
				<Key>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="revisionDescription" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="revisionName" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
			</EntityType>
			<EntityType Name="APIResource">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="canShowDelete" Type="Edm.Boolean"></Property>
				<Property Name="canShowGet" Type="Edm.Boolean"></Property>
				<Property Name="canShowHead" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="canShowOption" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="canShowPatch" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="canShowPost" Type="Edm.Boolean"></Property>
				<Property Name="canShowPut" Type="Edm.Boolean"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isDeleteChecked" Type="Edm.Boolean"></Property>
				<Property Name="isGetChecked" Type="Edm.Boolean"></Property>
				<Property Name="isHeadChecked" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isOptionChecked" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isPatchChecked" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isPostChecked" Type="Edm.Boolean"></Property>
				<Property Name="isPutChecked" Type="Edm.Boolean"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="proxyEndPointName" Type="Edm.String"></Property>
				<Property Name="resource_path" Type="Edm.String"></Property>
				<Property Name="title" Type="Edm.String" MaxLength="255"></Property>
				<Property Name="description" Type="Edm.String" MaxLength="16000"></Property>
				<NavigationProperty Name="apiProxyEndPoint" Relationship="apiportal.APIProxyEndPoint_APIResource_One_Many0" FromRole="APIResource" ToRole="APIProxyEndPoint"></NavigationProperty>
				<NavigationProperty Name="documentations" Relationship="apiportal.APIResource_Documentation_One_Many0" FromRole="APIResource" ToRole="Documentation"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.APIResource_Resource_One_Many0" FromRole="APIResource" ToRole="Resource"></NavigationProperty>
			</EntityType>
			<EntityType Name="APIResourceRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="canShowDelete" Type="Edm.Boolean"></Property>
				<Property Name="canShowGet" Type="Edm.Boolean"></Property>
				<Property Name="canShowHead" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="canShowOption" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="canShowPatch" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="canShowPost" Type="Edm.Boolean"></Property>
				<Property Name="canShowPut" Type="Edm.Boolean"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isDeleteChecked" Type="Edm.Boolean"></Property>
				<Property Name="isGetChecked" Type="Edm.Boolean"></Property>
				<Property Name="isHeadChecked" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isOptionChecked" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isPatchChecked" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isPostChecked" Type="Edm.Boolean"></Property>
				<Property Name="isPutChecked" Type="Edm.Boolean"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="proxyEndPointName" Type="Edm.String"></Property>
				<Property Name="resource_path" Type="Edm.String"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<NavigationProperty Name="apiProxyEndPoint" Relationship="apiportal.APIProxyEndPointRevision_APIResourceRevision_One_Many0" FromRole="APIResourceRevision" ToRole="APIProxyEndPointRevision"></NavigationProperty>
				<NavigationProperty Name="documentations" Relationship="apiportal.APIResourceRevision_DocumentationRevision_One_Many0" FromRole="APIResourceRevision" ToRole="DocumentationRevision"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.APIResourceRevision_ResourceRevision_One_Many0" FromRole="APIResourceRevision" ToRole="ResourceRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="APITargetEndPoint">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="FK_API_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_DEFAULTFAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isDefault" Type="Edm.Boolean"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="loadBalancerConfigurations" Type="apiportal.LoadBalancerConfigurations"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_POSTFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_PREFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="provider_id" Type="Edm.String" Nullable="true" MaxLength="200"></Property>
				<Property Name="relativePath" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_TARGET_API_PROXY" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="targetAPIProxyName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="url" Type="Edm.String" Nullable="true" MaxLength="2083"></Property>
				<NavigationProperty Name="additionalApiProviders" Relationship="apiportal.APIProvider_APITargetEndPoint_Many_Many0" FromRole="APITargetEndPoint" ToRole="APIProvider"></NavigationProperty>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.APIProxy_APITargetEndPoint_One_Many1" FromRole="APITargetEndPoint" ToRole="APIProxy"></NavigationProperty>
				<NavigationProperty Name="conditionalFlows" Relationship="apiportal.APITargetEndPoint_ConditionalFlowRule_One_Many0" FromRole="APITargetEndPoint" ToRole="ConditionalFlowRule"></NavigationProperty>
				<NavigationProperty Name="defaultFaultRule" Relationship="apiportal.APITargetEndPoint_DefaultFaultRule_One_One0" FromRole="APITargetEndPoint" ToRole="DefaultFaultRule"></NavigationProperty>
				<NavigationProperty Name="faultRules" Relationship="apiportal.APITargetEndPoint_FaultRule_One_Many0" FromRole="APITargetEndPoint" ToRole="FaultRule"></NavigationProperty>
				<NavigationProperty Name="postFlow" Relationship="apiportal.APITargetEndPoint_FlowRule_One_One0" FromRole="APITargetEndPoint" ToRole="FlowRule"></NavigationProperty>
				<NavigationProperty Name="preFlow" Relationship="apiportal.APITargetEndPoint_FlowRule_One_One1" FromRole="APITargetEndPoint" ToRole="FlowRule"></NavigationProperty>
				<NavigationProperty Name="properties" Relationship="apiportal.APITargetEndPoint_EndPointProperty_One_Many0" FromRole="APITargetEndPoint" ToRole="EndPointProperty"></NavigationProperty>
				<NavigationProperty Name="targetAPIProxy" Relationship="apiportal.APITargetEndPoint_APIProxy_One_ZeroToOne0" FromRole="APITargetEndPoint" ToRole="APIProxy"></NavigationProperty>
			</EntityType>
			<EntityType Name="APITargetEndPointRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_API_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_DEFAULTFAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isDefault" Type="Edm.Boolean"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="loadBalancerConfigurations" Type="apiportal.LoadBalancerConfigurations"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_POSTFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_PREFLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="provider_id" Type="Edm.String" Nullable="true" MaxLength="200"></Property>
				<Property Name="relativePath" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="FK_TARGET_API_PROXY" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="targetAPIProxyName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="url" Type="Edm.String" Nullable="true" MaxLength="2083"></Property>
				<NavigationProperty Name="additionalApiProviders" Relationship="apiportal.APITargetEndPointRevision_APIProvider_Many_Many0" FromRole="APITargetEndPointRevision" ToRole="APIProvider"></NavigationProperty>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.APITargetEndPointRevision_APIProxyRevision_Many_One0" FromRole="APITargetEndPointRevision" ToRole="APIProxyRevision"></NavigationProperty>
				<NavigationProperty Name="conditionalFlows" Relationship="apiportal.APITargetEndPointRevision_ConditionalFlowRuleRevision_One_Many0" FromRole="APITargetEndPointRevision" ToRole="ConditionalFlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="defaultFaultRule" Relationship="apiportal.APITargetEndPointRevision_DefaultFaultRuleRevision_One_One0" FromRole="APITargetEndPointRevision" ToRole="DefaultFaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="faultRules" Relationship="apiportal.APITargetEndPointRevision_FaultRuleRevision_One_Many0" FromRole="APITargetEndPointRevision" ToRole="FaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="postFlow" Relationship="apiportal.APITargetEndPointRevision_FlowRuleRevision_One_One0" FromRole="APITargetEndPointRevision" ToRole="FlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="preFlow" Relationship="apiportal.APITargetEndPointRevision_FlowRuleRevision_One_One1" FromRole="APITargetEndPointRevision" ToRole="FlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="properties" Relationship="apiportal.APITargetEndPointRevision_EndPointPropertyRevision_One_Many0" FromRole="APITargetEndPointRevision" ToRole="EndPointPropertyRevision"></NavigationProperty>
				<NavigationProperty Name="targetAPIProxy" Relationship="apiportal.APITargetEndPointRevision_APIProxy_One_ZeroToOne0" FromRole="APITargetEndPointRevision" ToRole="APIProxy"></NavigationProperty>
			</EntityType>
			<EntityType Name="ApiportalCloneMapping">
				<Key>
					<PropertyRef Name="subaccountId"></PropertyRef>
				</Key>
				<Property Name="apiportalClientId" Type="Edm.String" Nullable="true" MaxLength="512"></Property>
				<Property Name="devportalTenantId" Type="Edm.String" Nullable="true" MaxLength="512"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="newServiceInstanceId" Type="Edm.String" Nullable="true" MaxLength="512"></Property>
				<Property Name="serviceInstanceId" Type="Edm.String" Nullable="true" MaxLength="512"></Property>
				<Property Name="subaccountId" Type="Edm.String" Nullable="false" MaxLength="512"></Property>
			</EntityType>
			<EntityType Name="Application">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="callbackurl" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_DEVELOPER_ID" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="status_code" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="valid_from" Type="Edm.DateTime"></Property>
				<Property Name="valid_to" Type="Edm.DateTime"></Property>
				<Property Name="version" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<Property Name="title" Type="Edm.String" MaxLength="255"></Property>
				<Property Name="description" Type="Edm.String" MaxLength="16000"></Property>
				<Property Name="shortText" Type="Edm.String" MaxLength="255"></Property>
				<Property Name="app_key" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="app_secret" Type="Edm.String" MaxLength="1000"></Property>
				<Property Name="subscribedRatePlan" Type="Edm.String"></Property>
				<NavigationProperty Name="apiProducts" Relationship="apiportal.APIProduct_Application_Many_Many0" FromRole="Application" ToRole="APIProduct"></NavigationProperty>
				<NavigationProperty Name="attributes" Relationship="apiportal.Application_ApplicationAdditionalProperty_One_Many0" FromRole="Application" ToRole="ApplicationAdditionalProperty"></NavigationProperty>
				<NavigationProperty Name="developer" Relationship="apiportal.Application_Developer_One_One0" FromRole="Application" ToRole="Developer"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.Application_Resource_One_Many0" FromRole="Application" ToRole="Resource"></NavigationProperty>
			</EntityType>
			<EntityType Name="ApplicationAdditionalProperty">
				<Key>
					<PropertyRef Name="entityId"></PropertyRef>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="entityId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="value" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
			</EntityType>
			<EntityType Name="AttachmentRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="attachment_data" Type="Edm.Binary"></Property>
				<Property Name="description" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
				<Property Name="file_extension" Type="Edm.String" Nullable="true" MaxLength="40"></Property>
				<Property Name="file_name" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="locale" Type="Edm.String" Nullable="true" MaxLength="5"></Property>
				<Property Name="mime_type" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="object_name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="object_type" Type="Edm.String" Nullable="true" MaxLength="2"></Property>
				<Property Name="object_version" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.AttachmentRevision_APIProxyRevision_Many_One0" FromRole="AttachmentRevision" ToRole="APIProxyRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="Bill">
				<Key>
					<PropertyRef Name="entityId"></PropertyRef>
					<PropertyRef Name="entityType"></PropertyRef>
					<PropertyRef Name="fromDate"></PropertyRef>
					<PropertyRef Name="toDate"></PropertyRef>
				</Key>
				<Property Name="billDetails" Type="Edm.String"></Property>
				<Property Name="billGeneratedAt" Type="Edm.DateTime" Nullable="true"></Property>
				<Property Name="billGeneratedBy" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="billId" Type="Edm.String" Nullable="true" MaxLength="64"></Property>
				<Property Name="currency" Type="Edm.String" Nullable="true" MaxLength="32"></Property>
				<Property Name="description" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
				<Property Name="emailId" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="entityId" Type="Edm.String" Nullable="false" MaxLength="256"></Property>
				<Property Name="entityName" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="entityType" Type="Edm.String" Nullable="false" MaxLength="32"></Property>
				<Property Name="firstName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="fromDate" Type="Edm.DateTime" Nullable="false"></Property>
				<Property Name="isoffboarded" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="lastName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="offboardedDate" Type="Edm.DateTime" Nullable="true"></Property>
				<Property Name="status" Type="Edm.String" Nullable="true" MaxLength="64"></Property>
				<Property Name="toDate" Type="Edm.DateTime" Nullable="false"></Property>
				<Property Name="total" Type="Edm.Double" Nullable="true"></Property>
			</EntityType>
			<EntityType Name="CacheResource">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="compression_enabled" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="disk_size" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="expirySettings" Type="apiportal.ExpirySettings"></Property>
				<Property Name="in_memory_size" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="max_element_disk" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="max_element_memory" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="min_compression_size" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="over_flow_to_disk" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="persistent_cache" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="skip_cache_element_size" Type="Edm.Int32" Nullable="true"></Property>
			</EntityType>
			<EntityType Name="Certificate">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
					<PropertyRef Name="storeName"></PropertyRef>
				</Key>
				<Property Name="certName" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="csKey" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="description" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
				<Property Name="format" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="200"></Property>
				<Property Name="storeName" Type="Edm.String" Nullable="false" MaxLength="200"></Property>
				<Property Name="password" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="storeType" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="expiryDate" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="issuerEmail" Type="Edm.String" MaxLength="2048"></Property>
				<Property Name="subjectEmail" Type="Edm.String" MaxLength="2048"></Property>
				<Property Name="signAlgName" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="isValid" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="validFrom" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="version" Type="Edm.String" MaxLength="256"></Property>
				<Property Name="content" Type="Edm.Binary"></Property>
				<NavigationProperty Name="certificateStore" Relationship="apiportal.Certificate_CertificateStore_Many_ZeroToOne0" FromRole="Certificate" ToRole="CertificateStore"></NavigationProperty>
			</EntityType>
			<EntityType Name="CertificateStore">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="200"></Property>
				<Property Name="storeType" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<NavigationProperty Name="certificates" Relationship="apiportal.Certificate_CertificateStore_Many_ZeroToOne0" FromRole="CertificateStore" ToRole="Certificate"></NavigationProperty>
			</EntityType>
			<EntityType Name="CertificateStoreReference">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="certificateStoreName" Type="Edm.String" Nullable="true" MaxLength="200"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="storeType" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
			</EntityType>
			<EntityType Name="ConditionalFlowRule">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="FK_APIRESOURCE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="conditions" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="readOnly" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="FK_REQUEST_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_RESPONSE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="sequence" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="apiResource" Relationship="apiportal.ConditionalFlowRule_APIResource_One_One0" FromRole="ConditionalFlowRule" ToRole="APIResource"></NavigationProperty>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPoint_ConditionalFlowRule_One_Many0" FromRole="ConditionalFlowRule" ToRole="APIProxyEndPoint"></NavigationProperty>
				<NavigationProperty Name="request" Relationship="apiportal.ConditionalFlowRule_Stream_One_ZeroToOne0" FromRole="ConditionalFlowRule" ToRole="Stream"></NavigationProperty>
				<NavigationProperty Name="response" Relationship="apiportal.ConditionalFlowRule_Stream_One_ZeroToOne1" FromRole="ConditionalFlowRule" ToRole="Stream"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.APITargetEndPoint_ConditionalFlowRule_One_Many0" FromRole="ConditionalFlowRule" ToRole="APITargetEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="ConditionalFlowRuleRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_APIRESOURCE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="conditions" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="readOnly" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="FK_REQUEST_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_RESPONSE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="sequence" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="apiResource" Relationship="apiportal.ConditionalFlowRuleRevision_APIResourceRevision_One_One0" FromRole="ConditionalFlowRuleRevision" ToRole="APIResourceRevision"></NavigationProperty>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPointRevision_ConditionalFlowRuleRevision_One_Many0" FromRole="ConditionalFlowRuleRevision" ToRole="APIProxyEndPointRevision"></NavigationProperty>
				<NavigationProperty Name="request" Relationship="apiportal.ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne0" FromRole="ConditionalFlowRuleRevision" ToRole="StreamRevision"></NavigationProperty>
				<NavigationProperty Name="response" Relationship="apiportal.ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne1" FromRole="ConditionalFlowRuleRevision" ToRole="StreamRevision"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.APITargetEndPointRevision_ConditionalFlowRuleRevision_One_Many0" FromRole="ConditionalFlowRuleRevision" ToRole="APITargetEndPointRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="ContentPackageMapper">
				<Key>
					<PropertyRef Name="targetId"></PropertyRef>
					<PropertyRef Name="targetType"></PropertyRef>
				</Key>
				<Property Name="content" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="shortText" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="srcArtifactName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="srcArtifactType" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="srcPackageID" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="srcRepo" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="targetId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="targetType" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.ContentPackageMapper_APIProxy_One_ZeroToOne0" FromRole="ContentPackageMapper" ToRole="APIProxy"></NavigationProperty>
			</EntityType>
			<EntityType Name="DefaultFaultRule">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="alwaysEnforce" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.DefaultFaultRule_APIProxyEndPoint_Many_One0" FromRole="DefaultFaultRule" ToRole="APIProxyEndPoint"></NavigationProperty>
				<NavigationProperty Name="steps" Relationship="apiportal.DefaultFaultRule_Step_One_Many0" FromRole="DefaultFaultRule" ToRole="Step"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.DefaultFaultRule_APITargetEndPoint_Many_One0" FromRole="DefaultFaultRule" ToRole="APITargetEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="DefaultFaultRuleRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="alwaysEnforce" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.DefaultFaultRuleRevision_APIProxyEndPointRevision_Many_One0" FromRole="DefaultFaultRuleRevision" ToRole="APIProxyEndPointRevision"></NavigationProperty>
				<NavigationProperty Name="steps" Relationship="apiportal.DefaultFaultRuleRevision_StepRevision_One_Many0" FromRole="DefaultFaultRuleRevision" ToRole="StepRevision"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.DefaultFaultRuleRevision_APITargetEndPointRevision_Many_One0" FromRole="DefaultFaultRuleRevision" ToRole="APITargetEndPointRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="DestinationAndUrlMapping">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="destination" Type="Edm.String" Nullable="false" MaxLength="256"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="url" Type="Edm.String" Nullable="false" MaxLength="2048"></Property>
			</EntityType>
			<EntityType Name="Developer">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="country" Type="Edm.String"></Property>
				<Property Name="emailId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="firstName" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="256"></Property>
				<Property Name="lastName" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<NavigationProperty Name="applications" Relationship="apiportal.Developer_Application_One_Many0" FromRole="Developer" ToRole="Application"></NavigationProperty>
			</EntityType>
			<EntityType Name="Documentation">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="locale"></PropertyRef>
				</Key>
				<Property Name="FK_APIRESOURCE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="apiResourceName" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="content" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="locale" Type="Edm.String" Nullable="false" MaxLength="5"></Property>
				<Property Name="mime_type" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<NavigationProperty Name="apiResource" Relationship="apiportal.APIResource_Documentation_One_Many0" FromRole="Documentation" ToRole="APIResource"></NavigationProperty>
			</EntityType>
			<EntityType Name="DocumentationRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="locale"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_APIRESOURCE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="apiResourceName" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="content" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="locale" Type="Edm.String" Nullable="false" MaxLength="5"></Property>
				<Property Name="mime_type" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<NavigationProperty Name="apiResource" Relationship="apiportal.APIResourceRevision_DocumentationRevision_One_Many0" FromRole="DocumentationRevision" ToRole="APIResourceRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="EndPointProperty">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="512"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="value" Type="Edm.String"></Property>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPoint_EndPointProperty_One_Many0" FromRole="EndPointProperty" ToRole="APIProxyEndPoint"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.APITargetEndPoint_EndPointProperty_One_Many0" FromRole="EndPointProperty" ToRole="APITargetEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="EndPointPropertyRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="512"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="value" Type="Edm.String"></Property>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPointRevision_EndPointPropertyRevision_One_Many0" FromRole="EndPointPropertyRevision" ToRole="APIProxyEndPointRevision"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.APITargetEndPointRevision_EndPointPropertyRevision_One_Many0" FromRole="EndPointPropertyRevision" ToRole="APITargetEndPointRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="FaultRule">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="condition" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_ROUTERULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPoint_FaultRule_One_Many0" FromRole="FaultRule" ToRole="APIProxyEndPoint"></NavigationProperty>
				<NavigationProperty Name="routeRule" Relationship="apiportal.FaultRule_RouteRule_Many_One0" FromRole="FaultRule" ToRole="RouteRule"></NavigationProperty>
				<NavigationProperty Name="steps" Relationship="apiportal.FaultRule_Step_One_Many0" FromRole="FaultRule" ToRole="Step"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.APITargetEndPoint_FaultRule_One_Many0" FromRole="FaultRule" ToRole="APITargetEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="FaultRuleRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="condition" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="FK_ROUTERULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_TARGETENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPointRevision_FaultRuleRevision_One_Many0" FromRole="FaultRuleRevision" ToRole="APIProxyEndPointRevision"></NavigationProperty>
				<NavigationProperty Name="routeRule" Relationship="apiportal.FaultRuleRevision_RouteRuleRevision_Many_One0" FromRole="FaultRuleRevision" ToRole="RouteRuleRevision"></NavigationProperty>
				<NavigationProperty Name="steps" Relationship="apiportal.FaultRuleRevision_StepRevision_One_Many0" FromRole="FaultRuleRevision" ToRole="StepRevision"></NavigationProperty>
				<NavigationProperty Name="targetEndPoint" Relationship="apiportal.APITargetEndPointRevision_FaultRuleRevision_One_Many0" FromRole="FaultRuleRevision" ToRole="APITargetEndPointRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="FileResource">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="content" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<NavigationProperty Name="apiProxies" Relationship="apiportal.APIProxy_FileResource_Many_Many0" FromRole="FileResource" ToRole="APIProxy"></NavigationProperty>
			</EntityType>
			<EntityType Name="FileResourceRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="content" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<NavigationProperty Name="apiProxies" Relationship="apiportal.FileResourceRevision_APIProxyRevision_Many_Many0" FromRole="FileResourceRevision" ToRole="APIProxyRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="FlowRule">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="FK_REQUEST_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_RESPONSE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="request" Relationship="apiportal.FlowRule_Stream_One_ZeroToOne0" FromRole="FlowRule" ToRole="Stream"></NavigationProperty>
				<NavigationProperty Name="response" Relationship="apiportal.FlowRule_Stream_One_ZeroToOne1" FromRole="FlowRule" ToRole="Stream"></NavigationProperty>
			</EntityType>
			<EntityType Name="FlowRuleRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="1024"></Property>
				<Property Name="FK_REQUEST_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_RESPONSE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<NavigationProperty Name="request" Relationship="apiportal.FlowRuleRevision_StreamRevision_One_ZeroToOne0" FromRole="FlowRuleRevision" ToRole="StreamRevision"></NavigationProperty>
				<NavigationProperty Name="response" Relationship="apiportal.FlowRuleRevision_StreamRevision_One_ZeroToOne1" FromRole="FlowRuleRevision" ToRole="StreamRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="GenericKeyMapEntry">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
					<PropertyRef Name="scope"></PropertyRef>
					<PropertyRef Name="scopeId"></PropertyRef>
				</Key>
				<Property Name="isEncrypted" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="false" MaxLength="60"></Property>
				<Property Name="scopeId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<NavigationProperty Name="genericKeyMapEntryValues" Relationship="apiportal.GenericKeyMapEntry_GenericKeyMapEntryValue_One_Many0" FromRole="GenericKeyMapEntry" ToRole="GenericKeyMapEntryValue"></NavigationProperty>
			</EntityType>
			<EntityType Name="GenericKeyMapEntryValue">
				<Key>
					<PropertyRef Name="mapName"></PropertyRef>
					<PropertyRef Name="name"></PropertyRef>
					<PropertyRef Name="scope"></PropertyRef>
					<PropertyRef Name="scopeId"></PropertyRef>
				</Key>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="mapName" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="false" MaxLength="60"></Property>
				<Property Name="scopeId" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="value" Type="Edm.String" Nullable="true" MaxLength="10240"></Property>
				<NavigationProperty Name="genericKeyMapEntry" Relationship="apiportal.GenericKeyMapEntry_GenericKeyMapEntryValue_One_Many0" FromRole="GenericKeyMapEntryValue" ToRole="GenericKeyMapEntry"></NavigationProperty>
			</EntityType>
			<EntityType Name="KeyMapEntry">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="encrypted" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<NavigationProperty Name="keyMapEntryValues" Relationship="apiportal.KeyMapEntry_KeyMapEntryValue_One_Many0" FromRole="KeyMapEntry" ToRole="KeyMapEntryValue"></NavigationProperty>
			</EntityType>
			<EntityType Name="KeyMapEntryValue">
				<Key>
					<PropertyRef Name="map_name"></PropertyRef>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="map_name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="value" Type="Edm.String" Nullable="true" MaxLength="10240"></Property>
				<NavigationProperty Name="keyMapEntry" Relationship="apiportal.KeyMapEntry_KeyMapEntryValue_One_Many0" FromRole="KeyMapEntryValue" ToRole="KeyMapEntry"></NavigationProperty>
			</EntityType>
			<EntityType Name="Policy">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="FK_API_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="policy_content" Type="Edm.String"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="40"></Property>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.APIProxy_Policy_One_Many0" FromRole="Policy" ToRole="APIProxy"></NavigationProperty>
			</EntityType>
			<EntityType Name="PolicyRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_API_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="policy_content" Type="Edm.String"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="40"></Property>
				<NavigationProperty Name="apiProxy" Relationship="apiportal.PolicyRevision_APIProxyRevision_Many_One0" FromRole="PolicyRevision" ToRole="APIProxyRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="PolicyTemplateContainer">
				<Key>
					<PropertyRef Name="name"></PropertyRef>
				</Key>
				<Property Name="description" Type="Edm.String" Nullable="true" MaxLength="4096"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="proxyEndPointxml" Type="Edm.String"></Property>
				<Property Name="targetEndPointxml" Type="Edm.String"></Property>
				<Property Name="title" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="version" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<NavigationProperty Name="fileResources" Relationship="apiportal.PolicyTemplateContainer_TemplateFileResource_One_Many0" FromRole="PolicyTemplateContainer" ToRole="TemplateFileResource"></NavigationProperty>
				<NavigationProperty Name="policies" Relationship="apiportal.PolicyTemplateContainer_TemplatePolicy_One_Many0" FromRole="PolicyTemplateContainer" ToRole="TemplatePolicy"></NavigationProperty>
			</EntityType>
			<EntityType Name="RatePlan">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="currency" Type="Edm.String" Nullable="false" MaxLength="50"></Property>
				<Property Name="frequency" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false"></Property>
				<Property Name="isActive" Type="Edm.Boolean" Nullable="false"></Property>
				<Property Name="isPublished" Type="Edm.Boolean" Nullable="false"></Property>
				<Property Name="isSeasonal" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="rate" Type="Edm.String"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="validFrom" Type="Edm.DateTime"></Property>
				<Property Name="validTo" Type="Edm.DateTime"></Property>
				<Property Name="description" Type="Edm.String" MaxLength="16000"></Property>
				<NavigationProperty Name="apiProducts" Relationship="apiportal.APIProduct_RatePlan_Many_Many0" FromRole="RatePlan" ToRole="APIProduct"></NavigationProperty>
				<NavigationProperty Name="resources" Relationship="apiportal.RatePlan_Resource_One_Many0" FromRole="RatePlan" ToRole="Resource"></NavigationProperty>
			</EntityType>
			<EntityType Name="Resource">
				<Key>
					<PropertyRef Name="locale"></PropertyRef>
					<PropertyRef Name="object_id"></PropertyRef>
					<PropertyRef Name="type"></PropertyRef>
				</Key>
				<Property Name="locale" Type="Edm.String" Nullable="false" MaxLength="5"></Property>
				<Property Name="long_text" Type="Edm.String" Nullable="true" MaxLength="16000"></Property>
				<Property Name="medium_text" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="object_id" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="short_text" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="type" Type="Edm.String" Nullable="false" MaxLength="2"></Property>
			</EntityType>
			<EntityType Name="ResourceRevision">
				<Key>
					<PropertyRef Name="locale"></PropertyRef>
					<PropertyRef Name="object_id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
					<PropertyRef Name="type"></PropertyRef>
				</Key>
				<Property Name="locale" Type="Edm.String" Nullable="false" MaxLength="5"></Property>
				<Property Name="long_text" Type="Edm.String" Nullable="true" MaxLength="16000"></Property>
				<Property Name="medium_text" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="object_id" Type="Edm.String" Nullable="false" MaxLength="255"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="short_text" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="type" Type="Edm.String" Nullable="false" MaxLength="2"></Property>
			</EntityType>
			<EntityType Name="RouteRule">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="conditions" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="sequence" Type="Edm.Int32"></Property>
				<Property Name="targetEndPointName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="url" Type="Edm.String"></Property>
				<NavigationProperty Name="faultRules" Relationship="apiportal.FaultRule_RouteRule_Many_One0" FromRole="RouteRule" ToRole="FaultRule"></NavigationProperty>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPoint_RouteRule_One_Many0" FromRole="RouteRule" ToRole="APIProxyEndPoint"></NavigationProperty>
			</EntityType>
			<EntityType Name="RouteRuleRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="conditions" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_PROXYENDPOINT_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="sequence" Type="Edm.Int32"></Property>
				<Property Name="targetEndPointName" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="url" Type="Edm.String"></Property>
				<NavigationProperty Name="faultRules" Relationship="apiportal.FaultRuleRevision_RouteRuleRevision_Many_One0" FromRole="RouteRuleRevision" ToRole="FaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="proxyEndPoint" Relationship="apiportal.APIProxyEndPointRevision_RouteRuleRevision_One_Many0" FromRole="RouteRuleRevision" ToRole="APIProxyEndPointRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="Step">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="condition" Type="Edm.String"></Property>
				<Property Name="FK_DEFAULTFAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_FAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="policy_name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="sequence" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="FK_STREAM_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="defaultFaultRule" Relationship="apiportal.DefaultFaultRule_Step_One_Many0" FromRole="Step" ToRole="DefaultFaultRule"></NavigationProperty>
				<NavigationProperty Name="faultRule" Relationship="apiportal.FaultRule_Step_One_Many0" FromRole="Step" ToRole="FaultRule"></NavigationProperty>
				<NavigationProperty Name="stream" Relationship="apiportal.Step_Stream_Many_One0" FromRole="Step" ToRole="Stream"></NavigationProperty>
			</EntityType>
			<EntityType Name="StepRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="condition" Type="Edm.String"></Property>
				<Property Name="FK_DEFAULTFAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="FK_FAULTRULE_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="policy_name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<Property Name="sequence" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="FK_STREAM_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<NavigationProperty Name="defaultFaultRule" Relationship="apiportal.DefaultFaultRuleRevision_StepRevision_One_Many0" FromRole="StepRevision" ToRole="DefaultFaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="faultRule" Relationship="apiportal.FaultRuleRevision_StepRevision_One_Many0" FromRole="StepRevision" ToRole="FaultRuleRevision"></NavigationProperty>
				<NavigationProperty Name="stream" Relationship="apiportal.StepRevision_StreamRevision_Many_One0" FromRole="StepRevision" ToRole="StreamRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="Stream">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="FK_FLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isRequest" Type="Edm.Boolean"></Property>
				<NavigationProperty Name="flow" Relationship="apiportal.Stream_FlowRule_One_ZeroToOne0" FromRole="Stream" ToRole="FlowRule"></NavigationProperty>
				<NavigationProperty Name="steps" Relationship="apiportal.Step_Stream_Many_One0" FromRole="Stream" ToRole="Step"></NavigationProperty>
			</EntityType>
			<EntityType Name="StreamRevision">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
					<PropertyRef Name="revisionID"></PropertyRef>
				</Key>
				<Property Name="FK_FLOW_ID" Type="Edm.String" Nullable="true" MaxLength="36"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isRequest" Type="Edm.Boolean"></Property>
				<Property Name="revisionID" Type="Edm.Int32" Nullable="false"></Property>
				<NavigationProperty Name="flow" Relationship="apiportal.StreamRevision_FlowRuleRevision_One_ZeroToOne0" FromRole="StreamRevision" ToRole="FlowRuleRevision"></NavigationProperty>
				<NavigationProperty Name="steps" Relationship="apiportal.StepRevision_StreamRevision_Many_One0" FromRole="StreamRevision" ToRole="StepRevision"></NavigationProperty>
			</EntityType>
			<EntityType Name="TemplateFileResource">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="content" Type="Edm.String"></Property>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_TEMPLATE_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="scope" Type="Edm.String" Nullable="true" MaxLength="20"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="10"></Property>
				<NavigationProperty Name="policyTemplateContainer" Relationship="apiportal.PolicyTemplateContainer_TemplateFileResource_One_Many0" FromRole="TemplateFileResource" ToRole="PolicyTemplateContainer"></NavigationProperty>
			</EntityType>
			<EntityType Name="TemplatePolicy">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="FK_TEMPLATE_NAME" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="policy_content" Type="Edm.String"></Property>
				<Property Name="type" Type="Edm.String" Nullable="true" MaxLength="40"></Property>
				<NavigationProperty Name="policyTemplateContainer" Relationship="apiportal.PolicyTemplateContainer_TemplatePolicy_One_Many0" FromRole="TemplatePolicy" ToRole="PolicyTemplateContainer"></NavigationProperty>
			</EntityType>
			<EntityType Name="VirtualHost">
				<Key>
					<PropertyRef Name="id"></PropertyRef>
				</Key>
				<Property Name="id" Type="Edm.String" Nullable="false" MaxLength="36"></Property>
				<Property Name="isClientAuthEnabled" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isDefault" Type="Edm.Boolean"></Property>
				<Property Name="isForCustomDomain" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="isSSL" Type="Edm.Boolean"></Property>
				<Property Name="keyStoreAlias" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="keyStoreName" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="life_cycle" Type="apiportal.History"></Property>
				<Property Name="name" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="projectPath" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="trustStore" Type="Edm.String" Nullable="true" MaxLength="256"></Property>
				<Property Name="virtual_host" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
				<Property Name="virtual_port" Type="Edm.Int32"></Property>
			</EntityType>
			<ComplexType Name="HealthMonitor">
				<Property Name="httpMonitor" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
				<Property Name="intervalInSec" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="isEnabled" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="tcpMonitor" Type="Edm.String" Nullable="true" MaxLength="2048"></Property>
			</ComplexType>
			<ComplexType Name="LoadBalancerConfigurations">
				<Property Name="algorithm" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="fallBackServer" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="HealthMonitor" Type="apiportal.HealthMonitor"></Property>
				<Property Name="isRetry" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="maxFailures" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="serverUnhealthyResponseCode" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="weigths" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
			</ComplexType>
			<ComplexType Name="History">
				<Property Name="changed_at" Type="Edm.DateTime"></Property>
				<Property Name="changed_by" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="created_at" Type="Edm.DateTime"></Property>
				<Property Name="created_by" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
			</ComplexType>
			<ComplexType Name="ExpirySettings">
				<Property Name="expiry_date" Type="Edm.DateTime" Nullable="true"></Property>
				<Property Name="expiry_settings_override_disabled" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="time_out" Type="Edm.Int32" Nullable="true"></Property>
				<Property Name="time_out_day" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
			</ComplexType>
			<ComplexType Name="SSLInfo">
				<Property Name="ciphers" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="clientAuthEnabled" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="enabled" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="ignoreValidationErrors" Type="Edm.Boolean" Nullable="true"></Property>
				<Property Name="keyAlias" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="keyStore" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="protocols" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
				<Property Name="trustStore" Type="Edm.String" Nullable="true" MaxLength="255"></Property>
			</ComplexType>
			<Association Name="APIProvider_APIProxy_One_Many0">
				<End Type="apiportal.APIProvider" Multiplicity="0..1" Role="APIProvider"></End>
				<End Type="apiportal.APIProxy" Multiplicity="*" Role="APIProxy"></End>
				<ReferentialConstraint>
					<Principal Role="APIProvider">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxy">
						<PropertyRef Name="FK_PROVIDERNAME"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxy_APIProxyDeployment_One_ZeroToOne0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.APIProxyDeployment" Multiplicity="0..1" Role="APIProxyDeployment"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyDeployment">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxy">
						<PropertyRef Name="FK_deploymentinfo_name"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxy_APIProxyEndPoint_One_Many0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="*" Role="APIProxyEndPoint"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxy">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPoint">
						<PropertyRef Name="FK_API_NAME"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_DefaultFaultRule_One_One0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.DefaultFaultRule" Multiplicity="1" Role="DefaultFaultRule"></End>
				<ReferentialConstraint>
					<Principal Role="DefaultFaultRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPoint">
						<PropertyRef Name="FK_DEFAULTFAULTRULE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_FlowRule_One_One0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPoint">
						<PropertyRef Name="FK_POSTCLIENTFLOW_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_FlowRule_One_One1">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPoint">
						<PropertyRef Name="FK_POSTFLOW_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_FlowRule_One_One2">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPoint">
						<PropertyRef Name="FK_PREFLOW_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_APIProxyRevision_Many_One0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="*" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.APIProxyRevision" Multiplicity="1" Role="APIProxyRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyRevision">
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPointRevision">
						<PropertyRef Name="FK_API_NAME"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_DefaultFaultRuleRevision_One_One0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.DefaultFaultRuleRevision" Multiplicity="1" Role="DefaultFaultRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="DefaultFaultRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPointRevision">
						<PropertyRef Name="FK_DEFAULTFAULTRULE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_FlowRuleRevision_One_One0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPointRevision">
						<PropertyRef Name="FK_POSTCLIENTFLOW_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_FlowRuleRevision_One_One1">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPointRevision">
						<PropertyRef Name="FK_POSTFLOW_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_FlowRuleRevision_One_One2">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APIProxyEndPointRevision">
						<PropertyRef Name="FK_PREFLOW_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_APIResource_One_Many0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.APIResource" Multiplicity="*" Role="APIResource"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APIResource">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_APIResourceRevision_One_Many0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.APIResourceRevision" Multiplicity="*" Role="APIResourceRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APIResourceRevision">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxy_APITargetEndPoint_One_Many1">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.APITargetEndPoint" Multiplicity="*" Role="APITargetEndPoint"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxy">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPoint">
						<PropertyRef Name="FK_API_NAME"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_DefaultFaultRule_One_One0">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.DefaultFaultRule" Multiplicity="1" Role="DefaultFaultRule"></End>
				<ReferentialConstraint>
					<Principal Role="DefaultFaultRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPoint">
						<PropertyRef Name="FK_DEFAULTFAULTRULE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_FlowRule_One_One0">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPoint">
						<PropertyRef Name="FK_POSTFLOW_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_FlowRule_One_One1">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPoint">
						<PropertyRef Name="FK_PREFLOW_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_APIProxy_One_ZeroToOne0">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.APIProxy" Multiplicity="0..1" Role="APIProxy"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxy">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPoint">
						<PropertyRef Name="FK_TARGET_API_PROXY"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_APIProxyRevision_Many_One0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="*" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.APIProxyRevision" Multiplicity="1" Role="APIProxyRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyRevision">
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPointRevision">
						<PropertyRef Name="FK_API_NAME"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_DefaultFaultRuleRevision_One_One0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.DefaultFaultRuleRevision" Multiplicity="1" Role="DefaultFaultRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="DefaultFaultRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPointRevision">
						<PropertyRef Name="FK_DEFAULTFAULTRULE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_FlowRuleRevision_One_One0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPointRevision">
						<PropertyRef Name="FK_POSTFLOW_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_FlowRuleRevision_One_One1">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPointRevision">
						<PropertyRef Name="FK_PREFLOW_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_APIProxy_One_ZeroToOne0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.APIProxy" Multiplicity="0..1" Role="APIProxy"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxy">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="APITargetEndPointRevision">
						<PropertyRef Name="FK_TARGET_API_PROXY"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="Application_Developer_One_One0">
				<End Type="apiportal.Application" Multiplicity="1" Role="Application"></End>
				<End Type="apiportal.Developer" Multiplicity="1" Role="Developer"></End>
				<ReferentialConstraint>
					<Principal Role="Developer">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="Application">
						<PropertyRef Name="FK_DEVELOPER_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="AttachmentRevision_APIProxyRevision_Many_One0">
				<End Type="apiportal.AttachmentRevision" Multiplicity="*" Role="AttachmentRevision"></End>
				<End Type="apiportal.APIProxyRevision" Multiplicity="1" Role="APIProxyRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyRevision">
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="AttachmentRevision">
						<PropertyRef Name="object_name"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="Certificate_CertificateStore_Many_ZeroToOne0">
				<End Type="apiportal.Certificate" Multiplicity="*" Role="Certificate"></End>
				<End Type="apiportal.CertificateStore" Multiplicity="0..1" Role="CertificateStore"></End>
				<ReferentialConstraint>
					<Principal Role="CertificateStore">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="Certificate">
						<PropertyRef Name="storeName"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="ConditionalFlowRule_APIResource_One_One0">
				<End Type="apiportal.ConditionalFlowRule" Multiplicity="1" Role="ConditionalFlowRule"></End>
				<End Type="apiportal.APIResource" Multiplicity="1" Role="APIResource"></End>
				<ReferentialConstraint>
					<Principal Role="APIResource">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRule">
						<PropertyRef Name="FK_APIRESOURCE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_ConditionalFlowRule_One_Many0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.ConditionalFlowRule" Multiplicity="*" Role="ConditionalFlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRule">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="ConditionalFlowRule_Stream_One_ZeroToOne0">
				<End Type="apiportal.ConditionalFlowRule" Multiplicity="1" Role="ConditionalFlowRule"></End>
				<End Type="apiportal.Stream" Multiplicity="0..1" Role="Stream"></End>
				<ReferentialConstraint>
					<Principal Role="Stream">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRule">
						<PropertyRef Name="FK_REQUEST_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="ConditionalFlowRule_Stream_One_ZeroToOne1">
				<End Type="apiportal.ConditionalFlowRule" Multiplicity="1" Role="ConditionalFlowRule"></End>
				<End Type="apiportal.Stream" Multiplicity="0..1" Role="Stream"></End>
				<ReferentialConstraint>
					<Principal Role="Stream">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRule">
						<PropertyRef Name="FK_RESPONSE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_ConditionalFlowRule_One_Many0">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.ConditionalFlowRule" Multiplicity="*" Role="ConditionalFlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRule">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="ConditionalFlowRuleRevision_APIResourceRevision_One_One0">
				<End Type="apiportal.ConditionalFlowRuleRevision" Multiplicity="1" Role="ConditionalFlowRuleRevision"></End>
				<End Type="apiportal.APIResourceRevision" Multiplicity="1" Role="APIResourceRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIResourceRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRuleRevision">
						<PropertyRef Name="FK_APIRESOURCE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_ConditionalFlowRuleRevision_One_Many0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.ConditionalFlowRuleRevision" Multiplicity="*" Role="ConditionalFlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRuleRevision">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne0">
				<End Type="apiportal.ConditionalFlowRuleRevision" Multiplicity="1" Role="ConditionalFlowRuleRevision"></End>
				<End Type="apiportal.StreamRevision" Multiplicity="0..1" Role="StreamRevision"></End>
				<ReferentialConstraint>
					<Principal Role="StreamRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRuleRevision">
						<PropertyRef Name="FK_REQUEST_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne1">
				<End Type="apiportal.ConditionalFlowRuleRevision" Multiplicity="1" Role="ConditionalFlowRuleRevision"></End>
				<End Type="apiportal.StreamRevision" Multiplicity="0..1" Role="StreamRevision"></End>
				<ReferentialConstraint>
					<Principal Role="StreamRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRuleRevision">
						<PropertyRef Name="FK_RESPONSE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_ConditionalFlowRuleRevision_One_Many0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.ConditionalFlowRuleRevision" Multiplicity="*" Role="ConditionalFlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="ConditionalFlowRuleRevision">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="DefaultFaultRule_APIProxyEndPoint_Many_One0">
				<End Type="apiportal.DefaultFaultRule" Multiplicity="*" Role="DefaultFaultRule"></End>
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="DefaultFaultRule">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="DefaultFaultRule_APITargetEndPoint_Many_One0">
				<End Type="apiportal.DefaultFaultRule" Multiplicity="*" Role="DefaultFaultRule"></End>
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="DefaultFaultRule">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="DefaultFaultRuleRevision_APIProxyEndPointRevision_Many_One0">
				<End Type="apiportal.DefaultFaultRuleRevision" Multiplicity="*" Role="DefaultFaultRuleRevision"></End>
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="DefaultFaultRuleRevision">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="DefaultFaultRuleRevision_APITargetEndPointRevision_Many_One0">
				<End Type="apiportal.DefaultFaultRuleRevision" Multiplicity="*" Role="DefaultFaultRuleRevision"></End>
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="DefaultFaultRuleRevision">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIResource_Documentation_One_Many0">
				<End Type="apiportal.APIResource" Multiplicity="1" Role="APIResource"></End>
				<End Type="apiportal.Documentation" Multiplicity="*" Role="Documentation"></End>
				<ReferentialConstraint>
					<Principal Role="APIResource">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="Documentation">
						<PropertyRef Name="FK_APIRESOURCE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIResourceRevision_DocumentationRevision_One_Many0">
				<End Type="apiportal.APIResourceRevision" Multiplicity="1" Role="APIResourceRevision"></End>
				<End Type="apiportal.DocumentationRevision" Multiplicity="*" Role="DocumentationRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIResourceRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="DocumentationRevision">
						<PropertyRef Name="FK_APIRESOURCE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_EndPointProperty_One_Many0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.EndPointProperty" Multiplicity="*" Role="EndPointProperty"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="EndPointProperty">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_EndPointProperty_One_Many0">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.EndPointProperty" Multiplicity="*" Role="EndPointProperty"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="EndPointProperty">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_EndPointPropertyRevision_One_Many0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.EndPointPropertyRevision" Multiplicity="*" Role="EndPointPropertyRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="EndPointPropertyRevision">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_EndPointPropertyRevision_One_Many0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.EndPointPropertyRevision" Multiplicity="*" Role="EndPointPropertyRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="EndPointPropertyRevision">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_FaultRule_One_Many0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.FaultRule" Multiplicity="*" Role="FaultRule"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="FaultRule">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FaultRule_RouteRule_Many_One0">
				<End Type="apiportal.FaultRule" Multiplicity="*" Role="FaultRule"></End>
				<End Type="apiportal.RouteRule" Multiplicity="1" Role="RouteRule"></End>
				<ReferentialConstraint>
					<Principal Role="RouteRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="FaultRule">
						<PropertyRef Name="FK_ROUTERULE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPoint_FaultRule_One_Many0">
				<End Type="apiportal.APITargetEndPoint" Multiplicity="1" Role="APITargetEndPoint"></End>
				<End Type="apiportal.FaultRule" Multiplicity="*" Role="FaultRule"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="FaultRule">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_FaultRuleRevision_One_Many0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.FaultRuleRevision" Multiplicity="*" Role="FaultRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="FaultRuleRevision">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FaultRuleRevision_RouteRuleRevision_Many_One0">
				<End Type="apiportal.FaultRuleRevision" Multiplicity="*" Role="FaultRuleRevision"></End>
				<End Type="apiportal.RouteRuleRevision" Multiplicity="1" Role="RouteRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="RouteRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="FaultRuleRevision">
						<PropertyRef Name="FK_ROUTERULE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_FaultRuleRevision_One_Many0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="1" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.FaultRuleRevision" Multiplicity="*" Role="FaultRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APITargetEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="FaultRuleRevision">
						<PropertyRef Name="FK_TARGETENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FlowRule_Stream_One_ZeroToOne0">
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<End Type="apiportal.Stream" Multiplicity="0..1" Role="Stream"></End>
				<ReferentialConstraint>
					<Principal Role="Stream">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="FlowRule">
						<PropertyRef Name="FK_REQUEST_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FlowRule_Stream_One_ZeroToOne1">
				<End Type="apiportal.FlowRule" Multiplicity="1" Role="FlowRule"></End>
				<End Type="apiportal.Stream" Multiplicity="0..1" Role="Stream"></End>
				<ReferentialConstraint>
					<Principal Role="Stream">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="FlowRule">
						<PropertyRef Name="FK_RESPONSE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FlowRuleRevision_StreamRevision_One_ZeroToOne0">
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<End Type="apiportal.StreamRevision" Multiplicity="0..1" Role="StreamRevision"></End>
				<ReferentialConstraint>
					<Principal Role="StreamRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="FlowRuleRevision">
						<PropertyRef Name="FK_REQUEST_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FlowRuleRevision_StreamRevision_One_ZeroToOne1">
				<End Type="apiportal.FlowRuleRevision" Multiplicity="1" Role="FlowRuleRevision"></End>
				<End Type="apiportal.StreamRevision" Multiplicity="0..1" Role="StreamRevision"></End>
				<ReferentialConstraint>
					<Principal Role="StreamRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="FlowRuleRevision">
						<PropertyRef Name="FK_RESPONSE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="GenericKeyMapEntry_GenericKeyMapEntryValue_One_Many0">
				<End Type="apiportal.GenericKeyMapEntry" Multiplicity="0..1" Role="GenericKeyMapEntry"></End>
				<End Type="apiportal.GenericKeyMapEntryValue" Multiplicity="*" Role="GenericKeyMapEntryValue"></End>
				<ReferentialConstraint>
					<Principal Role="GenericKeyMapEntry">
						<PropertyRef Name="name"></PropertyRef>
						<PropertyRef Name="scope"></PropertyRef>
						<PropertyRef Name="scopeId"></PropertyRef>
					</Principal>
					<Dependent Role="GenericKeyMapEntryValue">
						<PropertyRef Name="mapName"></PropertyRef>
						<PropertyRef Name="scope"></PropertyRef>
						<PropertyRef Name="scopeId"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="KeyMapEntry_KeyMapEntryValue_One_Many0">
				<End Type="apiportal.KeyMapEntry" Multiplicity="0..1" Role="KeyMapEntry"></End>
				<End Type="apiportal.KeyMapEntryValue" Multiplicity="*" Role="KeyMapEntryValue"></End>
				<ReferentialConstraint>
					<Principal Role="KeyMapEntry">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="KeyMapEntryValue">
						<PropertyRef Name="map_name"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxy_Policy_One_Many0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.Policy" Multiplicity="*" Role="Policy"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxy">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="Policy">
						<PropertyRef Name="FK_API_NAME"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="PolicyRevision_APIProxyRevision_Many_One0">
				<End Type="apiportal.PolicyRevision" Multiplicity="*" Role="PolicyRevision"></End>
				<End Type="apiportal.APIProxyRevision" Multiplicity="1" Role="APIProxyRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyRevision">
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="PolicyRevision">
						<PropertyRef Name="FK_API_NAME"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPoint_RouteRule_One_Many0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="1" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.RouteRule" Multiplicity="*" Role="RouteRule"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPoint">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="RouteRule">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APIProxyEndPointRevision_RouteRuleRevision_One_Many0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="1" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.RouteRuleRevision" Multiplicity="*" Role="RouteRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="APIProxyEndPointRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="RouteRuleRevision">
						<PropertyRef Name="FK_PROXYENDPOINT_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="DefaultFaultRule_Step_One_Many0">
				<End Type="apiportal.DefaultFaultRule" Multiplicity="1" Role="DefaultFaultRule"></End>
				<End Type="apiportal.Step" Multiplicity="*" Role="Step"></End>
				<ReferentialConstraint>
					<Principal Role="DefaultFaultRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="Step">
						<PropertyRef Name="FK_DEFAULTFAULTRULE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FaultRule_Step_One_Many0">
				<End Type="apiportal.FaultRule" Multiplicity="1" Role="FaultRule"></End>
				<End Type="apiportal.Step" Multiplicity="*" Role="Step"></End>
				<ReferentialConstraint>
					<Principal Role="FaultRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="Step">
						<PropertyRef Name="FK_FAULTRULE_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="Step_Stream_Many_One0">
				<End Type="apiportal.Step" Multiplicity="*" Role="Step"></End>
				<End Type="apiportal.Stream" Multiplicity="1" Role="Stream"></End>
				<ReferentialConstraint>
					<Principal Role="Stream">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="Step">
						<PropertyRef Name="FK_STREAM_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="DefaultFaultRuleRevision_StepRevision_One_Many0">
				<End Type="apiportal.DefaultFaultRuleRevision" Multiplicity="1" Role="DefaultFaultRuleRevision"></End>
				<End Type="apiportal.StepRevision" Multiplicity="*" Role="StepRevision"></End>
				<ReferentialConstraint>
					<Principal Role="DefaultFaultRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="StepRevision">
						<PropertyRef Name="FK_DEFAULTFAULTRULE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="FaultRuleRevision_StepRevision_One_Many0">
				<End Type="apiportal.FaultRuleRevision" Multiplicity="1" Role="FaultRuleRevision"></End>
				<End Type="apiportal.StepRevision" Multiplicity="*" Role="StepRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FaultRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="StepRevision">
						<PropertyRef Name="FK_FAULTRULE_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="StepRevision_StreamRevision_Many_One0">
				<End Type="apiportal.StepRevision" Multiplicity="*" Role="StepRevision"></End>
				<End Type="apiportal.StreamRevision" Multiplicity="1" Role="StreamRevision"></End>
				<ReferentialConstraint>
					<Principal Role="StreamRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="StepRevision">
						<PropertyRef Name="FK_STREAM_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="Stream_FlowRule_One_ZeroToOne0">
				<End Type="apiportal.Stream" Multiplicity="1" Role="Stream"></End>
				<End Type="apiportal.FlowRule" Multiplicity="0..1" Role="FlowRule"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRule">
						<PropertyRef Name="id"></PropertyRef>
					</Principal>
					<Dependent Role="Stream">
						<PropertyRef Name="FK_FLOW_ID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="StreamRevision_FlowRuleRevision_One_ZeroToOne0">
				<End Type="apiportal.StreamRevision" Multiplicity="1" Role="StreamRevision"></End>
				<End Type="apiportal.FlowRuleRevision" Multiplicity="0..1" Role="FlowRuleRevision"></End>
				<ReferentialConstraint>
					<Principal Role="FlowRuleRevision">
						<PropertyRef Name="id"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Principal>
					<Dependent Role="StreamRevision">
						<PropertyRef Name="FK_FLOW_ID"></PropertyRef>
						<PropertyRef Name="revisionID"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="PolicyTemplateContainer_TemplateFileResource_One_Many0">
				<End Type="apiportal.PolicyTemplateContainer" Multiplicity="1" Role="PolicyTemplateContainer"></End>
				<End Type="apiportal.TemplateFileResource" Multiplicity="*" Role="TemplateFileResource"></End>
				<ReferentialConstraint>
					<Principal Role="PolicyTemplateContainer">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="TemplateFileResource">
						<PropertyRef Name="FK_TEMPLATE_NAME"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="PolicyTemplateContainer_TemplatePolicy_One_Many0">
				<End Type="apiportal.PolicyTemplateContainer" Multiplicity="1" Role="PolicyTemplateContainer"></End>
				<End Type="apiportal.TemplatePolicy" Multiplicity="*" Role="TemplatePolicy"></End>
				<ReferentialConstraint>
					<Principal Role="PolicyTemplateContainer">
						<PropertyRef Name="name"></PropertyRef>
					</Principal>
					<Dependent Role="TemplatePolicy">
						<PropertyRef Name="FK_TEMPLATE_NAME"></PropertyRef>
					</Dependent>
				</ReferentialConstraint>
			</Association>
			<Association Name="APITargetEndPointRevision_APIProvider_Many_Many0">
				<End Type="apiportal.APITargetEndPointRevision" Multiplicity="*" Role="APITargetEndPointRevision"></End>
				<End Type="apiportal.APIProvider" Multiplicity="*" Role="APIProvider"></End>
			</Association>
			<Association Name="APIProduct_APIProductAdditionalProperty_One_Many0">
				<End Type="apiportal.APIProduct" Multiplicity="1" Role="APIProduct"></End>
				<End Type="apiportal.APIProductAdditionalProperty" Multiplicity="*" Role="APIProductAdditionalProperty"></End>
			</Association>
			<Association Name="APIProxy_APIProxy_One_Many0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.APIProxy" Multiplicity="*" Role="APIProxy2"></End>
			</Association>
			<Association Name="ContentPackageMapper_APIProxy_One_ZeroToOne0">
				<End Type="apiportal.ContentPackageMapper" Multiplicity="1" Role="ContentPackageMapper"></End>
				<End Type="apiportal.APIProxy" Multiplicity="0..1" Role="APIProxy"></End>
			</Association>
			<Association Name="Developer_Application_One_Many0">
				<End Type="apiportal.Developer" Multiplicity="1" Role="Developer"></End>
				<End Type="apiportal.Application" Multiplicity="*" Role="Application"></End>
			</Association>
			<Association Name="Application_ApplicationAdditionalProperty_One_Many0">
				<End Type="apiportal.Application" Multiplicity="1" Role="Application"></End>
				<End Type="apiportal.ApplicationAdditionalProperty" Multiplicity="*" Role="ApplicationAdditionalProperty"></End>
			</Association>
			<Association Name="APIProduct_Application_Many_Many0">
				<End Type="apiportal.APIProduct" Multiplicity="*" Role="APIProduct"></End>
				<End Type="apiportal.Application" Multiplicity="*" Role="Application"></End>
			</Association>
			<Association Name="Application_Resource_One_Many0">
				<End Type="apiportal.Application" Multiplicity="1" Role="Application"></End>
				<End Type="apiportal.Resource" Multiplicity="*" Role="Resource"></End>
			</Association>
			<Association Name="APIProduct_APIProxy_Many_Many0">
				<End Type="apiportal.APIProduct" Multiplicity="*" Role="APIProduct"></End>
				<End Type="apiportal.APIProxy" Multiplicity="*" Role="APIProxy"></End>
			</Association>
			<Association Name="APIProxy_FileResource_Many_Many0">
				<End Type="apiportal.APIProxy" Multiplicity="*" Role="APIProxy"></End>
				<End Type="apiportal.FileResource" Multiplicity="*" Role="FileResource"></End>
			</Association>
			<Association Name="APIResourceRevision_ResourceRevision_One_Many0">
				<End Type="apiportal.APIResourceRevision" Multiplicity="1" Role="APIResourceRevision"></End>
				<End Type="apiportal.ResourceRevision" Multiplicity="*" Role="ResourceRevision"></End>
			</Association>
			<Association Name="APIProxyEndPointRevision_VirtualHost_Many_Many0">
				<End Type="apiportal.APIProxyEndPointRevision" Multiplicity="*" Role="APIProxyEndPointRevision"></End>
				<End Type="apiportal.VirtualHost" Multiplicity="*" Role="VirtualHost"></End>
			</Association>
			<Association Name="APIProvider_APITargetEndPoint_Many_Many0">
				<End Type="apiportal.APIProvider" Multiplicity="*" Role="APIProvider"></End>
				<End Type="apiportal.APITargetEndPoint" Multiplicity="*" Role="APITargetEndPoint"></End>
			</Association>
			<Association Name="APIProxy_APIProxy_One_One0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy2"></End>
			</Association>
			<Association Name="APIProxyEndPoint_VirtualHost_Many_Many0">
				<End Type="apiportal.APIProxyEndPoint" Multiplicity="*" Role="APIProxyEndPoint"></End>
				<End Type="apiportal.VirtualHost" Multiplicity="*" Role="VirtualHost"></End>
			</Association>
			<Association Name="APIProduct_APIResource_One_Many0">
				<End Type="apiportal.APIProduct" Multiplicity="1" Role="APIProduct"></End>
				<End Type="apiportal.APIResource" Multiplicity="*" Role="APIResource"></End>
			</Association>
			<Association Name="APIResource_Resource_One_Many0">
				<End Type="apiportal.APIResource" Multiplicity="1" Role="APIResource"></End>
				<End Type="apiportal.Resource" Multiplicity="*" Role="Resource"></End>
			</Association>
			<Association Name="APIProxy_APITargetEndPoint_One_Many0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.APITargetEndPoint" Multiplicity="*" Role="APITargetEndPoint"></End>
			</Association>
			<Association Name="APIProduct_RatePlan_Many_Many0">
				<End Type="apiportal.APIProduct" Multiplicity="*" Role="APIProduct"></End>
				<End Type="apiportal.RatePlan" Multiplicity="*" Role="RatePlan"></End>
			</Association>
			<Association Name="APIProvider_APIProviderAdditionalProperty_One_Many0">
				<End Type="apiportal.APIProvider" Multiplicity="1" Role="APIProvider"></End>
				<End Type="apiportal.APIProviderAdditionalProperty" Multiplicity="*" Role="APIProviderAdditionalProperty"></End>
			</Association>
			<Association Name="RatePlan_Resource_One_Many0">
				<End Type="apiportal.RatePlan" Multiplicity="1" Role="RatePlan"></End>
				<End Type="apiportal.Resource" Multiplicity="*" Role="Resource"></End>
			</Association>
			<Association Name="APIProvider_Resource_One_Many0">
				<End Type="apiportal.APIProvider" Multiplicity="1" Role="APIProvider"></End>
				<End Type="apiportal.Resource" Multiplicity="*" Role="Resource"></End>
			</Association>
			<Association Name="APIProxy_Resource_One_Many0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.Resource" Multiplicity="*" Role="Resource"></End>
			</Association>
			<Association Name="FileResourceRevision_APIProxyRevision_Many_Many0">
				<End Type="apiportal.FileResourceRevision" Multiplicity="*" Role="FileResourceRevision"></End>
				<End Type="apiportal.APIProxyRevision" Multiplicity="*" Role="APIProxyRevision"></End>
			</Association>
			<Association Name="APIProxy_ContentPackageMapper_One_ZeroToOne0">
				<End Type="apiportal.APIProxy" Multiplicity="1" Role="APIProxy"></End>
				<End Type="apiportal.ContentPackageMapper" Multiplicity="0..1" Role="ContentPackageMapper"></End>
			</Association>
			<Association Name="APIProduct_Resource_One_Many0">
				<End Type="apiportal.APIProduct" Multiplicity="1" Role="APIProduct"></End>
				<End Type="apiportal.Resource" Multiplicity="*" Role="Resource"></End>
			</Association>
			<Association Name="APIProvider_KeyMapEntry_One_Many0">
				<End Type="apiportal.APIProvider" Multiplicity="1" Role="APIProvider"></End>
				<End Type="apiportal.KeyMapEntry" Multiplicity="*" Role="KeyMapEntry"></End>
			</Association>
			<EntityContainer Name="apiportalContainer" m:IsDefaultEntityContainer="true">
				<EntitySet Name="ACLProductLinkages" EntityType="apiportal.ACLProductLinkage"></EntitySet>
				<EntitySet Name="APIProducts" EntityType="apiportal.APIProduct"></EntitySet>
				<EntitySet Name="APIProductAdditionalProperties" EntityType="apiportal.APIProductAdditionalProperty"></EntitySet>
				<EntitySet Name="APIProviders" EntityType="apiportal.APIProvider"></EntitySet>
				<EntitySet Name="APIProviderAdditionalPropertys" EntityType="apiportal.APIProviderAdditionalProperty"></EntitySet>
				<EntitySet Name="APIProxies" EntityType="apiportal.APIProxy"></EntitySet>
				<EntitySet Name="APIProxyDeployments" EntityType="apiportal.APIProxyDeployment"></EntitySet>
				<EntitySet Name="APIProxyEndPoints" EntityType="apiportal.APIProxyEndPoint"></EntitySet>
				<EntitySet Name="APIProxyEndPointRevisions" EntityType="apiportal.APIProxyEndPointRevision"></EntitySet>
				<EntitySet Name="APIProxyRevisions" EntityType="apiportal.APIProxyRevision"></EntitySet>
				<EntitySet Name="APIResources" EntityType="apiportal.APIResource"></EntitySet>
				<EntitySet Name="APIResourceRevisions" EntityType="apiportal.APIResourceRevision"></EntitySet>
				<EntitySet Name="APITargetEndPoints" EntityType="apiportal.APITargetEndPoint"></EntitySet>
				<EntitySet Name="APITargetEndPointRevisions" EntityType="apiportal.APITargetEndPointRevision"></EntitySet>
				<EntitySet Name="ApiportalCloneMappings" EntityType="apiportal.ApiportalCloneMapping"></EntitySet>
				<EntitySet Name="Applications" EntityType="apiportal.Application"></EntitySet>
				<EntitySet Name="ApplicationAdditionalPropertys" EntityType="apiportal.ApplicationAdditionalProperty"></EntitySet>
				<EntitySet Name="AttachmentRevisions" EntityType="apiportal.AttachmentRevision"></EntitySet>
				<EntitySet Name="Bills" EntityType="apiportal.Bill"></EntitySet>
				<EntitySet Name="CacheResources" EntityType="apiportal.CacheResource"></EntitySet>
				<EntitySet Name="Certificates" EntityType="apiportal.Certificate"></EntitySet>
				<EntitySet Name="CertificateStores" EntityType="apiportal.CertificateStore"></EntitySet>
				<EntitySet Name="CertificateStoreReferences" EntityType="apiportal.CertificateStoreReference"></EntitySet>
				<EntitySet Name="ConditionalFlowRules" EntityType="apiportal.ConditionalFlowRule"></EntitySet>
				<EntitySet Name="ConditionalFlowRuleRevisions" EntityType="apiportal.ConditionalFlowRuleRevision"></EntitySet>
				<EntitySet Name="ContentPackageMappers" EntityType="apiportal.ContentPackageMapper"></EntitySet>
				<EntitySet Name="DefaultFaultRules" EntityType="apiportal.DefaultFaultRule"></EntitySet>
				<EntitySet Name="DefaultFaultRuleRevisions" EntityType="apiportal.DefaultFaultRuleRevision"></EntitySet>
				<EntitySet Name="DestinationAndUrlMappings" EntityType="apiportal.DestinationAndUrlMapping"></EntitySet>
				<EntitySet Name="Developers" EntityType="apiportal.Developer"></EntitySet>
				<EntitySet Name="Documentations" EntityType="apiportal.Documentation"></EntitySet>
				<EntitySet Name="DocumentationRevisions" EntityType="apiportal.DocumentationRevision"></EntitySet>
				<EntitySet Name="EndPointProperties" EntityType="apiportal.EndPointProperty"></EntitySet>
				<EntitySet Name="EndPointPropertyRevisions" EntityType="apiportal.EndPointPropertyRevision"></EntitySet>
				<EntitySet Name="FaultRules" EntityType="apiportal.FaultRule"></EntitySet>
				<EntitySet Name="FaultRuleRevisions" EntityType="apiportal.FaultRuleRevision"></EntitySet>
				<EntitySet Name="FileResources" EntityType="apiportal.FileResource"></EntitySet>
				<EntitySet Name="FileResourceRevisions" EntityType="apiportal.FileResourceRevision"></EntitySet>
				<EntitySet Name="FlowRules" EntityType="apiportal.FlowRule"></EntitySet>
				<EntitySet Name="FlowRuleRevisions" EntityType="apiportal.FlowRuleRevision"></EntitySet>
				<EntitySet Name="GenericKeyMapEntries" EntityType="apiportal.GenericKeyMapEntry"></EntitySet>
				<EntitySet Name="GenericKeyMapEntryValues" EntityType="apiportal.GenericKeyMapEntryValue"></EntitySet>
				<EntitySet Name="KeyMapEntries" EntityType="apiportal.KeyMapEntry"></EntitySet>
				<EntitySet Name="KeyMapEntryValues" EntityType="apiportal.KeyMapEntryValue"></EntitySet>
				<EntitySet Name="Policies" EntityType="apiportal.Policy"></EntitySet>
				<EntitySet Name="PolicyRevisions" EntityType="apiportal.PolicyRevision"></EntitySet>
				<EntitySet Name="PolicyTemplateContainers" EntityType="apiportal.PolicyTemplateContainer"></EntitySet>
				<EntitySet Name="RatePlans" EntityType="apiportal.RatePlan"></EntitySet>
				<EntitySet Name="Resources" EntityType="apiportal.Resource"></EntitySet>
				<EntitySet Name="ResourceRevisions" EntityType="apiportal.ResourceRevision"></EntitySet>
				<EntitySet Name="RouteRules" EntityType="apiportal.RouteRule"></EntitySet>
				<EntitySet Name="RouteRuleRevisions" EntityType="apiportal.RouteRuleRevision"></EntitySet>
				<EntitySet Name="Steps" EntityType="apiportal.Step"></EntitySet>
				<EntitySet Name="StepRevisions" EntityType="apiportal.StepRevision"></EntitySet>
				<EntitySet Name="Streams" EntityType="apiportal.Stream"></EntitySet>
				<EntitySet Name="StreamRevisions" EntityType="apiportal.StreamRevision"></EntitySet>
				<EntitySet Name="TemplateFileResources" EntityType="apiportal.TemplateFileResource"></EntitySet>
				<EntitySet Name="TemplatePolicys" EntityType="apiportal.TemplatePolicy"></EntitySet>
				<EntitySet Name="VirtualHosts" EntityType="apiportal.VirtualHost"></EntitySet>
				<AssociationSet Name="APIProvider_APIProxy_One_Many0Set" Association="apiportal.APIProvider_APIProxy_One_Many0">
					<End EntitySet="APIProviders" Role="APIProvider"></End>
					<End EntitySet="APIProxies" Role="APIProxy"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_APIProxyDeployment_One_ZeroToOne0Set" Association="apiportal.APIProxy_APIProxyDeployment_One_ZeroToOne0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="APIProxyDeployments" Role="APIProxyDeployment"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_APIProxyEndPoint_One_Many0Set" Association="apiportal.APIProxy_APIProxyEndPoint_One_Many0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_DefaultFaultRule_One_One0Set" Association="apiportal.APIProxyEndPoint_DefaultFaultRule_One_One0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="DefaultFaultRules" Role="DefaultFaultRule"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_FlowRule_One_One0Set" Association="apiportal.APIProxyEndPoint_FlowRule_One_One0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="FlowRules" Role="FlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_FlowRule_One_One1Set" Association="apiportal.APIProxyEndPoint_FlowRule_One_One1">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="FlowRules" Role="FlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_FlowRule_One_One2Set" Association="apiportal.APIProxyEndPoint_FlowRule_One_One2">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="FlowRules" Role="FlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_APIProxyRevision_Many_One0Set" Association="apiportal.APIProxyEndPointRevision_APIProxyRevision_Many_One0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="APIProxyRevisions" Role="APIProxyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_DefaultFaultRuleRevision_One_One0Set" Association="apiportal.APIProxyEndPointRevision_DefaultFaultRuleRevision_One_One0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="DefaultFaultRuleRevisions" Role="DefaultFaultRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_FlowRuleRevision_One_One0Set" Association="apiportal.APIProxyEndPointRevision_FlowRuleRevision_One_One0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_FlowRuleRevision_One_One1Set" Association="apiportal.APIProxyEndPointRevision_FlowRuleRevision_One_One1">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_FlowRuleRevision_One_One2Set" Association="apiportal.APIProxyEndPointRevision_FlowRuleRevision_One_One2">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_APIResource_One_Many0Set" Association="apiportal.APIProxyEndPoint_APIResource_One_Many0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="APIResources" Role="APIResource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_APIResourceRevision_One_Many0Set" Association="apiportal.APIProxyEndPointRevision_APIResourceRevision_One_Many0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="APIResourceRevisions" Role="APIResourceRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_APITargetEndPoint_One_Many1Set" Association="apiportal.APIProxy_APITargetEndPoint_One_Many1">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_DefaultFaultRule_One_One0Set" Association="apiportal.APITargetEndPoint_DefaultFaultRule_One_One0">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="DefaultFaultRules" Role="DefaultFaultRule"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_FlowRule_One_One0Set" Association="apiportal.APITargetEndPoint_FlowRule_One_One0">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="FlowRules" Role="FlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_FlowRule_One_One1Set" Association="apiportal.APITargetEndPoint_FlowRule_One_One1">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="FlowRules" Role="FlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_APIProxy_One_ZeroToOne0Set" Association="apiportal.APITargetEndPoint_APIProxy_One_ZeroToOne0">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="APIProxies" Role="APIProxy"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_APIProxyRevision_Many_One0Set" Association="apiportal.APITargetEndPointRevision_APIProxyRevision_Many_One0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="APIProxyRevisions" Role="APIProxyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_DefaultFaultRuleRevision_One_One0Set" Association="apiportal.APITargetEndPointRevision_DefaultFaultRuleRevision_One_One0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="DefaultFaultRuleRevisions" Role="DefaultFaultRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_FlowRuleRevision_One_One0Set" Association="apiportal.APITargetEndPointRevision_FlowRuleRevision_One_One0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_FlowRuleRevision_One_One1Set" Association="apiportal.APITargetEndPointRevision_FlowRuleRevision_One_One1">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_APIProxy_One_ZeroToOne0Set" Association="apiportal.APITargetEndPointRevision_APIProxy_One_ZeroToOne0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="APIProxies" Role="APIProxy"></End>
				</AssociationSet>
				<AssociationSet Name="Application_Developer_One_One0Set" Association="apiportal.Application_Developer_One_One0">
					<End EntitySet="Applications" Role="Application"></End>
					<End EntitySet="Developers" Role="Developer"></End>
				</AssociationSet>
				<AssociationSet Name="AttachmentRevision_APIProxyRevision_Many_One0Set" Association="apiportal.AttachmentRevision_APIProxyRevision_Many_One0">
					<End EntitySet="AttachmentRevisions" Role="AttachmentRevision"></End>
					<End EntitySet="APIProxyRevisions" Role="APIProxyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="Certificate_CertificateStore_Many_ZeroToOne0Set" Association="apiportal.Certificate_CertificateStore_Many_ZeroToOne0">
					<End EntitySet="Certificates" Role="Certificate"></End>
					<End EntitySet="CertificateStores" Role="CertificateStore"></End>
				</AssociationSet>
				<AssociationSet Name="ConditionalFlowRule_APIResource_One_One0Set" Association="apiportal.ConditionalFlowRule_APIResource_One_One0">
					<End EntitySet="ConditionalFlowRules" Role="ConditionalFlowRule"></End>
					<End EntitySet="APIResources" Role="APIResource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_ConditionalFlowRule_One_Many0Set" Association="apiportal.APIProxyEndPoint_ConditionalFlowRule_One_Many0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="ConditionalFlowRules" Role="ConditionalFlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="ConditionalFlowRule_Stream_One_ZeroToOne0Set" Association="apiportal.ConditionalFlowRule_Stream_One_ZeroToOne0">
					<End EntitySet="ConditionalFlowRules" Role="ConditionalFlowRule"></End>
					<End EntitySet="Streams" Role="Stream"></End>
				</AssociationSet>
				<AssociationSet Name="ConditionalFlowRule_Stream_One_ZeroToOne1Set" Association="apiportal.ConditionalFlowRule_Stream_One_ZeroToOne1">
					<End EntitySet="ConditionalFlowRules" Role="ConditionalFlowRule"></End>
					<End EntitySet="Streams" Role="Stream"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_ConditionalFlowRule_One_Many0Set" Association="apiportal.APITargetEndPoint_ConditionalFlowRule_One_Many0">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="ConditionalFlowRules" Role="ConditionalFlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="ConditionalFlowRuleRevision_APIResourceRevision_One_One0Set" Association="apiportal.ConditionalFlowRuleRevision_APIResourceRevision_One_One0">
					<End EntitySet="ConditionalFlowRuleRevisions" Role="ConditionalFlowRuleRevision"></End>
					<End EntitySet="APIResourceRevisions" Role="APIResourceRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_ConditionalFlowRuleRevision_One_Many0Set" Association="apiportal.APIProxyEndPointRevision_ConditionalFlowRuleRevision_One_Many0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="ConditionalFlowRuleRevisions" Role="ConditionalFlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne0Set" Association="apiportal.ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne0">
					<End EntitySet="ConditionalFlowRuleRevisions" Role="ConditionalFlowRuleRevision"></End>
					<End EntitySet="StreamRevisions" Role="StreamRevision"></End>
				</AssociationSet>
				<AssociationSet Name="ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne1Set" Association="apiportal.ConditionalFlowRuleRevision_StreamRevision_One_ZeroToOne1">
					<End EntitySet="ConditionalFlowRuleRevisions" Role="ConditionalFlowRuleRevision"></End>
					<End EntitySet="StreamRevisions" Role="StreamRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_ConditionalFlowRuleRevision_One_Many0Set" Association="apiportal.APITargetEndPointRevision_ConditionalFlowRuleRevision_One_Many0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="ConditionalFlowRuleRevisions" Role="ConditionalFlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="DefaultFaultRule_APIProxyEndPoint_Many_One0Set" Association="apiportal.DefaultFaultRule_APIProxyEndPoint_Many_One0">
					<End EntitySet="DefaultFaultRules" Role="DefaultFaultRule"></End>
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
				</AssociationSet>
				<AssociationSet Name="DefaultFaultRule_APITargetEndPoint_Many_One0Set" Association="apiportal.DefaultFaultRule_APITargetEndPoint_Many_One0">
					<End EntitySet="DefaultFaultRules" Role="DefaultFaultRule"></End>
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
				</AssociationSet>
				<AssociationSet Name="DefaultFaultRuleRevision_APIProxyEndPointRevision_Many_One0Set" Association="apiportal.DefaultFaultRuleRevision_APIProxyEndPointRevision_Many_One0">
					<End EntitySet="DefaultFaultRuleRevisions" Role="DefaultFaultRuleRevision"></End>
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
				</AssociationSet>
				<AssociationSet Name="DefaultFaultRuleRevision_APITargetEndPointRevision_Many_One0Set" Association="apiportal.DefaultFaultRuleRevision_APITargetEndPointRevision_Many_One0">
					<End EntitySet="DefaultFaultRuleRevisions" Role="DefaultFaultRuleRevision"></End>
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIResource_Documentation_One_Many0Set" Association="apiportal.APIResource_Documentation_One_Many0">
					<End EntitySet="APIResources" Role="APIResource"></End>
					<End EntitySet="Documentations" Role="Documentation"></End>
				</AssociationSet>
				<AssociationSet Name="APIResourceRevision_DocumentationRevision_One_Many0Set" Association="apiportal.APIResourceRevision_DocumentationRevision_One_Many0">
					<End EntitySet="APIResourceRevisions" Role="APIResourceRevision"></End>
					<End EntitySet="DocumentationRevisions" Role="DocumentationRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_EndPointProperty_One_Many0Set" Association="apiportal.APIProxyEndPoint_EndPointProperty_One_Many0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="EndPointProperties" Role="EndPointProperty"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_EndPointProperty_One_Many0Set" Association="apiportal.APITargetEndPoint_EndPointProperty_One_Many0">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="EndPointProperties" Role="EndPointProperty"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_EndPointPropertyRevision_One_Many0Set" Association="apiportal.APIProxyEndPointRevision_EndPointPropertyRevision_One_Many0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="EndPointPropertyRevisions" Role="EndPointPropertyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_EndPointPropertyRevision_One_Many0Set" Association="apiportal.APITargetEndPointRevision_EndPointPropertyRevision_One_Many0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="EndPointPropertyRevisions" Role="EndPointPropertyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_FaultRule_One_Many0Set" Association="apiportal.APIProxyEndPoint_FaultRule_One_Many0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="FaultRules" Role="FaultRule"></End>
				</AssociationSet>
				<AssociationSet Name="FaultRule_RouteRule_Many_One0Set" Association="apiportal.FaultRule_RouteRule_Many_One0">
					<End EntitySet="FaultRules" Role="FaultRule"></End>
					<End EntitySet="RouteRules" Role="RouteRule"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPoint_FaultRule_One_Many0Set" Association="apiportal.APITargetEndPoint_FaultRule_One_Many0">
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
					<End EntitySet="FaultRules" Role="FaultRule"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_FaultRuleRevision_One_Many0Set" Association="apiportal.APIProxyEndPointRevision_FaultRuleRevision_One_Many0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="FaultRuleRevisions" Role="FaultRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="FaultRuleRevision_RouteRuleRevision_Many_One0Set" Association="apiportal.FaultRuleRevision_RouteRuleRevision_Many_One0">
					<End EntitySet="FaultRuleRevisions" Role="FaultRuleRevision"></End>
					<End EntitySet="RouteRuleRevisions" Role="RouteRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_FaultRuleRevision_One_Many0Set" Association="apiportal.APITargetEndPointRevision_FaultRuleRevision_One_Many0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="FaultRuleRevisions" Role="FaultRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="FlowRule_Stream_One_ZeroToOne0Set" Association="apiportal.FlowRule_Stream_One_ZeroToOne0">
					<End EntitySet="FlowRules" Role="FlowRule"></End>
					<End EntitySet="Streams" Role="Stream"></End>
				</AssociationSet>
				<AssociationSet Name="FlowRule_Stream_One_ZeroToOne1Set" Association="apiportal.FlowRule_Stream_One_ZeroToOne1">
					<End EntitySet="FlowRules" Role="FlowRule"></End>
					<End EntitySet="Streams" Role="Stream"></End>
				</AssociationSet>
				<AssociationSet Name="FlowRuleRevision_StreamRevision_One_ZeroToOne0Set" Association="apiportal.FlowRuleRevision_StreamRevision_One_ZeroToOne0">
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
					<End EntitySet="StreamRevisions" Role="StreamRevision"></End>
				</AssociationSet>
				<AssociationSet Name="FlowRuleRevision_StreamRevision_One_ZeroToOne1Set" Association="apiportal.FlowRuleRevision_StreamRevision_One_ZeroToOne1">
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
					<End EntitySet="StreamRevisions" Role="StreamRevision"></End>
				</AssociationSet>
				<AssociationSet Name="GenericKeyMapEntry_GenericKeyMapEntryValue_One_Many0Set" Association="apiportal.GenericKeyMapEntry_GenericKeyMapEntryValue_One_Many0">
					<End EntitySet="GenericKeyMapEntries" Role="GenericKeyMapEntry"></End>
					<End EntitySet="GenericKeyMapEntryValues" Role="GenericKeyMapEntryValue"></End>
				</AssociationSet>
				<AssociationSet Name="KeyMapEntry_KeyMapEntryValue_One_Many0Set" Association="apiportal.KeyMapEntry_KeyMapEntryValue_One_Many0">
					<End EntitySet="KeyMapEntries" Role="KeyMapEntry"></End>
					<End EntitySet="KeyMapEntryValues" Role="KeyMapEntryValue"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_Policy_One_Many0Set" Association="apiportal.APIProxy_Policy_One_Many0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="Policies" Role="Policy"></End>
				</AssociationSet>
				<AssociationSet Name="PolicyRevision_APIProxyRevision_Many_One0Set" Association="apiportal.PolicyRevision_APIProxyRevision_Many_One0">
					<End EntitySet="PolicyRevisions" Role="PolicyRevision"></End>
					<End EntitySet="APIProxyRevisions" Role="APIProxyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_RouteRule_One_Many0Set" Association="apiportal.APIProxyEndPoint_RouteRule_One_Many0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="RouteRules" Role="RouteRule"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_RouteRuleRevision_One_Many0Set" Association="apiportal.APIProxyEndPointRevision_RouteRuleRevision_One_Many0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="RouteRuleRevisions" Role="RouteRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="DefaultFaultRule_Step_One_Many0Set" Association="apiportal.DefaultFaultRule_Step_One_Many0">
					<End EntitySet="DefaultFaultRules" Role="DefaultFaultRule"></End>
					<End EntitySet="Steps" Role="Step"></End>
				</AssociationSet>
				<AssociationSet Name="FaultRule_Step_One_Many0Set" Association="apiportal.FaultRule_Step_One_Many0">
					<End EntitySet="FaultRules" Role="FaultRule"></End>
					<End EntitySet="Steps" Role="Step"></End>
				</AssociationSet>
				<AssociationSet Name="Step_Stream_Many_One0Set" Association="apiportal.Step_Stream_Many_One0">
					<End EntitySet="Steps" Role="Step"></End>
					<End EntitySet="Streams" Role="Stream"></End>
				</AssociationSet>
				<AssociationSet Name="DefaultFaultRuleRevision_StepRevision_One_Many0Set" Association="apiportal.DefaultFaultRuleRevision_StepRevision_One_Many0">
					<End EntitySet="DefaultFaultRuleRevisions" Role="DefaultFaultRuleRevision"></End>
					<End EntitySet="StepRevisions" Role="StepRevision"></End>
				</AssociationSet>
				<AssociationSet Name="FaultRuleRevision_StepRevision_One_Many0Set" Association="apiportal.FaultRuleRevision_StepRevision_One_Many0">
					<End EntitySet="FaultRuleRevisions" Role="FaultRuleRevision"></End>
					<End EntitySet="StepRevisions" Role="StepRevision"></End>
				</AssociationSet>
				<AssociationSet Name="StepRevision_StreamRevision_Many_One0Set" Association="apiportal.StepRevision_StreamRevision_Many_One0">
					<End EntitySet="StepRevisions" Role="StepRevision"></End>
					<End EntitySet="StreamRevisions" Role="StreamRevision"></End>
				</AssociationSet>
				<AssociationSet Name="Stream_FlowRule_One_ZeroToOne0Set" Association="apiportal.Stream_FlowRule_One_ZeroToOne0">
					<End EntitySet="Streams" Role="Stream"></End>
					<End EntitySet="FlowRules" Role="FlowRule"></End>
				</AssociationSet>
				<AssociationSet Name="StreamRevision_FlowRuleRevision_One_ZeroToOne0Set" Association="apiportal.StreamRevision_FlowRuleRevision_One_ZeroToOne0">
					<End EntitySet="StreamRevisions" Role="StreamRevision"></End>
					<End EntitySet="FlowRuleRevisions" Role="FlowRuleRevision"></End>
				</AssociationSet>
				<AssociationSet Name="PolicyTemplateContainer_TemplateFileResource_One_Many0Set" Association="apiportal.PolicyTemplateContainer_TemplateFileResource_One_Many0">
					<End EntitySet="PolicyTemplateContainers" Role="PolicyTemplateContainer"></End>
					<End EntitySet="TemplateFileResources" Role="TemplateFileResource"></End>
				</AssociationSet>
				<AssociationSet Name="PolicyTemplateContainer_TemplatePolicy_One_Many0Set" Association="apiportal.PolicyTemplateContainer_TemplatePolicy_One_Many0">
					<End EntitySet="PolicyTemplateContainers" Role="PolicyTemplateContainer"></End>
					<End EntitySet="TemplatePolicys" Role="TemplatePolicy"></End>
				</AssociationSet>
				<AssociationSet Name="APITargetEndPointRevision_APIProvider_Many_Many0Set" Association="apiportal.APITargetEndPointRevision_APIProvider_Many_Many0">
					<End EntitySet="APITargetEndPointRevisions" Role="APITargetEndPointRevision"></End>
					<End EntitySet="APIProviders" Role="APIProvider"></End>
				</AssociationSet>
				<AssociationSet Name="APIProduct_APIProductAdditionalProperty_One_Many0Set" Association="apiportal.APIProduct_APIProductAdditionalProperty_One_Many0">
					<End EntitySet="APIProducts" Role="APIProduct"></End>
					<End EntitySet="APIProductAdditionalProperties" Role="APIProductAdditionalProperty"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_APIProxy_One_Many0Set" Association="apiportal.APIProxy_APIProxy_One_Many0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="APIProxies" Role="APIProxy2"></End>
				</AssociationSet>
				<AssociationSet Name="ContentPackageMapper_APIProxy_One_ZeroToOne0Set" Association="apiportal.ContentPackageMapper_APIProxy_One_ZeroToOne0">
					<End EntitySet="ContentPackageMappers" Role="ContentPackageMapper"></End>
					<End EntitySet="APIProxies" Role="APIProxy"></End>
				</AssociationSet>
				<AssociationSet Name="Developer_Application_One_Many0Set" Association="apiportal.Developer_Application_One_Many0">
					<End EntitySet="Developers" Role="Developer"></End>
					<End EntitySet="Applications" Role="Application"></End>
				</AssociationSet>
				<AssociationSet Name="Application_ApplicationAdditionalProperty_One_Many0Set" Association="apiportal.Application_ApplicationAdditionalProperty_One_Many0">
					<End EntitySet="Applications" Role="Application"></End>
					<End EntitySet="ApplicationAdditionalPropertys" Role="ApplicationAdditionalProperty"></End>
				</AssociationSet>
				<AssociationSet Name="APIProduct_Application_Many_Many0Set" Association="apiportal.APIProduct_Application_Many_Many0">
					<End EntitySet="APIProducts" Role="APIProduct"></End>
					<End EntitySet="Applications" Role="Application"></End>
				</AssociationSet>
				<AssociationSet Name="Application_Resource_One_Many0Set" Association="apiportal.Application_Resource_One_Many0">
					<End EntitySet="Applications" Role="Application"></End>
					<End EntitySet="Resources" Role="Resource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProduct_APIProxy_Many_Many0Set" Association="apiportal.APIProduct_APIProxy_Many_Many0">
					<End EntitySet="APIProducts" Role="APIProduct"></End>
					<End EntitySet="APIProxies" Role="APIProxy"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_FileResource_Many_Many0Set" Association="apiportal.APIProxy_FileResource_Many_Many0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="FileResources" Role="FileResource"></End>
				</AssociationSet>
				<AssociationSet Name="APIResourceRevision_ResourceRevision_One_Many0Set" Association="apiportal.APIResourceRevision_ResourceRevision_One_Many0">
					<End EntitySet="APIResourceRevisions" Role="APIResourceRevision"></End>
					<End EntitySet="ResourceRevisions" Role="ResourceRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPointRevision_VirtualHost_Many_Many0Set" Association="apiportal.APIProxyEndPointRevision_VirtualHost_Many_Many0">
					<End EntitySet="APIProxyEndPointRevisions" Role="APIProxyEndPointRevision"></End>
					<End EntitySet="VirtualHosts" Role="VirtualHost"></End>
				</AssociationSet>
				<AssociationSet Name="APIProvider_APITargetEndPoint_Many_Many0Set" Association="apiportal.APIProvider_APITargetEndPoint_Many_Many0">
					<End EntitySet="APIProviders" Role="APIProvider"></End>
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_APIProxy_One_One0Set" Association="apiportal.APIProxy_APIProxy_One_One0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="APIProxies" Role="APIProxy2"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxyEndPoint_VirtualHost_Many_Many0Set" Association="apiportal.APIProxyEndPoint_VirtualHost_Many_Many0">
					<End EntitySet="APIProxyEndPoints" Role="APIProxyEndPoint"></End>
					<End EntitySet="VirtualHosts" Role="VirtualHost"></End>
				</AssociationSet>
				<AssociationSet Name="APIProduct_APIResource_One_Many0Set" Association="apiportal.APIProduct_APIResource_One_Many0">
					<End EntitySet="APIProducts" Role="APIProduct"></End>
					<End EntitySet="APIResources" Role="APIResource"></End>
				</AssociationSet>
				<AssociationSet Name="APIResource_Resource_One_Many0Set" Association="apiportal.APIResource_Resource_One_Many0">
					<End EntitySet="APIResources" Role="APIResource"></End>
					<End EntitySet="Resources" Role="Resource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_APITargetEndPoint_One_Many0Set" Association="apiportal.APIProxy_APITargetEndPoint_One_Many0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="APITargetEndPoints" Role="APITargetEndPoint"></End>
				</AssociationSet>
				<AssociationSet Name="APIProduct_RatePlan_Many_Many0Set" Association="apiportal.APIProduct_RatePlan_Many_Many0">
					<End EntitySet="APIProducts" Role="APIProduct"></End>
					<End EntitySet="RatePlans" Role="RatePlan"></End>
				</AssociationSet>
				<AssociationSet Name="APIProvider_APIProviderAdditionalProperty_One_Many0Set" Association="apiportal.APIProvider_APIProviderAdditionalProperty_One_Many0">
					<End EntitySet="APIProviders" Role="APIProvider"></End>
					<End EntitySet="APIProviderAdditionalPropertys" Role="APIProviderAdditionalProperty"></End>
				</AssociationSet>
				<AssociationSet Name="RatePlan_Resource_One_Many0Set" Association="apiportal.RatePlan_Resource_One_Many0">
					<End EntitySet="RatePlans" Role="RatePlan"></End>
					<End EntitySet="Resources" Role="Resource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProvider_Resource_One_Many0Set" Association="apiportal.APIProvider_Resource_One_Many0">
					<End EntitySet="APIProviders" Role="APIProvider"></End>
					<End EntitySet="Resources" Role="Resource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_Resource_One_Many0Set" Association="apiportal.APIProxy_Resource_One_Many0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="Resources" Role="Resource"></End>
				</AssociationSet>
				<AssociationSet Name="FileResourceRevision_APIProxyRevision_Many_Many0Set" Association="apiportal.FileResourceRevision_APIProxyRevision_Many_Many0">
					<End EntitySet="FileResourceRevisions" Role="FileResourceRevision"></End>
					<End EntitySet="APIProxyRevisions" Role="APIProxyRevision"></End>
				</AssociationSet>
				<AssociationSet Name="APIProxy_ContentPackageMapper_One_ZeroToOne0Set" Association="apiportal.APIProxy_ContentPackageMapper_One_ZeroToOne0">
					<End EntitySet="APIProxies" Role="APIProxy"></End>
					<End EntitySet="ContentPackageMappers" Role="ContentPackageMapper"></End>
				</AssociationSet>
				<AssociationSet Name="APIProduct_Resource_One_Many0Set" Association="apiportal.APIProduct_Resource_One_Many0">
					<End EntitySet="APIProducts" Role="APIProduct"></End>
					<End EntitySet="Resources" Role="Resource"></End>
				</AssociationSet>
				<AssociationSet Name="APIProvider_KeyMapEntry_One_Many0Set" Association="apiportal.APIProvider_KeyMapEntry_One_Many0">
					<End EntitySet="APIProviders" Role="APIProvider"></End>
					<End EntitySet="KeyMapEntries" Role="KeyMapEntry"></End>
				</AssociationSet>
				<FunctionImport Name="GetAllRevisions" ReturnType="Collection(apiportal.APIProxyRevision)" EntitySet="APIProxyRevisions" m:HttpMethod="GET">
					<Parameter Name="apiProxyName" Type="Edm.String" Nullable="false"></Parameter>
				</FunctionImport>
			</EntityContainer>
		</Schema>
	</edmx:DataServices>
</edmx:Edmx>
```