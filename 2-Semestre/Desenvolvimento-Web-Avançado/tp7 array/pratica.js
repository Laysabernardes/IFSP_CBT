
let colaboradores = [
    { nome: 'Edu', salario: 90000, data: "28 de Julho de 2008" },
    { nome: 'Savoia', salario: 75000, data: "15 de Agosto de 2021" },
    { nome: 'Catia', salario: 80000, data: "12 de Dezembro de 2011" }
];

colaboradores.sort(function (a, b) {return b.salario - a.salario;});
console.log("a) Tabela ordenada por salário:");
console.table(colaboradores);
  
const novoColaborador = { nome: 'Eduarda', salario: 62000, data: "10 de Novembro de 1999" };
colaboradores.push(novoColaborador);
console.log("b) Tabela após adição de novo colaborador:");
console.table(colaboradores);

colaboradores.shift();
console.log("c) Tabela após remoção do primeiro colaborador:");
console.table(colaboradores);

const colaboradoresMenor79000 = colaboradores.filter(function (colaboradores) { return colaboradores.salario<=79000;});

console.log("d) Novo array com salários menores ou iguais a 79000:");
console.table(colaboradoresMenor79000);





