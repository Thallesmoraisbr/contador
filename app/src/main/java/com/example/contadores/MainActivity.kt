package com.example.contadores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contadores.ui.theme.ContadoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContadoresTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    var count: Int by remember { mutableIntStateOf(0) };

    Image(
        painter = painterResource(id = R.drawable.bmw),
        contentDescription = "Plano de fundo",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = count.toString(),
            modifier = Modifier.padding(0.dp).align(Alignment.CenterHorizontally),
            color = Color.Red,
            fontFamily = FontFamily.SansSerif,
            fontSize = 60.sp,
        )
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(25.dp).fillMaxWidth()
        ) {
            Text(text = "Contar", fontSize = 30.sp);
        }
        Button(
            onClick = { count = 0 },
            modifier = Modifier.padding(25.dp).fillMaxWidth()
        ) {
            Text(text = "Resetar", fontSize = 30.sp);
        }

    }
}