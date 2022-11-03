package com.example.prototype2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prototype2.data.listMotivation
import com.example.prototype2.model.Motivation

class LazyColumn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotivationApp(listMotivation = listMotivation().loadMotivation())
        }
    }
}

@Composable
fun MotivationApp(listMotivation: List<Motivation>) {
    androidx.compose.foundation.lazy.LazyColumn{
        items(listMotivation){
            motivation -> thecolumnCard(motivation = motivation)
        }
    }
}

@Composable
fun thecolumnCard(motivation: Motivation){
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(id = motivation.imageResourceId),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = motivation.textResourceId),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun thecolumnCardPreview(){
    MotivationApp(listMotivation = listMotivation().loadMotivation())
}