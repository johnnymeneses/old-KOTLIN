package testes

import org.junit.Assert
import org.junit.Test

class testesUnitarios() {


    @Test fun retornaNumero(){
        Assert.assertEquals(1,retornaNumero(1))
    }

    @Test fun retornaString(){
        Assert.assertEquals("Texto",retornaString("Texto"))
    }

    @Test fun retornaBoolean(){
        Assert.assertEquals(true, testes.retornaBoolean(true))
    }

    @Test fun retornaMultiplicacao(){
        Assert.assertEquals(20,retornaNumero(4))
    }



}

fun retornaMultiplicacao(num: Int): Int{
    return num * 5
}




fun retornaNumero(num: Int): Int{
    return num
}

fun retornaString(palavra: String): String {
    return palavra
}

fun retornaBoolean(validade: Boolean): Boolean{
    return validade
}
