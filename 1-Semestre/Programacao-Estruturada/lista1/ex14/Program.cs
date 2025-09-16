using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex14
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int salariof, valorv, comissao,total,ganho;

            Console.Write("Informeo seu salario fixo:   ");
            salariof = int.Parse(Console.ReadLine());
            Console.Write("Informe o valor total de vendas efetuadas na loja:   ");
            valorv = int.Parse(Console.ReadLine());
            Console.Write("Informe seu percentual de comissão:   ");
            comissao = int.Parse(Console.ReadLine());

            ganho = valorv * (comissao/100);
            total = ganho + salariof;

            Console.WriteLine("O valor da camissão será de   {0} , e o valor do salario final sera de  {1}", ganho, total);
            Console.ReadKey();

        }
    }
}
