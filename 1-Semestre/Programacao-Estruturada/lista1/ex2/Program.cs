using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, num3, m;

            Console.Write("Informe o primeiro numero:  ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o segundo numero:   ");
            num2 = int.Parse(Console.ReadLine());
            Console.Write("Informeó terceiro numero:   ");
            num3 = int.Parse(Console.ReadLine());

            m = (num1 + num2 + num3) / 3;
            Console.WriteLine("A media entre os tres numeros informados é:   {0}", m);
            Console.ReadKey();
        }
    }
}
