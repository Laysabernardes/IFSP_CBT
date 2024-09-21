using System;

namespace _2_VENDEDORES
{
    public class Venda
    {
        public int Qtde { get; set; }
        public double Valor { get; set; }

        public Venda(int qtde, double valor)
        {
            this.qtde = qtde;
            this.valor = valor;
        }

        public double ValorMedio()
        {
            return qtde > 0 ? valor / qtde : 0;
        }
    }
}
