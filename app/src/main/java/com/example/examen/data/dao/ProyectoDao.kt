package com.example.examen.data.dao

import androidx.room.*
import com.example.examen.data.entity.Proyecto
import kotlinx.coroutines.flow.Flow

@Dao
interface ProyectoDao {
    @Query("SELECT * FROM proyecto")
    fun getAllProyectos(): Flow<List<Proyecto>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(proyecto: Proyecto)

    @Delete
    suspend fun delete(proyecto: Proyecto)
}
