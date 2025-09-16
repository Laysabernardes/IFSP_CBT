using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _101.doWhile
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero;

            do
            {
                Console.Write("Entre com um numero positivo:  ");
                numero=int.Parse(Console.ReadLine());

            }
            while (numero>0);
            Console.ReadKey();
        }
    }
}
