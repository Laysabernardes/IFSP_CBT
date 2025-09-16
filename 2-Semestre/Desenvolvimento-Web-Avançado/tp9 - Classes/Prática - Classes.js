//Verificação de Email - Questão 1 
function verificarEmail() {
    // Obtém o valor do campo de entrada de e-mail
    const email = document.getElementById('email').value;

    // Expressão regular para verificar o formato do e-mail
    const regex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

    if (regex.test(email)) {
        document.getElementById('resultadoEmail').textContent = 'E-mail válido!';
    } else {
        document.getElementById('resultadoEmail').textContent = 'E-mail não é válido.';
    }
}

//Verificação de senha - Questão 2 
function verificarSenha() {
    // Obtém o valor do campo de entrada de senha
    const senha = document.getElementById('senha').value;

    // Expressão regular para verificar a senha
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.$!%*?&])[A-Za-z\d@.$!%*?&]{8,}$/;

    if (regex.test(senha)) {
        document.getElementById('resultadoSenha').textContent = 'Senha válida!';
    } else {
        document.getElementById('resultadoSenha').textContent = 'Senha inválida.';
    }
}

/*

function Animal(pernas) {
    this.pernas = pernas;
}

Animal.prototype.anda = function() {
    console.log('Anda sobre ' + this.pernas + ' pernas');
}

function Passaro(pernas) {
    Animal.call(this, pernas);
}

Passaro.prototype = Object.create(Animal.prototype);
Passaro.prototype.constructor = Animal;


Passaro.prototype.voa = function() {
    console.log('Voa');
}

var pombo = new Passaro(2);
pombo.anda(); // Anda sobre 2 pernas
pombo.voa(); // voa

*/

//Resposta Questão 3 

class Animal {
    constructor(pernas) {
      this.pernas = pernas;
    }
  
    anda() {
      console.log('Anda sobre ' + this.pernas + ' pernas');
    }
  }
  
  class Passaro extends Animal {
    constructor(pernas) {
      super(pernas);
    }
  
    voa() {
      console.log('Voa');
    }
  }
  
  const pombo = new Passaro(2);
  pombo.anda(); // Anda sobre 2 pernas
  pombo.voa(); // Voa
  



