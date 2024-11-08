plugins {
    kotlin("multiplatform")
}

kotlin {
    macosArm64("macosArm64")
    linuxArm64("linuxArm64")
    macosX64("macosX64")
    linuxX64("linuxX64")
    mingwX64("mingwX64")

    sourceSets {
        val commonMain by getting {
            dependencies {
                kotlin("stdlib-common")
            }
        }

        val commonTest by getting {
            dependencies {
                kotlin("test")
            }
        }
    }
}