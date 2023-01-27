package com.plcoding.cleanarchitecturenoteapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = DarkGray,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = DarkGray
)

private val LightColorPalette = lightColors(
    primary = Color.Black,
    background = Color.White,
    onBackground = Color.DarkGray,
    surface = DarkGray,
    onSurface = DarkGray
)

@Composable
fun CleanArchitectureNoteAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}