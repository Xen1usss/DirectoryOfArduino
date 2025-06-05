package ks.directoryofarduino.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import ks.directoryofarduino.ui.screen.MainScreen
import ks.directoryofarduino.ui.screen.TopicDetailScreen
import ks.directoryofarduino.ui.screen.TopicListScreen

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        composable("topics") { TopicListScreen(navController) }
        composable("detail/{title}/{content}") { backStack ->
            TopicDetailScreen(
                title = backStack.arguments?.getString("title") ?: "",
                content = backStack.arguments?.getString("content") ?: ""
            )
        }
    }
}