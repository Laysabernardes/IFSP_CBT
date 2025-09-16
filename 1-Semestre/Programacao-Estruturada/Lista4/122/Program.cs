using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _122
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valor, total;
            string resposta = "S";
            

            while (resposta == "S")
            {
                Console.Write("Entre com um valor para calcular o fatorial:  ");
                valor = int.Parse(Console.ReadLine());

                while (valor < 0)
                {
                    Console.Write("Incorreto, insira um valor positivo:  ");
                    valor = int.Parse(Console.ReadLine());
                    
                }

                Console.Write("{0}! = ", valor);
                total = 1;

                while (valor > 0)
                {
                   
                    Console.Write(valor);
                    if(valor > 1)
                    {
                        Console.Write(" x ");
                    }
                    total *= valor;
                    valor--;
                }

                Console.Write("= {0}",total);

                Console.WriteLine("\nDeseja coninuar? Digite S para sim e N para não:  ");
                resposta = Console.ReadLine();

                while(resposta!="S" &&  resposta != "N")
                {
                    Console.Write("Incorreto! Digite S para sim e N para não:  ");
                    resposta = Console.ReadLine();
                }
            }
            
            Console.ReadKey();
        }
    }
}
