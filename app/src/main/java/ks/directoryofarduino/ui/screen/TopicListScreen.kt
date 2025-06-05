package ks.directoryofarduino.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import ks.directoryofarduino.viewmodel.TopicViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopicListScreen(navController: NavController, viewModel: TopicViewModel = viewModel()) {
    val topics by viewModel.topics.observeAsState(emptyList())

    Scaffold(topBar = {
        TopAppBar(title = { Text("Основы Arduino") })
    }) { paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            items(topics) { topic ->
                Card(
                    Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("detail/${topic.title}/${topic.content}")
                        }
                ) {
                    Text(topic.title, Modifier.padding(16.dp))
                }
            }
        }
    }
}
