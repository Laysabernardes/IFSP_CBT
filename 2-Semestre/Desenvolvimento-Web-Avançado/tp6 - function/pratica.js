//exercicio 1
function sortValues(...values) {
    values.sort((a, b) => a - b);
    return values;
  }
console.log(sortValues(9, 2, 5, 7, 1, 8));

//exercicio 2
function calcularSoma(a = 10, b = 20) {
    const soma = a + b;
    return `A soma é: ${soma}`;
  }
  
console.log(calcularSoma());          // A soma é: 30
console.log(calcularSoma(1));        // A soma é: 21
console.log(calcularSoma(5, 6));      // A soma é: 11

//exercicio 3
function Person(name, age, city) {
  this.name = name;
  this.age = age;
  this.city = city;
}

function Bike(company, model, year, owner) {
  this.company = company;
  this.model = model;
  this.year = year;
  this.owner = owner;
}


const owner = new Person("Eduardo", 30, "São Paulo");
const bike = new Bike("BMW", "R1200", 2021, owner);

document.write(`${bike.company} <br> ${bike.model}<br>${bike.year}<br> ${bike.owner.name}`);


