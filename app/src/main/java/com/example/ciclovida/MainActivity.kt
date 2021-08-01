package com.example.ciclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.ContentValues.TAG

//val TAG = "Ciclo de Vida"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG,"Criando a activity!")


        fun onStart() {
            super.onStart()
            print("onStart")
            Log.v(TAG,"Activity em OnStart!")
        }

        fun onResume() {
            super.onResume()
            print("onResume")
            Log.v(TAG,"Activity em OnResume!")
        }

        fun onPause() {
            super.onPause()
            print("onPause")
            Log.v(TAG,"Activity em OnPause!")
        }

        fun onStop() {
            super.onStop()
            print("onStop")
            Log.v(TAG,"Activity em OnStop!")
        }

        fun onRestart() {
            super.onRestart()
            print("onRestart")
            Log.v(TAG,"Activity em OnRestart!")
        }

        fun onDestroy() {
            super.onDestroy()
            print("onDestroy")
            Log.v(TAG,"Activity em OnDestroy!")
        }

    }
    }
