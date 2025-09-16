using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int valor1, valor2, menu, operacao;

            

            Console.Write("Infome o 1º valor:  ");
            valor1 = int.Parse(Console.ReadLine());
            Console.Write("Entre com o 2º valor:  ");
            valor2= int.Parse(Console.ReadLine());

            Console.Write("Escolha o que deseja fazer:\n 1-Multiplicação. \n 2-Adição. \n 3-Divisão. \n 4-Substração. \n 5-Fim do Processo.");
            menu = int.Parse(Console.ReadLine());
            
            switch (menu) 
            {
                case 1: operacao = valor1 * valor2; Console.Write("O resultado é {0} ", operacao);break;
                case 2: operacao = valor1 + valor2; Console.Write("O resultado é {0} ", operacao);break;
                case 3: if (valor2 == 0)
                    {
                        Console.Write("Erro");
                    }
                    else { 
                        operacao = (valor1 /valor2);
                        Console.Write("O resultado é {0} ", operacao);
                    };break;
                case 4: operacao = valor1 - valor2; Console.Write("O reusltado é {0} ", operacao);break;
                case 5: Console.Write("Fim do processp");break;
                default: Console.Write("Opção inválida!");break;
            }
            Console.ReadKey();

        }
    }
}
