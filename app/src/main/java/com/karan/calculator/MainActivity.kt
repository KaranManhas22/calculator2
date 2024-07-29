package com.karan.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var tvResult: TextView?= null
    var btnADDITION: Button?=null
    var btnSUBTRACTION: Button?=null
    var btnDIVISION: Button?=null
    var btnMULTIPLY: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        tvResult = findViewById(R.id.tvresult)

        btnADDITION= findViewById(R.id.btnADDITION)
        btnSUBTRACTION= findViewById(R.id.btnSUBTRACTION)
        btnMULTIPLY= findViewById(R.id.btnMULTIPLY)
        btnDIVISION= findViewById(R.id.btnDIVIDE)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnADDITION?.setOnClickListener {
            tvResult?.text = "${tvResult?.text.toString().toInt() +2}"
            Toast.makeText(this, "Addition by 2", Toast.LENGTH_SHORT).show()
        }
        btnDIVISION?.setOnClickListener {
            tvResult?.text= "${tvResult?.text.toString().toInt() /2}"
            Toast.makeText(this, "Division by 2", Toast.LENGTH_SHORT).show()
        }
        btnSUBTRACTION?.setOnClickListener {
            tvResult?.text="${tvResult?.text.toString().toInt() -2}"
            Toast.makeText(this, "Subtraction by 2", Toast.LENGTH_SHORT).show()
        }
        btnMULTIPLY?.setOnClickListener {
            tvResult?.text="${tvResult?.text.toString().toInt() *2}"
            Toast.makeText(this, "Multiplication by 2", Toast.LENGTH_SHORT).show()
        }
    }
}