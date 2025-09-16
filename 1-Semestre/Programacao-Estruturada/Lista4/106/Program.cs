using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _106
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valorx, valorA, valorB, resultado;

            Console.Write("Entre com um valor:  ");
            valorx = int.Parse(Console.ReadLine());

            while (valorx <= 0)
            {
                Console.Write("Incorreto, insira um valor positivo:  ");
                valorx = int.Parse(Console.ReadLine());
            }

            Console.Write("Informe o intervalo minimo para o calculo da tabuada:  ");
            valorA = int.Parse(Console.ReadLine());
            Console.Write("Informe o intervalo maximo para o calculo da tabuada:  ");
            valorB = int.Parse(Console.ReadLine());

            while (valorA > valorB)
            {
                Console.Write("Inválido, digite um novo valor para o intervalo máximo: ");
                valorB = int.Parse(Console.ReadLine());
            }

            while (valorB >= valorA)
            {
                resultado = valorx * valorB;
                Console.WriteLine("{0} * {1} = {2}", valorx, valorB, resultado);
                valorB--;
            }

            Console.ReadKey();


        }
    }
}
