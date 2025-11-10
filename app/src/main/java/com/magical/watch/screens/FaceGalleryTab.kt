package com.magical.watch.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import com.kyant.backdrop.backdrops.LayerBackdrop
import com.kyant.backdrop.backdrops.layerBackdrop
import com.magical.watch.ui.bold
import com.magical.watch.ui.medium
import com.magical.watch.R
import com.magical.watch.ui.regular
import com.magical.watch.utils.nonScaledSp
import io.github.alexzhirkevich.cupertino.CupertinoNavigationTitle
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi


class FaceGalleryTab(
    val backdrop: LayerBackdrop
) : Screen {
    override val key: ScreenKey = uniqueScreenKey

    companion object {
        const val TAG = "FaceGalleryScreen"
    }

    @Composable
    @OptIn(ExperimentalCupertinoApi::class, ExperimentalComposeUiApi::class)
    override fun Content() {
        val focusManager = LocalFocusManager.current

        val tileTextStyle = TextStyle(
            fontSize = 17.sp.nonScaledSp,
            fontFamily = regular,
        )

        val titleTextStyle = TextStyle(
            fontSize = 16.sp.nonScaledSp,
            fontFamily = medium,
        )

        val navigationTextStyle = TextStyle(
            fontSize = 34.sp.nonScaledSp,
            fontFamily = bold,
        )

        val descTextStyle = TextStyle(
            fontSize = 14.sp.nonScaledSp,
            fontFamily = regular,
        )

        val captionTextStyle = TextStyle(
            fontSize = 13.sp.nonScaledSp,
            fontFamily = regular,
        )


        @Composable
        fun WatchFaceCard(
            title: String,
            subtitle: String,
            modifier: Modifier = Modifier,
            image: Painter = painterResource(R.drawable.set_up_apple_watch_normal),
            shape: Shape = RoundedCornerShape(20.dp),
        ) {
            Box(
                modifier = Modifier
                    .clip(shape)
                    .background(Color(0xFF1C1C1D))
                    .then(modifier)
                    .padding(vertical = 21.dp, horizontal = 18.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .height(125.dp)
                        .clip(RoundedCornerShape(14.dp)),
                    contentScale = ContentScale.Crop
                )
                CupertinoText(
                    text = title,
                    color = Color.White,
                    fontSize = 22.sp.nonScaledSp,
                    fontFamily = bold,
                    maxLines = 2,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)

                )
                CupertinoText(
                    text = subtitle,
                    color = Color.White,
                    fontFamily = regular,
                    fontSize = 14.sp.nonScaledSp,
                    maxLines = 3,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                )
            }
        }

        CupertinoScaffold(
            modifier = Modifier
                .layerBackdrop(backdrop)
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                LazyColumn(
                    modifier = Modifier
                        .statusBarsPadding()
                        .absolutePadding(top = 45.dp),
                    userScrollEnabled = true
                ) {
                    item("Title") {
                        CupertinoNavigationTitle {
                            CupertinoText("Face Gallery", style = navigationTextStyle)
                        }
                    }
                    item("Grid") {
                        Spacer(Modifier.height(15.dp))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Black)
                                .padding(horizontal = 17.dp),
                            verticalArrangement = Arrangement.spacedBy(17.dp)
                        ) {

                            WatchFaceCard(
                                title = "New Watch Faces",
                                subtitle = "The latest Apple Watch faces.",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(258.dp)
                                    .background(brush = Brush.verticalGradient(
                                        0f to Color(0xff5b78ff),
                                        0.39f to Color(0xff313d7b),
                                        0.73f to Color(0xff1c1d25),
                                        1f to Color(0xff1c1c1d)
                                    ), shape = RoundedCornerShape(20.dp)),
                                image = painterResource(R.drawable.newfaces_preview)
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth().height(285.dp),
                                horizontalArrangement = Arrangement.spacedBy(17.dp)
                            ) {
                                WatchFaceCard(
                                    title = "Health and Fitness",
                                    subtitle = "Focus on your activity and wellbeing.",
                                    modifier = Modifier.weight(1f).fillMaxHeight(),
                                    image = painterResource(R.drawable.health_fitness_preview)

                                )
                                WatchFaceCard(
                                    title = "Photos",
                                    subtitle = "Your favorite images on your wrist.",
                                    modifier = Modifier.weight(1f).fillMaxHeight(),
                                    image = painterResource(R.drawable.photos_preview)
                                )
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth().height(285.dp),
                                horizontalArrangement = Arrangement.spacedBy(17.dp)
                            ) {
                                WatchFaceCard(
                                    title = "Clean",
                                    subtitle = "Only the most important.",
                                    modifier = Modifier.weight(1f).fillMaxHeight(),
                                    image = painterResource(R.drawable.clean_preview)
                                )
                                WatchFaceCard(
                                    title = "Data Rich",
                                    subtitle = "Functionality and convenient extensions.",
                                    modifier = Modifier.weight(1f).fillMaxHeight(),
                                    image = painterResource(R.drawable.datarich_preview)
                                )
                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.BottomCenter)
                        .background(
                            brush = Brush.verticalGradient(
                                colorStops = arrayOf(
                                    0.9f to Color.Transparent,
                                    1f to Color.Black
                                )
                            )
                        )
                )
            }
        }
    }
}
