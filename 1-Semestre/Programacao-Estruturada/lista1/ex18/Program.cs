using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex18
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float p1, p2, p3, p4, p5, pagamento, troco, total;

            Console.Write("Informe o valor do primeiro produto:   ");
            p1 = float.Parse(Console.ReadLine());
            Console.Write("Informe o valor do segundo produto:   ");
            p2 = float.Parse(Console.ReadLine());
            Console.Write("Infome o valor do terceiro produto:   ");
            p3 = float.Parse(Console.ReadLine());
            Console.Write("Informe o valor do quarto produto:   ");
            p4 = float.Parse(Console.ReadLine());
            Console.Write("Informe o valor do quinto produto:   ");
            p5 = float.Parse(Console.ReadLine());

            total = p1 + p2 + p3 + p4 + p5;

            Console.Write("O valor total é de {0}, informe o valor do pagamento:   ", total);
            pagamento = float.Parse(Console.ReadLine());

            troco = pagamento - total;

            Console.WriteLine("O troco será de:   {0}", troco);
            Console.ReadKey();

        }
    }
}
