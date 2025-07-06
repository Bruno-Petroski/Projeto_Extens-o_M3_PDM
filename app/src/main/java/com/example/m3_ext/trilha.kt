package com.example.m3_ext

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class trilha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trilha)

        val criatividade = findViewById<View>(R.id.blocoCriatividade)

        criatividade.setOnClickListener {
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)
        }
    }
}