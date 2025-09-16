using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _404
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int um, dois, tres, quatro;

            Console.Write("Entre com os 1º numero:  ");
            um = int.Parse(Console.ReadLine());
            Console.Write("Entre com os 2º numero:  ");
            dois = int.Parse(Console.ReadLine());
            Console.Write("Entre com os 3º numero:  ");
            tres = int.Parse(Console.ReadLine());
            Console.Write("Entre com os 4º numero:  ");
            quatro = int.Parse(Console.ReadLine());

            if (um % 2 == 0 && um % 3 == 0)
                Console.Write("{0} é divisivel por 2 e 3\n", um);
            else
                Console.Write("{0} não é divisivel por 2 e 3\n", um);

            if (dois % 2 == 0 && dois % 3 == 0)
                Console.Write("{0} é divisivel por 2 e 3\n", dois);
            else
                Console.Write("{0} não é divisivel por 2 e 3\n", dois);

            if (tres % 2 == 0 && tres % 3 == 0)
                Console.Write("{0} é divisivel por 2 e 3\n", tres);
            else
                Console.Write("{0} não é divisivel por 2 e 3\n", tres);

            if (quatro % 2 == 0 && quatro % 3 == 0)
                Console.Write("{0} é divisivel por 2 e 3\n", quatro);
            else
                Console.Write("{0} não é divisivel por 2 e 3\n", quatro);


            Console.ReadKey();
        }
    }
}
