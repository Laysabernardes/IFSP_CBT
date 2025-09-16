using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex19
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double raio, volume;
       

            Console.Write("Informe o valor do raio da esfera:   ");
            raio= double.Parse(Console.ReadLine());

            volume = ((4.0/ 3.0) * 3.1415 * (raio * raio * raio)); 
            

            Console.WriteLine(" O volume da esfera é de   {0}", volume);
            Console.ReadKey();
            
        }
    }
}
