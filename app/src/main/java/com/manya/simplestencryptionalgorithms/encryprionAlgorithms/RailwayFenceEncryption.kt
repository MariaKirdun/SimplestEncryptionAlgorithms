package com.manya.simplestencryptionalgorithms.encryprionAlgorithms

import com.manya.simplestencryptionalgorithms.exceptions.IncorrectKeyException

class RailwayFenceEncryption : Encryption {


    override fun encrypt(message : String, key : String) : String{
        var result = ""
        var keyInt = 0
        try {
            keyInt = Integer.parseInt(key)
        } catch (exp : Exception){
            throw IncorrectKeyException("incorrect key")
        }
        for (i in 0 until keyInt){
            var j = i
            while (j < message.length){
                result += message[j]
                j += keyInt
            }
        }
        return result
    }

    override fun decrypt(message : String, key : String) : String{
        val mes = CharArray(message.length) {' '}
        val keyInt : Int
        try {
            keyInt = Integer.parseInt(key)
        } catch (exp : Exception){
            throw IncorrectKeyException("incorrect key")
        }
        var mesIter = 0
        for (i in 0 until keyInt){
            var j = i
            while (j < message.length){
                mes[j] = message[mesIter]
                j += keyInt
                mesIter++
            }
        }
        return String(mes)
    }

}