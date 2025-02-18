package com.example.androidproject2.ui.theme.screens.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidproject2.navigation.ROUTE_LOGIN


@Composable
fun AboutScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ABOUT SCREEN",
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp )
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            colors = ButtonDefaults.buttonColors(Color.Green)) {
            Text(text = "To login Screen")

        }



    }

}
@Preview(
    showSystemUi = true,
    showBackground = true,
)
@Composable
fun AboutScreenPreview (){
    AboutScreen(navController = rememberNavController())
}
