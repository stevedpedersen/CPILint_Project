## How to Update Documentation 

- This repository can be cloned and used as a starting template.
- Documentation updates should managed in the branch `docs/branch-name`. This
  enables the standardized approach and automated exclusion from triggering
  Jenkins job builds
- Documentation content changes should be tested locally as outlined in the
  [Running Locally](how-to-update-documentation?id=running-locally) paragraph.
- To ensure consistency of updates this repo includes a pre-commit hook that
  will trigger spell check and markdown formatter as outlined in
  [Checking Content Spelling and Formatting](how-to-update-documentation?id=checking-content-spelling-and-formatting)
  paragraph.
- Number of docsify plugins have been evaluated and included with this template.
  Plugins are stored in /docs/docsify/lib folder. For additional info on
  available plugins please refer to [docsify](https://docsify.js.org/)
  documentation. Some of the plugins included:
  - Search
  - Copy to clipboard
  - Tabs plugin
  - Syntax highlighting for various programming languages
  - Image zoom (on click)
- Markdown content can include limited number of HTML elements. Please refer to
  [Bitbucket markdown syntax guide](https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)
  for details.
- Management of tables in markdown may be difficult, tools like
  [Tables Generator](https://www.tablesgenerator.com/markdown_tables) help
  simplify the process.
- Native markdown support for the visual workflows or technical diagrams is
  limited. The tools like [PlantUML](https://plantuml.com/) or
  [Mermaid](https://mermaid-js.github.io/) have been evaluated and can be added.
  Please note that the editing process has limitations and for more advanced
  technical diagrams, the recommendation is to use the
  [Draw.io](https://draw.io) interface, export the diagrams including metadata
  to png image and store them in the /docs/images/ folder. Export with metadata
  enables for images to be re-imported to draw.io for further editing, and the
  revisions can be reviewed/approved via git pull request process.

### Organizing Documentation

The documentation is stored in `/docs` folder. Key files/locations are as
follows

- `index.html` - this file is used to define docsify configurations and launches
  the site.
- `README.md` - defines the the main landing content of the documentation
- `\_sidebar.md` - contains links that define the navigational structure of the
  site
- `\_coverpage.md` - defines the cover page for the site

Beyond the key files, pages can be defined as simple markdown files at the root
of the project, or in hierarchical folders.

### Organizing Slide Presentations

Reveal.js slide presentations should be placed in the `/docs/slides` directory.

In general, it is recommended to put individual slide-sets in the md folder.
This allows them to be re-usable across presentations.

Individual presentations are defined as html files in the slides directory, and
simply link to the various slide sets in the md directory.

To highlight slide presentations within the documentation site, simply add them
as links in the `/docs/presentations.md` site.

### Linting and Checking the Content's Spelling and Formatting

This repository includes an example of pre-commit hook that triggers a spell,
format, and markdown lint check on any staged Markdown files. The following
tools were used to set up this functionality:

- pre-commit hook via [Husky](https://github.com/typicode/husky) and
  [lint-staged](https://www.npmjs.com/package/lint-staged)
- spelling check via [cSpell](https://www.npmjs.com/package/cspell)
- markdown formatting via [Prettier](https://prettier.io/)
- markdown linting via
  [markdownlint](https://github.com/DavidAnson/markdownlint)

To activate these features, as defined in the root directory's `package.json`,
installing Node.js and npm is required. After the installation, running
`npm install` inside of the local clone will activate the functionalities
described above.

?> If Node.js is not installed on the local workstation, XENA recommends using
the `xena-docs-utilities` docker image that is included with this XENA Docs
Example. The `xena-docs-utilities` docker image includes Node.js LTS needed to
run the local installation of the docsify and pre-commit spelling/formatting
hooks. <br/>

The `xena-docs-utilities` docker image is published to the XENA open repository
in the J&J Artifactory. To pull and run the image execute the following
commands. Note that we are mounting the local `/docs` directory to the
container's `/root/docs` directory in order to sync any changes made locally
with the container (which has the documentation tooling).

```shell
docker pull jnj.artifactrepo.jnj.com/xena/xena-docs-utilities

docker run --rm -it -p 8080:8080 -v $(pwd):/root/docs xena-docs-utilities
```

Once you're inside the container, you can install the necessary Node.js packages
for enabling the tools above by running:

```shell
npm install
```

Then, you can run the following scripts defined in `package.json` to interact
with the documentation:

- `npm run serve`

  - This script serves the documentation located in the `/docs` directory using
    the [http-server](https://www.npmjs.com/package/http-server) package on port
    `8080`.

- `npm run lint:markdown`

  - This script lints the markdown files within the whole repository using
    [markdownlint](https://github.com/DavidAnson/markdownlint).

- `npm run format`

  - This script formats the markdown files within the whole repository using
    [Prettier](https://prettier.io/).

- `npm run format:check`

  - This script checks the markdown files within the whole repository for any
    formatting issues using [Prettier](https://prettier.io/).

- `npm run spellcheck`

  - This script checks for any spelling mistakes in the markdown files within
    the whole repository using [cSpell](https://www.npmjs.com/package/cspell).

- `npm run lint`
  - This script runs the `format`, `spellcheck` and `lint:markdown` scripts
    above in succession.

#### Additional Details on Spellcheck Functionality

Please note the use of `cSpell.json` to control the configuration of the
[cSpell](https://www.npmjs.com/package/cspell) package. Inside it, you can see
that a `customDictionary` is defined with words residing in the
`customDictionary.txt` file. Every word that is defined in this text file
(separated by new lines) will be treated by the spell checker as an accurately
spelled word. For this reason, you can use this file to define any custom words
that your documentation might use (for example, a vendor company's name, a
technology's name, etc.). You can find more details on the
[cSpell](https://www.npmjs.com/package/cspell) package's documentation
[here](https://github.com/streetsidesoftware/cspell/blob/main/packages/cspell/README.md).

### Running Locally

The site can also be run as a simple static site locally. Simply run a webserver from
the `/docs` directory of the project.

A simple way of doing this is with the built-in python web-server from the
`/docs` directory. Once launched, you can access the site at
<http://localhost:8080>.

```shell
python3 -m http.server 8080
```

?> If Python is not installed locally XENA recommends using the
`xena-docs-utilities` docker image to serve the docs via a Node.js package,
amongst other editing features that come with installing the provided
configuration in `package.json`. Please refer to
[Running Locally](how-to-update-documentation?id=running-locally) paragraph for
more details.

