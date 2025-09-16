using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex20
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float eleitor, branco, nulo, validos, pbranco, pnulo, pvalidos;
            

            Console.Write("Informe o total de eleitores:   ");
            eleitor= float.Parse(Console.ReadLine());
            Console.Write("Informe o numero de votos brancos:   ");
            branco= float.Parse(Console.ReadLine());
            Console.Write("Informeo total de votos nulos:  ");
            nulo = float.Parse(Console.ReadLine());
            Console.Write("Informe o total de votos validos:  ");
            validos = float.Parse(Console.ReadLine());

            
            pbranco = (branco*100)/eleitor;
            pnulo = (nulo * 100) / eleitor;
            pvalidos = (validos * 100) / eleitor;

            Console.WriteLine("Em relação ao total de eleitores, os votos brancos correspondem a {0} % , os nulos a {1} % e os validos a {2}%", pbranco, pnulo, pvalidos);
            Console.ReadKey();
        }
    }
}
