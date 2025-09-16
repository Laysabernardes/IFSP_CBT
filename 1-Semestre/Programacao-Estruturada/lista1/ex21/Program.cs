using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex21
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double fabrica, final;

            Console.Write("Informe o custo de fabrica: ");
            fabrica=double.Parse(Console.ReadLine());

            final = fabrica +(fabrica * 0.28) + (fabrica * 0.45);

            Console.WriteLine("O valo final será de:  {0}", final);
            Console.ReadKey();

        }
    }
}
