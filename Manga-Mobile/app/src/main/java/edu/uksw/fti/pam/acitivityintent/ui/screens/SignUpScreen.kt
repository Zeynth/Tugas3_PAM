package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import android.service.autofill.OnClickAction
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import edu.uksw.fti.pam.acitivityintent.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.uksw.fti.pam.acitivityintent.SignUpActivity
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

@Composable
fun SignUpForm(btnOnClickAction: (String?) -> Unit) {

    var fnameInput by remember { mutableStateOf("") }
    var lnameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var confirmpasswordInput by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp)
                .padding(20.dp, 40.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .padding(0.dp, 30.dp),
                color = Color.White,
                text = stringResource(id = R.string.createacc),
                fontSize = 30.sp,
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                Arrangement.SpaceBetween
            ) {
                TextField(
                    value = fnameInput,
                    onValueChange = { fnameInput = it },
                    label = { Text(text = stringResource(id = R.string.fname)) },
                    modifier = Modifier.width(175.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.White,
                        backgroundColor = Color.Gray
                    )
                )
                TextField(
                    value = lnameInput,
                    onValueChange = { lnameInput = it },
                    label = { Text(text = stringResource(R.string.lname)) },
                    modifier = Modifier.width(175.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.White,
                        backgroundColor = Color.Gray
                    )
                )
            }
            TextField(
                value = usernameInput,
                onValueChange = { usernameInput = it },
                label = { Text(text = stringResource(R.string.username)) },
                modifier = Modifier.fillMaxWidth(),
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
            TextField(
                value = confirmpasswordInput,
                onValueChange = { confirmpasswordInput = it },
                label = { Text(text = stringResource(R.string.confirmpassword)) },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = Color.White,
                    backgroundColor = Color.Gray
                )
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {
                    btnOnClickAction(usernameInput)
                }
            ) {
                Text(text = stringResource(R.string.signup))
            }
        }
    }
}

@Composable
fun SignUpFormPreview(navController: NavController) {
    PAMAcitivityIntentTheme {
        SignUpForm({})
    }
}