package com.example.mycalorytracker

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.navigation.Route
import com.example.mycalorytracker.navigation.navigate
import com.example.mycalorytracker.ui.theme.MyCaloryTrackerTheme
import com.example.onboarding_presentation.activity.ActivityScreen
import com.example.onboarding_presentation.age.AgeScreen
import com.example.onboarding_presentation.gender.GenderScreen
import com.example.onboarding_presentation.goal.GoalScreen
import com.example.onboarding_presentation.height.HeightScreen
import com.example.onboarding_presentation.nutrient_goal.NutrientGoalScreen
import com.example.onboarding_presentation.weight.WeightScreen
import com.example.onboarding_presentation.welcome.WelcomeScreen
import com.example.tracker_presentation.tracker_overview.TrackerOverviewScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCaloryTrackerTheme {
                val navController = rememberNavController()
                val snackBarState = remember { SnackbarHostState() }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        snackbarHost = { SnackbarHost(snackBarState) }
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = Route.WELCOME
                        ) {
                            composable(Route.WELCOME) {
                                WelcomeScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.GENDER) {
                                GenderScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.AGE) {
                                AgeScreen(
                                    snackBarState = snackBarState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.WEIGHT) {
                                WeightScreen(
                                    snackBarState = snackBarState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.HEIGHT) {
                                HeightScreen(
                                    snackBarState = snackBarState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.ACTIVITY) {
                                ActivityScreen(onNavigate = navController::navigate)
                            }

                            composable(Route.GOAL) {
                                GoalScreen(onNavigate = navController::navigate)
                            }

                            composable(Route.NUTRIENT_GOAL) {
                                NutrientGoalScreen(
                                    snackBarState = snackBarState,
                                    onNavigate = navController::navigate
                                )
                            }

                            composable(Route.TRACKER_OVERVIEW) {
                                TrackerOverviewScreen(onNavigate = navController::navigate)
                            }

                            composable(Route.SEARCH) {

                            }
                        }
                    }

                }
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCaloryTrackerTheme {
        Greeting("Android")
    }
}