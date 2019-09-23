package com.manya.simplestencryptionalgorithms.encryprionAlgorithms

class RailwayFenceEncryption :
    Encryption {


    override fun encrypt(message : String, key : String) : String{
        var result = ""
        for (i in 0 until key as Int){
            var j = i
            while (j < message.length){
                result += message[j]
                j += key
            }
        }
        return result
    }

    override fun decrypt(message : String, key : String) : String{
        var result = ""
        var mes = message
        if (message.length % key as Int != 0) {
            mes += " "
        }
        val midPoint = mes.length / 2
        for (i in 0 until midPoint - 1){
            result += mes[i] + "" + mes[i + midPoint] + mes[i + 2*midPoint]
        }
        return result
    }

}