using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _121
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ct = 0;
            int numero, n, ctNegativo, maior, menor, soma, somaNegativo,somaTotal, total, porPositivo, porNegativo, mediaPositiva, mediaNegativo, mediaTotal;
            string resposta;
            ctNegativo = 0;
            maior = 0;
            menor = 20;
            soma = 0;
            somaNegativo = 0;
            resposta = "S";

            while (resposta == "S")
            {

                Console.Write("Digite a quantidade de numeros que desja:  ");
                numero = int.Parse(Console.ReadLine());

                while (ct < numero)
                {
                    Console.Write("Entre com um numero positvo:  ");
                    n = int.Parse(Console.ReadLine());
                    menor = n;


                    while (n < 0 || n > 20)
                    {
                        ctNegativo += 1;
                        Console.Write("Invalido, entre com um valor positivo menor que 20:  ");
                        n = int.Parse(Console.ReadLine());
                        somaNegativo += n;
                    }
    
                    if (maior < n)
                    {
                        maior = n;
                    }

                    if (menor > n)
                    {
                        menor= n;
                    }

                    soma += n;
                    ct++;
                }
                somaTotal = soma + somaNegativo;
                total = ct + ctNegativo;
                mediaTotal = somaTotal / total;
                porPositivo = (ct * 100) / total;
                porNegativo = (ctNegativo * 100) / total;

                Console.Write("O maior valor é:  {0}\n O menor valor é:  {1}\n A soma dos valores é:  {2}\n A media dos valores é:  {3}\n A porcentagem dos positivos é:  {4}\n A porcentagem dos negativos é:  {5}.", maior, menor, somaTotal, mediaTotal, porPositivo, porNegativo);
                
                Console.Write("Deseja continuar? Digite S para sim ou N para não");
                resposta = Console.ReadLine();

                while(resposta!="S" && resposta != "N")
                {
                    Console.Write("Opção Inválida,  Digite novamente S para sim ou N para não");
                    resposta = Console.ReadLine();
                }
            }

            Console.ReadKey();

        }
    }
}
