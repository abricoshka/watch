package com.magical.watch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.FadeTransition
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberCanvasBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.magical.watch.screens.*
import com.magical.watch.ui.compass
import com.magical.watch.ui.watch
import com.magical.watch.ui.watchface
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import com.magical.watch.screens.FaceGalleryTab

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CupertinoTheme {
                isSystemInDarkTheme()

                var selectedIndex by remember { mutableIntStateOf(0) }

                val simplifiedBackdrop = rememberCanvasBackdrop { drawRect(Color.Black) }
                val backdrop = rememberLayerBackdrop {
                    drawRect(Color.Black) // background
                    drawContent()
                }


                val tabs = remember {
                    listOf(
                        TabInfo("My Watch", watch, MyWatchTab()),
                        TabInfo("Face Gallery", watchface, FaceGalleryTab(backdrop)),
                        TabInfo("Discover", compass, DiscoverTab())
                    )
                }


                Box(
                    Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                ) {
                    Navigator(tabs[selectedIndex].screen) { navigator ->
                        FadeTransition(navigator)


                        BottomTabs(
                            backdrop = if (selectedIndex == 1) backdrop else simplifiedBackdrop,
                            tabs = tabs,
                            currentTabIndex = selectedIndex,
                            onTabSelected = { newIndex ->
                                if (newIndex == selectedIndex) return@BottomTabs
                                navigator.replace(tabs[newIndex].screen)
                                selectedIndex = newIndex
                            },
                            modifier = Modifier.align(Alignment.BottomCenter)
                        )
                    }
                }

            }
        }
    }
}
