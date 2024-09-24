package br.senai.jandira.sp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Airlines
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.CollectionsBookmark
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.jandira.sp.R
import br.senai.jandira.sp.ui.theme.ProvestTheme
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale



@Composable
fun Home(navigationController: NavHostController) {

    var showSearchField by remember { mutableStateOf(false) }
    var searchText by remember { mutableStateOf("") }
    val currentDate = LocalDate.now()
    val formatter = DateTimeFormatter.ofPattern("dd MMM", Locale("pt", "BR"))
    val formattedDate = currentDate.format(formatter)


    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFFFFF1))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(115.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "Menu de navegação",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {

                        }
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (showSearchField) {
                        OutlinedTextField(
                            shape = RoundedCornerShape(20.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color(0xffBCB3DF),
                                focusedLabelColor = Color(0xffBCB3DF),
                                focusedBorderColor = Color(0xffBCB3DF)
                            ),
                            value = searchText,
                            onValueChange = { searchText = it },
                            placeholder = {
                                Text("Pesquise...")
                            },
                            modifier = Modifier
                                .width(250.dp)
                                .padding(end = 16.dp)
                                .height(20.dp)
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Pesquisar",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    showSearchField = true
                                },
                            tint = Color(0xFFB39DDB)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notificações",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable {
                            },
                        tint = Color(0xFFB39DDB)
                    )
                }
            }

            Text(
                text = "DashBoard",
                color = Color(0xffD4A4E2),
                fontSize = 35.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .size(250.dp, height = 255.dp)
                            .padding(horizontal = 9.dp),
                        colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                        border = BorderStroke(4.dp, Color(0xff201F4B)),
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.pontinhos),
                                contentDescription = "pontinhos",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .size(30.dp),
                            )

                            Column(
                                modifier = Modifier.padding(top = 100.dp, start = 16.dp),
                                horizontalAlignment = Alignment.Start

                            ) {
                                Icon(
                                    imageVector = Icons.Default.CollectionsBookmark,
                                    contentDescription = "livros",
                                    tint = Color(0xff201F4B),
                                    modifier = Modifier.size(65.dp)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Atividades",
                                    color = Color(0xff201F4B),
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Light
                                )

                                Spacer(modifier = Modifier.height(4.dp))

                                Box(
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(4.dp)
                                        .background(Color(0xFF8373C2))
                                )
                            }
                        }
                    }
                }

                item {
                    Card(
                        modifier = Modifier
                            .size(250.dp, height = 255.dp)
                            .padding(horizontal = 9.dp),
                        colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                        border = BorderStroke(4.dp, Color(0xff201F4B)),
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.pontinhos),
                                contentDescription = "pontinhos",
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .size(30.dp),
                            )

                            Column(
                                modifier = Modifier.padding(top = 100.dp, start = 16.dp),
                                horizontalAlignment = Alignment.Start

                            ) {
                                Icon(
                                    imageVector = Icons.Default.Bookmark,
                                    contentDescription = "livros",
                                    tint = Color(0xff201F4B),
                                    modifier = Modifier.size(65.dp)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Redações",
                                    color = Color(0xff201F4B),
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Light
                                )

                                Spacer(modifier = Modifier.height(4.dp))

                                Box(
                                    modifier = Modifier
                                        .width(100.dp)
                                        .height(4.dp)
                                        .background(Color(0xFFBCB3DF))
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Calendário",
                color = Color(0xff201F4B),
                fontSize = 35.sp,
                fontWeight = FontWeight.Light
            )

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .size(400.dp, height = 100.dp)
                    .padding(horizontal = 9.dp),
                colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                border = BorderStroke(4.dp, Color(0xff201F4B))
            ) {

                Row(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .size(80.dp, 70.dp),
                        colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                        border = BorderStroke(4.dp, Color(0xffD4A4E2)),
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 24.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = formattedDate,
                                fontSize = 22.sp,
                                color = Color(0xff201F4B)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "História e Geografia",
                            color = Color(0xff201F4B),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Light
                        )

                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "botao de seta",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                }
                                .graphicsLayer(rotationZ = 180f),
                            tint = Color(0xFF201F4B)
                        )


                    }

                }
            }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Anotações",
                    color = Color(0xff201F4B),
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Light
                )

                Spacer(modifier = Modifier.height(10.dp))

                Card(
                    modifier = Modifier
                        .size(400.dp, height = 166.dp)
                        .padding(horizontal = 9.dp),
                    colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                    border = BorderStroke(4.dp, Color(0xff201F4B))
                ) {

            }

        }
    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun homePreview() {
    ProvestTheme {
        Home(navigationController = NavHostController(context = LocalContext.current))
    }
}