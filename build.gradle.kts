plugins {
    id("org.springframework.boot") version "2.2.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    id("java")
    val kotlinVersion = "1.3.61"
    kotlin("jvm") version kotlinVersion
}

group = "hu.dhajdukis"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:6.0.0")
    implementation("com.graphql-java-kickstart:graphiql-spring-boot-starter:6.0.0")
    implementation("com.graphql-java-kickstart:graphql-java-tools:5.6.0")

    compileOnly("org.projectlombok:lombok")
    runtimeOnly("com.h2database:h2")
    annotationProcessor("org.projectlombok:lombok")
}
