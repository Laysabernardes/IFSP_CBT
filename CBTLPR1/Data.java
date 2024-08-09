import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

class Data {
    private int dia;
    private int mes;
    private int ano;

    private static Scanner scan = new Scanner(System.in);

    // Construtor que permite ao usuário digitar os valores de ano, mês e dia
    public Data() {
        setAno();
        setMes();
        setDia();
    }

    // Construtor que recebe os valores de dia, mês e ano
    public Data(int d, int m, int a) {
        setAno(a);
        setMes(m);
        setDia(d);
    }

    // Métodos Setters com validação
    public void setDia(int d) {
         while (true) {
            try {
                 if (isValidDate(d, this.mes, this.ano)) {
                    this.dia = d;
                    break;
                } else {
                    System.out.println("Dia inválido. Tente novamente.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro ao entrar com o dia: " + e.getMessage());
                scan.nextLine();
            }
        }
    }

    public void setMes(int m) {
        if (m >= 1 && m <= 12) {
            this.mes = m;
            if (!isValidDate(this.dia, m, this.ano)) {
                this.dia = 1; // Ajusta o dia para um valor válido se o mês mudar e a data não for mais válida
            }
        } else {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }

    public void setAno(int a) {
        if (a > 0) {
            this.ano = a;
            if (!isValidDate(this.dia, this.mes, a)) {
                this.dia = 1; // Ajusta o dia para um valor válido se o ano mudar e a data não for mais válida
            }
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }

    // Métodos Setters que permitem ao usuário digitar os valores
    public void setDia() {
        while (true) {
            try {
                System.out.print("Digite o dia: ");
                int dia = scan.nextInt();
                 if (isValidDate(dia, this.mes, this.ano)) {
                    setDia(dia);
                    break;
                } else {
                    System.out.println("Dia inválido. Tente novamente.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro ao entrar com o dia: " + e.getMessage());
                scan.nextLine();
            }
        }
    }

    public void setMes() {
        while (true) {
            try {
                System.out.print("Digite o mês: ");
                int mes = scan.nextInt();
                if (mes >= 1 && mes <= 12) {
                    setMes(mes);
                    if (!isValidDate(this.dia, mes, this.ano)) {
                        this.dia = 1; // Ajusta o dia para um valor válido se o mês mudar e a data não for mais válida
                    }
                    break;
                } else {
                    System.out.println("Mês inválido. Tente novamente.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro ao entrar com o mês: " + e.getMessage());
                scan.nextLine();
            }
        }
    }

    public void setAno() {
        while (true) {
            try {
                System.out.print("Digite o ano: ");
                int ano = scan.nextInt();
                if (ano > 0) {
                    setAno(ano);
                    if (!isValidDate(this.dia, this.mes, ano)) {
                        this.dia = 1; // Ajusta o dia para um valor válido se o ano mudar e a data não for mais válida
                    }
                    break;
                } else {
                    System.out.println("Ano inválido. Tente novamente.");
                }
                
                break;
            } catch (Exception e) {
                System.out.println("Erro ao entrar com o ano: " + e.getMessage());
                scan.nextLine();
            }
        }
    }

    // Métodos Getters
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    // Métodos para mostrar a data em diferentes formatos
    public String mostra1() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String mostra2() {
        String[] mesesPorExtenso = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d de %s de %04d", this.dia, mesesPorExtenso[this.mes - 1], this.ano);
    }

    // Método para verificar se o ano é bissexto
    public boolean isBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    // Método para calcular os dias transcorridos no ano até a data
    public int getDiasTranscorridos() {
        int[] diasPorMes = {31, (isBissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTranscorridos = 0;

        for (int i = 0; i < this.mes - 1; i++) {
            diasTranscorridos += diasPorMes[i];
        }

        diasTranscorridos += this.dia;

        return diasTranscorridos;
    }

    // Método para apresentar a data atual no formato completo
    public void apresentaDataAtual() {
        Date dataAtual = new Date();
        DateFormat formatoData = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + formatoData.format(dataAtual));
    }

    // Método auxiliar para validar a data
    private boolean isValidDate(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1) {
            return false;
        }
        int[] diasPorMes = {31, (isBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasPorMes[mes - 1];
    }

    // Método auxiliar para verificar se um ano específico é bissexto
    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
