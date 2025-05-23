package com.example.testapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testapp.R
import com.example.testapp.navigation.Routes
import com.example.testapp.presentation.initial.Colores
import com.example.testapp.ui.theme.Purple40
import com.example.testapp.ui.theme.PurpleGrey40
import com.example.testapp.ui.theme.White
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {

    LaunchedEffect(key1 = true) {
        delay(2200)
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
        Image(painter = painterResource(id = R.drawable.logoapp),
            contentDescription = "SplashScreen",
            modifier = Modifier.size(200.dp)
                .border(4.dp, Colores(),shape = RoundedCornerShape(16.dp)))

        Spacer(modifier = Modifier.size(25.dp))



        Text(
            text = "JIJAJU",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40
        )
        LinearProgressIndicator(color = Colores(), trackColor =Colores(), strokeCap = StrokeCap.Round)


    }
}