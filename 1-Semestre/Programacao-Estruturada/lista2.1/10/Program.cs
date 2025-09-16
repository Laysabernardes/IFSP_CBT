using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int atual, nascimento, s;

            Console.Write("Informe o ano atual:  ");
            atual = int.Parse(Console.ReadLine());
            Console.Write("Informe o ano de seu nascimento:  ");
            nascimento = int.Parse(Console.ReadLine());

            s = atual - nascimento;

            if (s > 16)
            {
                Console.Write("Podera votar!");
            }
            else
            {
                Console.Write("Não podera votar! ");
            }
            Console.ReadKey();
        }
    }
}
