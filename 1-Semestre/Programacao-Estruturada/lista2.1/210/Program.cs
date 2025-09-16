using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _210
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int codigo;

            Console.Write("Informe o codigo da mercadoria:  ");
            codigo = int.Parse(Console.ReadLine());

            if (codigo == 1 )
            {
                Console.WriteLine("sabão");
            }
            else
            {
                if( codigo == 2 )
                {
                    Console.WriteLine("Vassoura");
                }
                else 
                {
                    if (codigo == 3)
                    {
                        Console.WriteLine(" Detergente");
                    }
                    else
                    {

                    }
                }
            }
            Console.ReadKey();
        }
    }
}
