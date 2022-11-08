package com.example.prototype2.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.prototype2.R

@Composable
fun ScreenDua(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.moon_knight_iphone_wallpaper), contentDescription = null)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate("screen1")}) {
            Text(text = "Welcome To Moon Knight")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenDuaPreview(){
    ScreenDua(rememberNavController())
}