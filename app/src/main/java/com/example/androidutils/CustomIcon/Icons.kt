package com.example.androidutils.CustomIcon

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.androidutils.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Bolt
import androidx.compose.ui.res.vectorResource

enum class IconNames(val icon: String) {
    arrowForward("arrow_forward"),
    settings("settings"),
    home("home"),
    note("note"),
    lighteningBolt("bolt"),
    bubbles("bubbles");


    @Composable
    fun getIcon(type: String): ImageVector {

        return when (this) {

            lighteningBolt-> when (type) {
                "thin" -> Icons.Rounded.Bolt
                "bold" -> Icons.Rounded.Bolt
                else -> Icons.Rounded.Bolt
            }
            arrowForward -> when (type) {
                "thin" -> Icons.Outlined.ArrowForward
                "bold" -> Icons.Filled.ArrowForward
                else -> Icons.Default.ArrowForward
            }
            home -> when (type) {
                "thin" -> Icons.Outlined.Home
                "bold" -> Icons.Filled.Home
                else -> Icons.Default.Home
            }
            settings -> when (type) {
                "thin" -> Icons.Outlined.Settings
                "bold" -> Icons.Filled.Settings
                else -> Icons.Default.Settings
            }
            note -> when (type) {
                "thin" -> ImageVector.vectorResource(id = R.drawable.note_thin)
                "light" -> ImageVector.vectorResource(id = R.drawable.note_light)
                else -> Icons.Default.Settings
            }
            bubbles -> when (type) {
                "thin" -> ImageVector.vectorResource(id = R.drawable.bubbles_thin)
                "ultralight" -> ImageVector.vectorResource(id = R.drawable.bubbles_ultralight)
                "light" -> ImageVector.vectorResource(id = R.drawable.bubbles_light)
                "regular" -> ImageVector.vectorResource(id = R.drawable.bubbles_regular)
                else -> Icons.Default.Settings
            }
        }
    }
}
