package com.example.testapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.testapp.R
import com.example.testapp.navigation.Routes
import com.example.testapp.ui.theme.White
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {

    LaunchedEffect(key1 = true) {
        delay(2000)
        navHostController.popBackStack()
        navHostController.navigate(Routes.Screen1.routes)
    }
    Splash()
}

@Composable
fun Splash(){
    Column(modifier = Modifier.fillMaxSize().background(White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.portada),
            contentDescription = "SplashScreen",
            modifier = Modifier.size(200.dp))


    }
}