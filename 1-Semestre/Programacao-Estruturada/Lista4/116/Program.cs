using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _116
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ct, num1, num2, num3;
            ct = 1;
            num1 = 1;
            num2 = 1;
            Console.WriteLine(num1);
            Console.WriteLine(num2);
            while (ct <= 30)
            {
                num3 = num1 +num2;
                Console.WriteLine(num3);
                num1 = num2;
                num2 = num3;
                ct++;
            }
            Console.ReadKey();
        }
    }
}
