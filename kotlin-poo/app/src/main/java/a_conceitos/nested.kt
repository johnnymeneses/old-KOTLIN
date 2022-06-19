package a_conceitos

class Computer(val processorModel: String) {

    //Classe Interna
    inner class Memory(val level: Int) {
        fun getMemoryLevel(): Int {
            println(processorModel)
            return level
        }

    }

}

fun main(){
    val m1: Computer.Memory= Computer("").Memory(75)
    println(m1.getMemoryLevel())

}

