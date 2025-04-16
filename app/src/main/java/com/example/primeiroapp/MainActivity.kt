package com.example.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botão para navegar
        val btnNavegar = findViewById<Button>(R.id.btnNavegar)

        btnNavegar.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent) // Faz a navegação
        }
    }
}
