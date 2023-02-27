package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import android.graphics.Paint.Align
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import edu.uksw.fti.pam.acitivityintent.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.uksw.fti.pam.acitivityintent.HomeActivity
import edu.uksw.fti.pam.acitivityintent.contracts.SignUpContract
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!!})

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.End,
        ) {
            Image(
                painter = painterResource(id = R.drawable.mangaki),
                contentDescription = "Manga Logo"
            )
            TextField(
                    value = usernameInput,
                    onValueChange = { usernameInput = it },
                    label = { Text(text = stringResource(R.string.username)) },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.White,
                        backgroundColor = Color.Gray
                    )
            )
            TextField(
                    value = passwordInput,
                    onValueChange = { passwordInput = it },
                    label = { Text(text = stringResource(R.string.password)) },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.White,
                        backgroundColor = Color.Gray
                    )
            )
            Row(
                modifier = Modifier,
            ) {
                Button(
                    modifier = Modifier.padding(end = 20.dp),
                    onClick = {
                        val isAuthtenticated = doAuth(usernameInput, passwordInput)
                        if (isAuthtenticated) {
                            lContext.startActivity(
                                Intent(lContext, HomeActivity::class.java)
                                    .apply {
                                        putExtra("username", usernameInput)
                                    }
                            )
                        }
                    }
                ) {
                    Text(text = stringResource(R.string.login))
                }
                Button(
                    onClick = {
                        getUsernameFromSignedUpForm.launch("")
                    }
                ) {
                    Text(text = stringResource(R.string.signup))
                }
            }
        }
    }
}