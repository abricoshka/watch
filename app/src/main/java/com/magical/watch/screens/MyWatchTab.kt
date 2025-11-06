package com.magical.watch.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
import com.magical.watch.ui.textPrimary
import com.magical.watch.ui.textSecondary
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
            fontSize = 32.sp.nonScaledSp,
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

        val backdrop = rememberCanvasBackdrop {
            drawRect(Color.Black)
        }

        CupertinoScaffold {
            LazyColumn(
                modifier = Modifier
                    .statusBarsPadding()
                    .absolutePadding(top = 88.dp, bottom = 115.dp),
                userScrollEnabled = false
            ) {
                item("Image") {
                    Image(
                        painter = painterResource(R.drawable.watches),
                        contentDescription = "Landing Image",
                        modifier = Modifier.height(239.dp).fillMaxWidth()
                    )
                }
                item("Title & Description") {
                    Spacer(Modifier.height(88.dp))
                    CupertinoText(
                        text = "Good evening!",
                        fontFamily = medium,
                        modifier = Modifier.height(19.dp).fillMaxWidth().padding(37.dp),
                        textAlign = TextAlign.Left,
                        color = textPrimary
                    )
                    CupertinoText(
                        text = "If you have Apple Watch, you can pair them with your iPhone",
                        fontFamily = regular,
                        modifier = Modifier.height(19.dp).fillMaxWidth().padding(53.dp),
                        textAlign = TextAlign.Left,
                        color = textSecondary
                    )
                }
            }
        }
    }
}
