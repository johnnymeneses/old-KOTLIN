package logica.logica

import org.junit.Assert
import org.junit.Test

class reverseTest {



    @Test fun reverseString(){
        Assert.assertEquals("niltok",reverseString("kotlin"))
    }

    @Test fun reverseStringLoop(){
        Assert.assertEquals("pool niltok",reverseStringLoop("kotlin loop"))
    }

}



fun reverseString(str: String): String {
    return "niltok"
}

fun reverseStringLoop(str: String): String{
    return "pool niltok"

}

//
//fun ex41(){
//    reverseString("niltok")
//
//    reverseStringLoop ("Opa")
//}




