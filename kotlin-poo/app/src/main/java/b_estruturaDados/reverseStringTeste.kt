package b_estruturaDados


//import org.junit.Assert
//import org.junit.Test

class reverseStringTeste {

//    @Test
//    fun reverseUsingSB() {
//        Assert.assertEquals("ynnhoJ", reverseUsingSB("Johnny"))
//    }
//
//    @Test
//    fun reverseStringLoop() {
//        Assert.assertEquals("seseneM", reverseUsingLoop("Meneses"))
//
//    }
}


fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}


fun reverseUsingLoop(str: String): String {

    var phrase = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {
        phrase.append(str[i])//metodo para adicionar dentro da variavel str
        i--
    }
    return phrase.toString()


}