using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _109
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ct = 0;

            while (ct <= 20)
            {
               
                if (ct % 2 == 0)
                {
                    Console.WriteLine(ct);
                }
                ct++; 
            }
            Console.ReadKey();
        }
    }
}
