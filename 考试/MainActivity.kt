package com.example.middleexam
import IndexPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
                val navController: NavHostController = rememberNavController()
                NavHost(navController = navController, startDestination = "index") {
                    composable("index") {
                        IndexPage(navController)
                    }
                    composable("commodity") {
                        CommodityPage()
                    }
                    composable("equipment") {
                        EquipmentPage()
                    }
                    composable("end") {
                        EndPage {}
                    }
                }
            }
        }
    }
}
