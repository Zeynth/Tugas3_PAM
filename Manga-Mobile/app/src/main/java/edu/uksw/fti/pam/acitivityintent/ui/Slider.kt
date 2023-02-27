package edu.uksw.fti.pam.acitivityintent

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.*
import edu.uksw.fti.pam.acitivityintent.ui.ImageBannerList
import kotlinx.coroutines.delay
import java.lang.Thread.yield
import kotlin.math.absoluteValue

@ExperimentalPagerApi
@Composable
fun ViewPagerSlider(){

    val pagerState  = rememberPagerState(
        pageCount = ImageBannerList.size,
        initialPage = 0
    )

    LaunchedEffect(Unit){
        while (true){
            yield()
            delay(2000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
                animationSpec = tween(600)
            )
        }
    }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 55.dp)
                .height(260.dp)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .weight(1f)
                ) { page ->
                    Card(modifier = Modifier
                        .background(Color.Black)
                        .graphicsLayer {
                            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                            lerp(
                                start = 0.85f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            ).also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }
                            alpha = lerp(
                                start = 0.5f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )

                        }
                        .fillMaxWidth()
                    ) {

                        val imageBanner = ImageBannerList[page]

                        Card(
                            modifier = Modifier
                                .fillMaxSize(),
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(260.dp),
                                contentAlignment = Alignment.TopCenter
                            ) {
                                Image(
                                    painter = painterResource(
                                        id = imageBanner.imgUri
                                    ),
                                    contentDescription = "Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(260.dp),
                                )
                                HorizontalPagerIndicator(
                                    pagerState = pagerState,
                                    modifier = Modifier
                                        .align(Alignment.BottomCenter)
                                        .padding(16.dp),
                                    Color.White,
                                    Color.DarkGray,
                                )
                            }
                        }
                    }
                }
            }
        }
}

@Composable
fun Section(

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 350.dp)
            .padding(start = 20.dp)
            .padding(end = 20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = "Latest News",
            color = Color.White,
            fontSize = 24.sp
        )
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "One Piece has proven several things with the Wano saga, and one of the most important has to do with its animation. Despite being an annual series, the team at Toei Animation put its all into One Piece's latest arc.",
            color = Color.White,
            fontSize = 14.sp,
        )
        Text(
            text = "Latest Update",
            color = Color.White,
            fontSize = 24.sp
        )
        Text(
            modifier = Modifier.padding(top = 230.dp),
            text = "Most Popular",
            color = Color.White,
            fontSize = 24.sp
        )
    }
}