package com.example.androidcustomsymbols

// IconComposable.kt

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
fun ThemedIcon(iconName: String, modifier: Modifier = Modifier) {
    val iconColor = MaterialTheme.colors.onPrimary  // Automatically adjusts based on theme

    // Use a local context to fetch the icon resource
    val context = LocalContext.current
    val iconResName = "${iconName}_icon"
    val drawableResId = context.resources.getIdentifier(iconResName, "drawable", context.packageName)
    val painter = painterResource(id = drawableResId)

    Image(
        painter = painter,
        contentDescription = "$iconName icon",
        modifier = modifier,
        colorFilter = ColorFilter.tint(iconColor)
    )
}



