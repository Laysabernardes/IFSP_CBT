using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int codigo;

            Console.Write("Digite 1 para sinal vermelho e 2 para sinal verde!");
            codigo = int.Parse(Console.ReadLine());

            if (codigo == 1)
            {
                Console.Write("ESPERE! ");
            }
            else
            {
                Console.Write("SIGA");
            }
            Console.WriteLine("\n Aperte <enter> para sair do programa.");
            Console.ReadKey();
        }
    }
}
