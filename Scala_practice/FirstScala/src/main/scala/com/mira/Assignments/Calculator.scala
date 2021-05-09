package com.mira.Assignments

import scala.io.StdIn.readLine

object Calculator {

  def main(args: Array[String]): Unit = {

    println("Addition : 1 ")
    println("Subtraction : 2 ")
    println("Multiplication : 3 ")
    println("Division : 4 ")
    println("Enter your operation : ")
    val calculation = readLine()
    println("Enter number 1 : ")
    val number1 = readLine()
    println("Enter number 2 : ")
    val number2 = readLine()

    calculate(calculation.toInt, number1.toDouble, number2.toDouble)

  }

  def calculate(calculation: Int, number1: Double, number2: Double): Unit = {

    calculation match {
      case 1 => println("Addition")
        println(number1 + number2)
      case 2 => println("Subtraction")
        println(number1 - number2)
      case 3 => println("Multiplication")
        println(number1 * number2)
      case 4 => println("Division")
        println(number1 / number2)
      case default=> println("Incorrect calculation: " + default.toString)
        3
    }
  }
}
