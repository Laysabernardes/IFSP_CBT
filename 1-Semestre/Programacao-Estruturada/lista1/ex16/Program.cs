using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex16
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double milhas, qm;

            Console.Write("informe um valor de milhas maritmas para ser convertido em quilometros:   ");
            milhas = double.Parse(Console.ReadLine());

            qm = milhas * 1.852;

            Console.WriteLine("{0} em Milhas maritmicas equivale a {1} em quilometros ", milhas, qm);
            Console.ReadKey();
        }
    }
}
