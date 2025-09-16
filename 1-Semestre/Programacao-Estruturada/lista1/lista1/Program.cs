using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lista1
{
    internal class Program
    {
        static void Main(string[] args)
        {
        int num1, num2, s;

            Console.Write("Informe o primeiro numero:  ");
            num1 = int.Parse(Console.ReadLine());

            Console.Write("Informe o segundo numero:   ");
            num2 = int.Parse(Console.ReadLine());

            s = num1 * num2;

            Console.Write("O produto estre o numero um  e o numero dois é: {0}", s);
            Console.ReadKey();
        }
    }
}
