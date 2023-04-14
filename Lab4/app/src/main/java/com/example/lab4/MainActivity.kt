package com.example.lab4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var nametf: EditText
    private lateinit var emailtf: EditText
    private lateinit var phonetf: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.saveButton)
        button.setOnClickListener { CLick() }

        nametf=findViewById(R.id.nameTF)
        emailtf=findViewById(R.id.emailTF)
        phonetf=findViewById(R.id.phoneTF)

    }

    private  fun CLick(){
        val intent = Intent(this,ShareInformation::class.java)
        intent.putExtra("name",nametf.text.toString())
        intent.putExtra("email",emailtf.text.toString() )
        intent.putExtra("phone",phonetf.text.toString())
        startActivity(intent)
    }
}