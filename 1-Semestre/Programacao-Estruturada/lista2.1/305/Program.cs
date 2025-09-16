using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _305
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int codigo, nascimento, ingresso, idade, tempoTrabalhando;

            Console.Write("Informe o codigo do funcionario:  ");
            codigo = int.Parse(Console.ReadLine());
            Console.Write("Informe o ano de seu  nascimento:  ");
            nascimento = int.Parse(Console.ReadLine());
            Console.Write("Informe o ano de ingresso na empresa:  ");
            ingresso = int.Parse(Console.ReadLine());

            idade = 2023 - nascimento;
            tempoTrabalhando = 2023 - ingresso;

            if(idade>=65 || tempoTrabalhando>=30 || (idade>=60 && tempoTrabalhando >= 25))
            {
                Console.Write("Considerando o ano de 2023! \n Sua idade é de: {0} anos. \n Seu tempo de trabalho é de: {1} anos.\n Requerer Aponsentadoria! ", idade, tempoTrabalhando);
            }
            else
            {
                Console.Write("Considerando o ano de 2023! \n Sua idade é de: {0} anos. \n Seu tempo de trabalho é de: {1} anos\n Não requerer ", idade, tempoTrabalhando);
            }
            Console.ReadLine();
        }
    }
}
