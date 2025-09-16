using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, s;

            Console.Write("Informe o primeiro numero:  ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o segundo numero:  ");
            num2 = int.Parse(Console.ReadLine());

            if (num1 > num2)
            {
                s = num1 / num2;
                Console.Write("O resultado de {0} /{1} é {2}", num1, num2, s);
            }
            else
            {
                s = num2 / num1;
                Console.Write("O resultado de {0} /{1} é {2}", num2,num1, s);
            }
            Console.ReadKey();  
        }
    }
}
