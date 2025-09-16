using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int receita, despesa;

            Console.Write("Informe a receita da empresa:  ");
            receita = int.Parse(Console.ReadLine());
            Console.Write("Informe a despesa da empresa:  ");
            despesa = int.Parse(Console.ReadLine());

            if (receita > despesa)
            {
                Console.Write("Sua empresa esta em Lucro!");
            }
            else
            {
                Console.Write("Sua empres está em prejuizo!");
            }
            Console.WriteLine("\n Aperte <enter> para sair do programa.");
            Console.ReadKey();
        }
    }
}
