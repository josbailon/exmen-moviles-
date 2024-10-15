package com.example.examen.data.repository

import com.example.examen.data.dao.ActividadDao
import com.example.examen.data.entity.Actividad
import kotlinx.coroutines.flow.Flow

class ActividadRepository(private val actividadDao: ActividadDao) {
    fun getAllActividades(): Flow<List<Actividad>> = actividadDao.getAllActividades()

    suspend fun insert(actividad: Actividad) {
        actividadDao.insert(actividad)
    }

    suspend fun delete(actividad: Actividad) {
        actividadDao.delete(actividad)
    }
}
