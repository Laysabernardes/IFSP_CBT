using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _111
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num, ct, soma;
            ct = 1;
            soma = 0;


            while (ct <= 10)
            {
                Console.Write("Insira um valor:  ");
                num = int.Parse(Console.ReadLine());
                soma = soma + num;
                ct++;
            }
            Console.Write("A soma dos valores é {0} ", soma);
            Console.ReadKey();
        }
    }
}
