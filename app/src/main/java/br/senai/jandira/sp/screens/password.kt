package br.senai.jandira.sp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.jandira.sp.ui.theme.ProvestTheme

@Composable
fun Password() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xff201F4B),
                        shape = RoundedCornerShape(bottomStart = 14.dp, bottomEnd = 14.dp)
                    )
                    .height(182.dp)
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PasswordPreview() {
    ProvestTheme {
        Password()
    }
}
