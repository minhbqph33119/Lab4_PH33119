package com.example.lab4_ph31577

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab4_ph33119.Bai1
import com.example.lab4_ph33119.Bai2
import com.example.lab4_ph33119.Bai3
import com.example.lab4_ph33119.Home
import com.example.lab4_ph33119.ui.theme.Lab4_PH33119Theme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4_PH33119Theme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    val navControl = rememberNavController()
                    NavHost(navController = navControl,
                        startDestination = "home"
                    ){
                        composable("home"){
                            Home(navControl)
                        }
                        composable("bai1"){
                            Bai1()
                        }
                        composable("bai2"){
                            Bai2()
                        }
                        composable("bai3"){
                            Bai3()
                        }

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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab4_PH33119Theme {
        Greeting("Android")
    }
}