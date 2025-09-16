using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _101
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero;
            numero = 0;           

            while (numero <= 0)
            {
                Console.Write("Entre com um numero positivo:  ");
                numero = int.Parse(Console.ReadLine());
            }
            Console.ReadKey();
        }
    }
}
