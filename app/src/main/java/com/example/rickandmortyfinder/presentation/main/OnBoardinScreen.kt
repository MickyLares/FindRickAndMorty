package com.example.rickandmortyfinder.presentation.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.example.rickandmortyfinder.MainDestination
import com.example.rickandmortyfinder.R

@Composable
fun OnBoardingScreen(navController: NavController, viewModel: MainViewModel) {
    val pagerState = rememberPagerState(pageCount = { 3 })

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.white))
    ) {
        val (pager, indicator, startButton) = createRefs()

        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .constrainAs(pager) {
                    top.linkTo(parent.top)
                    bottom.linkTo(indicator.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        ) { page ->
            when (page) {
                0 -> PagerScreen(
                    imageRes = R.drawable.mortyarm,
                    text = stringResource(R.string.text_onBoarding_page_1),
                    isLastScreen = false,
                )

                1 -> PagerScreen(
                    imageRes = R.drawable.rick,
                    text = stringResource(R.string.text_onBoarding_page_2),
                    isLastScreen = false,
                )

                2 -> PagerScreen(
                    imageRes = R.drawable.rick69,
                    text = stringResource(R.string.text_onBoarding_page_3),
                    isLastScreen = true,
                    onClickSkip = {
                        viewModel.onBoardingFinished()
                        navController.navigate(MainDestination)
                    }
                )
            }
        }
        PageIndicator(
            pageCount = 3,
            currentPage = pagerState.currentPage,
            modifier = Modifier
                .constrainAs(indicator) {
                    bottom.linkTo(parent.bottom, margin = 65.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

    }
}

@Composable
fun PagerScreen(
    imageRes: Int,
    text: String,
    isLastScreen: Boolean = false,
    onClickSkip: () -> Unit = {}
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        val (image, description, button) = createRefs()

        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Onboarding image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .border(
                    width = 0.5.dp,
                    color = colorResource(R.color.black),
                    shape = RoundedCornerShape(4.dp)
                )
                .constrainAs(image) {
                    top.linkTo(parent.top, margin = 56.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = androidx.constraintlayout.compose.Dimension.percent(0.40f)
                    width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                }
        )

        Text(
            text = text,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = colorResource(R.color.black),
            modifier = Modifier.constrainAs(description) {
                top.linkTo(image.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        if (isLastScreen) {
            Button(
                onClick = onClickSkip,
                modifier = Modifier
                    .zIndex(1f)
                    .constrainAs(button) {
                        top.linkTo(parent.top, margin = 60.dp)
                        end.linkTo(parent.end, margin = 10.dp)
                    },
                colors = ButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Blue,
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.Transparent
                )
            ) {
                Text(text = "Iniciar", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun PageIndicator(pageCount: Int, currentPage: Int, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        repeat(pageCount) { index ->
            Box(
                modifier = Modifier
                    .size(19.dp)
                    .padding(4.dp)
                    .background(
                        color = if (index == currentPage) colorResource(R.color.purple_500)
                        else colorResource(R.color.black),
                        shape = CircleShape
                    )
            )
        }
    }
}