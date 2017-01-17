package kotlin_features

import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.next()
    val k = scan.nextInt()
    var min:String? = null
    var max:String? = null
    for(i in 0..s.length-k){
        val substring:String = s.substring(i, i+k)
        if(min==null && max==null){
            min = substring
            max = substring
        }else{
            if(substring.compareTo(min!!) <= 0)
                min = substring

            if(substring.compareTo(max!!) >= 0)
                max = substring
        }
    }
    println(min)
    println(max)
    scan.close()
}
