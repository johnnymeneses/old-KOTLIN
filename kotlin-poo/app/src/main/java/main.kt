import d_exercicios_logica.*

fun main() {

    var exercicio = 23


    //Logica para chamar os exercícios
    when (exercicio) {
        1 -> Ex01(5)                                 //Tabuada
        2 -> Ex02(2, 5)                             //Area do Terreno
        3 -> println(Ex03(5))                        //Par ou impar?
        4 -> println(Ex04(10, 5))                   // Divisao de dois numeros
        5 -> Ex05(10, 11)                       //Padaria
        6 -> println(Ex06("Johnny", 37))      //Idade em anos
        7 -> println(Ex07(5.69f, 5.69f))     //Preço Gasolina
        8 -> Ex08()
        13 -> Ex13()                                           //Exemplo de entrada de dados usando o readLine()
        14 -> Ex14(5000.0)                            //Aumento de Salario
        20 -> Ex20(15, 20)          //Horas Extras
        23 -> Ex23(1,1,0)               //qtosLitros
        25 -> Ex25("Pneu",100.0,10.0)   //Desconto
        40 -> Ex40()                                        //Exercicio For - Udemy
        41 -> Ex41()                                        //Exercicio For - Udemy
        42 -> Ex42()                                        //Exercicio For - Udemy
        43 -> Ex43()                                        //Exercicio For Somatoria - Udemy
        44 -> Ex44(5)                                   //Exercicio For #### - Udemy
        45 -> Ex45()                                   //Exercicio doWhile - Udemy
        46 -> Ex46()                                   //Exercicio doWhile - FizzBuzz

    }


}


/*
     Basic syntax
    Package definition and imports
    Program entry point
    Print to the standard output
    Functions
    Variables
    Creating classes and instances
    Comments
    String templates
    Conditional expressions
    for loop
    while loop
    when expression
    Ranges
    Collections
    Nullable values and null checks
    Type checks and automatic casts
* */