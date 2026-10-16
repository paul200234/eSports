package com.example.esports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.esports.ui.theme.ESportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ESportsTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Column( modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()) {
                        Text(
                            text = "TEAM TITANS",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp),
                            style = MaterialTheme.typography.headlineMedium)
                        Jugador(
                            nombre = "AlexPro",
                            rol = "Atacante",
                            edad = 21,
                            nivel = 87,
                            imagen = R.drawable.jugador1
                        )
                        HorizontalDivider(thickness = 0.5.dp)
                        Jugador(
                            nombre = "AlexPro",
                            rol = "Atacante",
                            edad = 21,
                            nivel = 87,
                            imagen = R.drawable.jugador1
                        )
                        HorizontalDivider(thickness = 0.5.dp)
                        Jugador(
                            nombre = "AlexPro",
                            rol = "Atacante",
                            edad = 21,
                            nivel = 87,
                            imagen = R.drawable.jugador1
                        )
                        HorizontalDivider(thickness = 0.5.dp)
                        Jugador(
                            nombre = "AlexPro",
                            rol = "Atacante",
                            edad = 21,
                            nivel = 87,
                            imagen = R.drawable.jugador1
                        )
                        HorizontalDivider(thickness = 0.5.dp)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun Jugador(
    nombre: String,
    rol: String,
    edad: Int,
    nivel: Int,
    @DrawableRes imagen: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(imagen),
                contentDescription = null,
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer( modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = nombre,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = rol,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.secondary
                )
                Text(
                    text = "Edad: $edad años",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Nivel: $nivel",
                    style = MaterialTheme.typography.bodySmall
                )
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun JugadorPreview(){
    Jugador(
        nombre = "AlexPro",
        rol = "Atacante",
        edad = 21,
        nivel = 87,
        imagen = R.drawable.jugador1
    )

}
