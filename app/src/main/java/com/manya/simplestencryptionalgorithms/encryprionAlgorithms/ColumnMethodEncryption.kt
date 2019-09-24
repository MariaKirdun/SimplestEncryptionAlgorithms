package com.manya.simplestencryptionalgorithms.encryprionAlgorithms

class ColumnMethodEncryption : Encryption {

    override fun encrypt(message: String, key: String): String {
        val matrix = createMatrix(message,key)
        val result = CharArray(matrix.get(0).size * matrix.size) {' '}

        val ascii = getASCIINumbers(key)
        val sortAscii = ascii.sortedArray()

        var iterator = 0
        for ( row in matrix.indices) {

            for (col in matrix[row].indices) {
                val i = sortAscii.indexOf(ascii[col])
                if (i < result.size && i >= 0) {
                    result[ row + i + iterator] = matrix[row][col]
                }
//                if ((row + 1) >= matrix.size){
//                    sortAscii[i] = 0
//                }
            }
            iterator += key.length - 1
        }
        return String(result).replace(" ", "")

    }

    override fun decrypt(message: String, key: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun createMatrix(message: String, key: String) : Array<Array<Char>>{
        val col = key.length
        var row = message.length / col
        if (message.length % col != 0) {
            row++
        }
        var i = 0;
        return Array(row) {Array(col){if (i < message.length) message[i++] else ' '}}
    }

    private fun getASCIINumbers(key : String) : Array<Int>{
        val array : Array<Int> = Array(key.length){0}
        var i = 0
        for (char in key) {
            array[i] = char.toInt()
            i++
        }
        return array
    }

}