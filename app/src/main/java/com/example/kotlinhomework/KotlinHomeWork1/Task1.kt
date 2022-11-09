package com.example.kotlinhomework.KotlinHomeWork1

import java.util.*
import kotlin.math.max

class Task1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val randomNumber = (4..6).random()
            var lines: Array<String> = Array(randomNumber) {""}
            var maxLength = -1
            var minLength = 100
            for (i in 0 until randomNumber){
                println("Enter lines")
                val name = readLine()
                if (name != null) {
                    lines[i] = name
                }
                if (lines[i].length < minLength){
                    minLength = lines[i].length
                }
                if (lines[i].length > maxLength){
                    maxLength = lines[i].length
                }
            }
            println(lines.contentToString())

            println("The lowest line")
            for (strings in lines){
                if (strings.length == minLength) {
                    println(strings);
                }
            }

            println("The biggest line")
            for (strings in lines){
                if (strings.length == maxLength) {
                    println(strings);
                }
            }
//            var max = ""
//            for (i in lines.indices){
//
//                if (max.length < lines[i+1].length){
//                    max = lines[i+1]
//                }
//            }
//            println(max)
        }
    }
}