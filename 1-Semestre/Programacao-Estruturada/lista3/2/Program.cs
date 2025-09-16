using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int codigo;

            Console.Write("Entre com o seu codigo de funcionario:  ");
            codigo = int.Parse(Console.ReadLine());

            switch (codigo)
            {
                case 1: Console.Write("Seu cargo é: ESCRITURÁRIO. \nSeu percentual de aumento é: 50%");break;
                case 2: Console.Write("Seu cargo é: SECRETARIO \nSeu percentual de aumento é: 35%");break;
                case 3: Console.Write("Seu cargo é: CAIXA \nSeu percentual de aumento é: 20%");break;
                case 4: Console.Write("Seu cargo é: GERENTE \nSeu percentual de aumento é: 10%");break;
                case 5: Console.Write("Seu cargo é: DIRETOR\nSeu percentual de aumento é: Não tem aumento!"); break;
                default: Console.Write("Codigo inválido, tente novamente"); break;
            }
            Console.ReadKey();



        }
    }
}
