package com.manya.simplestencryptionalgorithms

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.manya.simplestencryptionalgorithms.encryprionAlgorithms.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var algorithm : Encryption? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.encryptButton ->
                Toast.makeText(this,"Encrypt", Toast.LENGTH_SHORT).show()
            R.id.decryptButton ->
                Toast.makeText(this,"Decrypt", Toast.LENGTH_SHORT).show()
        }
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked =  view.isChecked

            when (view.id) {
                R.id.railwayFenceRadioButton ->
                    if (checked) {
                        algorithm = RailwayFenceEncryption()
                    }
                R.id.columnMethodRadioButton ->
                    if (checked) {
                        algorithm = ColumnMethodEncryption()
                    }
                R.id.vigenereDirectRadioButton ->
                    if (checked) {
                        algorithm = VigenereDirectEncryption()
                    }
                R.id.vigenereProgressiveRadioButton ->
                    if (checked) {
                        algorithm = VigenereProgressiveEncryption()
                    }
                R.id.vigenereSelfGeneratedRadioButton ->
                    if (checked) {
                        algorithm = VigenereSelfGeneratedEncryption()
                    }
                R.id.playfairRadioButton ->
                    if (checked) {
                        algorithm = PlayfairEncryption()
                    }
            }
        }
    }

}
