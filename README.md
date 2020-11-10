# SpringBoot-Maven-Profile 

#### Declaring Profiles

<b>

```xml

    <profiles>

      <profile>
        <id>dev</id>
        <activation>
          <activeByDefault>true</activeByDefault>
        </activation>
      </profile>

      <profile>
        <id>sit</id>
        <activation>
          <activeByDefault>false</activeByDefault>
        </activation>
      </profile>

    <profiles>
      
```

</b>


#### Profiles in pom.xml file


<b>

```xml

    <profiles>
	
	<profile>
		<id>dev</id>
		<activation>
			<activeByDefault>true</activeByDefault>
		</activation>
		<properties>
			<java.version>1.8</java.version>
			<maven.test.skip>true</maven.test.skip>
		</properties>
		<dependencies>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-data-rest</artifactId>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
			</dependency>
			<dependency>
				<groupId>org.projectlombok</groupId>
				<artifactId>lombok</artifactId>
				<optional>true</optional>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-test</artifactId>
				<scope>test</scope>
				<exclusions>
					<exclusion>
						<groupId>org.junit.vintage</groupId>
						<artifactId>junit-vintage-engine</artifactId>
					</exclusion>
				</exclusions>
			</dependency>
		</dependencies>
	</profile>

	<profile>
		<id>dev</id>
		<activation>
			<activeByDefault>true</activeByDefault>
		</activation>
		<properties>
			<java.version>1.8</java.version>
			<maven.test.skip>true</maven.test.skip>
		</properties>
		<dependencies>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-data-rest</artifactId>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
			</dependency>
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-test</artifactId>
				<scope>test</scope>
				<exclusions>
					<exclusion>
						<groupId>org.junit.vintage</groupId>
						<artifactId>junit-vintage-engine</artifactId>
					</exclusion>
				</exclusions>
			</dependency>
		</dependencies>
	</profile>
		
	</profiles>

```

</b>
