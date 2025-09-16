using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _201
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num;

            Console.Write("Informe um numero:  ");
            num = int.Parse(Console.ReadLine());

            if (num > 0)
            {
                Console.Write("É positivo! ");
            }
            else
            {
                if (num < 0)
                {
                    Console.Write("É negativo!");
                }
                else
                {
                    Console.Write("É zero!");
                }
            }
            Console.ReadKey();
        }
    }
}
