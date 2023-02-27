package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.acitivityintent.*
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.MenuItem
import edu.uksw.fti.pam.acitivityintent.ui.TopProfile
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen() {
    val user = painterResource(id = R.drawable.brook)
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            scaffoldState = scaffoldState,
            topBar = {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Column(modifier = Modifier.padding(top = 90.dp)) {
                        Card(modifier = Modifier.size(250.dp, 250.dp), shape = RoundedCornerShape(360.dp)) {
                            Image(modifier = Modifier.background(Color.Gray),
                                painter = user,
                                contentDescription = "")
                        }
                        Text(text = stringResource(id = R.string.fname), modifier = Modifier.padding(top = 50.dp), color = Color.White)
                        Text(text = "Bagas", modifier = Modifier.padding(bottom = 30.dp), color = Color.White)
                        Text(text = stringResource(id = R.string.lname), color = Color.White)
                        Text(text = "Setyawan", modifier = Modifier.padding(bottom = 30.dp), color = Color.White)
                    }
                }
                TopProfile(
                    onNavigationIconClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }
                )
            },
            drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
            drawerContent = {
                DrawerHeader()
                DrawerBody(
                    items = listOf(
                        MenuItem(
                            id = "home",
                            title = "Home",
                            contentDescription = "Go to home screen",
                            icon = Icons.Default.Home
                        ),
                        MenuItem(
                            id = "settings",
                            title = "Settings",
                            contentDescription = "Go to settings screen",
                            icon = Icons.Default.Settings
                        ),
                        MenuItem(
                            id = "help",
                            title = "Help",
                            contentDescription = "Get help",
                            icon = Icons.Default.Info
                        ),
                    ),
                    onItemClick = {
                        println("Clicked on ${it.title}")
                    }
                )
            }
        ) {
        }
    }
}