plugins {
    id("composeapplication.android.feature")
    id("composeapplication.android.room")
    id("composeapplication.android.retrofit")
}

android {
    namespace = "com.example.tracker.data"
}

dependencies {
    implementation(project(":tracker:tracker_domain"))
}