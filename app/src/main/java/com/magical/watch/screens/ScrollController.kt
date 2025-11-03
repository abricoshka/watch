package com.magical.watch.screens

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf


class ScrollController {
    private val _enabled = mutableStateOf(true)
    val enabled get() = _enabled

    fun setEnabled(value: Boolean) {
        _enabled.value = value
    }

    fun disable() = setEnabled(false)
    fun enable() = setEnabled(true)
}

val LocalScrollController = compositionLocalOf<ScrollController?> {
    error("Provide ScrollController via CompositionLocalProvider")
}
