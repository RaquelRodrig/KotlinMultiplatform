plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.9.10"
    id("com.android.library")
    id("org.jetbrains.compose")
}

kotlin {
    // Define targets
    androidTarget()
    jvm("desktop")

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
                implementation("io.ktor:ktor-client-core:1.6.0")
                implementation("io.ktor:ktor-client-json:1.6.0")
                implementation("io.ktor:ktor-client-serialization:1.6.0")
                implementation("com.squareup.sqldelight:sqlite-driver:1.5.0")
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.compose.ui:ui:1.0.0")
                implementation("androidx.compose.material:material:1.0.0")
                implementation("androidx.compose.ui:ui-tooling:1.0.0")
            }
        }
    }
}
android {
    namespace = "auction"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}
