using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _401
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero;

            Console.Write("Entre com um numero: ");
            numero=int.Parse(Console.ReadLine());

            if (numero < 0)
            {
                numero = numero * -1;
                Console.Write("O numero {0} positivo!", numero);
            }
            else
            {
                Console.Write("Numero {0} positivo! ", numero);
            }
            Console.ReadKey();
        }
    }
}
