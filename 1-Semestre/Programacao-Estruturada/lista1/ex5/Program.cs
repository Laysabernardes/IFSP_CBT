using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i, d, h, m, s;
            Console.Write("Informe sua idade:   ");
            i = int.Parse(Console.ReadLine());

            d = i * 365;
            h = d * 24;
            m = h * 60;
            s = m * 60;

            Console.WriteLine("Você apresenta {0} anos, {1} dias, {2} horas, {3} minutos e {4} segundos.", i, d, h, m, s);
            Console.ReadKey();
        }
    }
}
