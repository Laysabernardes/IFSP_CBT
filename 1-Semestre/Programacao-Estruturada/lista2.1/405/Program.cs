using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _405
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valor;

            Console.Write("Entre com um valor:  ");
            valor = int.Parse(Console.ReadLine());

            if (valor >= 1 && valor <= 9)
                Console.Write("O valor está na faixa permitida");
            else
                Console.Write("O valor não está na faixa permitida");

            Console.ReadKey();

        }
    }
}
