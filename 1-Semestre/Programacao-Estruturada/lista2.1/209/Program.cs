using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _209
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double salarioBruto, taxaINSS, valorINSS, salarioLiquido;

            Console.Write("Informe seu salario bruto:  ");
            salarioBruto=double.Parse(Console.ReadLine());

            if (salarioBruto < 500)
            {
                taxaINSS = 8;
            }
            else
            {
                if(salarioBruto >= 500 && salarioBruto<1000) 
                {
                    taxaINSS = 10;
                }
                else
                {
                    taxaINSS = 12;
                }
            }
            valorINSS = (salarioBruto * taxaINSS) / 100;
            salarioLiquido = salarioBruto - valorINSS;

            Console.WriteLine("\n Salario Bruto: {0} \n Taxa do INSS {1}" +
                              " \n Valor de INSS {2} \n Salario Liquido {3}", 
                                salarioBruto, taxaINSS, valorINSS, salarioLiquido);
            Console.ReadKey();
        }
    }
}
