plugins {
    id("java")
    id("com.github.yamert89.snoopy")
}

group = "yamert89.snoopy"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.yamert89.snoopy:meta:master-SNAPSHOT")
}

tasks {
    test {
        useJUnitPlatform()
    }

    snoopyCompile {
        dependsOn(classes)
    }

    create<JavaExec>("runApp") {
        classpath = sourceSets.main.get().runtimeClasspath
        mainClass = "yamert89.snoopy.Main"
        dependsOn(snoopyCompile)
    }
}

