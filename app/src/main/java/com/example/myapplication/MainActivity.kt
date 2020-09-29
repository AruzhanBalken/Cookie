package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var t= findViewById<TextView>(R.id.t)
        var btn = findViewById<Button>(R.id.btn)
        var img = findViewById<ImageView>(R.id.img)

        btn.setOnClickListener(){
            img.setImageResource(R.drawable.full)
            btn.setText("done")
            t.setText("Im full")
        }
    }


}