using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double nota1, nota2, nota3, nota4, media;

            Console.Write("Inforeme a sua primeira nota:   ");
            nota1 = double.Parse(Console.ReadLine());
            Console.Write("Informe a sua segunda nota:   ");
            nota2 = double.Parse(Console.ReadLine());
            Console.Write("Informe a sua terceira nota:   ");
            nota3 = double.Parse(Console.ReadLine());
            Console.Write("Informe a sua quarta nota:   ");
            nota4 = double.Parse(Console.ReadLine());

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            Console.WriteLine("Sua media aritmetica é:   {0}", media);
            Console.ReadKey();
        }
    }
}
