# Maven + Spring hello world example

### 1. Generate project structure with Maven

`mvn archetype:generate -DgroupId=com.bz.common -DartifactId=SpringExamples
	-DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

Maven will generate all the Java’s standard folders structure for you (besides resources folder, which you need to create it manually)

### 2. Convert to Eclipse project

`cd SpringExamples`

`mvn eclipse:eclipse`

**Create a resources folder**

Create a resources “**/src/main/resources**” folder, the Spring’s bean xml configuration file will put here later. Maven will treat all files under this “resources” folder as resources files, and copy it to output classes automatically.

### ref.

<https://www.mkyong.com/spring/quick-start-maven-spring-example/>
