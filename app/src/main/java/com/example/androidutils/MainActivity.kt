package com.example.androidutils


import CustomIcon
import IconStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.Column

import com.example.androidutils.CustomIcon.IconNames

object AppColors {
    val teal200 = Color(0xFF03DAC5)
    val teal500 = Color(0xFF3F9BAB)
    val teal700 = Color(0xFF022836)

}



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {


                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        // Button for setting theme based on system preference

//                        CustomButton(
//                            icon = "sticky_note",
//                            label = "System",
//                            onClick = {  },
//                            contentColor =Color.Yellow,
//                            contentPadding= PaddingValues(8.dp),
//                            backgroundColor=Color.DarkGray,
//                            activeColor = Color.Blue,
//                            isActive = false,
//                        )
//                        CustomButton( icon = "sticky_note",
//                            label = "Dark",
//                            onClick = {  },
//
//                            contentColor =Color.Yellow,
//                            contentPadding= PaddingValues(8.dp),
//                            backgroundColor=Color.DarkGray,
//                            activeColor = Color.Blue,
//                            isActive = false,
//                        )
//                        CustomButton(  icon = "sticky_note",
//                            label = "Light",
//                            onClick = {  },
//
//                            contentColor =Color.Yellow,
//                            contentPadding= PaddingValues(8.dp),
//                            backgroundColor=Color.DarkGray,
//                            activeColor = Color.Blue,
//                            isActive = false,
//                        )
                        CustomIcon(
                            icon = IconNames.note,
                            type="thin",
                            style = IconStyle(Color.Blue, Color.Transparent,  48f),
                            id = "Icon"
                        )
                        CustomIcon(
                            icon = IconNames.bubbles,
                            type="ultralight",
                            style = IconStyle(Color.Blue, Color.Transparent,  48f),
                            id = "Icon"
                        )
                        CustomIcon(
                            icon = IconNames.bubbles,
                            type="thin",
                            style = IconStyle(Color.Blue, Color.Transparent,  48f),
                            id = "Icon"
                        )
                        CustomIcon(
                            icon = IconNames.bubbles,
                            type="light",
                            style = IconStyle(Color.Blue, Color.Transparent,  48f),
                            id = "Icon"
                        )
                        CustomIcon(
                            icon = IconNames.bubbles,
                            type="regular",
                            style = IconStyle(Color.Blue, Color.Transparent,  48f),
                            id = "Icon"
                        )

//com.example.androidutils.CustomButton(
//    label = "Light",
//    onClick = {  },
//
//    contentColor =Color.Yellow,
//    contentPadding= PaddingValues(8.dp),
//    backgroundColor=Color.DarkGray,
//    leftIcon = "sticky_note",
//    rightIcon = "sticky_note",
//)



                }
            }
        }
    }
}
