package com.example.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class StatefulActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            EchoText()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EchoText(){
    Text(text = "Hallo Dek")

    OutlinedTextField(value = "Default Value", onValueChange = {})
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EchoText2(){
    Text(text = "Hallo Bang")
}