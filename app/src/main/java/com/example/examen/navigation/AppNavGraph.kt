package com.example.examen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.examen.ui.actividad.ActividadListScreen
import com.example.examen.ui.proyecto.ProyectoListScreen
import com.example.examen.ui.theme.HomeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("actividades") {
            ActividadListScreen()
        }
        composable("proyectos") {
            ProyectoListScreen()
        }
    }
}
