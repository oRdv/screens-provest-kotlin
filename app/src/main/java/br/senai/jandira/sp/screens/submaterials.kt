package br.senai.jandira.sp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.jandira.sp.R
import br.senai.jandira.sp.ui.theme.ProvestTheme

@Composable
fun Submaterials() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp)),
                containerColor = Color(0xFFC6E6A3),
                contentColor = Color(0xFF201F4B),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.bookmark),
                        contentDescription = "Anotações",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {

                            }
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "Home",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {

                            }
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.chat),
                        contentDescription = "Mensagens",
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {

                            }
                    )
                }
            }
        },
        content = { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFFFFFF1))
                        .padding(16.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(2.dp, Color(0xFFD4A4E2), RoundedCornerShape(16.dp))
                            .padding(start = 40.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(text = "20", fontSize = 32.sp, color = Color(0xFF5446B6))
                                Text(text = "out", fontSize = 18.sp, color = Color(0xFF5446B6))
                            }
                            Spacer(modifier = Modifier.width(16.dp))

                            Text(
                                text = "UniCamp - 1ª fase",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    SubjectButton("MATEMÁTICA", Color(0xFFD98C8C))
                    SubjectButton("LÍNGUA PORTUGUESA", Color(0xFFE1ACB2))
                    SubjectButton("INGLÊS", Color(0xFFF8D3A2))
                    SubjectButton("FÍSICA", Color(0xFFF2E29A))
                    SubjectButton("QUÍMICA", Color(0xFFAED8A5))
                    SubjectButton("BIOLOGIA", Color(0xFFB4DAD5))
                    SubjectButton("GEOGRAFIA", Color(0xFFA9BFE6))
                    SubjectButton("HISTÓRIA", Color(0xFFB2A5D8))
                }
            }
        }
    )
}

@Composable
fun SubjectButton(subjectName: String, backgroundColor: Color) {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor),
        shape = RoundedCornerShape(32.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = subjectName,
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                tint = Color(0xFF2B264B),
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SubmaterialsPreview() {
    ProvestTheme {
        Submaterials()
    }
}
