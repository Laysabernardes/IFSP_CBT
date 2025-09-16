using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int volume, comprimento, largura, altura;

            Console.Write("Informe o comprimento da caixa:   ");
            comprimento = int.Parse(Console.ReadLine());
            Console.Write("Informe a altura da caixa:   ");
            altura = int.Parse(Console.ReadLine());
            Console.Write("Informe a largura da caixa:   ");
            largura = int.Parse(Console.ReadLine());

            volume = comprimento * largura * altura;

            Console.WriteLine("O volume da caixa é:   {0}", volume);
            Console.ReadKey();

            
        }
    }
}
