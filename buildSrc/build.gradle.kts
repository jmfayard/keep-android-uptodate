plugins {
    `kotlin-dsl`
}
repositories {
    google()
    jcenter()
    mavenCentral()
}
val kotlinVersion = "1.3.50" // Don't forget to update in Dependencies.kt too!

dependencies {
    compileOnly(gradleKotlinDsl())
    implementation("com.android.tools.build:gradle:3.5.1")
}
