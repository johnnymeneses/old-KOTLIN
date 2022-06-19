package br.com.johnny.bytebank.exception

//Toda Exception deriva da classe Throwable
class FalhaAutenticacaoException(
    mensagem: String= "Falha na Autenticação"): Exception (mensagem)