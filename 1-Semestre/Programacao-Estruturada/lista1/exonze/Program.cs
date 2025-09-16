using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exonze
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, q;

            Console.Write("Informe um numero:   ");
            num1 = int.Parse(Console.ReadLine());

            q = num1 * num1;

            Console.WriteLine("O quadrado do numero {0} é:   {1}  ", num1, q);
            Console.ReadKey();
        }
    }
}
