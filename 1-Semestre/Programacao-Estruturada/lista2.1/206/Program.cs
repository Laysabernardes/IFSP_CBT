using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _206
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int men1, men2, girl1, girl2, s,p;

            Console.Write("Informe a idade do 1º homem:  ");
            men1 = int.Parse(Console.ReadLine());
            Console.Write("Informe a idade do 2º homem:  ");
            men2 = int.Parse(Console.ReadLine());
            Console.Write("Informe a idade da 1º mulher:  ");
            girl1 = int.Parse(Console.ReadLine());
            Console.Write("Informe a idade da 2º mulher:  ");
            girl2 = int.Parse(Console.ReadLine());

            if(men1>men2)
            {
                if (girl1 > girl2)
                {
                    s = men1 + girl2;
                    p = men2 * girl1;
                    Console.Write("caso 1");
                }
                else
                {
                    s = men1 + girl1;
                    p = men2 * girl2;
                    Console.Write("Caso 2");
                }
            }
            else
            {
                if (girl1 > girl2)
                {
                    s = men2 + girl2;
                    p = men1 * girl1;
                    Console.Write("Caso 3");
                }
                else
                {
                    s = men2 + girl1;
                    p = men1 * girl2;
                    Console.Write("Caso 4");
                }
            }
            Console.WriteLine("\n A soma de idades é {0}, já o produto é {1}", s, p);
            Console.ReadKey();
        }
    }
}
