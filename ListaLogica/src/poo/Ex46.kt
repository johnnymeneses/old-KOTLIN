package poo
/*
4. Crie uma classe abstrata chamada CartaoMensagem. Essa classe representa todos os tipos de cartões de mensagem contendo apenas um atributo: destinatario. Nessa classe você deverá também declarar o método retornarMensagem(remetente).

    Crie três classes filhas (sub-classes) da classe CartaoMensagem:
        MensagemDiaDosNamorados
        MensagemNatal
        MensagemAniversario.
    Cada uma dessas classes deve conter um método construtor que receba o nome do destinatário do cartão. Cada classe também deve implementar o método retornarMensagem(remetente), retornando uma mensagem ao usuário com o nome do destinatário, um texto que seja específico para a data de comemorativa do cartão, acrescido do remetente ao final da mensagem. Por exemplo, essa poderia ser uma mensagem de um cartão de dia dos namorados: “Querida Maria, Feliz Dia dos Namorados! Espero que esse tenha gostado do meu cartão de dia dos namorados! De todo meu coração, João”
    Crie um programa para demonstrar o uso das classes criadas. Para isso, crie um array (ex.: listaMsg = []) e insira de forma alternada instâncias dos 3 tipos de cartões (ex.: listaMsg.append(cartao)). Em seguida, use um laço de repetição (ex.: for msg in listMsg:) para exibir as mensagens dos cartões. Chame o método mostrarMensagem(String remetente) dos objetos, utilizando como argumento o seu nome para remetente. Utilize o método input para receber dados do usuário.


 */
