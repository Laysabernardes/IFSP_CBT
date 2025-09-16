using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _118
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double ct, numero, sequencia, n1, n2, soma;
            ct = 0;
            soma = 0;
            n1 = 1;


            Console.Write("Informe o numero de valroes que deseja ver da sequencia:  ");
            numero = double.Parse(Console.ReadLine());

            while(numero<0 || numero > 50)
            {
                Console.Write("Invalido, entre com um numero positivo menor que 50");
                numero = double.Parse(Console.ReadLine());
            }
            
            while (ct < numero)
            {
               
                n2 = n1 + 1;
                sequencia = n1 / n2;

                soma += sequencia;
                n1 = n2;
                ct++;

            }
            Console.Write("A soma dos {0} numeros é: {1} ", numero, soma);
            Console.ReadKey();
        }
    }
}
