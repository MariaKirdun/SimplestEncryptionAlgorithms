package com.manya.simplestencryptionalgorithms

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val algorithm = RailwayFenceEncryption("cryptogram",4)
        Log.d("defy", "${algorithm.encrypt()} \t")

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked =  view.isChecked

            when (view.id) {
                R.id.railwayFenceRadioButton ->
                /**
                 * railwayFence
                 */
                    if (checked) {

                    }
                R.id.columnMethodRadioButton ->
                /**
                 * columnMethod
                 */
                    if (checked) {

                    }
                R.id.vigenereDirectRadioButton ->
                /**
                 * vigenereDirectRadioButton
                 */
                    if (checked) {

                    }
                R.id.vigenereProgressiveRadioButton ->
                /**
                 * vigenereProgressiveRadioButton
                 */
                    if (checked) {

                    }
                R.id.vigenereSelfGeneratedRadioButton ->
                /**
                 * vigenereSelfGeneratedRadioButton
                 */
                    if (checked) {

                    }

                else -> Toast.makeText(this,"Please choose algorithm", Toast.LENGTH_SHORT).show()

            }
        }
    }

}
