using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int idade,risco;

            Console.Write("Informe sua idade:  ");
            idade = int.Parse(Console.ReadLine());


            if (idade < 18 || idade > 70)
            {
                Console.Write("Sua idade não é permitida!");
            }
            else
            {
                Console.Write("Informe se pertence ao grupo de risco\n1-baixo\n2-medio\n3-alto\n  ");
                risco = int.Parse(Console.ReadLine());

                if (idade >= 18 && idade <= 24)
                {
                    switch (risco)
                    {
                        case 1: Console.Write("Sua categoria é 7"); break;
                        case 2: Console.Write("Sua categoria é 8"); break;
                        case 3: Console.Write("Sua categoria é 9"); break;
                        default:Console.Write("Cogido inavlaido");break;

                    }

                }
                else
                {
                    if (idade >= 25 && idade <= 40)
                    {
                        switch (risco)
                        {
                            case 1: Console.Write("Sua categoria é 4"); break;
                            case 2: Console.Write("Sua categoria é 5"); break;
                            case 3: Console.Write("Sua categoria é 6"); break;
                            default: Console.Write("Cogido inavlaido"); break;

                        }

                    }
                    else
                    {
                        if (idade >= 41 && idade <= 70)
                        {
                            switch (risco)
                            {
                                case 1: Console.Write("Sua categoria é 1"); break;
                                case 2: Console.Write("Sua categoria é 2"); break;
                                case 3: Console.Write("Sua categoria é 3"); break;
                                default: Console.Write("Cogido inavlaido"); break;

                            }

                        }
                    }
                }
            }
            Console.ReadKey();
        }
    }
}
