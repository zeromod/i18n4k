group = "examples"
version = "1.0.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.5.31"
    id("de.comahe.i18n4k") version "0.1.3"
}

// ####################################
// configuration

i18n4k {
    sourceCodeLocales = listOf("en", "de")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

// ####################################
// dependencies

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("de.comahe.i18n4k:i18n4k-core-jvm:0.1.3")
    implementation("com.miglayout:miglayout-swing:5.2")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.13")
}



