using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _107
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int tabuada, maximo, resultado;
            string continuar;

            maximo = 1;

            while (maximo <= 20)
            {
                tabuada = 1;
                while (tabuada <= 10)
                {
                    resultado = tabuada * maximo;
                    Console.WriteLine("{0} * {1} = {2} ", tabuada, maximo, resultado);
                    tabuada++;
                }
                Console.Write("Aperte no teclado para continuar com as tabuadas!");
                continuar = Console.ReadLine();
                maximo++;
            }
            Console.ReadKey();



        }
    }
}
