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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun Contact(){
    val imageResIds = listOf(
        R.drawable.index1,
        R.drawable.index2,
        R.drawable.index3,
        R.drawable.index4,
        R.drawable.index5,
        R.drawable.index,
    )

    LazyVerticalGrid(columns = GridCells.Adaptive(minSize=128.dp),
        modifier = Modifier){
        items(imageResIds){imageResId ->
            Image( painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier=Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
                    .aspectRatio(1f),
                )
        }


    }

}

