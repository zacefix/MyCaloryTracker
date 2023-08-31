import com.example.trackerzac.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidRetrofitConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {

        with(target) {
            dependencies {
                "implementation"(libs.findLibrary("retrofit-core").get())
                "implementation"(libs.findLibrary("retrofit-kotlin-serialization").get())
                "implementation"(libs.findLibrary("moshi").get())
                "implementation"(libs.findLibrary("okhttp").get())
                "implementation"(libs.findLibrary("okhttp-logging").get())
            }
        }
    }

}