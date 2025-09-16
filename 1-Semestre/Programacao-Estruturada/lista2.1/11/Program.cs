using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double hora, valor, s;

            Console.Write("Informe o numero de horas trabalhadas no mês: ");
            hora = double.Parse(Console.ReadLine());
            Console.Write("Informe o valor da hora trabalhada:  ");
            valor = double.Parse(Console.ReadLine());

            if (hora < 160)
            {
                s = hora * valor;
                Console.Write("O total pago E  R$ {0} ", s);
            }
            else
            {
                s = hora * (valor * 1.5);
                Console.Write("O total pago E  R$ {0} ", s);
            }
            Console.ReadKey();
        }
    }
}
