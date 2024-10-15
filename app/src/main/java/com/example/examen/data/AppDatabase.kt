package com.example.examen.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.examen.data.dao.ActividadDao
import com.example.examen.data.dao.ProyectoDao
import com.example.examen.data.entity.Actividad
import com.example.examen.data.entity.Proyecto

@Database(entities = [Actividad::class, Proyecto::class], version = 2)
abstract class AppDatabase : RoomDatabase() {

    abstract fun actividadDao(): ActividadDao
    abstract fun proyectoDao(): ProyectoDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).fallbackToDestructiveMigration() // Para evitar errores de migración en desarrollo
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
