using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _203
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float lado1, lado2, lado3;

            Console.Write("Informe o 1º lado:  ");
            lado1 = float.Parse(Console.ReadLine());
            Console.Write("Informe o 2ºlado:   ");
            lado2 = float.Parse(Console.ReadLine());
            Console.Write("Informe o 3º lado:   ");
            lado3 = float.Parse(Console.ReadLine());

            if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2))
            {
                Console.Write("Esses valores formam um triangulo!");
            }
            else
            {
                Console.Write("Esses valores não formam um triangulo!");
            }
            Console.ReadKey();
        }
    }
}
