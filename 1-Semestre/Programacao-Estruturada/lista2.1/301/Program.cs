
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _301
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x, y;

            Console.Write("Entre com a coordenada x:  ");
            x = int.Parse(Console.ReadLine());
            Console.Write("Entre com a coordenada y:  ");
            y = int.Parse(Console.ReadLine());

            if(x>=0 && y >= 0)
            {
                Console.Write("Estas coordenadas pertencem ao primeiro quadrante!");
            }
            else
            {
                if(x<0 && y >= 0)
                {
                    Console.Write("Estas coordenadas pertencem ao segundo quadrante! ");
                }
                else
                {
                    if(x>=0 && y < 0)
                    {
                        Console.Write("Estas coordenadas pertencem ao quarto quadrante");
                    }
                    else
                    {
                        Console.Write("Estas coordenadas pertencem ao terceiro quadrante");

                    }

                }
            }
            Console.ReadKey();

        }
    }
}
