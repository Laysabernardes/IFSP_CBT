//----------------------Exercicio 1
/*
let maior = 0;

for (let cont = 1; cont <= 10; cont++) {
  let num = parseInt(prompt(`Digite o número ${cont}:`));

  if (num > maior) {
    maior = num;
  }
}

alert(`O maior número é: ${maior}`);

*/

//----------------------EXERCICIO 2

/*
let n = parseInt(prompt("Digite um numero"));

document.write(`
    <table border="1">
    <tr>
    <th>N</th>
    <th>10*N</th>
    <th>100*N</th>
    <th>1000*N</th>
    </tr>
`)

for (let x = 1; x <= n; x++) {
    document.write(`
    <tr>
        <td>${x}</td>
        <td>${10 * x}</td>
        <td>${10 * 10 * x}</td>
        <td>${10 * 10 * 10 * x}</td>
      </tr>
    `);
  }
  
  document.write(`
    </table>
  `);

  */

//----------------------EXERCICIO 3 

/*
  document.write("Multiplos do numero 2:");
  let limite = 20000000000000;
  let multiplo = 2;

  while (multiplo <= limite){
    document.writeln(`<li>${multiplo}</li>`);
    multiplo *= 2;
  }

*/
//----------------------EXERCICIO 4 

/*
    const tamanho=6;
    let diamante=["*"];
    let espaco="";
   

    document.write(`<pre style="text-align:center">`);

    for(let cont=1; cont<tamanho;cont++)
    {
        espaco+="";

        let forma=espaco+diamante;
        document.writeln(`${forma}`);
        diamante+=["**"];  
    }
    
    for (let ct=7; ct>0; ct--)
    {
        let deletando=[...diamante].splice(1,ct);
        forma=espaco+(deletando.join(""));
        document.writeln(forma);
        ct -=1;
    }
    document.write(`</pre>`);
    
 */

//----------------------EXERCICIO 5 



let diamante=" ";
 
for(let ct =1; ct<=5; ct++)
{
    let num = parseInt(prompt('Digite um numero entre 1 e 30'));
    for(let cont=1;num>=0 ; cont++)
    {
        diamante+="*";
        num--;
    }
    document.writeln(`${diamante} <br>`);
    diamante="";
}
