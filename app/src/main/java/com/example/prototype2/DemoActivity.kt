package com.example.prototype2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)) {
                Image(painter = painterResource(id = R.drawable.wakanda), contentDescription = "")
                Surface(color = Color.Blue, modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Hello Polban!",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                        color = Color.White)
                }
                Surface(color = Color.Green, modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Hello Mahasiswa",
                        modifier = Modifier.padding(16.dp,8.dp,16.dp,4.dp),
                        color = Color.Blue)
                }
            }
        }
    }
}