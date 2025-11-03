package com.magical.watch.ui

import androidx.compose.material3.Typography
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontLoadingStrategy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.magical.watch.R

@Stable
val bold = FontFamily(Font(R.font.bold, FontWeight.Bold))

@Stable
val medium = FontFamily(Font(R.font.medium, FontWeight.Medium))

@Stable
val regular = FontFamily(Font(R.font.regular, FontWeight.Normal))

@Stable
val iosEmojiFontFamily = FontFamily(Font(R.font.iosemojifont, loadingStrategy = FontLoadingStrategy.Async))

@Stable
val typography = Typography(
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        fontFamily = regular,
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        fontFamily = regular,
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        fontFamily = regular,
    ),
    headlineLarge = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 30.sp,
        fontFamily = regular,
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 24.sp,
        fontFamily = regular,
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 20.sp,
        fontFamily = regular,
    ),
    displaySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        fontFamily = regular,
    ),
)