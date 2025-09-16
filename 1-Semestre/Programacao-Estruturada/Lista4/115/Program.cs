using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _115
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ct = 1;

            while (ct <= 100)
            {
                while (ct % 3 == 0 || ct % 5 == 0)
                {
                    Console.WriteLine("{0} é multiplo de 3 ou 5 ", ct);
                    break;
                }
                ct++;
            }
            Console.ReadKey();
        }
    }
}
