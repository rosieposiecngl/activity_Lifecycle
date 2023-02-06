package com.android.erwin.challengeactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var TAG = "Process"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"onCreateG")
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG,"onStart")
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG,"onRestart")
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG,"onResume")
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG,"onPause")
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG,"onStop")
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG,"onDestroy")
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show()
    }
}