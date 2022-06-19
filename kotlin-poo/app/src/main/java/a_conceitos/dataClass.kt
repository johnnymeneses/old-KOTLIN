package a_conceitos


//        Data class
//        Uso: Representa uma classe que transita dados
//        Ganho: agregar dados; função copy
//Quando vc instrancia uma classe, vc aloca um objeto na memoria. Posição na memoria
//Quando vc intancia um dataclasse, vc compara os valores e não a posição na memoria


class Quadrado(val area: Float)
data class Triangulo(val area: Float)

//data class param(var b:Boolean, var s:String, var i: Int )


fun dataClass() {

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    println(q1)
    println(t1) //Imprimir a area e o valor do atributo

    println(q1 == q2) //compara endereço de memória
    println(t1 == t2)//compara valores

    // println("HashCode")
    println(q1.hashCode())
    println(q2.hashCode())
    println(t1.hashCode())
    println(t2.hashCode())

    //copy
    val t3 = t2.copy()

    println("copy")
    println(t3)

}