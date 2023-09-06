package com.example.tracker_presentation.tracker_overview

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.core.util.UiEvent
import com.example.core_ui.LocalSpacing
import com.example.tracker_presentation.tracker_overview.components.NutrientsHeader

@Composable
fun TrackerOverviewScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: TrackerOverviewViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current

//    LaunchedEffect(key1 = true) {
//        viewModel.uiEvent.collect { event ->
//            when (event) {
//                is UiEvent.RefreshActivity -> {
//                    (context as? Activity)?.finish()
//                }
//
//                else -> Unit
//            }
//        }
//    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                bottom = spacing.spaceMedium
            ),
        userScrollEnabled = true
    ) {
        item { NutrientsHeader(state = state) }
//        item {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(
//                        color = MaterialTheme.colorScheme.primary
//                    )
//            ) {
//                IconButton(onClick = { viewModel.onEvent(TrackerOverviewEvent.OnLogoutClick) }) {
//                    Icon(
//                        imageVector = Icons.Default.ExitToApp,
//                        tint = MaterialTheme.colorScheme.onPrimary,
//                        contentDescription = "Exit"
//                    )
//                }
//            }
//            NutrientsHeader(state = state)
//            Spacer(modifier = Modifier.height(spacing.spaceMedium))
//            DaySelector(
//                date = state.date,
//                onPreviousDayClick = { viewModel.onEvent(TrackerOverviewEvent.OnPreviousDayClick) },
//                onNextDayClick = { viewModel.onEvent(TrackerOverviewEvent.OnNextDayClick) },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(
//                        horizontal = spacing.spaceMedium
//                    )
//            )
//            Spacer(modifier = Modifier.height(spacing.spaceMedium))
//        }
//        items(state.meals) { meal ->
//            ExpandableMeal(
//                meal = meal,
//                onToggleClick = {
//                    viewModel.onEvent(TrackerOverviewEvent.OnToggleMealClick(meal))
//                },
//                content = {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = spacing.spaceSmall)
//                    ) {
//                        val foods = state.trackedFoods.filter {
//                            it.mealType == meal.mealType
//                        }
//                        foods.forEach { food ->
//                            TrackedFoodItem(
//                                trackedFood = food,
//                                onDeleteClick = {
//                                    viewModel.onEvent(
//                                        TrackerOverviewEvent
//                                            .OnDeleteTrackedFoodClick(food)
//                                    )
//                                }
//                            )
//                            Spacer(modifier = Modifier.height(spacing.spaceMedium))
//                        }
//                        AddButton(
//                            text = stringResource(
//                                id = R.string.add_meal,
//                                meal.name.asString(context)
//                            ),
//                            onClick = {
//                                onNavigateToSearch(
//                                    meal.name.asString(context),
//                                    state.date.dayOfMonth,
//                                    state.date.monthValue,
//                                    state.date.year
//                                )
//                            },
//                            modifier = Modifier.fillMaxWidth()
//                        )
//                    }
//                },
//                modifier = Modifier.fillMaxWidth()
//            )
//        }
    }
}