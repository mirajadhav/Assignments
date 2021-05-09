package com.mira.Assignments

object Student
{
  def main(args: Array[String]): Unit = {

    calculateGrade(91)
  }

  def calculateGrade(percentage: Int): Unit = {
    if (percentage > 90 && percentage <= 100) {
      println("Student got - Grade A")
    }

    if (percentage > 80 && percentage <= 90) {
      println("Student got - Grade B")
    }

    if (percentage > 70 && percentage <= 80) {
      println("Student got -Grade C")
    }

    if (percentage < 70) {
      println("Student is Failed..")
    }
  }

}
