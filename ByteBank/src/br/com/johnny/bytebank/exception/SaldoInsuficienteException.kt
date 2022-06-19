package br.com.johnny.bytebank.exception

//Toda Exception deriva da classe Throwable
class SaldoInsuficienteException(
    mensagem: String= "Saldo Insuficiente"): Exception (mensagem)