using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int  vitorias, derrotas;

            Console.Write("Informe o numero de vitorias:  ");
            vitorias = int.Parse(Console.ReadLine());
            Console.Write("Informe o numero de derrotas:  ");
            derrotas = int.Parse(Console.ReadLine());

            if (vitorias > derrotas)
            {
                Console.Write("Bom!");
            }
            else
            {
                Console.Write("Ruim!");
            }
            Console.ReadKey();
        }
    }
}
