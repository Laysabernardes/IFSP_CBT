using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int @base, altura, area;

            Console.Write("Informe o valor da base do trinangulo:   ");
            @base = int.Parse(Console.ReadLine());
            Console.Write("Informe a altura do triangulo:   ");
            altura = int.Parse(Console.ReadLine());

            area = (@base * altura) / 2;

            Console.WriteLine("A area do triangulo é de:   {0}", area);
            Console.ReadKey();

        }
    }
}
