package com.example.prototype2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prototype2.ui.theme.BelajarandroidTheme

class SolutionChallengeActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            BelajarandroidTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Solution()
                }
            }
        }
    }
}

@Composable
fun Solution(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row (modifier = Modifier.weight(1f)){
            Content(
                name = stringResource(id = R.string.Char1) ,
                description = stringResource(id = R.string.Char1_desc),
                backgroundColor = colorResource(id = R.color.mainColor),
                modifier = Modifier.weight(1f),
                image = R.drawable.genos
            )
            Content(
                name =stringResource(id = R.string.Char2) ,
                description = stringResource(id = R.string.Char2_desc),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f),
                image = R.drawable.eren2
            )
            Content(
                name =stringResource(id = R.string.Char3) ,
                description = stringResource(id = R.string.Char3_desc),
                backgroundColor = Color.Gray,
                modifier = Modifier.weight(1f),
                image = R.drawable.gojo2
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Content(
                name = stringResource(id = R.string.Char4) ,
                description = stringResource(id = R.string.Char4_desc),
                backgroundColor = Color.DarkGray,
                modifier = Modifier.weight(1f),
                image = R.drawable.sasuke
            )
            Content(
                name =stringResource(id = R.string.Char5) ,
                description = stringResource(id = R.string.Char5_desc),
                backgroundColor = Color.Red,
                modifier = Modifier.weight(1f),
                image = R.drawable.tanjiro
            )
            Content(
                name =stringResource(id = R.string.Char6),
                description = stringResource(id = R.string.Char6_desc),
                backgroundColor = Color.Blue,
                modifier = Modifier.weight(1f),
                image = R.drawable.zoro
            )
        }
    }
}

@Composable
private fun Content(
    name: String,
    description : String,
    backgroundColor : Color,
    modifier : Modifier,
    image : Int
){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .border(2.dp, Color.White, CircleShape)
        )
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp),
            fontSize = 18.sp,
            color = Color.White
        )
        Text(
            text = description,
            modifier = Modifier.padding(bottom = 4.dp),
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthDayPreview(){
    BelajarandroidTheme() {
        Solution()
    }
}