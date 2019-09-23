package com.manya.simplestencryptionalgorithms

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.manya.simplestencryptionalgorithms.encryprionAlgorithms.*
import com.manya.simplestencryptionalgorithms.exceptions.IncorrectKeyException
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var algorithm : Encryption? = null
    private var message : String = ""
    private var key : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        message = wordEditText.text.toString()
        key = keyEditText.text.toString()

    }

    override fun onClick(v: View?) {
        try {
            when (v?.id) {
                R.id.encryptButton ->
                    algorithm?.encrypt(message, key)
                R.id.decryptButton ->
                    algorithm?.decrypt(message, key)
            }
        } catch (e : IncorrectKeyException) {
            Toast.makeText(this,"Please enter correct key", Toast.LENGTH_SHORT).show()
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
