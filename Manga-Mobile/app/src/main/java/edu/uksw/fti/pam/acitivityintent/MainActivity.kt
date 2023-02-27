package edu.uksw.fti.pam.acitivityintent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.uksw.fti.pam.acitivityintent.ui.screens.LoginForm
import edu.uksw.fti.pam.acitivityintent.ui.screens.SignUpForm
import edu.uksw.fti.pam.acitivityintent.ui.screens.SignUpFormPreview
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMAcitivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    LoginForm()
                }
            }
        }
    }
    @Composable
    fun Login() {
        val navController = rememberNavController()
        
        NavHost(navController = navController, startDestination = "LoginScreen", builder = {
            composable("LoginScreen", content = { })
            composable("SignUpScreen", content = { SignUpFormPreview(navController = navController) })

        } )
    }
}
