using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex17
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int cotacao, dolar, reais;

            Console.Write("Informe a cotação do Dolar:   ");
            cotacao = int.Parse(Console.ReadLine());
            Console.Write("Informe um valor de dolar a ser convertido em reais:   ");
            dolar = int.Parse(Console.ReadLine());

            reais = cotacao * dolar;

            Console.WriteLine("O valor de {0} dolares em reais é de  {1}  reais ", dolar, reais);
            Console.ReadKey();
        }
    }
}
