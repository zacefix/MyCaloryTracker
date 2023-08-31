pluginManagement {
    includeBuild("build_logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MyCaloryTracker"
include(":app")
//include(":build_logic")
//include(":build_logic:convention")
include(":onboarding")
include(":onboarding:onboarding_domain")
include(":onboarding:onboarding_presentation")
include(":core")
include(":core_ui")
include(":tracker")
include(":tracker:tracker_data")
include(":tracker:tracker_domain")
include(":tracker:tracker_presentation")
