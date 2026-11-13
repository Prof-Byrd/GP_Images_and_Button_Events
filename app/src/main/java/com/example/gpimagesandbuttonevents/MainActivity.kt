package com.example.gpimagesandbuttonevents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        Brian Byrd
//        Mobile App 2
//        11/12/2026
//        Buttons and Images

        val recipeButton = findViewById<Button>(R.id.btnRecipe)

        recipeButton.setOnClickListener{
            startActivity(Intent(this, RecipeActivity::class.java))
        }
    }
}