package rubricaContattiV1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

@SuppressWarnings("serial")
public class MainClass extends JFrame {
    private JLabel lblWaringMessage;
    private JPanel contentPane;
    private JTextField textFieldCognome;
    private JTextField textFieldNumerotelelfonico;
    private JTextField textFieldEmail;
    private JTextField textFieldNome;
    private ArrayList<String> listaContatti = new ArrayList<>();
    protected String contatto; 
    private FIleManager fm = new FIleManager();  

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainClass frame = new MainClass();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainClass() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 499, 386);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCongome = new JLabel("Cognome");
        lblCongome.setBounds(28, 23, 65, 34);
        contentPane.add(lblCongome);

        JLabel lblTelefono = new JLabel("n. Telefonico");
        lblTelefono.setBounds(28, 124, 105, 34);
        contentPane.add(lblTelefono);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(262, 34, 45, 13);
        contentPane.add(lblNome);

        JLabel lblEmail = new JLabel("email");
        lblEmail.setBounds(262, 135, 45, 13);
        contentPane.add(lblEmail);

        textFieldCognome = new JTextField();
        textFieldCognome.setBounds(131, 31, 96, 19);
        contentPane.add(textFieldCognome);
        textFieldCognome.setColumns(10);

        textFieldNumerotelelfonico = new JTextField();
        textFieldNumerotelelfonico.setBounds(131, 132, 96, 19);
        contentPane.add(textFieldNumerotelelfonico);
        textFieldNumerotelelfonico.setColumns(10);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(317, 132, 96, 19);
        contentPane.add(textFieldEmail);
        textFieldEmail.setColumns(10);

        textFieldNome = new JTextField();
        textFieldNome.setBounds(317, 31, 96, 19);
        contentPane.add(textFieldNome);
        textFieldNome.setColumns(10);

        JButton btnSalva = new JButton("Salvo Contatto");
        btnSalva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contatto = "Nome: " + textFieldNome.getText() + ", Cognome: " + textFieldCognome.getText() + 
                           ", Numero Telefonico: " + textFieldNumerotelelfonico.getText() + ", Email: " + textFieldEmail.getText();
                listaContatti.add(contatto);
                fm.salvaContatti(listaContatti);
            }
        });
        btnSalva.setBounds(262, 235, 151, 21);
        contentPane.add(btnSalva);

        lblWaringMessage = new JLabel("<html>Disclamer : Una volta che avrai salvato qualsisasi informazion non potrai tornare in dietro per cambiarla (per adesso)</html>");
        lblWaringMessage.setFont(new Font("Wide Latin", Font.PLAIN, 10));
        lblWaringMessage.setVerticalAlignment(SwingConstants.TOP);
        lblWaringMessage.setBounds(28, 288, 429, 45);
        contentPane.add(lblWaringMessage);
        
        JButton btnVisualizzaContatti = new JButton("Visualizza Contatti");
        btnVisualizzaContatti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CasellaAccountSalvati casellaFrame = new CasellaAccountSalvati(listaContatti);
                casellaFrame.setVisible(true);
            }
        });
        btnVisualizzaContatti.setBounds(262, 200, 151, 21);
        contentPane.add(btnVisualizzaContatti);
    }
}
