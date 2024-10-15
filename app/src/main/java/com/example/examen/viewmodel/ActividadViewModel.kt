package com.example.examen.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen.data.entity.Actividad
import com.example.examen.data.repository.ActividadRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ActividadViewModel(private val repository: ActividadRepository) : ViewModel() {

    val actividades: Flow<List<Actividad>> = repository.getAllActividades()

    fun insert(actividad: Actividad) = viewModelScope.launch {
        repository.insert(actividad)
    }

    fun delete(actividad: Actividad) = viewModelScope.launch {
        repository.delete(actividad)
    }
}
