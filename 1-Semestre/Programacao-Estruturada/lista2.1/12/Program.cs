using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int conta;
            float saldo, credito, debito, saldo_atual;

            Console.Write("Informe o numero da conta:  ");
            conta = int.Parse(Console.ReadLine());
            Console.Write("Informe o saldo da conta:  ");
            saldo = float.Parse(Console.ReadLine());
            Console.Write("Informe o valor do debito da conta:  ");
            debito = float.Parse(Console.ReadLine());
            Console.Write("Informe o valor do credito da conta:  ");
            credito = float.Parse(Console.ReadLine());

            saldo_atual = saldo - debito + credito;

            if (saldo_atual >= 0)
            {
                Console.Write("A conta{0} esta com saldo positivo! ", conta);
            } 
            else
            {
                Console.Write("A conta{0} esta com saldo negativo! ", conta);

            }
            Console.ReadKey();

        }
    }
}
