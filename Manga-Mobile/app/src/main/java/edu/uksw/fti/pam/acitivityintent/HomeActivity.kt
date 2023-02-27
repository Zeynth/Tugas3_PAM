package edu.uksw.fti.pam.acitivityintent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import edu.uksw.fti.pam.acitivityintent.ui.screens.BottomNavigationMainScreenView
import edu.uksw.fti.pam.acitivityintent.ui.screens.HomeScreen
import edu.uksw.fti.pam.acitivityintent.ui.screens.NavigationGraph
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import kotlinx.coroutines.launch


class HomeActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMAcitivityIntentTheme {

                val username = getIntent().getStringExtra("username") ?: ""
                BottomNavigationMainScreenView()
                //HomeScreen()
            }
        }
    }
}