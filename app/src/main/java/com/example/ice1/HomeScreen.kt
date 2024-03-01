package com.example.ice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity() {

    private lateinit var englishButton : Button
    private lateinit var frenchButton : Button
    private lateinit var spanishButton : Button
    private lateinit var italianButton : Button
    private lateinit var afrikaansButton : Button
    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        englishButton = findViewById(R.id.buttonEnglish)
        frenchButton = findViewById(R.id.buttonFrench)
        spanishButton = findViewById(R.id.buttonSpanish)
        italianButton = findViewById(R.id.buttonItalian)
        afrikaansButton = findViewById(R.id.buttonAfrikaans)


        englishButton.setOnClickListener{
            textView2.setText(R.string.hello_world_english)
        }

        frenchButton.setOnClickListener{
            textView2.setText(R.string.hello_world_french)
        }

        spanishButton.setOnClickListener{
            textView2.setText(R.string.hello_world_spanish)
        }

        italianButton.setOnClickListener{
            textView2.setText(R.string.hello_world_italian)
        }

        afrikaansButton.setOnClickListener{
            textView2.setText(R.string.hello_world_afrikaans)
        }

    }
}