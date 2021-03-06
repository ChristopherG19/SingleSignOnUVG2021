package com.uvg.singlesignonuvg2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth

class MainActivity3 : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()
        val user = mAuth.currentUser

        Handler().postDelayed({
            if (user != null){
                val Mapa = Intent(this, MainActivity2::class.java)
                startActivity(Mapa)
                finish()

            } else {
                val SignInGoogle = Intent(this,MainActivity::class.java)
                startActivity(SignInGoogle)
                finish()
            }

        }, 2000)
    }
}