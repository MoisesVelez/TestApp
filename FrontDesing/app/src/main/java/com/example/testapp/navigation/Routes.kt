package com.example.testapp.navigation

sealed class Routes(val routes:String) {
    object Screen1: Routes("initial")
    object Screen2: Routes("login")
    object Screen3: Routes("sign")
}