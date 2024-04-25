
package com.example.androidcustomsymbols

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
//    @DrawableRes imageResource: Int,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    activeModifier: Modifier = Modifier,
    cornerRadius: Dp = 16.dp,
    contentPadding: PaddingValues = PaddingValues(8.dp),
    fontSize: TextUnit = 16.sp,
    activeColor: Color,
    isActive: Boolean,
    backgroundColor: Color ,
    contentColor: Color ,
    icon: String,
) {
    val context = LocalContext.current
    val themeSuffix = if (isSystemInDarkTheme()) "_thin" else "_light"
    val resourceName = icon + themeSuffix
    val imageResource = context.resources.getIdentifier(resourceName, "drawable", context.packageName)

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(cornerRadius),
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(backgroundColor = if (isActive) activeColor else backgroundColor) // Set the containerColor here

    ) {
        Row(

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = imageResource),
                contentDescription = label,
                tint = contentColor
            )
            Spacer(modifier = Modifier.width(4.dp)) // Spacing between icon and text
            Text(text = label,style = TextStyle(fontSize = fontSize,color = contentColor))
        }
    }
}