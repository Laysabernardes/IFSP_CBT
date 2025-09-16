using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _204
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int gol1, gol2;
            string time1, time2;

            Console.Write("Informe o nome do 1º time: ");
            time1=Console.ReadLine();
            Console.Write("Informe o nome do  2º time: ");
            time2=Console.ReadLine();
            Console.Write("Informe o numero de gols feito pelo time {0} ", time1);
            gol1 = int.Parse(Console.ReadLine());
            Console.Write("Informe o numero de gols feito peolo tiome {0} ", time2);
            gol2 = int.Parse(Console.ReadLine());

            if (gol1 == gol2)
            {
                Console.Write("Houve empate ente os times {0} e {1}", time1, time2);
            }
            else
            {
                if (gol1 > gol2)
                {
                    Console.Write("O time {0} é o vencedor", time1);
                }
                else
                {
                    Console.Write("O time {0} é o vencedor", time2);
                }
            }
            Console.ReadKey();
        }
    }
}
