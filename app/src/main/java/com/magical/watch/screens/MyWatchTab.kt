package com.magical.watch.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import com.kyant.backdrop.backdrops.rememberCanvasBackdrop
import com.magical.watch.ui.bold
import com.magical.watch.ui.medium
import com.magical.watch.ui.regular
import com.magical.watch.utils.nonScaledSp
import com.magical.watch.R
import com.magical.watch.ui.components.LiquidButton
import com.magical.watch.ui.info
import com.magical.watch.ui.textPrimary
import com.magical.watch.ui.textSecondary
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi

class MyWatchTab : Screen {
    override val key: ScreenKey = uniqueScreenKey

    companion object {
        const val TAG = "MyWatchScreen"
    }

    @Composable
    @OptIn(ExperimentalCupertinoApi::class, ExperimentalComposeUiApi::class)
    override fun Content() {
        val backdrop = rememberCanvasBackdrop {
            drawRect(Color.Black)
        }

        CupertinoScaffold {
            LazyColumn(
                modifier = Modifier
                    .statusBarsPadding()
                    .absolutePadding(top = 88.dp, bottom = 105.dp),
                userScrollEnabled = false
            ) {
                item("Image") {
                    Image(
                        painter = painterResource(R.drawable.watches),
                        contentDescription = "Landing Image",
                        modifier = Modifier
                            .height(239.dp)
                            .fillMaxWidth()
                    )
                }
                item("Title & Description") {
                    Spacer(Modifier.height(88.dp))
                    CupertinoText(
                        text = "Good evening!",
                        fontFamily = medium,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 37.dp),
                        textAlign = TextAlign.Left,
                        fontSize = 20.sp.nonScaledSp,
                        color = textPrimary
                    )
                    Spacer(Modifier.height(6.dp))
                    CupertinoText(
                        text = "If you have Apple Watch, you can pair them with iPhone.",
                        fontFamily = regular,
                        modifier = Modifier
                            .height(53.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 37.dp),
                        textAlign = TextAlign.Left,
                        color = textSecondary,
                        lineHeight = 25.sp.nonScaledSp,
                        fontSize = 20.sp.nonScaledSp,
                        minLines = 2
                    )
                }
                item("Info") {
                    Spacer(Modifier.height(18.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .height(20.dp)
                            .padding(horizontal = 37.dp)
                    ) {
                        Box(Modifier
                            .fillMaxHeight()
                            .aspectRatio(1f)) {
                            CupertinoIcon(
                                imageVector = info,
                                contentDescription = "Info",
                                tint = Color(0xFFFFA429),
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        CupertinoText(
                            text = "Learn more about Apple Watch",
                            fontFamily = regular,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 9.dp),
                            textAlign = TextAlign.Left,
                            fontSize = 15.sp.nonScaledSp,
                            color = Color(0xFFFFA429),
                            letterSpacing = 0.5.sp.nonScaledSp
                        )
                    }
                }
                item("Button") {
                    Spacer(Modifier.height(130.dp))
                    LiquidButton(
                        {},
                        backdrop,
                        tint = Color(0xFF2B2B2D),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(horizontal = 37.dp)
                    ) {
                        CupertinoText(
                            "Start Pairing",
                            style = TextStyle(Color.White),
                            fontFamily = regular,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 15.sp.nonScaledSp,
                            letterSpacing = 0.5.sp.nonScaledSp
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                }
            }
        }
    }
}
