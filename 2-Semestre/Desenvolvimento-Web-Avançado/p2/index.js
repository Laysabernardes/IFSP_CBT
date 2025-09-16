//o comando qu e escreve "hello Wold!" num elemento html cujo id é "text1" é:

// document.getElementsById("text1").Text = "Hello Word!";
// document.getElementsById('text1').innerHTML = "Hello Word!";
// document.getElementById('text1').innerHTML="Hello Word!";
// document.getElementById("text1").Text = "Hello Word!";

//Analise o código Javascript exibido a seguir 
// function xpto (n) {
//     var text = " ";
//     var i = 1;
//         while(i<=n){
//             text += i + '; '; i++;
//         }
//     return text;
// }

// //num comando JS, a expressão xpto(5) retorna?

// console.log(xpto(5));

// function xpto1 (n) {
//     var text = "";
//     var i = 1;
//         while(i<=n){
//             text += i + ';'; i++;
//         }
//     return text;
// }

// // //num comando JS, a expressão xpto(5) retorna?

// console.log(xpto2(5));

// function xpto2 (n) {
//     var text = "";
//     var i = 1;
//         while(i<=n){
//             text += i + ';'; i++;
//         }
//     return text;
// }

// // //num comando JS, a expressão xpto(5) retorna?

// xpto2(5);
// //Para Inserir o valor "HB20" no final do array carros e depois removelo utiliza-se, repectivamente: 
// var carros = ["Gol", "Palio", "Fiesta", "Onix"];
// //a-
// console.log(carros);
// carros.push("HB20");
// console.log(carros);
// carros.pop();
// console.log(carros);

//Analise o código Javascript exibido a seguir 
// function xpto (n){
//     var text = "";
//     var i = 1;
//         while(i<=n){
//             text += i + ';'; i++;
//         }
//     return text;
// }

// //num comando JS, a expressão xpto(5) retorna?

// console.log(xpto(5));

//console.log(JSON.parse('["Carlos","Pedro","Francisco"]'));

//Considere a função em codigos JavaScrip.
// function car (s) {
//     let text = ""
//     for (const x of s){
//         text = x + text;
//         console.log (text);
//     } return text ; 
// }
// console.log (car ("gol" + "palio"));

// str = "Banana Laranja Morango";
// alert(str.split(" ")[1]);

function f1 (n) {
    if (n%2===0){
        return --n;
    }
    else {
        return++n;
    }
}
console.log(f1(22));