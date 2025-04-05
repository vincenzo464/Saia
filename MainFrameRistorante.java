import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class MainFrameRistorante extends JFrame {
	private static final long serialVersionUID = 1L;
    public 	static MainFrameRistorante frame;
    private JPanel contentPane;
    private JTextField textTotPeopleField;
    private JTextField textField_Marinara;
    private JTextField textField_Margherita;
    private JTextField textFieldTotCostMarinara;
    private JTextField textFieldTotCostMargherita;
    private JTextField textFieldThirdLiquid;
    private JTextField textFieldFirstLiquid;
    private JTextField textFieldSeondLiquid;
    private JTextField textFieldTotCostFirstLiquid;
    private JTextField textFieldTotCostSecondLiquid;
    private JTextField textFieldTotCostThirdLiquid;
    private JTextField textFieldTotCostLiquids;
    private JTextField textFieldTotCostPizzas;
    private JTextField textFieldTotCostForEverything;
    private JTextField textFieldBasicllyYouPutHerePax;
    private JLabel lblN_1;
    private JLabel lblN_2;
    private JLabel lblN_3;
    private JLabel lblN_4;
    private JLabel lblN_5;
    private JLabel lblTot_2;
    private JLabel lblTot_1;
    private JLabel lblTot_3;
    private JLabel lblTot_4;
    private JLabel lblTot_5;
    private JLabel lblTotBeverage;
    private JLabel lblTotPizza;
    private JLabel lblCostForEverything;
    private JRadioButton rdbtnTakeAway = new JRadioButton("asporto");    
    static public int totTablesBorrowed;
    
    static JButton btnBorrowNewTable = new JButton("Ordina nuovo tavolo");
    private static JTextField textTableNumber_1;
    private JButton btnCloseMeOnly;
   

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	frame = new MainFrameRistorante();
                    frame.setVisible(true);
                    
                    borrowNewWindow(btnBorrowNewTable);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainFrameRistorante() { 	
        this.setTitle("Tavolo : " + totTablesBorrowed);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 950, 500);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // #-INUTILE PER IL MOMENTO-#
        JLabel lblTableLabel = new JLabel("TAVOLO");
        lblTableLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTableLabel.setBounds(44, 25, 100, 25);
        contentPane.add(lblTableLabel);

        JLabel lblPAX = new JLabel("PAX €1.0 PER PERSONA");
        lblPAX.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPAX.setBounds(44, 61, 221, 25);
        contentPane.add(lblPAX);

        textTotPeopleField = new JTextField();
        textTotPeopleField.setBounds(275, 66, 86, 20);
        contentPane.add(textTotPeopleField);
        textTotPeopleField.setColumns(10);

        JLabel lblTotPax = new JLabel("TOT. COPERTI");
        lblTotPax.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTotPax.setBounds(553, 64, 146, 22);
        contentPane.add(lblTotPax);

        textFieldBasicllyYouPutHerePax = new JTextField();
        textFieldBasicllyYouPutHerePax.setEditable(false);
        textFieldBasicllyYouPutHerePax.setColumns(10);
        textFieldBasicllyYouPutHerePax.setBounds(710, 66, 86, 20);
        contentPane.add(textFieldBasicllyYouPutHerePax);

        JLabel lblPizza = new JLabel("MENù PIZZE");
        lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPizza.setBounds(44, 140, 124, 14);
        contentPane.add(lblPizza);

        JLabel lblMarinara = new JLabel("Marinara € 4.00");
        lblMarinara.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblMarinara.setBounds(178, 143, 146, 14);
        contentPane.add(lblMarinara);

        textField_Marinara = new JTextField();
        textField_Marinara.setColumns(10);
        textField_Marinara.setBounds(584, 140, 86, 20);
        contentPane.add(textField_Marinara);

        JLabel lblMargherita = new JLabel("Margherita €5.00");
        lblMargherita.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblMargherita.setBounds(178, 191, 146, 14);
        contentPane.add(lblMargherita);

        textField_Margherita = new JTextField();
        textField_Margherita.setColumns(10);
        textField_Margherita.setBounds(584, 191, 86, 20);
        contentPane.add(textField_Margherita);

        JLabel lbl_1 = new JLabel("Uno €0.50");
        lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbl_1.setBounds(178, 322, 100, 14);
        contentPane.add(lbl_1);

        JLabel lbl_2 = new JLabel("Due € 1.00");
        lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbl_2.setBounds(178, 350, 113, 14);
        contentPane.add(lbl_2);

        JLabel lbl_3 = new JLabel("Tre €5.00");
        lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbl_3.setBounds(178, 375, 100, 14);
        contentPane.add(lbl_3);

        textFieldTotCostMarinara = new JTextField();
        textFieldTotCostMarinara.setEditable(false);
        textFieldTotCostMarinara.setColumns(10);
        textFieldTotCostMarinara.setBounds(805, 140, 69, 20);
        contentPane.add(textFieldTotCostMarinara);

        textFieldTotCostMargherita = new JTextField();
        textFieldTotCostMargherita.setEditable(false);
        textFieldTotCostMargherita.setColumns(10);
        textFieldTotCostMargherita.setBounds(805, 191, 69, 20);
        contentPane.add(textFieldTotCostMargherita);

        textFieldThirdLiquid = new JTextField();
        textFieldThirdLiquid.setColumns(10);
        textFieldThirdLiquid.setBounds(586, 369, 86, 20);
        contentPane.add(textFieldThirdLiquid);

        textFieldFirstLiquid = new JTextField();
        textFieldFirstLiquid.setColumns(10);
        textFieldFirstLiquid.setBounds(586, 318, 86, 20);
        contentPane.add(textFieldFirstLiquid);

        textFieldSeondLiquid = new JTextField();
        textFieldSeondLiquid.setColumns(10);
        textFieldSeondLiquid.setBounds(586, 344, 86, 20);
        contentPane.add(textFieldSeondLiquid);

        textFieldTotCostFirstLiquid = new JTextField();
        textFieldTotCostFirstLiquid.setEditable(false);
        textFieldTotCostFirstLiquid.setColumns(10);
        textFieldTotCostFirstLiquid.setBounds(806, 318, 86, 20);
        contentPane.add(textFieldTotCostFirstLiquid);

        textFieldTotCostSecondLiquid = new JTextField();
        textFieldTotCostSecondLiquid.setEditable(false);
        textFieldTotCostSecondLiquid.setColumns(10);
        textFieldTotCostSecondLiquid.setBounds(806, 344, 86, 20);
        contentPane.add(textFieldTotCostSecondLiquid);

        textFieldTotCostThirdLiquid = new JTextField();
        textFieldTotCostThirdLiquid.setEditable(false);
        textFieldTotCostThirdLiquid.setColumns(10);
        textFieldTotCostThirdLiquid.setBounds(806, 369, 86, 20);
        contentPane.add(textFieldTotCostThirdLiquid);

        textFieldTotCostLiquids = new JTextField();
        textFieldTotCostLiquids.setEditable(false);
        textFieldTotCostLiquids.setBounds(710, 410, 182, 20);
        contentPane.add(textFieldTotCostLiquids);
        textFieldTotCostLiquids.setColumns(10);

        textFieldTotCostPizzas = new JTextField();
        textFieldTotCostPizzas.setEditable(false);
        textFieldTotCostPizzas.setBounds(788, 241, 104, 20);
        contentPane.add(textFieldTotCostPizzas);
        textFieldTotCostPizzas.setColumns(10);

        textFieldTotCostForEverything = new JTextField();
        textFieldTotCostForEverything.setEditable(false);
        textFieldTotCostForEverything.setBounds(300, 436, 168, 20);
        contentPane.add(textFieldTotCostForEverything);
        textFieldTotCostForEverything.setColumns(10);

        JButton btnCalculate = new JButton("CALCOLA");
        btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnCalculate.setBounds(400, 380, 120, 40);
        contentPane.add(btnCalculate);
        
        lblN_1 = new JLabel("N");
        lblN_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblN_1.setBounds(544, 140, 30, 14);
        contentPane.add(lblN_1);
        
        lblN_2 = new JLabel("N");
        lblN_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblN_2.setBounds(544, 191, 30, 14);
        contentPane.add(lblN_2);
        
        lblN_3 = new JLabel("N");
        lblN_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblN_3.setBounds(544, 325, 30, 14);
        contentPane.add(lblN_3);
        
        lblN_4 = new JLabel("N");
        lblN_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblN_4.setBounds(544, 353, 30, 14);
        contentPane.add(lblN_4);
        
        lblN_5 = new JLabel("N");
        lblN_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblN_5.setBounds(544, 378, 30, 14);
        contentPane.add(lblN_5);
        
        lblTot_2 = new JLabel("TOT");
        lblTot_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTot_2.setBounds(749, 191, 47, 14);
        contentPane.add(lblTot_2);
        
        lblTot_1 = new JLabel("TOT");
        lblTot_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTot_1.setBounds(749, 140, 47, 14);
        contentPane.add(lblTot_1);
        
        lblTot_3 = new JLabel("TOT");
        lblTot_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTot_3.setBounds(749, 322, 47, 14);
        contentPane.add(lblTot_3);
        
        lblTot_4 = new JLabel("TOT");
        lblTot_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTot_4.setBounds(749, 350, 47, 14);
        contentPane.add(lblTot_4);
        
        lblTot_5 = new JLabel("TOT");
        lblTot_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTot_5.setBounds(749, 375, 47, 14);
        contentPane.add(lblTot_5);
        
        lblTotBeverage = new JLabel("TOT. Beverage");
        lblTotBeverage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTotBeverage.setBounds(554, 413, 126, 14);
        contentPane.add(lblTotBeverage);
        
        lblTotPizza = new JLabel("TOT. Pizza");
        lblTotPizza.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTotPizza.setBounds(554, 257, 126, 14);
        contentPane.add(lblTotPizza);
        
        lblCostForEverything = new JLabel("TOT. Cost");
        lblCostForEverything.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblCostForEverything.setBounds(186, 439, 100, 14);
        contentPane.add(lblCostForEverything);
        

        btnBorrowNewTable.setForeground(Color.RED);
        btnBorrowNewTable.setBounds(10, 410, 134, 48);
        contentPane.add(btnBorrowNewTable);
        
        textTableNumber_1 = new JTextField();
        textTableNumber_1.setEditable(false);
        textTableNumber_1.setBounds(131, 30, 47, 20);
        contentPane.add(textTableNumber_1);
        textTableNumber_1.setColumns(10);
        
        btnCloseMeOnly = new JButton("Chiudi finstre singola");
        btnCloseMeOnly.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnCloseMeOnly.setBounds(10, 350, 134, 47);
        contentPane.add(btnCloseMeOnly);
        
        JRadioButton rdbtnTable = new JRadioButton("Consumazione a tavolo");
        rdbtnTable.setBounds(228, 29, 156, 23);
        contentPane.add(rdbtnTable);
        
        JRadioButton rdbtnAsport = new JRadioButton("asporto");
        rdbtnAsport.setBounds(400, 29, 109, 23);
        contentPane.add(rdbtnAsport);
        
        JLabel lblPayment = new JLabel("Metodo Di pagamento");
        lblPayment.setBounds(350, 11, 196, 14);
        contentPane.add(lblPayment);
        
            
        rdbtnTakeAway.setBounds(520, 29, 109, 23);
        contentPane.add(rdbtnTakeAway);
        
        btnCalculate.addActionListener(e -> calculateTotalCost());
    }
   
    private static void borrowNewWindow(JButton jb) {
    	textTableNumber_1.setText("0");
    	
    	jb.addActionListener(e -> {
    		
    		MainFrameRistorante newTable = new MainFrameRistorante();
            totTablesBorrowed++;
                	
            newTable.setVisible(true);
            newTable.setTitle("Table : " + totTablesBorrowed);
            textTableNumber_1.setText(String.valueOf(totTablesBorrowed));
    			
    	});
    	
    	/* 
    	 * stackoverflow
    	 * 
    	 * Problem : 

			While running the code I saw that 2 identical frames pop up. 
			
		   Solution : 
		   
		   	Call your function inside the main instead
    	 */
    }
    private void calculateTotalCost() {
        double marinaraPrice = 4.00;
        double margheritaPrice = 5.00;

        double firstLiquidPrice = 0.50;
        double secondLiquidPrice = 1.00;
        double thirdLiquidPrice = 5.00;

        try {
            int marinaraQty = Integer.parseInt(textField_Marinara.getText().isEmpty() ? "0" : textField_Marinara.getText());
            int margheritaQty = Integer.parseInt(textField_Margherita.getText().isEmpty() ? "0" : textField_Margherita.getText());
            int firstLiquidQty = Integer.parseInt(textFieldFirstLiquid.getText().isEmpty() ? "0" : textFieldFirstLiquid.getText());
            int secondLiquidQty = Integer.parseInt(textFieldSeondLiquid.getText().isEmpty() ? "0" : textFieldSeondLiquid.getText());
            int thirdLiquidQty = Integer.parseInt(textFieldThirdLiquid.getText().isEmpty() ? "0" : textFieldThirdLiquid.getText());
            int paxQty = Integer.parseInt(textTotPeopleField.getText().isEmpty() ? "0" : textTotPeopleField.getText());

            double totalCostMarinara = marinaraPrice * marinaraQty;
            double totalCostMargherita = margheritaPrice * margheritaQty;
            textFieldTotCostMarinara.setText(String.valueOf(totalCostMarinara));
            textFieldTotCostMargherita.setText(String.valueOf(totalCostMargherita));

            double totalCostFirstLiquid = firstLiquidPrice * firstLiquidQty;
            double totalCostSecondLiquid = secondLiquidPrice * secondLiquidQty;
            double totalCostThirdLiquid = thirdLiquidPrice * thirdLiquidQty;
            textFieldTotCostFirstLiquid.setText(String.valueOf(totalCostFirstLiquid));
            textFieldTotCostSecondLiquid.setText(String.valueOf(totalCostSecondLiquid));
            textFieldTotCostThirdLiquid.setText(String.valueOf(totalCostThirdLiquid));

            double totalCostLiquids = totalCostFirstLiquid + totalCostSecondLiquid + totalCostThirdLiquid;
            textFieldTotCostLiquids.setText(String.valueOf(totalCostLiquids));

            double paxCost = 1.00;
            double totalCostPax = paxQty * paxCost;
            textFieldBasicllyYouPutHerePax.setText(String.valueOf(totalCostPax));

            double totalCostPizzas = totalCostMarinara + totalCostMargherita;
            textFieldTotCostPizzas.setText(String.valueOf(totalCostPizzas));
            
            double totalCostForEverything = 0;
            

            // Controllo se il pulsante "Take Away" è selezionato
            if (rdbtnTakeAway.isSelected()) totalCostForEverything = totalCostPax + totalCostPizzas + totalCostLiquids + 10;
            else totalCostForEverything = totalCostPax + totalCostPizzas + totalCostLiquids;
            
            textFieldTotCostForEverything.setText(String.valueOf(totalCostForEverything));
            
            String orders = "Marinara: " + marinaraQty + ", Margherita: " + margheritaQty +
                    ", Primo Liquido: " + firstLiquidQty + ", Secondo Liquido: " + secondLiquidQty +
                    ", Terzo Liquido: " + thirdLiquidQty + ", PAX: " + paxQty +
                    ", Totale: " + totalCostForEverything + ", Tavolo n1 : " + totTablesBorrowed;
            FilaManger fileManager = new FilaManger();
            fileManager.getOrders(orders);
        } catch (NumberFormatException e) {
            textFieldTotCostForEverything.setText("Errore: Inserisci valori numerici validi.");
        }
    }
}
