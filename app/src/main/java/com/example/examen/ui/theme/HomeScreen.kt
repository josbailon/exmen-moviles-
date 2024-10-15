package com.example.examen.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { navController.navigate("actividades") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Ver Actividades")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("proyectos") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Ver Proyectos")
        }
    }
}
