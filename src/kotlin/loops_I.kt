package kotlin

import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val N = scan.nextInt()
    //until use the range between 1 to 10
    for(i in 1 until 11){
        println("$N x $i = ${N*i}")
    }
    scan.close()
}