plugins {
    kotlin("multiplatform") version "1.8.21"
    kotlin("plugin.serialization") version "1.8.21"

}

group = "org.hieuluu.arch"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(BOTH) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    val reaktiveVersion = "1.2.3"
    val serializationVersion = "1.5.1"
    val coroutinesVersion = "1.6.4"
    sourceSets {
        val commonMain by getting {
            dependencies {

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

                // Kotlin multiplatform implementation of Reactive Extensions.
//                implementation("com.badoo.reaktive:reaktive:$reaktiveVersion")
//                implementation("com.badoo.reaktive:reaktive-annotations:$reaktiveVersion")
//                implementation("com.badoo.reaktive:coroutines-interop:$reaktiveVersion") // For interop with coroutines
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
//                implementation("com.badoo.reaktive:reaktive-testing:$reaktiveVersion")
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
        val nativeMain by getting
        val nativeTest by getting
    }
}

