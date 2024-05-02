
package com.example.androidutils

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment


@Composable
fun CustomButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 16.dp,
    contentPadding: PaddingValues = PaddingValues(8.dp),
    fontSize: TextUnit = 16.sp,
    backgroundColor: Color,
    contentColor: Color,
    leftIcon: String? = null,
    rightIcon: String? = null,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    iconSpacing: Dp = 8.dp
) {
    val context = LocalContext.current
    val themeSuffix = if (isSystemInDarkTheme()) "_thin" else "_light"

    val leftIconResource = leftIcon?.let {
        context.resources.getIdentifier(it + themeSuffix, "drawable", context.packageName)
    }
    val rightIconResource = rightIcon?.let {
        context.resources.getIdentifier(it + themeSuffix, "drawable", context.packageName)
    }

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(cornerRadius),
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor),
        enabled = isEnabled && !isLoading
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            if (leftIcon != null) {
                Icon(
                    painter = painterResource(id = leftIconResource ?: 0),
                    contentDescription = "Left Icon",
                    tint = contentColor,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(iconSpacing))
            }
            Text(text = label, style = TextStyle(fontSize = fontSize, color = contentColor))
            if (rightIcon != null) {
                Spacer(modifier = Modifier.width(iconSpacing))
                Icon(
                    painter = painterResource(id = rightIconResource ?: 0),
                    contentDescription = "Right Icon",
                    tint = contentColor,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}