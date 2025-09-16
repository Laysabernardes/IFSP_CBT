using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ex7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int litros_usados, tempo, velocidade, distancia;

            Console.Write("Informe o tempo gasto na viagem  ");
            tempo = int.Parse(Console.ReadLine());
            Console.Write("Informa sua velocidade media durante a viagem  ");
            velocidade = int.Parse(Console.ReadLine());

            distancia = tempo * velocidade;
            litros_usados = distancia / 12;

            Console.WriteLine("Durante está viagem a velocidade media foi  de   {0}, o tempo gasto na viagem foi  {1} a distancia percorrida foi  {2} e a quantidade de litros gastos foi {3}", velocidade,tempo,distancia,litros_usados);
            Console.ReadKey();


        }
    }
}
