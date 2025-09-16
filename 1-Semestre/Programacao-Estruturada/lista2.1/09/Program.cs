using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double maca, s;

            Console.Write("Informe o numero de maças compradas:  ");
            maca = double.Parse(Console.ReadLine());

            if (maca < 12)
            {
                s = maca * 1.30;
                Console.Write("O custo será de R$ {0} ", s);
            }
            else
            {
                Console.Write("O custo sera de R$ {0} ", maca);
            }
            Console.ReadKey();
        }
    }
}
