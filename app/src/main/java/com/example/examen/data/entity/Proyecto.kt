package com.example.examen.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "proyecto")
data class Proyecto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val descripcion: String // Agregamos la descripción aquí
)
