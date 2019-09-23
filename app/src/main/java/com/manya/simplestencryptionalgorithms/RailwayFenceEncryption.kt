package com.manya.simplestencryptionalgorithms

class RailwayFenceEncryption (private val message : String, private val key : Int) {


    fun encrypt() : String{
        var result = ""
        for (i in 0 until key){
            var j = i
            while (j < message.length){
                result += message[j]
                j += key
            }
        }
        return result
    }

    fun decrypt() : String{
        var result = ""
        var mes = message
        if (message.length % key != 0) {
            mes += " "
        }
        val midPoint = mes.length / 2
        for (i in 0 until midPoint - 1){
            result += mes[i] + "" + mes[i + midPoint] + mes[i + 2*midPoint]
        }
        return result
    }

}