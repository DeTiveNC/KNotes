plugins {
    kotlin("jvm") version "2.2.10"
    id("com.vaadin") version "24.8.6"
    application
}

group = "com.knotes"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // vaadin
    implementation("com.vaadin:vaadin-core:24.8.6")
    implementation("com.github.mvysny.vaadin-boot:vaadin-boot:13.3")
    implementation("com.github.mvysny.karibudsl:karibu-dsl:2.4.0")

    // exposed
    implementation("org.jetbrains.exposed:exposed-core:0.61.0")
    implementation("org.jetbrains.exposed:exposed-java-time:0.61.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.61.0")

    // database
    implementation("com.zaxxer:HikariCP:7.0.1")
    implementation("org.postgresql:postgresql:42.7.7")

    // misc
    implementation("org.slf4j:slf4j-simple:2.0.17")
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.knotes.MainKt")
}