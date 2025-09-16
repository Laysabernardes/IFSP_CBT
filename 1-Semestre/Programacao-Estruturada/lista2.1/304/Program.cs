using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _304
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double funcionario, salario, salario_novo;

            Console.Write("Informe o numero do funcionario:  ");
            funcionario = double.Parse(Console.ReadLine());
            Console.Write("Informe o salario atual do funcionario {0}:  ", funcionario);
            salario = double.Parse(Console.ReadLine());

            if (salario >= 0 && salario < 400)
            {
                salario_novo = salario * 1.15;
                Console.Write("O nova salario é de {0}", salario_novo);
            }
            else
            {
                if (salario >= 400 && salario < 700)
                {
                    salario_novo = salario * 1.12;
                    Console.Write("O novo salrio é de {0} ", salario_novo);
                }
                else
                {
                    if(salario>=700 && salario < 1000)
                    {
                        salario_novo = salario * 1.10;
                        Console.Write("O novo salario é de {0} ", salario_novo);
                    }
                    else
                    {
                        if(salario>=1000 && salario < 1800)
                        {
                            salario_novo = salario * 1.07;
                            Console.Write("O novo salrio é de {0} ", salario_novo);
                        }
                        else
                        {
                            if (salario >= 1800 && salario < 2500)
                            {
                                salario_novo = salario * 1.04;
                                Console.Write("O novo salrio é de {0} ", salario_novo);
                            }
                            else
                            {
                                Console.Write("Seu salario é de {0} ", salario);
                            }
                        }
                    }
                }

               
            }
            Console.ReadKey();
            
        }
    }
}
