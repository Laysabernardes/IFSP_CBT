using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ano, mes, dia, s;

            Console.WriteLine("Abaixo quando solicitado, informe sua idade em ano, meses e dias:");
            Console.Write("Informe os anos:   ");
            ano = int.Parse(Console.ReadLine());
            Console.Write("Informe os meses:   ");
            mes = int.Parse(Console.ReadLine());
            Console.Write("Inform os dias:   ");
            dia = int.Parse(Console.ReadLine());

            s = ((ano * 365) + (mes * 30) + dia);
            Console.WriteLine("Sua idade expressa em dias é: {0}  ", s);
            Console.ReadKey();
        }
    }
}
