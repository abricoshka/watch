import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

val lifecycleVersion = "2.9.4"
val composeVersion = "1.9.4"
val voyagerVersion = "1.1.0-beta03"


android {
    namespace = "com.magical.watch"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.magical.watch"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    packaging {
        resources {
            excludes += listOf(
                "/META-INF/{AL2.0,LGPL2.1}",
                "junit/runner/{smalllogo.gif,logo.gif}"
            )
        }
    }
}

dependencies {
    // Core
    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${lifecycleVersion}")
    implementation("androidx.activity:activity-compose:1.11.0")
    implementation(platform("androidx.compose:compose-bom:2025.10.01"))
    implementation("androidx.compose.ui:ui:${composeVersion}")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3:1.4.0")
    implementation("androidx.test.ext:junit-ktx:1.3.0")
    implementation(platform("androidx.compose:compose-bom:2025.10.01"))
    debugImplementation("androidx.compose.ui:ui-tooling")
    androidTestImplementation("androidx.test:runner:1.7.0")

    // Cupertino
    implementation("io.github.alexzhirkevich:cupertino:0.1.0-alpha04")
    implementation("io.github.alexzhirkevich:cupertino-icons-extended:0.1.0-alpha04")

    // Liquid Glass
    implementation("io.github.kyant0:capsule:2.1.1") // AndroidLiquidGlass dependency
    implementation("io.github.kyant0:backdrop:1.0.0")

    // Navigator
    implementation("cafe.adriel.voyager:voyager-navigator:${voyagerVersion}")
    // Screen Model
    implementation("cafe.adriel.voyager:voyager-screenmodel:${voyagerVersion}")
    // LiveData integration
    implementation("cafe.adriel.voyager:voyager-livedata:${voyagerVersion}")
    // Transitions
    implementation("cafe.adriel.voyager:voyager-transitions:${voyagerVersion}")
}