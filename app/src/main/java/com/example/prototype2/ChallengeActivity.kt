package com.example.prototype2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class ChallengeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Challenge()
        }
    }
}

fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Challenge() {
    // Mencari Ukuran Layar (Pixel)
    val screenWidth = Resources.getSystem().displayMetrics.widthPixels
    val screenHeight = Resources.getSystem().displayMetrics.heightPixels
    // Mencari Ratio (dp:pixel)
    val ratioScreen = Resources.getSystem().displayMetrics.xdpi/ getScreenWidth()
    // Mencari Ukuran Konten
    val maxContentWidth = ((getScreenWidth()/3)*ratioScreen)
    val maxContentHeight = ((getScreenHeight()/2)*ratioScreen)
    // Tes Print
    println("Ini Lebar Layar: " + screenWidth)
    println("Ini Tinggi Layar: " + screenHeight)
    println("Ini Rasio: " + ratioScreen)
    println("Ini Lebar Konten: " + maxContentWidth)
    println("Ini Tinggi Konten: " + maxContentHeight)

    // Define Warna
    val mainColor = Color(0xFF141920)
    val merah = Color(0xFFF00CC00)
    val biruTua = Color(0xFFFF6600)
    val biruMuda = Color(0xFF00CCFF)
    val kuningMuda = Color(0xFFFFFF311)
    val cream = Color(0xFF9788781)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            //Content 1
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = mainColor
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.eren2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.White, CircleShape)
                    )
                    Text(
                        text = "Eren Yeager/Attack Titan",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Shingeki No Kyojin",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
            }
            //Content 2
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = merah
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.genos),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Genos/Demon Cyborg",
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "One Punch Man",
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                }
            }
            //Content 3
            Surface(modifier = Modifier
                .size(maxContentWidth.dp, maxContentHeight.dp),
                color = biruTua
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sasuke),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.White, CircleShape)
                    )
                    Text(
                        text = "Uchiha Sasuke",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Naruto Shippuden",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            //Content 1
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = kuningMuda
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gojo2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Gojo Satoru",
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Jujutsu Kaisen",
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                }
            }
            //Content 2
            Surface(
                modifier = Modifier
                    .size(maxContentWidth.dp, maxContentHeight.dp),
                color = biruMuda
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.tanjiro),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.White, CircleShape)
                    )
                    Text(
                        text = "Tanjiro Kamado",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Kimetsu No Yaiba",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
            }
            //Content 3
            Surface(modifier = Modifier
                .size(maxContentWidth.dp, maxContentHeight.dp),
                color = cream
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.zoro),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(3.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Roronoa Zoro",
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "One Piece",
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}