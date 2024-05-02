import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidutils.CustomIcon.IconNames


data class IconStyle(
    val color: Color,
    val backgroundColor: Color,
    val size: Float = 24f
)



@Composable
fun CustomIcon(
    icon: IconNames,
    type:  String,
    style: IconStyle,
    id: String
) {

    val iconVector = icon.getIcon(type)
    Icon(
        imageVector = iconVector,
        contentDescription = id,
        modifier = Modifier
            .size(style.size.dp)
            .background(style.backgroundColor)
            .then(Modifier.size(style.size.dp)),
        tint = style.color
    )
}


// Example usage in your @Composable function
@Composable
fun PreviewCustomIcon() {
    MaterialTheme {
        CustomIcon(
            icon = IconNames.arrowForward,
            type="thin",
            style = IconStyle(Color.Blue, Color.Transparent,  24f),
            id = "Icon"
        )
    }
}