using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _112
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float ct, num, soma, media;
            ct = 1;
            soma = 0;

            while (ct <= 10)
            {
                Console.Write("Insira um numero:  ");
                num = float.Parse(Console.ReadLine());
                soma = soma + num;
                ct++;
            }
            media = soma / ct;
            Console.Write("A media é {0} ", media);
            Console.ReadKey();
        }
    }
}
