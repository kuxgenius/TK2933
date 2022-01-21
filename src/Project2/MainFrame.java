package Project2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MainFrame {

	private JFrame frmWelcomeToCocoffee;
	
	static JTextPane textPaneShow;
	JButton btnAddOrder;
	JButton btnPayment;
	JButton btnNextOrder;
	JLabel lblPrintPayment;
	JLabel lblPrintBalance;
	JScrollPane scrollPane;
	static JLabel lblPrintTotal;
	
	double payment=0.00,balance=0.00;
	static double totalPrice=0.00;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					//window.
					window.frmWelcomeToCocoffee.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmWelcomeToCocoffee = new JFrame();
		frmWelcomeToCocoffee.setTitle("Welcome to Cocoffee Hut");
		frmWelcomeToCocoffee.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmWelcomeToCocoffee.setBounds(100, 100, 450, 500);
		frmWelcomeToCocoffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToCocoffee.getContentPane().setLayout(null);
		CafeOrder order = new CafeOrder();
		JLabel lblNewLabel = new JLabel("Welcome to Cocoffee Hut");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(95, 11, 242, 39);
		frmWelcomeToCocoffee.getContentPane().add(lblNewLabel);
		
		btnAddOrder = new JButton("Order Drinks");
		btnAddOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.initialize();
				order.frmCocoffeeHut.setVisible(true);
			}
		});
		btnAddOrder.setBounds(10, 83, 121, 23);
		frmWelcomeToCocoffee.getContentPane().add(btnAddOrder);
		
		JLabel lblNewLabel_1 = new JLabel("Current Order");
		lblNewLabel_1.setBounds(10, 205, 82, 14);
		frmWelcomeToCocoffee.getContentPane().add(lblNewLabel_1);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Enter Payment");
				payment = Double.parseDouble(input);
				lblPrintPayment.setText(String.valueOf(df.format(payment)));
				balance = payment - totalPrice;
				if (balance < 0)
					lblPrintBalance.setForeground(Color.RED);
				else
					lblPrintBalance.setForeground(Color.GREEN);
				lblPrintBalance.setText(String.valueOf(df.format(balance)));
			}
		});
		btnPayment.setBounds(157, 83, 121, 23);
		frmWelcomeToCocoffee.getContentPane().add(btnPayment);
		
		JButton btnNextOrder = new JButton("Next Order");
		btnNextOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNextOrder.setBounds(296, 83, 121, 23);
		frmWelcomeToCocoffee.getContentPane().add(btnNextOrder);
		
		JLabel lblNewLabel_2 = new JLabel("Total Price");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 117, 107, 23);
		frmWelcomeToCocoffee.getContentPane().add(lblNewLabel_2);
		
		lblPrintTotal = new JLabel(String.valueOf(df.format(totalPrice)));
		lblPrintTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrintTotal.setBounds(34, 151, 107, 23);
		frmWelcomeToCocoffee.getContentPane().add(lblPrintTotal);
		
		JLabel lblNewLabel_4 = new JLabel("Payment");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(146, 117, 107, 23);
		frmWelcomeToCocoffee.getContentPane().add(lblNewLabel_4);
		
		lblPrintPayment = new JLabel(String.valueOf(df.format(payment)));
		lblPrintPayment.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrintPayment.setBounds(156, 151, 83, 23);
		frmWelcomeToCocoffee.getContentPane().add(lblPrintPayment);
		
		JLabel lblNewLabel_6 = new JLabel("Balance");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(278, 117, 66, 23);
		frmWelcomeToCocoffee.getContentPane().add(lblNewLabel_6);
		
		lblPrintBalance = new JLabel(String.valueOf(df.format(balance)));
		lblPrintBalance.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrintBalance.setBounds(296, 149, 83, 27);
		frmWelcomeToCocoffee.getContentPane().add(lblPrintBalance);
		
		textPaneShow = new JTextPane();
		textPaneShow.setContentType("text");
		textPaneShow.setText(" ");
		//textPaneShow.setBounds(10, 230, 414, 220);
		//frmWelcomeToCocoffee.getContentPane().add(textPaneShow);
		
		scrollPane = new JScrollPane(textPaneShow);
		scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 230, 414, 220);
		frmWelcomeToCocoffee.getContentPane().add(scrollPane);
	}
	
	public static void printOrder(ArrayList<addOrder> ol) {
		totalPrice = 0.00;
		String txt = "Menu \t\t\tQty.\tPrice";
		for(addOrder order:ol ) {
			String mo = order.getMainOrder();
			String[] tp = order.getToppings();
			int u = order.getUnit();
			double p = order.getPrice();
			
			txt += "\n"+mo+"\n"
					+"\t\t\t"+u+"\t"+df.format(p);
			
			for(int i=0;i<tp.length;i++) {
				if(tp[i] != null)
					txt += "\n\t"+tp[i];
			}
			txt += "\n";
			totalPrice += p;
			lblPrintTotal.setText(String.valueOf(df.format(totalPrice)));
			
		}
		System.out.println(txt);
		textPaneShow.setText(txt);
	}
	
	public void reset() {
		totalPrice=0.00;
		frmWelcomeToCocoffee.dispose();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					//window.
					window.frmWelcomeToCocoffee.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
