package datastructures

import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val arr = kotlin.arrayOfNulls<Int>(n)
    for(i in 0 until n){
        arr[i] = scan.nextInt()
    }
    var result = ""
    for(x in n-1 downTo 0){
        result += "${arr[x]} "
    }
    println(result.trim())
    scan.close()
}