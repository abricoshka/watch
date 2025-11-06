package com.magical.watch.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.kyant.backdrop.Backdrop
import com.magical.watch.ui.components.LiquidBottomTab
import com.magical.watch.ui.components.LiquidBottomTabs
import com.magical.watch.ui.medium
import io.github.alexzhirkevich.cupertino.CupertinoIcon
import io.github.alexzhirkevich.cupertino.CupertinoText

data class TabInfo(
    val name: String,
    val icon: ImageVector,
    val screen: Screen
)

@Composable
fun BottomTabs(
    backdrop: Backdrop,
    tabs: List<TabInfo>,
    currentTabIndex: Int,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    LiquidBottomTabs(
        selectedTabIndex = { currentTabIndex },
        onTabSelected = onTabSelected,
        backdrop = backdrop,
        tabsCount = tabs.size,
        modifier = modifier
            .padding(horizontal = 68.dp)
            .safeContentPadding()
    ) {
        tabs.forEachIndexed { index, tab ->
            LiquidBottomTab(onClick = { onTabSelected(index) }) {
                Box(Modifier.height(23.dp)) {
                    CupertinoIcon(
                        imageVector = tab.icon,
                        contentDescription = tab.name,
                        tint = Color(0xFFF3F3F3),
                        modifier = Modifier.fillMaxSize()
                    )
                }
                CupertinoText(
                    tab.name,
                    style = TextStyle(Color(0xFFF3F3F3), 10.sp),
                    fontFamily = medium,
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
        }
    }
}
