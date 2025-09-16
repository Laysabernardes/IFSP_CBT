using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int atual, maximo, minimo, media;

            Console.Write("Informe a quantidade de estoque atual:  ");
            atual = int.Parse(Console.ReadLine());
            Console.Write("Informe a quantidade maxima de estoque:  ");
            maximo = int.Parse(Console.ReadLine());
            Console.Write("Informe a quantidade minima de estoque:  ");
            minimo = int.Parse(Console.ReadLine());

            media = (maximo + minimo) / 2;

            if (atual >= media)
            {
                Console.Write("Não efetuar compra!");
            }
            else
            {
                Console.Write("Efetuar compra!");
            }
            Console.ReadKey();
        }
    }
}
