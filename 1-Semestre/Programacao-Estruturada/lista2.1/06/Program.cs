using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int num;

            Console.Write("Informe um numero:  ");
            num = int.Parse(Console.ReadLine());

            if (num > 100)
            {
                Console.Write("E um numero maior do que 100!  ");
            }
            else
            {
                Console.Write("É um numero menor do que 100!  ");
            }
            Console.WriteLine("\n Aperte <enter> para sair do programa");
            Console.ReadKey();
        }
    }
}
