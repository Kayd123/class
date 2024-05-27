@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.chebby.diana

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.widget.ImageViewCompat
import android.graphics.drawable.Icon as DrawableIcon

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //val layout = findViewById<RelativeLayout>(R.id.)
            login()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun login(
    backgroundImageResId: Int = R.drawable.index9,
    content : @Composable () -> Unit ={}
) {

    val About = LocalContext.current
    val Home = LocalContext.current
    val Contact = LocalContext.current
    val Login = LocalContext.current
    val submit = LocalContext.current
    var username by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Box(
        modifier = Modifier
    ) {
        Image(
            painter = painterResource(id = backgroundImageResId),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        content()
    }
    Column(
        Modifier
            .padding(2.dp)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Row {
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
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
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
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )

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
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Button(
                onClick = {
                    Login.startActivity(Intent(Login, LoginActivity::class.java))
                },
                colors = ButtonDefaults.buttonColors(Color(0xff931c44)),
                shape = RoundedCornerShape(8.dp),
                //shape = RectangleShape,

            ) {
                Text("Login")

            }
        }
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )

        Image(
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(5.dp))
            .border(2.dp, Color(0xff369f9c)),
            painter = painterResource(id = R.drawable.index8),
            contentDescription = "",/*null, "describe"*/
            alignment = Alignment.Center
        )
        Text(
            text = "LOGIN",
            Modifier,
            fontFamily = FontFamily.SansSerif,
            fontSize = 58.sp,
            color = Color(0xfffafafa),
            textAlign = TextAlign.Center,
        )
        Text(
            text = "Come Back With Your ID",
            Modifier,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            color = Color(0xff369f9c),
            textAlign = TextAlign.Center,
        )
        Text(
            text = "For easy, fast and secure login",
            Modifier,
            fontFamily = FontFamily.SansSerif,
            fontSize = 14.sp,
            color = Color(0xff369f9c),
            textAlign = TextAlign.Center,
        )
        Column(
            modifier = Modifier
                .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(
                username, { username = it },
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
                label = {
                    Text(
                        text = "Username",
                        color= Color(0xffc92df1)
                        )
                }
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = null) },
                label = {
                    Text("Password",
                        color= Color(0xffc92df1)
                        )
                },

                visualTransformation = PasswordVisualTransformation()
            )
            Column(
                Modifier
                    .padding(6.dp)
                    .fillMaxSize(10F)
                    .fillMaxWidth(50F),

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Button(
                onClick = {
                    submit.startActivity(Intent(submit, MainActivity::class.java))
                },
                shape = RoundedCornerShape(8.dp),
                //shape = RectangleShape,


            ) {
                Text("Login")
            }}

        }
    }
}