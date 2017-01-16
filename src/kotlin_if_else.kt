import java.util.*

/**
 * Created by jmarkstar on 16/01/2017.
 */

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    if(n%2==1){
        println("Weird")
    }else{
        if(n>=2 && n<=5){
            println("Not Weird")
        }else if(n>=6 && n<=20){
            println("Weird")
        }else if(n>20){
            println("Not Weird")
        }
    }
    scan.close()
}