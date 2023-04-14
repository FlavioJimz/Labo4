package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ShareInformation : AppCompatActivity() {

    val name = intent.getStringExtra("name").toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_information)

    }
}