plugins {
    kotlin("jvm") version "1.3.50"
    maven
    `maven-publish`
}

group = "org.kotlin-everywhere"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:1.4.0")
}

val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
    from("LICENSE")
    from("README.md")
}

artifacts {
    add("archives", sourcesJar)
}

tasks.jar {
    from("LICENSE")
    from("README.md")
}
