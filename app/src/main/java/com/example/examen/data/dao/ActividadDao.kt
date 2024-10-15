package com.example.examen.data.dao

import androidx.room.*
import com.example.examen.data.entity.Actividad
import kotlinx.coroutines.flow.Flow

@Dao
interface ActividadDao {
    @Query("SELECT * FROM actividad")
    fun getAllActividades(): Flow<List<Actividad>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(actividad: Actividad)

    @Delete
    suspend fun delete(actividad: Actividad)
}
