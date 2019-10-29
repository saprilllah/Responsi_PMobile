package com.example.responsi312

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var Email:String="saprillah@gmail.com"
    var Pass:String="5170411312"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailEt=findViewById<EditText>(R.id.id_email)
        val passEt=findViewById<EditText>(R.id.login_pass)

        val btnLogin=findViewById<Button>(R.id.btn_login)
        val  btnRegis=findViewById<Button>(R.id.btn_register)

        btnLogin.setOnClickListener {
            val email=emailEt.toString()
            val pass=passEt.toString()
            val user:String="saprillah@gmail.com"
            val nama:String="Saprillah"
            if (email==Email&&pass==Pass){

                intent.putExtra("nama",nama)
                intent.putExtra("user",user)
                intent.putExtra("email",email)
                intent.putExtra("pass",pass)
                intent=Intent(this@MainActivity,Preview::class.java)
                startActivity(intent)

            }

        }
        btnRegis.setOnClickListener {
            intent=Intent(this,::class.java)
            startActivity(intent)
        }


    }


}
