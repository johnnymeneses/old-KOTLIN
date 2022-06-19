package outros

fun estruturaRepeticao() {

//FOR
    tabuada(5)

//WHEN
    novelos(6)


//    DO WHILE
//    WHILE SO

}

//FOR
fun tabuada (num: Int){
    for(index in 1..10)
    {
        println("$index * $num = " + index * num)
    }
}

//WHEN
fun novelos(blusa: Int){

    when {
        blusa <= 0 -> return
        blusa == 1 -> println("Para $blusa blusa, é preciso ${blusa*87} novelos")
        blusa > 1 -> println("Para $blusa blusas, é preciso ${blusa*87} novelos")
    }


}

