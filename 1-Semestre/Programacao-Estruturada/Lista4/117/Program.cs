using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _117
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero, ct, soma, n, sequencia;
            ct = 0;
            soma = 0;
            n = 1;

            Console.Write("Insira numero de valores que devera ser emitido:  ");
            numero = int.Parse(Console.ReadLine());

            while (numero <= 0 || numero>100)
            {
                Console.Write("Invalido, entre com um numero positivo menor que 100.\n ");
                numero=int.Parse(Console.ReadLine());
            }
            while (ct < numero)
            {
                sequencia = (n * n) + 1;
                soma += sequencia;
                n++;
                ct++;
            }
            Console.Write("A soma dos {0} numeros é: {1} ", numero, soma);
            Console.ReadKey();
        }
    }
}
