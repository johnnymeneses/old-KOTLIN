package br.com.johnny.bytebank.modelo

import br.com.johnny.bytebank.modelo.IAutenticavel

class SistemaInterno {

    fun validaEntrada(admin: IAutenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem Vindo ao ByteBank")
        }else
        {
            println("Acesso Negado")
        }


    }

}