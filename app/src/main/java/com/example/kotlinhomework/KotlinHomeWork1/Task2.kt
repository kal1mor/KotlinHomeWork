package com.example.kotlinhomework.KotlinHomeWork1

import java.lang.StringBuilder

class Task2 {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val randomNumber = (4..6).random()
            var lines: Array<String> = Array(randomNumber) {""}
            var length = 0
            var counter = 0

            for (i in 0 until randomNumber){
                println("Enter lines")
                val name = readLine()
                if (name != null) {
                    lines[i] = name
                }
                length += lines[i].length
                counter++
            }

            var averageLength = length/counter
            println("Average length:")
            println(averageLength)

            println("Rows that are above average:")
            var strBuilder: StringBuilder
            for (i in lines.indices){
                if (lines[i].length > averageLength){
                    strBuilder = StringBuilder(lines[i])
                    println(strBuilder)
                }
            }
        }
    }
}