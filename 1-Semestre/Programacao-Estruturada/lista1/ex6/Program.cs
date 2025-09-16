using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int f, c;

            Console.Write("Informe a termperatura em graus fahrenheit:   ");
            f = int.Parse(Console.ReadLine());

            c = ((f - 32) * (5 / 9));
            Console.WriteLine("A temperatura em graus Celsius é {0}", c);
            Console.ReadKey();
        }
    }
}
