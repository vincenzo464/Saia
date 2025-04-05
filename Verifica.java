import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Verifica extends JFrame {
    private JPanel contentPane;
    private JTextField ImportotextField;
    private JTextField TotaletextField;
    @SuppressWarnings("rawtypes")
    private JComboBox eventualeScontoBox = new JComboBox(); 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Verifica frame = new Verifica();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Verifica() {        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 950, 460);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblb1 = new JLabel("Importo");
        lblb1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblb1.setBounds(10, 11, 106, 35);
        contentPane.add(lblb1);

        JLabel lblb2 = new JLabel("Eventuale sconto");
        lblb2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblb2.setBounds(601, 16, 278, 35);
        contentPane.add(lblb2);

        JLabel lblNewLabel = new JLabel("Totale");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblNewLabel.setBounds(10, 145, 106, 41);
        contentPane.add(lblNewLabel);

        ImportotextField = new JTextField();
        ImportotextField.setBounds(100, 23, 215, 20);
        contentPane.add(ImportotextField);
        ImportotextField.setColumns(10);

        eventualeScontoBox = new JComboBox();
        eventualeScontoBox.setModel(new DefaultComboBoxModel(new Float[] {(float)0, (float) 10, (float)20}));
        eventualeScontoBox.setBounds(601, 52, 159, 22);
        contentPane.add(eventualeScontoBox);

        TotaletextField = new JTextField();
        TotaletextField.setEditable(false);
        TotaletextField.setBounds(100, 160, 215, 20);
        contentPane.add(TotaletextField);
        TotaletextField.setColumns(10);

        JButton CalcolaImportobtn = new JButton("Calcola");
        CalcolaImportobtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getImporto();
            }
        });
        CalcolaImportobtn.setBounds(601, 159, 89, 23);
        contentPane.add(CalcolaImportobtn);
    }

    public void getImporto() {
        try {
            float totImporto = Float.parseFloat(ImportotextField.getText()); 
            float sconto = (float) eventualeScontoBox.getSelectedItem();
            float contoFinale = totImporto - (totImporto * sconto / 100);
            TotaletextField.setText(String.valueOf(contoFinale));
        } catch (NumberFormatException e) {}
    }
}