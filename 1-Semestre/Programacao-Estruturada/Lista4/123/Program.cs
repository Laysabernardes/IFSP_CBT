using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _123
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero;
            int ct = 3;

            while (ct > 0)
            {
                Console.Write("Entre com um numero:  ");
                numero = int.Parse(Console.ReadLine());

                if (numero == 7)
                {
                    Console.Write("ACERTOU!");
                    break;
                }
                
,                else
                {
                    if (numero > 7)
                        Console.WriteLine("O numero digita é maior do que o verdadeiro.");
                    else
                        Console.WriteLine("O numero digita é menor do que o verdadeiro.");
                }
                ct--;
                if (numero != 7 && ct==0)
                    Console.WriteLine(" VOCE PERDEU!");
            }
            Console.ReadLine();
        }
    }
}
