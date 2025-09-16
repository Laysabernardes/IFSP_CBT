using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _105
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valor, tabuada, resultado;
            tabuada = 1;

            Console.Write("Entre com um valor:  ");
            valor = int.Parse(Console.ReadLine());

            while (valor <0)
            {
                Console.Write("Incorreto,digito um valor positivo:  ");
                valor = int.Parse(Console.ReadLine());
            }
            while (tabuada <= 10)
            {
                resultado = valor * tabuada;
                Console.WriteLine("{0} * {1} = {2}",valor, tabuada, resultado);
                tabuada++;
            }

            Console.ReadKey();
        }
    }
}
