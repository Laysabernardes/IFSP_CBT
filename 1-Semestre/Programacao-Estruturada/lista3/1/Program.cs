using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int  codigo;
            float preco;

            Console.Write("Entre com o preço do produto:  ");
            preco = float.Parse(Console.ReadLine());
            Console.Write("Entre com o codigo do produto:  ");
            codigo = int.Parse(Console.ReadLine());

            switch (codigo)
            {
                case 1: Console.Write("O preço é R${0}. E sua procedencie é: SUL.", preco);break;
                case 2: Console.Write("O preço é R${0}. E sua procedencia é: NORTE.", preco);break;
                case 3: Console.Write("O preço é R${0}. E sua procedencia é: LESTE.", preco);break;
                case 4: Console.Write("O preço é R${0}. E sua procedencia é: OESTE.", preco);break;
                case 5: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco);break;
                case 6: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco);break;
                case 7: Console.Write("o preço é R${0}. E sua procedencia é: SUDESTE.", preco);break;
                case 8: Console.Write("o preço é R${0}. E sua procedencia é: SUDESTE.", preco); break;
                case 9: Console.Write("o preço é R${0}. E sua procedencia é: SUDESTE.", preco); break;
                case 10: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 11: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 12: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 13: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 14: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 15: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 16: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 17: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 18: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 19: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 20: Console.Write("o preço é R${0}. E sua procedencia é: CENTRO-OESTE.", preco); break;
                case 21: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 22: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 23: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 24: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 25: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 26: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 27: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 28: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 29: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                case 30: Console.Write("O preço é R${0}. E sua procedencia é: NORDESTE.", preco); break;
                default: Console.Write("O preço é R${0}. E sua procedencia é: IMPORTADO.", preco); break;
            }
            Console.ReadKey();
        }
    }
}
