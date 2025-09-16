// ALUNA: LAYSA BERNARDES CAMPOS DA ROCHA - CB3024873

/*1 Preencha as respostas em cada uma das seguintes afirmações: 

    a) Como começa um comentário de uma única linha e em blocos.
        R-> Em uma unica linha utiliza // Já para um bloco de linhas utiliza no inicio do bloco /* e termina o bloco com com */
    /* 
    b) Toda declaração deve terminar com um.
        R-> Toda declaração deve terminar com um ponto e virgula (;).

    c) O objeto que exibe caixas de diálogo, de alerta e prompt.
        R->O objeto que exibe caixas de diálogo é "window".

    d) Quais as formas possíveis de declarar variáveis?
        R-> Pode declarar usando var, let ou const.*/

/*2. Informar se cada um dos seguintes é verdadeira ou falsa. Se falsa, explique por quê.

    a) JavaScript considera a variável let e const como idênticas em  atribuição?
        R->FALSO. A variavel let pode ser reatribuida mas a variavel const não pode ser reatribuida.

    b) O identificador 123copinho é um nome de Variável válido
        R-> FALSO. Um identificador válido deve começar com[a-z, A-Z, _, $], ou seja,não é permitido começar com números.

    c) O operador módulo (%) pode ser usado somente com operandos numéricos.
        R->VERDADEIRO.

    d) Os operadores aritméticos *, /, %, + e - todos têm o mesmo nível de precedência. 
        R-> FALSO. Os operadores *,/,% tem maior nivel de prioridade na hora dos calculos que os operadores + e -. 
    */

/*3 Escreva instruções JavaScript para realizar cada uma das seguintes tarefas:

    a) Apresente uma caixa de diálogo solicitando que o usuário digite um número inteiro. Mostre o valor padrão 0 no campo.
        R-> 
        prompt ("Digite um numero inteiro", "0");
        
    b) Se a variável o numero não é igual a 7, exibir "A variável numero não é igual 7 " em um diálogo de mensagem.
        R-> 
        let numero = prompt ("Digite um numero inteiro", "7");
        if(numero!="7")
            {
                alert("A variável numero não é igual 7")
            }


    c) Saída de texto HTML que irá exibir a mensagem "Este é um programa JavaScript "em uma linha no documento HTML.
        R->
            document.write("Este é um programa JavaScript ");

    d) Saída de texto HTML que irá exibir a mensagem "Este é um programa JavaScript" em duas linhas no documento XHTML. Use apenas uma declaração
        R->
        let texto = "Este é um programa JavaScript";
        document.writeln(texto + "<br>" + texto);
    */

/*4. Escreva um script (método externo) que peça ao usuário para digitar dois números, armazene os números digitados pelo usuário em duas variáveis (utilize a função parseInt() para a conversão da string em numero). Exiba no corpo do HTML utilizando apenas uma declaração os seguintes dados: soma, produto, subtração e quociente dos dois números

    let num1=prompt("Digite o primeiro numero");
    let num2=prompt("Digite o segundo numero");

    num1 = parseInt(num1);
    num2 = parseInt(num2);

    document.writeln("Soma: " + (num1+num2) + "<br>" +
                    "Produto: " + (num1*num2) + "<br>" +
                     "Subtração: " + (num1-num2) + "<br>" +
                     "Quociente: " + (num1 / num2));
*/

/*5- Escreva um script que peça ao usuário para digitar dois números inteiros, armazene os números digitados pelo usuário em duas variáveis. Teste ( utilize if () ) se o primeiro número é maior que o segundo e viceversa. Mostre numa caixa de alerta o número maior seguido da palavra “é maior”. Se os número forem iguais exiba no corpo do HTML em H1 “Estes números são iguais”*/

    let numero1=prompt("Digite o primeiro numero inteiro");
    numero1 = parseInt(numero1);
    let numero2=prompt("Digite o segundo numero inteiro");
    numero2 = parseInt(numero2);

    if (numero1 > numero2) {
        alert(numero1 + " é maior");
    } else if (numero2 > numero1) {
        alert(numero2 + " é maior");
    } else {
        document.write("<h1>Estes números são iguais</h1>");
    }


