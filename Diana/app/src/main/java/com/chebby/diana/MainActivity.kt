
package com.chebby.diana

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chebby.diana.ui.theme.DianaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            manage()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun manage() {
    val About = LocalContext.current
    val Home= LocalContext.current
    val Contact = LocalContext.current
    Column(
        modifier = Modifier
            .padding(6.dp)
            .background(Color(0xffecc0cb))
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    ) {
        Text(
            "My first android class ",
            Modifier.background(Color(0xff787973)),
            fontFamily = FontFamily.SansSerif,
            fontSize = 22.sp,
            color = Color(0xff4744ef),
            textAlign = TextAlign.Center,
        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Text(
            "Welcome below is a button that takes you to services",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color(0xff2540ff),
            textAlign = TextAlign.Center,


            )
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
        Image(
            modifier =Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(8.dp, Color(0xff030001))

            ,painter = painterResource(id = R.drawable.index),
            contentDescription = ""/*null, "describe"*/)

    }



}