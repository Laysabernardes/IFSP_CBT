using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _202
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, num3, s;

            Console.Write("Informe o 1º numero:  ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o 2º numero:  ");
            num2= int.Parse(Console.ReadLine());
            Console.Write("Informe o 3º numero:  ");
            num3=int.Parse(Console.ReadLine());

            if (num1 > num2 && num1 >num3)
            {
                if (num2 > num3)
                {
                    s = num1 + num2;
                    Console.Write("Caso 1");
                }
                else
                {
                    s = num1 + num3;
                    Console.Write("Caso 2");

                }
            }
            else
            {
                if (num2 > num1 && num2 > num3)
                {
                    if (num1 > num3)
                    {
                        s = num2 + num1;
                        Console.Write("Caso 3");

                    }
                    else
                    {
                        s = num2 + num3;
                        Console.Write("Caso 4");

                    }
                }
                else
                {
                    if (num1 > num2)
                    {
                        s = num3 + num1;
                        Console.Write("5");


                    }
                    else
                    {
                        s = num3 + num2;
                        Console.Write("6");

                    }
                }

            }
            Console.Write("\n Os maiores numeros são e  sua soma é: {0} " ,s);

            Console.ReadKey();

        }
    }
}
