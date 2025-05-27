package com.example.testapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.testapp.mvvm.MvvmPresentation
import com.example.testapp.navigation.Navigationwrapper
import com.example.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    private lateinit var navHostController: NavHostController

    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            navHostController= rememberNavController()
            val viewModel: MvvmPresentation = viewModel()


            TestAppTheme {
                Surface(modifier = Modifier.fillMaxSize())
                {
                    Navigationwrapper(navHostController,viewModel)
                }
            }
        }
    }
}
