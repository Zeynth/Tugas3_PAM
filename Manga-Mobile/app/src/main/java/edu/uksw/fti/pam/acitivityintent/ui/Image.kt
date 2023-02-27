package edu.uksw.fti.pam.acitivityintent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.ui.theme.Purple500

@Composable
fun GridHome() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {

        val onepiece = painterResource(id = R.drawable.onepiece)
        val jjk = painterResource(id = R.drawable.jujutsu)
        val ds = painterResource(id = R.drawable.kimetsu)
        LazyVerticalGrid(
            modifier = Modifier
                .padding(top = 555.dp)
                .padding(start = 15.dp)
                .padding(end = 15.dp),
            columns = GridCells.Fixed(3),
            content = {
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = onepiece,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "One Piece",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "1073")
                            }
                        }
                    }
                }
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = jjk,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "Jujutsu Kaisen",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "211")
                            }
                        }
                    }
                }
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = ds,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "Demon Slayer",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "206")
                            }
                        }
                    }
                }
            }
        )
    }
}

@Composable
fun GridFavorite() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)) {

        val onepiece = painterResource(id = R.drawable.onepiece)
        val jjk = painterResource(id = R.drawable.jujutsu)
        val ds = painterResource(id = R.drawable.kimetsu)
        val haikyuu = painterResource(id = R.drawable.haikyuu)
        val bluelock = painterResource(id = R.drawable.bluelock)
        LazyVerticalGrid(
            modifier = Modifier
                .padding(top = 80.dp)
                .padding(start = 15.dp)
                .padding(end = 15.dp),
            columns = GridCells.Fixed(3),
            content = {
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp, bottom = 15.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = onepiece,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "One Piece",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "1073")
                            }
                        }
                    }
                }
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp, bottom = 15.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = jjk,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "Jujutsu Kaisen",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "211")
                            }
                        }
                    }
                }
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp, bottom = 15.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = ds,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "Demon Slayer",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "206")
                            }
                        }
                    }
                }
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp, bottom = 15.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = bluelock,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "Blue Lock",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "208")
                            }
                        }
                    }
                }
                items(1) { i ->
                    Box(
                        modifier = Modifier
                            .padding(start = 7.5.dp, end = 7.5.dp, bottom = 15.dp)
                            .height(185.dp)
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Column() {
                            Image(
                                modifier = Modifier
                                    .padding(start = 6.dp)
                                    .size(100.dp, 140.dp),
                                painter = haikyuu,
                                contentDescription = " ",
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 6.dp),
                                text = "Haikyuu!!",
                                fontSize = 15.sp
                            )
                            Box(
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 6.dp)
                                    .fillMaxWidth()
                                    .background(Purple500),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(color = Color.White, fontSize = 10.sp, text = "402.5")
                            }
                        }
                    }
                }
            }
        )
    }
}