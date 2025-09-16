using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _104
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int tabuada, resultado;
            tabuada = 1;

            while (tabuada <= 10)
            {
                resultado = 5 * tabuada;
                Console.Write("5*{0} = {1}\n", tabuada, resultado);
                tabuada++;
            }
            Console.ReadKey();
        }
    }
}
