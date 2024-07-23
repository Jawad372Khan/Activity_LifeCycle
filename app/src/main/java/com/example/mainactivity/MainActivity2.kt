package com.example.mainactivity

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    val TAG = "tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Destroy")
    }
}