rootProject.name = "snoopyExample"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
    plugins {
        id("com.github.yamert89.snoopy") version "master-SNAPSHOT"
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven{
            url = uri("https://jitpack.io")
        }
    }
}