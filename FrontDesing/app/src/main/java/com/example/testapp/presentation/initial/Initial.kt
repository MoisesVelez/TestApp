package com.example.testapp.presentation.initial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testapp.R
import com.example.testapp.ui.theme.Pink40
import com.example.testapp.ui.theme.White
import com.example.testapp.ui.theme.azulJi
import com.example.testapp.ui.theme.rojoJa
import com.example.testapp.ui.theme.verdeJu
import kotlin.random.Random


@Composable
fun InitialScreen(){
    val colorEscogido = Colores()
    Column(modifier = Modifier.fillMaxSize()
        .background(Brush.verticalGradient(listOf(White,colorEscogido)))
        .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.size(60.dp))
        Image(
            painter = painterResource(id = R.drawable.portada),
            contentDescription = "Logo App",
            modifier = Modifier.size(200.dp)
                .clip(CircleShape)
                .border(4.dp, colorEscogido, CircleShape)
        )
        Spacer(modifier = Modifier.weight(1f))


    }
}

@Composable
fun Colores(): Color {
    val colorElegido:Color
    val randomNumber = remember { Random.nextInt(0,3 ) }
    colorElegido = when(randomNumber){
        0 -> verdeJu
        1 -> rojoJa
        2 -> azulJi
        else -> Pink40
    }
    return colorElegido

}