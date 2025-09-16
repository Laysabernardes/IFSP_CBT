using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _402
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int nota1, nota2, nota3, nota4, media,exame, nova_media;

            Console.Write("Entre com a 1º nota:  ");
            nota1 = int.Parse(Console.ReadLine());
            Console.Write("Entre com a 2º nota:  ");
            nota2 = int.Parse(Console.ReadLine());
            Console.Write("Entre com a 3º nota:  ");
            nota3 = int.Parse(Console.ReadLine());
            Console.Write("Entre com a 4º nota:  ");
            nota4 = int.Parse(Console.ReadLine());

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 7)
            {
                Console.Write("Aluno aprovado!\n Sua media é de {0} pontos.", media);
            }
            else
            {
                if (media < 7)
                {
                    Console.Write("Entre com a nota do exame:  ");
                    exame = int.Parse(Console.ReadLine());
                    nova_media = (media + exame)/2;

                    if (nova_media >= 5)
                    {
                        Console.Write("Aluno Aprovado!\n Sua media é de: {0} pontos.", nova_media);
                    }
                    else
                    {
                        Console.Write("Aluno Reprovado!\n Sua media é de: {0} pontos.", nova_media);
                    }
                }
            }
            Console.ReadKey();
        }
    }
}
