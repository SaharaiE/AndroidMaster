package com.example.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
    
        val btnPulsame = findViewById<AppCompatButton>(R.id.btnPulsame)
        val etName = findViewById<TextView>(R.id.etName)

        btnPulsame.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                 val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    //Iniciar en la pantalla


    }



}