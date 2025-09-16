using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _303
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float nota1, nota2, nota3, media;

            Console.Write("Entre com a primeira nota:  ");
            nota1 = float.Parse(Console.ReadLine());

            Console.Write("Entre com a segunda nota:  ");
            nota2 = float.Parse(Console.ReadLine());

            Console.Write("Entre com a terceira nota:  ");
            nota3 = float.Parse(Console.ReadLine());

            media = (nota1 + nota2 + nota3) / 3;

            if(media<=10 && media >= 9)
            {
                Console.Write("A");
            }
            else
            {
                if (media < 9 && media >= 7)
                {
                    Console.Write("B");
                }
                
                else
                {
                    if(media <7 && media >= 4)
                    {
                        Console.Write("C");
                    }
                    else
                    {
                        if(media<4 && media >= 0)
                        {
                            Console.Write("D");
                        }
                    }
                }
            }
            Console.ReadKey();
        }
    }
}
