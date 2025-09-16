const person ={
    nome:'Kayo Amado',
    idade:30,
    local:'São Vicente, Brasil',
}

const { nome, idade, local } = person;
console.log(`Eu sou ${nome}, idade:${idade} e sou prefeito de ${local}.`);

//EXERCICIO 2 
   let sum = (a, b, c, ...numbers) => {
    let total = a + b + c;
    for(let number of numbers) {
        total += number;
    }
    return total;
    };
    console.log(sum(1,2,3,4,5,6,7,8,9));

//exercicio 3 
const dominios=[
    'Facebook',
    'Instagram',
    'Hotmail',
    'YouTube',
];
let resultado = [];
dominios.forEach(item => resultado.push(item.length));
console.log(resultado);