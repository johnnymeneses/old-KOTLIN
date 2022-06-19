package br.com.johnny.bytebank.exception

//Toda Exception deriva da classe Throwable
class ValorInvalidoException(
    mensagem:String = "Este valor é invalido.") : Exception (mensagem)