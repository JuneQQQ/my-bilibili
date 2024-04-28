plugins {
    id("org.jetbrains.kotlin.jvm")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("org.apache.commons:commons-text:1.11.0")
    }
}

//testing {
//    suites {
//        // Configure the built-in test suite
//        val test by getting(JvmTestSuite::class) {
//            // Use JUnit Jupiter test framework
//            useJUnitJupiter("5.10.1")
//        }
//    }
//}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
