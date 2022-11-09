package com.example.kotlinhomework.KotlinHomeWork1

import java.util.*

class Task3 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var lines: Array<String> = Array(3) {""}
            for (i in lines.indices) {
                println("Enter lines")
                val name = readLine()
                if (name != null) {
                    lines[i] = name
                }
            }
            val strBuffer = StringBuffer(lines[2])
            println("line 3:")
            println(strBuffer)

            val strBuffer1 = StringBuffer(lines[1].lowercase(Locale.getDefault()))
            println("line 2:")
            println(strBuffer1)

            val strBuffer2 = StringBuffer(lines[0].reversed())
            println("line 1:")
            println(strBuffer2)
        }
    }
}