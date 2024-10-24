//Aluna: Laysa Bernardes Campos da Rocha - CB3024873 
//Aluno: Lucas Lopes Cruz - CB3025284 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Tela extends JFrame {
    private JTextField nomeField;
    private JTextField idadeField;
    private JTextField enderecoField;

    private List<Aluno> alunos;

    public Tela() {
        alunos = new ArrayList<>();

        setTitle("TP02 - LP2I4");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelSuperior = new JPanel(new GridLayout(3, 2, 10, 10)); 
        painelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        add(painelSuperior, BorderLayout.CENTER);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(15);
        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField(15);
        JLabel enderecoLabel = new JLabel("Endereco:");
        enderecoField = new JTextField(15);

        painelSuperior.add(nomeLabel);
        painelSuperior.add(nomeField);
        painelSuperior.add(idadeLabel);
        painelSuperior.add(idadeField);
        painelSuperior.add(enderecoLabel);
        painelSuperior.add(enderecoField);

        JPanel painelInferior = new JPanel(new GridLayout(1, 4, 10, 10));
        painelInferior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        add(painelInferior, BorderLayout.SOUTH);

        JButton okButton = new JButton("Ok");
        JButton limparButton = new JButton("Limpar");
        JButton mostrarButton = new JButton("Mostrar");
        JButton sairButton = new JButton("Sair");

        painelInferior.add(okButton);
        painelInferior.add(limparButton);
        painelInferior.add(mostrarButton);
        painelInferior.add(sairButton);

        okButton.addActionListener(e -> {
            try {
                String nome = nomeField.getText();
                if (!nome.matches("[a-zA-Z\\s]+")) {
                    throw new IllegalArgumentException("Nome deve conter apenas letras.");
                }

                String endereco = enderecoField.getText();
                if (!endereco.matches("[a-zA-Z0-9\\s.,-/#]+")) {
                    throw new IllegalArgumentException("Endereço deve conter apenas letras, números e alguns caracteres especiais (.,-/#).");
                }

                int idade = Integer.parseInt(idadeField.getText());
                Aluno aluno = new Aluno(nome, endereco, idade);
                alunos.add(aluno);
                JOptionPane.showMessageDialog(null, "Aluno cadastrado: " + nome);

                limparCampos();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Erro: Idade deve ser um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        });

        limparButton.addActionListener(e -> limparCampos());

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder mensagem = new StringBuilder("Alunos cadastrados:\n");
                for (Aluno aluno : alunos) {
                    mensagem.append("ID: ").append(aluno.getUuid()).append(" Nome: ").append(aluno.getNome()).append("\n");
                }
                JOptionPane.showMessageDialog(Tela.this, mensagem.toString());
            }
        });

        sairButton.addActionListener(e -> {
            System.exit(0);
        });
    }

    private void limparCampos() {
        nomeField.setText("");
        idadeField.setText("");
        enderecoField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tela formulario = new Tela();
            formulario.setVisible(true);
        });
    }
}
