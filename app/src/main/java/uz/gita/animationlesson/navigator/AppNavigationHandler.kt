package uz.gita.animationlesson.navigator

import androidx.navigation.NavController
import kotlinx.coroutines.flow.Flow

typealias NavigationArgs = NavController.() -> Unit

interface AppNavigationHandler {
    val navigationStack: Flow<NavigationArgs>
}