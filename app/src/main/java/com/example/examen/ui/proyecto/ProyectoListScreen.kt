package com.example.examen.ui.proyecto

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen.data.entity.Proyecto
import com.example.examen.viewmodel.ProyectoViewModel

@Composable
fun ProyectoListScreen(
    proyectoViewModel: ProyectoViewModel = viewModel()
) {
    val proyectos by proyectoViewModel.proyectos.collectAsState(initial = emptyList())

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Lista de Proyectos", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        proyectos.forEach { proyecto ->
            ProyectoItem(proyecto)
        }
    }
}

@Composable
fun ProyectoItem(proyecto: Proyecto) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = proyecto.nombre, style = MaterialTheme.typography.bodyLarge)
            Text(text = proyecto.descripcion, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
