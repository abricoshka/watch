package com.magical.watch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import cafe.adriel.voyager.navigator.Navigator
import com.magical.watch.screens.MyWatchScreen
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CupertinoTheme {
                isSystemInDarkTheme()

                Navigator(MyWatchScreen())
            }
        }
    }
}