package b_estruturaDados

//import org.junit.Assert
//import org.junit.Test

class contagemLetras {

//    @Test
//    fun contaVogal() {
//        Assert.assertEquals(11, contaVogal("Quantas vogais tem esta frase?"))
//    }
//
//    @Test
//    fun contaConsoante() {
//        Assert.assertEquals(21, contaConsoante("Geralmente uma frase possui mais consoantes!"))
//    }
//
//    @Test
//    fun contaVogaleConso() {
//        val phrase = "Estou gostando muito de aprender Kotlin"
//        Assert.assertEquals(15, contaVogal(phrase))
//        Assert.assertEquals(19, contaConsoante(phrase))
//    }
//
//
//}


    fun contaVogal(str: String): Int {
        val vogais = "aeiou"
        var totalVogais = 0

        for (letra in str) {
            if (letra.lowercaseChar() in vogais) totalVogais++ //lowercaseChar pra considerar todas as vogais como inuscula
        }
        return totalVogais
    }

    fun contaConsoante(str: String): Int {
        val consoantes = "bcdfgjklmnpqrstvwxz"
        var totalVogais = 0

        for (letra in str) {
            if (letra.lowercaseChar() in consoantes) totalVogais++ //lowercaseChar pra considerar todas as vogais como inuscula
        }
        return totalVogais
    }
}