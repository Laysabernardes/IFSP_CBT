using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1;

            Console.Write("Informe um numero:  ");
            num1 = int.Parse(Console.ReadLine());

            if ((num1 % 2) == 0)
            {
                Console.WriteLine("O numero é par! ");
            }
            else
            {
                Console.WriteLine("O numero é impar! ");
            }
            Console.WriteLine("\n Aperte <enter> para sair do programa.");
            Console.ReadKey();
        }
    }
}
