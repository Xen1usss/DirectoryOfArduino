package ks.directoryofarduino.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopicDetailScreen(title: String, content: String) {
    Scaffold(topBar = {
        TopAppBar(title = { Text(title) })
    }) { paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues) // учитываем высоту панели
            .padding(16.dp)         // твой обычный внутренний отступ
        ) {
            Text(content)
        }
    }
}