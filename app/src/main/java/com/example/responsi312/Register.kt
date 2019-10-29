package com.example.responsi312

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityRegis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama=findViewById<EditText>(R.id.regist_nama)
        val username=findViewById<EditText>(R.id.regist_user)
        val email=findViewById<EditText>(R.id.regist_email)
        val pass=findViewById<EditText>(R.id.regist_pass)
        val btn=findViewById<Button>(R.id.btn_register)

        btn.setOnClickListener {
            val namaa=nama.text.toString()
            val user=username.text.toString()
            val emaill=email.text.toString()
            val passs=pass.text.toString()

            val intent=Intent(this@ActivityRegis,Preview::class.java)
            intent.putExtra("nama",namaa)
            intent.putExtra("user",user)
            intent.putExtra("email",emaill)
            intent.putExtra("pass",passs)

            startActivity(intent)
        }


    }
}
