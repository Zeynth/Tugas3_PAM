package edu.uksw.fti.pam.acitivityintent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import edu.uksw.fti.pam.acitivityintent.ui.screens.HomeScreen
import edu.uksw.fti.pam.acitivityintent.ui.screens.ProfileScreen
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

class ProfileActivity :ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMAcitivityIntentTheme {

                val username = getIntent().getStringExtra("username") ?: ""
                ProfileScreen()
            }
        }
    }
}