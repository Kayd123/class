package com.chebby.diana

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
    val About = LocalContext.current
    val Home = LocalContext.current
    val Contact = LocalContext.current
    Column (
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
            "Welcome to my about page",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xff2540ff),
            textAlign = TextAlign.Center,
        )
        Image(
            modifier =Modifier
            .size(400.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(8.dp, Color(0xff030001))
            ,painter = painterResource(id = R.drawable.index1),
            contentDescription =" ",)
        Text("This is avator Aang in his 4 states.",
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color(0xff2540ff),
                textAlign = TextAlign.Center,
            )

    }


}