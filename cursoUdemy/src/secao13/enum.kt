//Classe enum permitem listar possibilidades possíveis; possibilidades de valores

enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super Baixa"
        }
    },
    MEDIA(5), ALTA(10) {
        override fun toString(): String {
            return "Super Alta"
        };

    }
}


//override
//enum class Prioridade2(val id: Int){


//Classes enum como se fossem parametros de outras classes
class Alarme(var desc: String, p: Prioridade2)


fun enum() {

//    println(Prioridade1.BAIXA)
//    println(Prioridade2.BAIXA.id)

    Alarme("Aviso", Prioridade2.ALTA)

    for (p in Prioridade2.values()) {
//        println(p)
        println("${p.id} ${p} - posição ${p.ordinal}")

        if (p.toString() == "MEDIA") println("Chegamos na media")


    }

}