package com.manya.simplestencryptionalgorithms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val algorithm = RailwayFenceEncryption("cryptogram",4)
        Log.d("defy", "${algorithm.encrypt()} \t")
        val algorithmD = RailwayFenceEncryption("ctaromygpr",4)
        Log.d("defy", "${algorithmD.decrypt()} \t")

    }
}
