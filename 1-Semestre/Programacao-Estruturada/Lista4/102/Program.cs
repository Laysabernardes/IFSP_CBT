using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _102
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valor1, valor2;

            Console.Write("Entre com o 1º valor:  ");
            valor1 = int.Parse(Console.ReadLine());
            Console.Write("Entre com o 2º valor:  ");
            valor2 = int.Parse(Console.ReadLine());

            while (valor2<=valor1)
            {
                Console.Write("O 2º valor deve ser maior que o 1º!\nDigite o segundo valor novamente:  ");
                valor2 = int.Parse(Console.ReadLine());
               
            }
            Console.Write("Os valores digitados foram 1º valor: {0}, 2º valor: {1} ", valor1, valor2);
            Console.ReadKey();

        }
    }
}
