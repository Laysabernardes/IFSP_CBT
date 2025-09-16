using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2;

            Console.Write("Informe o primeiro numero: ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o segundo numero:  ");
            num2 = int.Parse(Console.ReadLine());

            if (num1 > num2)
            {
                Console.Write("O primeiro numero é maior que o segundo!");
            }
            else
            {
                Console.Write("O segundo numero é maior que o primeiro! ");
            }

            Console.ReadKey();
        }
    }
}
