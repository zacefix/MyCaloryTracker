import com.example.trackerzac.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidTestConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            dependencies {
                add("api", libs.findLibrary("junit").get())
                add("api", libs.findLibrary("ui.test.junit4").get())

            }
        }
    }
}