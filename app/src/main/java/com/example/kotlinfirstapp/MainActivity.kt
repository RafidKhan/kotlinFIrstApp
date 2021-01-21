package com.example.kotlinfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnShowToast.setOnClickListener {
           // Log.i("MainActivity", "Button Clicked!")
            Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show()


            btnSendMsgToNextActivity.setOnClickListener {
                var message: String = etUserMessage.text.toString().trim()
                Toast.makeText(this, "Message: "+message, Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SecondActivity::class.java)

                startActivity(intent)


            }

        }
    }
}