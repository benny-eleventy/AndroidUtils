package com.example.androidutils

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
// Set the image resource to the ImageView
        val first = findViewById<ImageView>(R.id.second)
        first.setImageResource(
            com.example.androidcustomsymbols.R.drawable.annotation)
        // Set the color of the icon to green
        first.setColorFilter(ContextCompat.getColor(this, R.color.green))
        // Set the image resource to the ImageView
        val second = findViewById<ImageView>(R.id.first)
        second.setImageResource(R.drawable.outline_toggle_on_24)
        // Set the color of the icon to green
        second.setColorFilter(ContextCompat.getColor(this, R.color.green))


    }
}