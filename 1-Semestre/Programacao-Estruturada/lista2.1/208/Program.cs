using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _208
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double shora, qhora, qfilho, sbruto, sfamilia;

            Console.Write("Informe o valor do salario hora:  ");
            shora = double.Parse(Console.ReadLine());
            Console.Write("Informe a quantidade de horas trabalhada:  ");
            qhora = double.Parse(Console.ReadLine());
            Console.Write("Informe a quantidade de filhos menores de 14 anos:  ");
            qfilho=double.Parse(Console.ReadLine());

            sbruto = shora * qhora;

            if (sbruto < 500)
            {
                sfamilia = qfilho * 10.50;
            }
            else
            {
                if (sbruto >= 500 && sbruto < 1000)
                {
                    sfamilia = qfilho * 6.50;
                }
                else
                {
                    sfamilia = qfilho * 1.50;
                }
            }
            Console.Write("Seu salario bruto é de R${0} e o salario familia é R${1}", sbruto, sfamilia);
            Console.ReadKey();


        }
    }
}
