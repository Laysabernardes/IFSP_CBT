using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _205
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2;

            Console.Write("Informe o 1º numero:  ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o 2º numero:  ");
            num2 = int.Parse(Console.ReadLine());

            if (num1 == num2)
            {
                Console.Write("Numeros Iguais!");
            }
            else
            {
                if (num1 > num2)
                {
                    Console.Write("Primeiro é maior!");
                }
                else
                {
                    Console.Write("Segundo maior");
                }
            }
            Console.ReadKey();
        }
    }
}
