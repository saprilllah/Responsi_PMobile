package com.example.responsi312

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Preview : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        val btn=findViewById<Button>(R.id.btnlogin)
        var intent=intent
        val nama=intent.getStringExtra("nama")
        val user=intent.getStringExtra("user")
        val email=intent.getStringExtra("email")
        val pass=intent.getStringExtra("pass")




        btn.setOnClickListener {
            intent= Intent(this@Preview,MainActivity::class.java)

            startActivity(intent)
        }
        val resultTv =findViewById<TextView>(R.id.resultTv)
        resultTv.text="Nama : "+nama+"\nUsername : "+user+"\nEmail"+email+"\nPassword"+pass

    }
}
