package solutions


//Solução para logs

import java.text.SimpleDateFormat
import java.util.*

fun top() {

    fun log(str: String) {
        val calendar= Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }

    log("Inicio")
    val interval = 1..1000000000
    var sum: Double = 0.0
    log("For")
    for(i in interval){
        sum+=1*2*1
    }
    log("Fim")
}



fun main() {
    top()
}