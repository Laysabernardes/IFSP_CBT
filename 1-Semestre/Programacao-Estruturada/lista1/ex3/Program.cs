using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, a;
            Console.Write("Informe um numero:   ");
            num1 = int.Parse(Console.ReadLine());

            a = num1 - 1;
            Console.WriteLine("O antecessor ao numero informado é:   {0}", a);
            Console.ReadKey();

        }
    }
}
