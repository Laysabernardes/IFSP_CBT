import javax.swing.*;
import com.google.gson.Gson;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Cadastro extends JFrame {

    private JTextField campoNome;
    private JTextField campoIdade;
    private JTextField campoPeso;
    private JTextField campoAltura;
    private JTextField campoObjetivo;

    public Cadastro() {
        setTitle("Cadastro de Aluno - Academia");
        setSize(400, 300);
        setLayout(new GridLayout(7, 2, 5, 5)); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Campos de entrada
        campoNome = new JTextField();
        campoIdade = new JTextField();
        campoPeso = new JTextField();
        campoAltura = new JTextField();
        campoObjetivo = new JTextField();

        // Adicionando componentes à interface
        add(new JLabel("Nome:"));
        add(campoNome);
        add(new JLabel("Idade:"));
        add(campoIdade);
        add(new JLabel("Peso:"));
        add(campoPeso);
        add(new JLabel("Altura:"));
        add(campoAltura);
        add(new JLabel("Objetivo:"));
        add(campoObjetivo);

        // Botões
        JButton btnIncluir = new JButton("Incluir");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnApresentar = new JButton("Apresentar Dados");
        JButton btnSair = new JButton("Sair");

        add(btnIncluir);
        add(btnLimpar);
        add(btnApresentar);
        add(btnSair);

        // Ações dos botões
        btnLimpar.addActionListener(e -> limparCampos());

        btnIncluir.addActionListener(e -> incluirAluno());

        btnApresentar.addActionListener(e -> apresentarAluno());

        btnSair.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void apresentarAluno() {
        Gson gson = new Gson();

        String nome = campoNome.getText();
        String idade = campoIdade.getText();
        String peso = campoPeso.getText();
        String altura = campoAltura.getText();
        String objetivo = campoObjetivo.getText();

        // Representa os dados em JSON
        String[] array = {nome, idade, peso, altura, objetivo};
        JOptionPane.showMessageDialog(this, gson.toJson(array), "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
    }

    private void incluirAluno() {
        String nome = campoNome.getText();
        String idadeString = campoIdade.getText();
        String pesoString = campoPeso.getText();
        String alturaString = campoAltura.getText();
        String objetivo = campoObjetivo.getText();

        if (nome.isEmpty() || idadeString.isEmpty() || pesoString.isEmpty() || alturaString.isEmpty() || objetivo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int idade = Integer.parseInt(idadeString);
            float peso = Float.parseFloat(pesoString);
            float altura = Float.parseFloat(alturaString);

            if (idade <= 0 || peso <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(this, "Idade, peso e altura devem ser valores positivos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Inserindo no banco de dados
            try (Connection con = Database.getConnection()) {
                String sql = "INSERT INTO Aluno (nome, idade, peso, altura, objetivo) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ps.setString(1, nome);
                    ps.setInt(2, idade);
                    ps.setFloat(3, peso);
                    ps.setFloat(4, altura);
                    ps.setString(5, objetivo);

                    int rowsAffected = ps.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        limparCampos();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao cadastrar aluno.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro na conexão com o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Idade, peso e altura devem ser números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        campoNome.setText("");
        campoIdade.setText("");
        campoPeso.setText("");
        campoAltura.setText("");
        campoObjetivo.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Cadastro::new);
    }
}
