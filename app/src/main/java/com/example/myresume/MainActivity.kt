package com.example.myresume

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity as AppCompatActivity1

class MainActivity : AppCompatActivity1() {
    var photo: ImageView? = null
    var eduButton: Button? = null
    var workButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        photo = findViewById(R.id.profilePhoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this,ProfilePhoto::class.java)
            startActivity(clickIntent)
        })
        eduButton = findViewById(R.id.eduButton)
        eduButton?.setOnClickListener {
            startActivity(Intent(this,Education::class.java))
        }
        workButton = findViewById(R.id.workButton)
        workButton?.setOnClickListener(
            {
                var clickIntent2 = Intent(this,WorkExperience::class.java)
                startActivity(clickIntent2)
            })
    }
}
