package a_conceitos

//# Condicionais


fun condicionais(): Boolean {

    val senha = ""
    val senhaCorreta = ""


    return senha == senhaCorreta // Retorno em uma única linha

    //retorno padrão
    if (senha == senhaCorreta) {
        return true
    } else {
        return false
    }

}


fun saldo() {
    val saldo = 0.0

    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Conta zerada")

    }
}




