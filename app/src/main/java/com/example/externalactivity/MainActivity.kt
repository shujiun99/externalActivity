package com.example.externalactivity

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnAbout)
        btn.setOnClickListener(){

            //To the internal Activity
            //val intent: Intent = Intent(this, AboutActivity::class.java)
            //startActivity(intent)

            //External Activity
            //To Google Map
            //val geo = Uri.parse("geo: 3.1390, 101.6869")
            //val mapIntent = Intent(Intent.ACTION_VIEW,geo)
            //mapIntent.setPackage("com.google.android.apps.maps")

            //Open another Application
            //val intent = Intent(Intent.ACTION_SEND)
            //intent.setType("Text/plain")
            //intent.putExtra(Intent.EXTRA_TEXT,"Hello")

            //Cal a person
            val value = Uri.parse("tel: 012345678")
            val intent = Intent(Intent.ACTION_DIAL, value)
            try{
                startActivity(intent)
                //startActivity(mapIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(this,"No match application", Toast.LENGTH_LONG).show()
            }

        }
    }
}