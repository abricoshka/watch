package com.magical.watch.screens

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import com.magical.watch.ui.bold
import com.magical.watch.ui.medium
import com.magical.watch.ui.regular
import com.magical.watch.utils.nonScaledSp
import io.github.alexzhirkevich.cupertino.CupertinoScaffold
import io.github.alexzhirkevich.cupertino.CupertinoSheetValue
import io.github.alexzhirkevich.cupertino.CupertinoText
import io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi
import io.github.alexzhirkevich.cupertino.PresentationDetent
import io.github.alexzhirkevich.cupertino.PresentationStyle
import io.github.alexzhirkevich.cupertino.rememberCupertinoBottomSheetScaffoldState
import io.github.alexzhirkevich.cupertino.rememberCupertinoSheetState
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme


class MyWatchScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    companion object {
        const val TAG = "MyWatchScreen"
    }

    @Composable
    @OptIn(ExperimentalCupertinoApi::class, ExperimentalComposeUiApi::class)
    override fun Content() {
        val sheetSectionColor = CupertinoTheme.colorScheme.tertiarySystemBackground

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

        val lazyListState = rememberLazyListState()

        val scaffoldState = rememberCupertinoBottomSheetScaffoldState(
            rememberCupertinoSheetState(
                presentationStyle = PresentationStyle.Modal(
                    detents = setOf(
                        PresentationDetent.Large,
                        PresentationDetent.Fraction(.6f),
                    ),
                )
            )
        )

        LaunchedEffect(lazyListState.isScrollInProgress) {
            if (lazyListState.isScrollInProgress) {
                focusManager.clearFocus(force = true)
            }
        }

        LaunchedEffect(scaffoldState.bottomSheetState.targetValue) {
            if (scaffoldState.bottomSheetState.targetValue == CupertinoSheetValue.Hidden) {
                focusManager.clearFocus(force = true)
            }
        }


        CupertinoScaffold(
            hasNavigationTitle = true,
            modifier = Modifier.semantics {
                testTagsAsResourceId = true
            },
            containerColor = CupertinoTheme.colorScheme
                .secondarySystemBackground,
        ) {
            LazyColumn(
                modifier = Modifier
                    .statusBarsPadding()
                    .absolutePadding(top = 45.dp, bottom = 80.dp)
                    .testTag("home_screen_list"),
                userScrollEnabled = false
            ) {
                item {
                    CupertinoText("Lorem ipsum dolor sit amet...")
                }
            }
        }
    }
}

