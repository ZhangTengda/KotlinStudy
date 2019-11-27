package com.roger.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)
        textView.setOnClickListener(View.OnClickListener {
            // Custom Toast
//            CustomToast(this@MainActivity, "Hello World").show()

            // Toast in Activity
//            Toast.makeText(this@MainActivity, "Hello Roger!", Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext, "Hello Zhang!", Toast.LENGTH_SHORT).show()

            // Toast in Fragment
//            Toast.makeText(activity, "Hello Kotlin", Toast.LENGTH_LONG).show()
//            Toast.makeText(activity?.applicationContext, "Hello Android", Toast.LENGTH_LONG).show()
        })
    }
}
