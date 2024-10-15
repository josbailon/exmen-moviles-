package com.example.examen.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen.data.entity.Proyecto
import com.example.examen.data.repository.ProyectoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ProyectoViewModel(private val repository: ProyectoRepository) : ViewModel() {

    val proyectos: Flow<List<Proyecto>> = repository.getAllProyectos()

    fun insert(proyecto: Proyecto) = viewModelScope.launch {
        repository.insert(proyecto)
    }

    fun delete(proyecto: Proyecto) = viewModelScope.launch {
        repository.delete(proyecto)
    }
}
