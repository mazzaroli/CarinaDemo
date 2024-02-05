```markdown
## Freemarker. Rest assured. API automation. Carina.

### Task Title: Create 4 tests for [https://dummyjson.com](https://dummyjson.com). Use FreeMarker for at least 2 tests and validate your responses.

### Getting Started
- Install and configure JDK 11.
- Install and configure [Apache Maven 3.6.0+](http://maven.apache.org/).
- Download and start the latest [Selenium standalone server](http://www.seleniumhq.org/download/).
- Download the latest version of [Eclipse](http://www.eclipse.org/downloads/) and install the [TestNG plugin](http://testng.org/doc/download.html).
- [Read Carina documentation](https://zebrunner.github.io/carina/).

### Import to Eclipse
If the generation is successfully complete, you would see a new project folder with a name equal to the `artifactId` attribute specified during generation. Navigate to that folder (where `pom.xml` is located) and execute the following Maven task:
```bash
mvn clean eclipse:eclipse
```
By executing this command, Maven should resolve all dependencies, downloading required libraries to your local repository and generating Eclipse classpath. Before importing the new project to Eclipse, you should link your IDE to your Maven repository by executing the following task:
```bash
mvn -Dworkspace=<path_to_workspace> eclipse:configure-workspace
```
Here you have to specify the absolute path to the Eclipse workspace. After that, restart the Eclipse IDE. Now you can import the generated projects, such as "Existing Java Project," into the Eclipse IDE.
Generate the Eclipse workspace using the command:
```bash
mvn clean eclipse:eclipse
```

### Run Tests
```bash
mvn clean test -Dsuite=api
```

### Changes Made
- Added 4 tests for [https://dummyjson.com](https://dummyjson.com).
- Utilized FreeMarker for at least 2 tests.
- Validated responses in each test scenario.
- Refer to the commit history and specific commit messages for detailed changes and additions.

### Folder Structure
- `src/test/resources/api` contains API test resources, including request and response templates.
- `src/test/java/com/carina/demo` contains Java classes for API test scenarios.
```