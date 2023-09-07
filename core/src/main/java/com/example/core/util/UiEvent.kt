package com.example.core.util

sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
    data object NavigateUp : UiEvent()
    data class ShowSnackBar(val message: UiText) : UiEvent()
    data object RefreshActivity : UiEvent()
}
