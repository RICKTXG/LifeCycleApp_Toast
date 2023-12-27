package com.opensource.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,
            "hello",
            Toast.LENGTH_SHORT).show()
    }


    override fun onResume() {
        super.onResume()
            Toast.makeText(this,
            "hiiii",
            Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
            Toast.makeText(this,
            "pause",
            Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
            Toast.makeText(this,
            "after stop",
            Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
            Toast.makeText(this,
            "restart app",
            Toast.LENGTH_SHORT).show()
    }

}