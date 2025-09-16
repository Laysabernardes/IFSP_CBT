using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _207
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int codigo,codigo_digitado, senha, senha_digitada;
            codigo = 1234;
            senha = 9999;

            Console.Write("Entre com o codigo (4numero) do usuario:  ");
            codigo_digitado = int.Parse(Console.ReadLine());
            Console.Write("Entre com a senha: ");
            senha_digitada=int.Parse(Console.ReadLine());

            if(codigo == codigo_digitado && senha==senha_digitada)
            {
                Console.Write("Acesso permitido!");
            }
            else
            {
                Console.Write("Acesso Negado!");
            }
            Console.ReadKey();

        }
    }
}
