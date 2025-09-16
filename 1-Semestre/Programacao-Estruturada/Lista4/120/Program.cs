using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _120
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero, ct, maior, soma, media, teste;
            ct = 0;
            soma = 0;
            maior = 0;

            while (ct < 10)
            {
               
                Console.Write("Entre com um numero positvo:  ");
                numero = int.Parse(Console.ReadLine());
                

                while (numero < 0)
                {
                    Console.Write("Invalido, digite novamente um valor positivo");
                    numero = int.Parse(Console.ReadLine());
                }

                if (maior <= numero)
                {
                    maior = numero;
                }
                else
                {
                    maior = maior;
                }
                
                soma += numero;
                ct++;
            }
            media = soma / ct;
            Console.Write("O maior valor é {0}\n A soma dos valores é: {1}\n A media dos valores é: {2}", maior, soma, media);
            Console.ReadKey();
        }
    }
}
