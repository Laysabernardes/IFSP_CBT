using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _403
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;

            Console.Write("Entre com o 1º valor:  ");
            a = int.Parse(Console.ReadLine());
            Console.Write("Entre com o 2º valor:  ");
            b = int.Parse(Console.ReadLine());
            Console.Write("Entre com o 3º valor:  ");
            c = int.Parse(Console.ReadLine());

            if(a>b && a > c)
            {
                if (b > c)
                    Console.Write("A ordem crescente é: {0}, {1} , {2} ", a, b, c);
                else
                    Console.Write("A ordem crescente é: {0}, {1} , {2} ", a, c, b);
            }
            else
            {
                if(b>a && b > c)
                {
                    if (a > c)
                        Console.Write("A ordem crescente é: {0}, {1} , {2} ", b , a, c);
                    else
                        Console.Write("A ordem crescente é: {0}, {1} , {2} ", b, c, a);
                }
                else
                {
                    if (c > a && c > b)
                    {
                        if (a > b)
                            Console.Write("A ordem crescente é: {0}, {1} , {2} ", c,a,b);
                        else
                            Console.Write("A ordem crescente é: {0}, {1} , {2} ", c,b,a);
                    }

                }
            }
            Console.ReadKey();
        }
    }
}
