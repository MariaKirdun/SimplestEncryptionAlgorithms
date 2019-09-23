package com.manya.simplestencryptionalgorithms.encryprionAlgorithms

interface Encryption {

    fun encrypt(message : String, key: String) : String
    fun decrypt(message : String, key: String) : String
}