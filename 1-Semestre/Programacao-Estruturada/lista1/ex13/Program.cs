using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int idade1, idade2, diferenca;

            Console.Write("Informe sua idade:   ");
            idade1 = int.Parse(Console.ReadLine());
            Console.Write("Informe outra idade:   ");
            idade2 = int.Parse(Console.ReadLine());

            diferenca = idade1 - idade2;
            //perguntar sobre diferenças negativas

            Console.WriteLine("A diferença entre a primeira idade e a segunda é de:   {0}", diferenca);
            Console.ReadKey();
        }
    }
}
