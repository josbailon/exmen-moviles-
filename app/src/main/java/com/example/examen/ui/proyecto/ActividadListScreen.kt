package com.example.examen.ui.actividad

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen.data.entity.Actividad
import com.example.examen.viewmodel.ActividadViewModel

@Composable
fun ActividadListScreen(
    actividadViewModel: ActividadViewModel = viewModel()
) {
    val actividades by actividadViewModel.actividades.collectAsState(initial = emptyList())

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Lista de Actividades", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        actividades.forEach { actividad ->
            ActividadItem(actividad)
        }
    }
}

@Composable
fun ActividadItem(actividad: Actividad) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = actividad.nombre, style = MaterialTheme.typography.bodyLarge)
            Text(text = actividad.descripcion, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
