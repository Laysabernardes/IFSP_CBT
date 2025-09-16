using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, temporario;

            Console.Write("Informe o primeiro numero");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o segundo numero");
            num2 = int.Parse(Console.ReadLine());

            temporario = num1;
            num1 = num2;
            num2 = temporario;

            Console.WriteLine("O primeiro numero é igual a   {0} e o segundo numero é igual a   {1}", num1, num2);
            Console.ReadKey();


        }
    }
}
