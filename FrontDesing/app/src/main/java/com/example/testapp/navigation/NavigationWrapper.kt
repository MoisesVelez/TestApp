package com.example.testapp.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.testapp.mvvm.MvvmPresentation
import com.example.testapp.presentation.SplashScreen
import com.example.testapp.presentation.initial.InitialScreen
import com.example.testapp.presentation.login.LoginScreen
import com.example.testapp.presentation.signup.SignUpScreen


@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun Navigationwrapper(
    navHostController: NavHostController, ModelViewModelPresentation: MvvmPresentation,
                      ) {

    NavHost(navController = navHostController,startDestination= Routes.SplashScreen.routes){
        composable(Routes.SplashScreen.routes) { SplashScreen(navHostController) }
        composable(Routes.Screen1.routes) { InitialScreen(navHostController) }
        composable(Routes.Screen2.routes) { LoginScreen(ModelViewModelPresentation) }
        composable(Routes.Screen3.routes) { SignUpScreen() }

    }
}