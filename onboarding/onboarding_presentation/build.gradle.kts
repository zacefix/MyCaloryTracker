plugins {
    id("composeapplication.android.library.compose")
    id("composeapplication.android.feature")
}

android {
    namespace = "com.example.onboarding.presentation"
}

dependencies {
    implementation(project(":onboarding:onboarding_domain"))
    implementation(project(":core_ui"))
}