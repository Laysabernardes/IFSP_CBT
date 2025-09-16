using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _302
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int qi;

            Console.Write("Informe seu QI:  ");
            qi = int.Parse(Console.ReadLine());

            if(qi>=0 && qi <30)
            {
                Console.Write("Muito Insuficiente. ");
            }
            else
            {
                if(qi>=30 && qi < 50)
                {
                    Console.Write("Insuficiente. ");
                }
                else
                {
                    if(qi >= 50 && qi < 70)
                    {
                        Console.Write("Regular");
                    }
                    else
                    {
                        if(qi >= 70 && qi < 100)
                        {
                            Console.Write("Normal");
                        }
                        else
                        {
                            if(qi >= 100 && qi <= 150)
                            {
                                Console.Write("Gênio");
                            }
                            else
                            {
                                Console.Write("QI inválido! ");
                            }
                        }
                    }
                }
            }
            Console.ReadKey();
        }
    }
}
