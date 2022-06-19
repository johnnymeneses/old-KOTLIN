package d_exercicios_logica/*



Questionamentos sobre Orientação à Objetos

Escreva em Java uma classe que represente um circulo no plano cartesiano. Forneça os seguintes membros de classe: a) Um construtor que receba o raio e um ponto (o centro do círculo); b) Um construtor que receba o raio e posicione o círculo na origem do espaço cartesiano; c) Métodos de acesso ao atributo raio do círculo; d) Métodos inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de um dado valor; e) Métodos sobrecarregados, inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de uma unidade; h) Métodos sobrecarregados mover, que: i) por default (sem parâmetros) levam o círculo para a origem do espaço 2D; ii) movem o círculo para um local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e ordenada do ponto para onde o círculo se move); iii) movem o círculo para o local indicado por outro ponto. f) Método que retorna a área do círculo

Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira. Escreva a classe em Java e forneça os seus membros a seguir: a) Construtor que inicialize o código ISO, o nome e a dimensão do país; b) Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e dimensão do país; c) Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO; d) Um método que informe se outro país é limítrofe do país que recebeu a mensagem; e) Um método que retorne a densidade populacional do país; f) Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países. Considere que um país tem no máximo 40 outros países com os quais ele faz fronteira.

Escreva em Java uma classe Continente. Um continente possui um nome e é composto por um conjunto de países. Forneça os membros de classe a seguir: a) Construtor que inicialize o nome do continente; b) Um método que permita adicionar países aos continentes; c) Um método que retorne a dimensão total do continente; d) Um método que retorne a população total do continente; e) Um método que retorne a densidade populacional do continente; f) Um método que retorne o país com maior população no continente; g) Um método que retorne o país com menor população no continente; h) Um método que retorne o país de maior dimensão territorial no continente; i) Um método que retorne o país de menor dimensão territorial no continente; j) Um método que retorne a razão territorial do maior pais em relação ao menor país

Escreva uma classe Pessoa que representa uma pessoa numa árvore genealógica. A pessoa possui um nome, um pai e uma mãe (que também são pessoas). Forneça os seguintes membros para a classe: a) Construtores sobrecarregados que: i) inicialize o nome da pessoa, bem como seus antecessores (pai e mãe); ii) inicialize o nome da pessoa, e coloque seus antecessores para null; b) Um método que verifique a igualdade semântica entre duas pessoas (as pessoas são iguais se possuem o mesmo nome e a mesma mãe); c) Um método que verifique se duas pessoas são irmãs; d) Um método que verifique se uma pessoa é antecessora da pessoa que recebeu a mensagem (é seu pai ou sua mãe, ou antecessor do pai ou antecessor da mãe)

Escreva uma classe Conjunto, que represente um conjunto de tamanho variável (crescimento de array por demanda) de elementos do tipo String. Escreva os seguintes membros para a classe: a) Um método que permita adicionar um elemento para o conjunto (o elemento não pode existir no conjunto); b) Um método que permita verificar se um dado elemento pertence ao Conjunto; c) Um método uniao, que retorne um novo conjunto de acordo com a semântica da operação união entre conjuntos (um novo conjunto, sem elementos repetidos, com a combinação dos elementos dos dois conjuntos originais, o que recebeu a mensagem e o que foi passado como parâmetro); d) Um método inter, que retorne um novo conjunto de acordo com a semântica da operação interseção entre conjuntos(um novo conjunto, sem elementos repetidos, com os elementos que estejam nos dois conjuntos originais ,o que recebeu a mensagem e o que foi passado como parâmetro); e) Um método menos, que retorne um novo conjunto de acordo com a semântica da operação subtração entre conjuntos (um novo conjunto, sem elementos repetidos, com os elementos do conjunto que recebeu a mensagem, e que não existam no conjunto passado como parâmetro).

Crie uma classe Matriz que represente uma matriz matemática. Forneça um construtor que permita a inicialização das dimensões da Matriz Forneça métodos para acesso (leitura/escrita) de cada elemento da matriz. Forneça os métodos adequados para as seguintes operações com matriz: a) Comparação semântica da matriz; b) Retornar a transposta (é aquela onde as linhas se transformam em colunas e as colunas em linhas) da matriz. c) Retornar a oposta (é aquela onde todos os elementos possuem sinais trocados) da matriz; d) Gere uma matriz nula (é aqueles onde todos os elementos são iguais a 0); e) Informe se a matriz é identidade (matriz quadrada onde os elementos da diagonal principal são todos iguais a 1 e os demais 0); f) Informe se a matriz é diagonal (matriz quadrada onde os elementos fora da diagonal principal são todos iguais a 0). g) Informe se a matriz é singular (matriz diagonal onde os elementos da diagonal principal são todos iguais); h) Informe se a matriz é simétrica (uma matriz quadrada é dita simétrica se ela é igual a sua transposta); i) Informe se a matriz é anti-simétrica (uma matriz quadrada é dita anti-simétrica se sua oposta é igual a sua transposta) j) Adicionar duas matrizes (alterando o valor da que recebeu a mensagem); k) Subtrair duas matrizes(alterando o valor da que recebeu a mensagem); l) Multiplicar duas matrizes(alterando o valor da que recebeu a mensagem); m) Gere uma cópia da matriz


:::1 Crie um algoritmo que calcule a área de um retângulo.



:::3 – Desenvolva uma calculadora, onde será necessário entrar com a operação, primeiro e segundo valor, exiba o resultado na tela.

:::4 – Desenvolva um algoritmo que solicite a entrada da idade de um determinado usuário, se for menor que 18 anos exiba na cor vermelha “Sem permissão”, caso seja maior ou igual a 18 anos exiba na cor verde “Permissão concedida”.




:::6 – Desenvolva um algoritmo que solicite a entrada de uma frase, após isto troque todas as letras A ou a por &, porém não utilize o método Replace().


:::7 – Desenvolva um algoritmo que calcule o reajuste salarial. Se o salário for abaixo de 1.700 o ajuste é de R$300.00, se maior de R$ 200.00. Para finalizar, exiba o novo salário na tela.



:::8 - Desenvolva um algoritmo que solicite a entrada de nome, e-mail, telefone e RG de um determinado usuário e grave em um arquivo de texto. Exiba as informações na tela a partir do arquivo de texto gerado.



:::9 – Desenvolva um algoritmo que calcule o IMC de uma determinada pessoa, e grave os resultados em um arquivo de texto, onde ao acessar a aplicação será solicitado se quer fazer um novo cadastro ou consultar os existentes. Cadastrando um novo calculo de IMC, será necessário informar o nome, idade, peso e altura. O cálculo do IMC é feito dividindo o peso (em quilogramas) pela altura (em metros) ao quadrado. Ao gravar em um arquivo de texto, os dados anteriores deverão ser mantidos.




::::Exercício Maior Idade
Implemente um programa no qual o usuário deverá informar o nome e a idade de três pessoas. O programa deverá informar o nome da pessoa que possuir a maior idade.
Regras que deverão ser seguidas para a implementação do algoritmo:
É obrigatório o uso de classe para representar uma pessoa e a mesma deverá possuir como propriedades (características) um nome e uma idade.
A classe também deverá possuir um método chamado ExibirDados. Esse método deverá exibir o nome e a idade da pessoa em questão.
Ao implementar a classe é obrigatório implementar dois construtores (Sobrecarga), um que não recebe parâmetro algum e outro que irá receber o nome e a idade de uma pessoa.

Exercícios básicos
Determine as raízes de uma equação de 2º grau: ax2 + bx + c = 0 (recordar que o discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).
Calcule a distância entre dois pontos num espaço de 3 dimensões.
Para cada produto informado (nome, preço e quantidade), escreva o nome do produto comprado e o valor total a ser pago, considerando que são oferecidos descontos pelo número de unidades compradas, segundo a tabela abaixo: a. Até 10 unidades: valor total b. de 11 a 20 unidades: 10% de desconto c. de 21 a 50 unidades: 20% de desconto d. acima de 50 unidades: 25% de desconto

Construa a tabela de multiplicação de números de 1 a 10 (ex.: 1 x 1 = 1, 1 x 2 = 2, etc.).
Determine o número de dígitos de um número informado.
Considere os programas a seguir, que leem um código repetidamente e imprimem o código lido até que o código lido seja igual a -1. O código -1 não deve ser impresso.

Calcule a série de Fibonacci para um número inteiro não negativo informado pelo usuário. A série de Fibonacci inicia com os números F0 = 0 e F1 = 1, e cada número posterior equivale à logica.logica.soma dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso o usuário informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

Calcule o retorno de um investimento financeiro fazendo as contas mês a mês, sem usar a fórmula de juros compostos. O usuário deve informar quanto será investido por mês e qual será a taxa de juros mensal. O programa deve informar o saldo do investimento após um ano (logica.logica.soma das aplicações mês a mês considerando os juros compostos), e perguntar ao usuário se ele deseja que seja calculado o ano seguinte, sucessivamente. Por exemplo, caso o usuário deseje investir R$ 100,00 por mês, e tenha uma taxa de juros de 1% ao mês, o programa forneceria a seguinte saída: Saldo do investimento após 1 ano: 1280.9328043328942 Deseja processar mais um ano? (S/N)

Calcule a raiz quadrada aproximada de um número inteiro informado pelo usuário, respeitando o erro máximo também informado pelo usuário. Não utilize funções predefinidas

Exercícios de variáveis compostas
12. Leia uma matriz 3 x 3 que representa um tabuleiro de jogo da velha e indique qual posição deveria ser jogada para ganhar o jogo (se possível) ou ao menos para evitar uma derrota.
13. Ordene um vetor de 100 números inteiros gerados aleatoriamente.
14. Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor individualmente, e combine os dois vetores gerando um novo vetor de 100 posições, de forma que esse novo vetor já seja criado ordenado

Exercícios de subprogramação
15. Faça um método que calcule a média de um aluno de acordo com o critério definido neste curso. Além disso, faça um outro método que informe o status do aluno de acordo com a tabela a seguir: Nota acima de 6 à “Aprovado” Nota entre 4 e 6 à Conceito “Verificação Suplementar” Nota abaixo de 4 à Conceito “Reprovado”
16. Leia do usuário o tempo em segundos e escreva em horas, minutos e segundos. Utilize cinco métodos, para a leitura e escrita de dados e para obtenção de horas, minutos e segundos a partir do tempo em segundos.
17. Leia um número decimal (até 3 dígitos) e escreva o seu equivalente em numeração romana. Utilize métodos para obter cada dígito do número decimal e para a transformação de numeração decimal para romana (Dica1: 1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1.000 = M; Dica2: utilize um vetor guardando a tradução para cada um dos dígitos).
18. Escreva um número por extenso aceitando números de até 9 dígitos, usando métodos para as traduções e vetores de Strings que guardam cada tradução (ex.: unidades = { “zero”, “um”, “dois”, ..., “nove” }).

Exercícios de OO
19. Identifique as classes e implemente um programa para a seguinte especificação: “O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja e a respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou cartão.”
20. Faça um programa de agenda telefônica, com as classes Agenda e Contato.
21. Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.
22. Faça uma programa para representar a árvore genealógica de uma família. Para tal, crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e a mãe. Tenha em mente que pai e mãe também são do tipo Pessoa.
23. Faça um programa que calcule a área de uma figura geométrica. Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo. Use herança e polimorfismo. 24. Adicione a funcionalidade de exibição do total de contatos registrados na agenda disponível em https://github.com/leomurta/agenda
25. Adicione a funcionalidade de busca por contato na agenda disponível em https://github.com/leomurta/agenda
26. Adicione a funcionalidade de ordenação dos contatos na agenda disponível em https://github.com/leomurta/agenda
27. Adicione o registro de mais de um telefone por contato na agenda disponível em https://github.com/leomurta/agenda
28. Adicione o registro de endereço comercial e residencial por contato na agenda disponível em https://github.com/leomurta/agenda
29. Explique com suas palavras como é o mecanismo de listener usado no Swing para permitir que os eventos de clique dos botões sejam tratados pelo programa.
30. Qual a diferença entre abstração, encapsulamento e modularidade?

Exercícios de Tratamento de Exceções
31. Refaça os exercícios 1, 2 e 3 para protegê-los de qualquer tipo de exceção que pode ocorrer durante a interação com o usuário.
32. Qual a diferença entre uma exceção (subclasses de Exception) e um erro (subclasses de Error)?

Exercícios de Coleções
33. Refaça os exercícios 13 e 14 usando List no lugar de vetor.
34. Refaça o exercício 17 usando Map para guardar a tradução dos números decimais para romanos.
35. Refaça o exercício 22 usando Set para guardar o conjunto de filhos de uma pessoa no lugar dos seus pais
Exercícios de Threads
 36. Faça um programa que leia um número “n” informado pelo usuário e diga quantos números primos há entre 0 e “n”. Esse seu programa deve rodar em 2 threads, de forma que o esforço computacional seja uniformemente dividido entre as threads.
 37. Faça com que a funcionalidade de persistência da agenda disponível em https://github.com/leomurta/agenda passe a rodar em uma thread em separado, tanto para leitura dos dados, na abertura da janela, quanto para a escrita dos dados, no fechamento da janela

39. Para que serve o modificador synchronized? Em que situações ele deve ser usado? Por que não usar em todos os métodos do programa?

40. Qual a diferença entre o método sleep() e o método join() da classe Thread



https://www.computersciencemaster.com.br/exercicio-sistema-de-lanchonete/
https://www.computersciencemaster.com.br/exercicios-de-orientacao-a-objetos/
https://www.computersciencemaster.com.br/exercicios-construtores-e-sobrecarga/
https://www.computersciencemaster.com.br/exercicio-sistema-de-lanchonete/
https://www.computersciencemaster.com.br/exercicios-polimorfismo/
https://www.computersciencemaster.com.br/exercicio-sistema-de-gerenciamento-de-pedidos-grafica/
https://www.computersciencemaster.com.br/exercicio-calculadora/
https://dev.to/guilhermemanzano/exercicios-resolvidos-de-orientacao-a-objetos-em-java-4b6g




 */
