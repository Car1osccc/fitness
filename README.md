## Project Overview
This is a Spring Boot project that uses MyBatis for data persistence and Gradle for build management. The project is built with the latest JDK to ensure compatibility with modern Java features and libraries.

## Prerequisites
- **JDK**: Ensure you have the latest JDK installed. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or use an open-source alternative like [AdoptOpenJDK](https://adoptopenjdk.net/).
- **Gradle**: Gradle should be installed and added to your system's PATH. You can download it from [Gradle's official website](https://gradle.org/install/).

## Project Setup

### Clone the Repository
Clone the project repository to your local machine using the following command:

git clone https://github.com/Car1osccc/fitness.git

### Build the Project
Use Gradle to build the project:

gradle build

## Configuration

### Database Configuration
The database configuration is managed in the `application.properties` file located in the `src/main/resources` directory. You need to set the appropriate database connection properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

mybatis.mapper-locations=classpath:mapper/*.xml

Replace `your_database`, `your_username`, and `your_password` with your actual database credentials.

### MyBatis Configuration
MyBatis mapper XML files should be placed in the `src/main/resources/mapper` directory. Ensure that your mapper interfaces are correctly annotated and configured.

## Dependencies
The project dependencies are managed in the `build.gradle` file. Some key dependencies include:

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-redis'
    implementation 'org.springframework.boot:spring-boot-starter-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
    implementation 'org.springframework.ai:spring-ai-openai-spring-boot-starter'
    implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3'
    implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.28'
    testImplementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.3'
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    compileOnly 'com.alibaba:fastjson:2.0.28'
}
