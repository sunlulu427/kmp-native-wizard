import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

kotlin {

    macosArm64("macosArm64")
    linuxArm64("linuxArm64")
    macosX64("macosX64")
    linuxX64("linuxX64")
    mingwX64("mingwX64")

    targets.withType<KotlinNativeTarget> {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":base"))
                implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.6")
            }
        }
        val commonTest by getting
    }
}
