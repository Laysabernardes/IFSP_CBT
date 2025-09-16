using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valor, taxa, tempo, prestacao;

            Console.Write("Informe o valor da prestação atrasada:   ");
            valor = int.Parse(Console.ReadLine());
            Console.Write("Informe a quatos meses a prestação esta em atraso:   ");
            tempo = int.Parse(Console.ReadLine());
            Console.Write("Informe qual é a taxa mensal por atraso:   ");
            taxa = int.Parse(Console.ReadLine());

            prestacao = valor + valor * taxa / 100 * tempo;
            //perguntar sobre os parenteses

            Console.WriteLine("O valor da prestação em atraso é:   {0}", prestacao);
            Console.ReadKey();

        }
    }
}
