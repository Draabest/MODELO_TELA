import java.awt.*;
import javax.swing.*; // Importa as classes necessárias de `java.awt` para layouts e outros recursos


public class AWTTestSwing {
    public static void main(String[] args) {
        // Cria um novo JFrame com o título "AWT Test"
        JFrame frame = new JFrame("AWT Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação de fechar
        frame.setSize(400, 200); // Define o tamanho da janela
        frame.setLayout(new BorderLayout()); // Define o layout do JFrame como BorderLayout

        // Cria um JLabel e um JTextField e os adiciona a um painel superior
        JLabel label1 = new JLabel("Label1");
        JTextField textField1 = new JTextField(15);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout()); // Define o layout do painel superior
        topPanel.add(label1); // Adiciona o JLabel ao painel superior
        topPanel.add(textField1); // Adiciona o JTextField ao painel superior

        // Cria três botões e os adiciona a um painel de botões
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // Define o layout do painel de botões
        buttonPanel.add(button1); // Adiciona o Button1 ao painel de botões
        buttonPanel.add(button2); // Adiciona o Button2 ao painel de botões
        buttonPanel.add(button3); // Adiciona o Button3 ao painel de botões

        // Adiciona o painel superior e o painel de botões ao JFrame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true); // Torna a janela visível
    }
}