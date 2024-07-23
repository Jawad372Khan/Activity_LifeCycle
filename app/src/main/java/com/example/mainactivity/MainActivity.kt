package com.example.mainactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


/**
 * Firstly, when the MainActivity is opened, the init block will be executed first.
 * After that, the onCreate() method will be executed, followed by the onStart() and onResume() methods,
 * which will be executed one after another. When the user clicks on the button, the application will
 * navigate to the next activity by calling the onPause() method of the MainActivity, and will then
 * execute the onCreate(), onStart(), and onResume() methods of the next activity, which is MainActivity2.
 * After this, the application will call the onStop() method of the MainActivity.
 *
 * As the user navigates back from MainActivity2, the onPause() method of MainActivity2 will be called,
 * followed by onRestart(), onStart(), and onResume() methods of the MainActivity in that order.
 * Afterwards, the onStop() and onDestroy() methods of MainActivity2 will be called to destroy MainActivity2.
 */
class MainActivity : AppCompatActivity() {
    val TAG = "tag"

    init {
        Log.d(TAG,"Init Block")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Create")
        val btn = findViewById<Button>(R.id.homeActivity)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
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