package com.example.androidproject2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidproject2.ui.theme.screens.about.AboutScreen
import com.example.androidproject2.ui.theme.screens.home.HomeScreen
import com.example.androidproject2.ui.theme.screens.login.LoginScreen
import com.example.androidproject2.ui.theme.screens.products.UpdateProductsScreen
import com.example.androidproject2.ui.theme.screens.products.ViewProductsScreen
import com.example.androidproject2.ui.theme.screens.products.ViewUploadsScreen
import com.example.androidproject2.ui.theme.screens.register.RegisterScreen
import com.example.androidproject2.ui.theme.screens.products.AddProductsScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_LOGIN) {
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)

        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT) {
           ViewProductsScreen(navController)
        }
        composable("$ROUTE_UPDATE_PRODUCT+ /{id}") {passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }
}