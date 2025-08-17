plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.vaadin)
    application
}

group = "com.knotes"
version = "1.0-SNAPSHOT"


dependencies {
    // vaadin
    implementation(libs.vaadin.core)
    implementation(libs.vaadin.boot)
    implementation(libs.karibu.dsl)

    // exposed
    implementation(libs.exposed.core)
    implementation(libs.exposed.java.time)
    implementation(libs.exposed.jdbc)

    // database
    implementation(libs.hikariCP)
    implementation(libs.postgresql)

    // misc
    implementation(libs.slf4j.simple)
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.knotes.MainKt")
}