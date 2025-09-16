using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _114
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num, soma;
            string resposta;
            soma = 0;
            resposta = "S";

            while (resposta =="S")
            {
                Console.Write("Entre com um numero: ");
                num = int.Parse(Console.ReadLine());
                soma += num;
                Console.Write("Deseja continuar? ");
                resposta = (Console.ReadLine());
            }
            Console.Write("A soma dos valores lidos é: {0} ", soma);
            Console.ReadKey();
        }
    }
}
