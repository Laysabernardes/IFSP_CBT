//ALUNA:LAYSA BERNARDES 
// digitar um número e uma string
let num = parseFloat(prompt("Digite um número: "));
let texto = prompt("Digite uma string: ");

// Exibir o número de várias maneiras
document.writeln(`i. Com 2 casas decimais: ${num.toFixed(2)}<br>`);
document.writeln(`ii. Arredondado: ${Math.round(num)}<br>`);
document.writeln(`iii. Raiz quadrada: ${Math.sqrt(num)}<br>`);
document.writeln(`iv. Randômico: ${Math.floor(Math.random() * num)}<br>`);

// Exibir a string de várias maneiras
document.writeln(`i. Quantidade de caracteres: ${texto.length}<br>`);
document.writeln(`ii. Maiúsculas: ${texto.toUpperCase()}<br>`);
document.writeln(`iii. Contém "java": ${texto.includes("java")}<br>`);
document.writeln(`iv. Substituição: ${texto.slice(0, 1)}mamão${texto.slice(2)}<br>`);


let quantidade = 9;
let precoUnitario = 8.99;
let produto = 'Leite';
let resultado = `${quantidade} itens de ${produto} custam R$ ${(quantidade * precoUnitario).toFixed(2)}.`;
console.log(resultado);
