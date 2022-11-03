package com.example.myapplication

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val circle = Modifier
    .size(100.dp)
    .clip(CircleShape)
    .border(2.dp, Color.White, CircleShape)

class MerkFnB : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showMerkFnB()
        }
    }
}

fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable

fun showMerkFnB() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier

            .fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xfffaae4b),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mcd),
                        contentDescription = null,
                        modifier = circle
                    )
                    Text(
                        text = "Rakyat Pemburu Diskon! 9/10⭐",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Surface(
                color = Color(0xfffffafa),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kfc),
                        contentDescription = null,
                        modifier = circle
                    )
                    Text(
                        text = "Rakyat Pemburu Diskon! 8.5/10⭐",
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Surface(
                color = Color(0xfffc3232),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.burgerking),
                        contentDescription = null,
                        modifier = circle
                    )
                    Text(
                        text = "Rakyat Pemburu Diskon! 8/10⭐",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xff328c5f),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.starbucks),
                        contentDescription = null,
                        modifier = circle
                    )
                    Text(
                        text = "Khusus Sultan! 9/10⭐",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    }
                }

            Surface(
                color = Color(0xff60287a),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.chatime),
                        contentDescription = null,
                        modifier = circle
                    )
                    Text(
                        text = "Yang Mampu! 8.5/10⭐",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Surface(
                color = Color(0xffb33970),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.haus),
                        contentDescription = null,
                        modifier = circle
                    )
                    Text(
                        text = "Merakyat! 8/10⭐",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

