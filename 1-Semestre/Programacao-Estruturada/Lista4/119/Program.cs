using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace _119
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double n,ct,sec, n1, soma;
            n1 = 2;
            sec = 2;
            ct = 1;
            soma = 2;

            Console.Write("Entre com o numero de sequencia que deseja exibir:  ");
            n = double.Parse(Console.ReadLine());

            while(n<0 || n > 50)
            {
                Console.Write("Incorreto, entre um valor positivo, menor que 50: ");
                n = double.Parse(Console.ReadLine());
            }

            Console.WriteLine(sec);

            while (ct < n)
            {
                sec = ((n1 * n1) + 1) / (n1 * n1 * n1);
                Console.WriteLine(sec);
                soma= soma+ sec;
                n1++;
                ct++;
            }
            Console.Write("A soma dos {0} primeiros numeros da sequencia é: {1}", n, soma);
            Console.ReadKey();
        }
    }
}
