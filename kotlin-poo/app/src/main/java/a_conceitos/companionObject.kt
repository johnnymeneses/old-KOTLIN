package a_conceitos

//Object Declaration que será usado para contador de contas criadas.
//Este objeto Fica disponível desde a execução do programa até o final
//Companion Object: Um OB consiga compartilhar seus membros quando ele estrá dentro de uma classe

class companionObject
{

    companion object Contador{
        var total= 0
            private set
    }

}

