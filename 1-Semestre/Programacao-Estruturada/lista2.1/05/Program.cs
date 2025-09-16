using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float nota1, nota2, nota3, nota4, media;

            Console.Write("Informe a nota 1:  ");
            nota1 = float.Parse(Console.ReadLine());
            Console.Write("Informe a nota 2:  ");
            nota2 = float.Parse(Console.ReadLine());
            Console.Write("Informe a nota 3:  ");
            nota3 = float.Parse(Console.ReadLine());
            Console.Write("Informe a nota 4:  ");
            nota4 = float.Parse(Console.ReadLine());

            media = ((nota1 + nota2 + nota3 + nota4) / 4);

            if (media > 6)
            {
                Console.Write("Aluno Aprovado!");
            }
            else
            {
                Console.Write("Aluno Reprovado!");
            }
            Console.WriteLine("\n Aperte <enter> para sair do programa.");
            Console.ReadKey();
        }
    }
}
