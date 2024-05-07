package com.example.androidproject2.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidproject2.R
import com.example.androidproject2.navigation.ROUTE_ADD_PRODUCT
import com.example.androidproject2.navigation.ROUTE_VIEW_PRODUCT
import com.example.androidproject2.ui.theme.AndroidProject2Theme


@Composable
fun HomeScreen(navController: NavController) {
    Box {
        Image(painter = painterResource(id = R.drawable.job),
            contentDescription ="Business people",
            modifier = Modifier.fillMaxSize()
        )
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "HOME SCREEN",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp )
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_ADD_PRODUCT) },
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = "Add Product")
        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "View Product")
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true)
@Composable
fun HomeScreenPreview (){
    AndroidProject2Theme {
        HomeScreen(navController = rememberNavController())
    }
}












