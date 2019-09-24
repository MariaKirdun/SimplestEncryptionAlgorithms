package com.manya.simplestencryptionalgorithms.encryprionAlgorithms

class ColumnMethodEncryption : Encryption {

    override fun encrypt(message: String, key: String): String {
        sortAlphabetically(key)
        return sortAlphabetically(key).contentToString()

    }

    override fun decrypt(message: String, key: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun createMatrix(message: String, key: String) : Array<Array<String>>{
        val col = key.length
        var row = message.length / col
        if (message.length % col != 0) {
            row++
        }
        return Array(row) {Array(col){" "}}
    }

    private fun sortAlphabetically(key : String) : Array<Int>{
        val array : Array<Int> = Array(key.length){0}
        for ((i, char) in key.indices.withIndex()) {
            array[i] = char
        }
        return array
    }

}