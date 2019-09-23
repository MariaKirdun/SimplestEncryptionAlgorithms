package com.manya.simplestencryptionalgorithms.encryprionAlgorithms

import com.manya.simplestencryptionalgorithms.exceptions.IncorrectKeyException

class RailwayFenceEncryption :
    Encryption {


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
        var result = ""
        var mes = message
        var keyInt = 0
        try {
            keyInt = Integer.parseInt(key)
        } catch (exp : Exception){
            throw IncorrectKeyException("incorrect key")
        }
        if (message.length % keyInt != 0) {
            mes += " "
        }
        val midPoint = mes.length / 2
        for (i in 0 until midPoint - 1){
            result += mes[i] + "" + mes[i + midPoint] + mes[i + 2*midPoint]
        }
        return result
    }

}