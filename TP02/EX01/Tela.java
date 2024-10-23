package EX01;
import java.awt.*;
import java.awt.event.*;
// import java.util.ArrayList;
// import java.util.List;

class FechaJanela extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class Tela extends Frame {
    public static void main(String[] args){
        Frame tela = new Frame("TP02 - LP214");
        tela.setLayout(new FlowLayout(FlowLayout.RIGHT));
        tela.setSize(500, 400);
        tela.addWindowListener(new FechaJanela());
        tela.add(new Button("Botão"));

        tela.setVisible(true);
    }
}
