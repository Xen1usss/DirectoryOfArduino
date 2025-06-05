package ks.directoryofarduino.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Справочник по Arduino") })
    }) { paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
            .padding(16.dp)
        ) {
            Button(onClick = { navController.navigate("topics") }, modifier = Modifier.fillMaxWidth()) {
                Text("Основы")
            }
            Spacer(Modifier.height(8.dp))
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Данные")
            }
            Spacer(Modifier.height(8.dp))
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Операторы")
            }
            Spacer(Modifier.height(8.dp))
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Функции")
            }
        }
    }
}
