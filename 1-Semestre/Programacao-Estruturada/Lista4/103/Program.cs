
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _103
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string sexo;

            Console.Write("Usando F para feminino e M para masculino. \nDigite o sexo do usuário: ");
            sexo = Console.ReadLine();

            while(sexo!="F" && sexo != "M")
            {
                Console.Write("Incorreto, digite novamente!");
                sexo= Console.ReadLine();
            }
            Console.Write("O sexo do usuário é: {0} ", sexo);
            Console.ReadKey();
        }
    }
}
