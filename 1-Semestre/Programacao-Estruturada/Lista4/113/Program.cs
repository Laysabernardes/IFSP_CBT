using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _113
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double num, soma1, soma2, media;
            int ct, ct2;
            ct = 1;
            ct2 = 0;
            soma1 = 0;
            soma2 = 0;

            while (ct <= 20)
            {
                Console.Write("{0}Insira um numero:  ", ct);
                num = double.Parse(Console.ReadLine());
                
                if (num >0)
                {
                    soma1 += num;
                }
                
                else if (num<0)
                {
                    soma2 += num;
                    ct2++;
                }
                ct++;
                
            }
            media = soma2 / ct2;
            Console.Write("A soma dos valores positivos é: {0}. \n E a media dos valores negativos é: {1}", soma1, media);
            Console.ReadKey();
        }
    }
}
