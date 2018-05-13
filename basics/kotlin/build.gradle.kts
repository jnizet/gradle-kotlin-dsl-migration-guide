buildscript {
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.1.RELEASE")
    }
}

plugins {
    java
    id("jacoco")
    id("org.flywaydb.flyway") version "5.0.3"
}

plugins.apply("checkstyle")

repositories {
    mavenCentral()
}

plugins.apply("io.spring.dependency-management")

val jar: Jar by tasks
jar.archiveName = "foo.jar"

jar.apply {
    archiveName = "foo.jar"
    into("META-INF") {
        from("bar")
    }
}

val test by tasks
test.doLast { println("test completed") }
