# SpringBoot-Maven-Profile 

#### Add plugin

<b>

```xml

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-resources-plugin</artifactId>
    <configuration>
	<delimiters>
	    <delimiter>@</delimiter>
	</delimiters>
	<useDefaultDelimiters>false</useDefaultDelimiters>
    </configuration>
</plugin>
```

</b>

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


#### pom.xml 


<b>

```xml

<profiles>
   
   <!-- dev profile -->	
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
	
   <!-- sit profile -->		
   <profile>
      <id>sit</id>
      <activation>
	 <activeByDefault>false</activeByDefault>
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

#### Properties file

  - ##### application.properties
  
  ```properties

	spring.profiles.active=dev
	
  ```  

  - ##### application-dev.properties
  
  ```properties

	server.port=8000 

	pom.description=@project.description@
	pom.test=@test.pom@
  ```  

  - ##### application-sit.properties
  
  ```properties

	server.port=8000 

	pom.description=@project.description@
	pom.test=@test.pom@
  ```  

#### Using maven profiles with Eclipse

<p align="center">
  <img src="https://user-images.githubusercontent.com/15135199/98629530-a9030980-234b-11eb-82cd-a736764393a3.JPG" width="600">
</p>

