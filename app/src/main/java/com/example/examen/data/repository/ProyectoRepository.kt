package com.example.examen.data.repository

import com.example.examen.data.dao.ProyectoDao
import com.example.examen.data.entity.Proyecto
import kotlinx.coroutines.flow.Flow

class ProyectoRepository(private val proyectoDao: ProyectoDao) {
    fun getAllProyectos(): Flow<List<Proyecto>> = proyectoDao.getAllProyectos()

    suspend fun insert(proyecto: Proyecto) {
        proyectoDao.insert(proyecto)
    }

    suspend fun delete(proyecto: Proyecto) {
        proyectoDao.delete(proyecto)
    }
}
