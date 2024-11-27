package com.example.examen_02_rog;


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen_02_rog.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnUsuarios = findViewById<Button>(R.id.bt_Conversion)
        val btnCreditos = findViewById<Button>(R.id.bt_Creditos)
        val btnSalir = findViewById<Button>(R.id.bt_Salir)

        btnUsuarios.setOnClickListener {
            val intentUsuarios = Intent(this, UsersActivity::class.java)
            startActivity(intentUsuarios)
        }
        btnCreditos.setOnClickListener {
            val intentCreditos = Intent(this, Creditos::class.java)
            startActivity(intentCreditos)
        }

        btnSalir.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}
