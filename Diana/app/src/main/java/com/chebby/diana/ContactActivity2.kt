package com.chebby.diana

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chebby.diana.ui.theme.DianaTheme

class ContactActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Contact()
        }
    }
}


@Composable
fun Contact() {
    val imageResIds = listOf(
        R.drawable.index1,
        R.drawable.index2,
        R.drawable.index3,
        R.drawable.index4,
        R.drawable.index5,
        R.drawable.index,
    )
    val About = LocalContext.current
    val Home = LocalContext.current
    val Contact = LocalContext.current
    Column(
        modifier = Modifier
            .padding(6.dp)
            .background(Color(0xffecc0cb))
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Button(
            onClick = {
                Home.startActivity(Intent(Home, MainActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color(0xff931c44)),
            shape = RoundedCornerShape(8.dp),
            //shape = RectangleShape,

        ) {
            Text("Home")

        }
        Button(
            onClick = {
                About.startActivity(Intent(About, AboutActivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color(0xff931c44)),
            shape = RoundedCornerShape(8.dp),
            //shape = RectangleShape,

        ) {
            Text("About")

        }

        Button(
            onClick = {
                Contact.startActivity(Intent(Contact, ContactActivity2::class.java))
            },
            colors = ButtonDefaults.buttonColors(Color(0xff931c44)),
            shape = RoundedCornerShape(8.dp),
            //shape = RectangleShape,

        ) {
            Text("Contact")

        }
        Text(
            "Welcome to my Contact page",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xff2540ff),
            textAlign = TextAlign.Center,
        )


        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp),
            modifier = Modifier
        ) {
            items(imageResIds) { imageResId ->
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth()
                        .aspectRatio(1f),
                )
            }
        }
    }
}

