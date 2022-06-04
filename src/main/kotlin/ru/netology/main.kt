package ru.netology

fun main() {
    val amount =10_000_00
    val minCommission = 3500
    val commission = if(amount*0.0075 > minCommission) (amount*0.0075).toInt()
    else minCommission
    println("Комиссия составит: ${commission} коп.")

}