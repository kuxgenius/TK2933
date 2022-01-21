package Project2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

public class CafeOrder {

	public JFrame frmCocoffeeHut;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	private String[] cocoString = {" ","Superior Coco","Hazelnut Coco","Horlicks Malty Coco","Strawberry Coco","Coco Smoothies with Oreo Cookie Pieces"};
	private String[] coffeeString = {" ","Coffee Smoothies","Americano","Wake-me-up Latte","Cocoa Mocha","Specialty Latte"};
	
	//Combobox Coco
	private JLabel lblCoco;
	private JComboBox comboBoxCoco;
	//Combobox Coffee
	private JLabel lblCoffee;
	private JComboBox comboBoxCoffee;
	//Rd Size
	private JLabel lblSize;
	private JRadioButton rdbtnRegular;
	private JRadioButton rdbtnLarge;
	private ButtonGroup bgSize;
	//Rd Flavor
	private JLabel lblFlavor;
	private JRadioButton rdbtnFVanilla;
	private JRadioButton rdbtnFHazelnut;
	private JRadioButton rdbtnFCaramel;
	private ButtonGroup bgFlavor;
	//Checkbox Topping
	private JLabel lblTopping;
	private JCheckBox chckbxPearl;
	private JCheckBox chckbxGjelly;
	private JCheckBox chckbxChia;
	private JCheckBox chckbxCoconut;
	private JCheckBox chckbxPudding;
	private JCheckBox chckbxOreo;
	private JCheckBox chckbxAloe;
	private JCheckBox chckbxRedbean;
	private JCheckBox chckbxGoldPearl;
	private JCheckBox chckbxCreamFoam;
	//Button Add Quantity
	private JButton btnMinusUnit;
	private JLabel lblUnit;
	private JButton btnAddUnit;
	//Price label
	private JLabel lbPrice;
	private JLabel lblShowPrice;
	//Image icon
	private Image icon1;
	private JLabel lblImage;
	
	//process variable
	double price;
	int unit = 1;
	int slctTopping = 0;
	public ArrayList<JCheckBox> Toppings;
	public ArrayList<addOrder> oList = new ArrayList<addOrder>();
	
	//based product price
	private final double baseCoco1 = 6.50;
	private final double baseCoco2 = 6.50;
	private final double baseCoco3 = 6.50;
	private final double baseCoco4 = 6.50;
	private final double baseCoco5 = 8.50;
	private final double baseCoffee1 = 8.50;
	private final double baseCoffee2 = 6.50;
	private final double baseCoffee3 = 6.50;
	private final double baseCoffee4 = 6.50;
	private final double baseCoffee5 = 6.50;
	private JButton btnCancel;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeOrder window = new CafeOrder();
					window.frmCocoffeeHut.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public CafeOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		unit = 1;
		slctTopping = 0;
		
		frmCocoffeeHut = new JFrame();
		frmCocoffeeHut.setTitle("Cocoffee Hut");
		frmCocoffeeHut.setBounds(100, 100, 450, 550);
		frmCocoffeeHut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCocoffeeHut.getContentPane().setLayout(null);
		
		ActionListener cbAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBoxCoco) {
					JComboBox cb = (JComboBox)e.getSource();
					int selected = cb.getSelectedIndex();
					switch (selected) {
						case 0:
							comboBoxCoffee.setEnabled(true);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							setPrice();
							break;
						case 1:
							//Superior Coco
							comboBoxCoffee.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							setPrice();
							break;
						case 2:
							//Hazelnut Coco
							comboBoxCoffee.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							setPrice();
							break;
						case 3:
							//Horlicks Malty Coco
							comboBoxCoffee.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							setPrice();
							break;
						case 4:
							//Strawberry Coco
							comboBoxCoffee.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							setPrice();
							break;
						case 5:
							//Coco Smoothies with Oreo Cookie Pieces
							comboBoxCoffee.setEnabled(false);
							rdbtnRegular.setEnabled(false);
							rdbtnLarge.setSelected(true);
							setPrice();
							break;
					}
				}
				else if (e.getSource() == comboBoxCoffee) {
					JComboBox cb = (JComboBox)e.getSource();
					int selected = cb.getSelectedIndex();
					switch (selected) {
						case 0:
							comboBoxCoco.setEnabled(true);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							lblFlavor.setVisible(false);
							rdbtnFVanilla.setVisible(false);
							rdbtnFHazelnut.setVisible(false);
							rdbtnFCaramel.setVisible(false);
							setPrice();
							break;
						case 1:
							//Coffee Smoothies
							comboBoxCoco.setEnabled(false);
							rdbtnRegular.setEnabled(false);
							rdbtnLarge.setSelected(true);
							lblFlavor.setVisible(false);
							rdbtnFVanilla.setVisible(false);
							rdbtnFHazelnut.setVisible(false);
							rdbtnFCaramel.setVisible(false);
							setPrice();
							break;
						case 2:
							//Americano
							comboBoxCoco.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							lblFlavor.setVisible(false);
							rdbtnFVanilla.setVisible(false);
							rdbtnFHazelnut.setVisible(false);
							rdbtnFCaramel.setVisible(false);
							setPrice();
							break;
						case 3:
							//Wake-me-up Latte
							comboBoxCoco.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							lblFlavor.setVisible(false);
							rdbtnFVanilla.setVisible(false);
							rdbtnFHazelnut.setVisible(false);
							rdbtnFCaramel.setVisible(false);
							setPrice();
							break;
						case 4:
							//Cocoa Mocha
							comboBoxCoco.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							lblFlavor.setVisible(false);
							rdbtnFVanilla.setVisible(false);
							rdbtnFHazelnut.setVisible(false);
							rdbtnFCaramel.setVisible(false);
							setPrice();
							break;
						case 5:
							//Specialty Latte
							comboBoxCoco.setEnabled(false);
							rdbtnRegular.setEnabled(true);
							rdbtnRegular.setSelected(true);
							lblFlavor.setVisible(true);
							rdbtnFVanilla.setVisible(true);
							rdbtnFVanilla.setSelected(true);
							rdbtnFHazelnut.setVisible(true);
							rdbtnFCaramel.setVisible(true);
							setPrice();
							break;
					}
				}
			}
		};
		
		ActionListener chckBoxAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkBox = (JCheckBox) e.getSource();
				if (chkBox.isSelected()) {
					slctTopping++;
					if (slctTopping>=4) {
						for(JCheckBox topp : Toppings) {
							if(!topp.isSelected())
								topp.setEnabled(false);
						}
					}
					setPrice();
				}
				else {
					slctTopping--;
					if (slctTopping<4) {
						for(JCheckBox topp : Toppings) {
							if(!topp.isSelected())
								topp.setEnabled(true);
						}
					}
					setPrice();
				}
			}
		};
		
		ActionListener sizeAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setPrice();				
			}
		};
		
		lblCoco = new JLabel("Coco");
		lblCoco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCoco.setBounds(10, 22, 46, 14);
		frmCocoffeeHut.getContentPane().add(lblCoco);
		
		comboBoxCoco = new JComboBox(cocoString);
		comboBoxCoco.setBounds(10, 47, 257, 22);
		frmCocoffeeHut.getContentPane().add(comboBoxCoco);
		comboBoxCoco.addActionListener(cbAction);
				
		lblCoffee = new JLabel("Coffee");
		lblCoffee.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCoffee.setBounds(10, 80, 46, 14);
		frmCocoffeeHut.getContentPane().add(lblCoffee);
		
		comboBoxCoffee = new JComboBox(coffeeString);
		comboBoxCoffee.setBounds(10, 105, 257, 22);
		frmCocoffeeHut.getContentPane().add(comboBoxCoffee);
		comboBoxCoffee.addActionListener(cbAction);
		
		lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSize.setBounds(10, 138, 46, 14);
		frmCocoffeeHut.getContentPane().add(lblSize);
		
		rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setSelected(true);
		rdbtnRegular.setBounds(20, 159, 81, 23);
		frmCocoffeeHut.getContentPane().add(rdbtnRegular);
		rdbtnRegular.addActionListener(sizeAction);
		
		rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setBounds(103, 159, 81, 23);
		frmCocoffeeHut.getContentPane().add(rdbtnLarge);
		rdbtnLarge.addActionListener(sizeAction);
		
		//Group radio button size
		bgSize = new ButtonGroup();
		bgSize.add(rdbtnRegular);
		bgSize.add(rdbtnLarge);
		
		lblTopping = new JLabel("Topping (Up to 4 selection)");
		lblTopping.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTopping.setBounds(10, 221, 174, 14);
		frmCocoffeeHut.getContentPane().add(lblTopping);
		
		Toppings = new ArrayList<JCheckBox>();
		
		chckbxPearl = new JCheckBox("Pearl +1.10");
		chckbxPearl.setBounds(20, 242, 147, 23);
		frmCocoffeeHut.getContentPane().add(chckbxPearl);
		chckbxPearl.addActionListener(chckBoxAction);
		Toppings.add(chckbxPearl);
		
		chckbxGjelly = new JCheckBox("Grass Jelly +1.10");
		chckbxGjelly.setBounds(20, 268, 147, 23);
		frmCocoffeeHut.getContentPane().add(chckbxGjelly);
		chckbxGjelly.addActionListener(chckBoxAction);
		Toppings.add(chckbxGjelly);
		
		chckbxChia = new JCheckBox("Organic Chia Seed +1.10");
		chckbxChia.setBounds(20, 294, 164, 23);
		frmCocoffeeHut.getContentPane().add(chckbxChia);
		chckbxChia.addActionListener(chckBoxAction);
		Toppings.add(chckbxChia);
		
		chckbxCoconut = new JCheckBox("Coconut Jelly +1.10");
		chckbxCoconut.setBounds(20, 320, 147, 23);
		frmCocoffeeHut.getContentPane().add(chckbxCoconut);
		chckbxCoconut.addActionListener(chckBoxAction);
		Toppings.add(chckbxCoconut);
		
		chckbxPudding = new JCheckBox("Pudding +1.10");
		chckbxPudding.setBounds(20, 346, 147, 23);
		frmCocoffeeHut.getContentPane().add(chckbxPudding);
		chckbxPudding.addActionListener(chckBoxAction);
		Toppings.add(chckbxPudding);
		
		chckbxOreo = new JCheckBox("Oreo Cookies Pieces +1.10");
		chckbxOreo.setBounds(207, 242, 185, 23);
		frmCocoffeeHut.getContentPane().add(chckbxOreo);
		chckbxOreo.addActionListener(chckBoxAction);
		Toppings.add(chckbxOreo);
		
		chckbxAloe = new JCheckBox("Aloe Vera +1.60");
		chckbxAloe.setBounds(207, 268, 147, 23);
		frmCocoffeeHut.getContentPane().add(chckbxAloe);
		chckbxAloe.addActionListener(chckBoxAction);
		Toppings.add(chckbxAloe);
		
		chckbxRedbean = new JCheckBox("Red Bean +1.60");
		chckbxRedbean.setBounds(207, 294, 129, 23);
		frmCocoffeeHut.getContentPane().add(chckbxRedbean);
		chckbxRedbean.addActionListener(chckBoxAction);
		Toppings.add(chckbxRedbean);
		
		chckbxGoldPearl = new JCheckBox("Gold Pearl +2.20");
		chckbxGoldPearl.setBounds(207, 320, 121, 23);
		frmCocoffeeHut.getContentPane().add(chckbxGoldPearl);
		chckbxGoldPearl.addActionListener(chckBoxAction);
		Toppings.add(chckbxGoldPearl);
		
		chckbxCreamFoam = new JCheckBox("Vanilla Cream Form +3.50");
		chckbxCreamFoam.setBounds(207, 346, 185, 23);
		frmCocoffeeHut.getContentPane().add(chckbxCreamFoam);
		chckbxCreamFoam.addActionListener(chckBoxAction);
		Toppings.add(chckbxCreamFoam);
		
		lblFlavor = new JLabel("Flavor");
		lblFlavor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFlavor.setBounds(207, 139, 46, 14);
		frmCocoffeeHut.getContentPane().add(lblFlavor);
		lblFlavor.setVisible(false);

		
		rdbtnFVanilla = new JRadioButton("Vanilla");
		rdbtnFVanilla.setBounds(207, 159, 81, 23);
		frmCocoffeeHut.getContentPane().add(rdbtnFVanilla);
		rdbtnFVanilla.setVisible(false);
		
		rdbtnFHazelnut = new JRadioButton("Hazelnut");
		rdbtnFHazelnut.setBounds(294, 159, 109, 23);
		frmCocoffeeHut.getContentPane().add(rdbtnFHazelnut);
		rdbtnFHazelnut.setVisible(false);
		
		rdbtnFCaramel = new JRadioButton("Caramel");
		rdbtnFCaramel.setBounds(207, 185, 109, 23);
		frmCocoffeeHut.getContentPane().add(rdbtnFCaramel);
		rdbtnFCaramel.setVisible(false);
		
		//Group radio button flavor
		bgFlavor = new ButtonGroup();
		bgFlavor.add(rdbtnFVanilla);
		bgFlavor.add(rdbtnFHazelnut);
		bgFlavor.add(rdbtnFCaramel);
		
		btnMinusUnit = new JButton("-");
		btnMinusUnit.setEnabled(false);
		btnMinusUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unit--;
				if (unit<=1)
					btnMinusUnit.setEnabled(false);
				else if(unit>=10)
					btnAddUnit.setEnabled(false);
				else {
					btnMinusUnit.setEnabled(true);
					btnAddUnit.setEnabled(true);
				}
				setPrice();
				lblUnit.setText(String.valueOf(unit));
			}
		});
		btnMinusUnit.setBounds(74, 395, 89, 23);
		frmCocoffeeHut.getContentPane().add(btnMinusUnit);
		
		lblUnit = new JLabel(String.valueOf(unit));
		lblUnit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUnit.setBounds(190, 399, 18, 14);
		frmCocoffeeHut.getContentPane().add(lblUnit);
		
		btnAddUnit = new JButton("+");
		btnAddUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unit++;
				if(unit<=1)
					btnMinusUnit.setEnabled(false);
				else if(unit>=10)
					btnAddUnit.setEnabled(false);
				else {
					btnMinusUnit.setEnabled(true);
					btnAddUnit.setEnabled(true);
				}
				setPrice();
				lblUnit.setText(String.valueOf(unit));
			}
		});
		btnAddUnit.setBounds(229, 395, 89, 23);
		frmCocoffeeHut.getContentPane().add(btnAddUnit);
		
		lbPrice = new JLabel("Price : RM");
		lbPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbPrice.setBounds(32, 468, 74, 22);
		frmCocoffeeHut.getContentPane().add(lbPrice);
		
		lblShowPrice = new JLabel(String.valueOf(df.format(price)));
		lblShowPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShowPrice.setBounds(116, 472, 109, 14);
		frmCocoffeeHut.getContentPane().add(lblShowPrice);
		
		icon1 = new ImageIcon(getClass().getResource("logo.png")).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		lblImage = new JLabel("");
		lblImage.setBounds(277, 11, 150, 150);
		frmCocoffeeHut.getContentPane().add(lblImage);
		lblImage.setIcon(new ImageIcon(icon1));
		
		JButton btnAddOrder = new JButton("Add Order");
		btnAddOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validate()) {
					submitOrder();
					frmCocoffeeHut.dispose();
				}
				else {
					JOptionPane.showMessageDialog(frmCocoffeeHut,"Please select a drink!","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAddOrder.setBounds(229, 470, 98, 23);
		frmCocoffeeHut.getContentPane().add(btnAddOrder);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null,"Are you sure?","Cancel Order",JOptionPane.OK_CANCEL_OPTION);
				if (n == 0)
					frmCocoffeeHut.dispose();
			}
		});
		btnCancel.setBounds(329, 470, 98, 23);
		frmCocoffeeHut.getContentPane().add(btnCancel);
		
	}
	
	public void setPrice() {
		//get combobox selection price
		System.out.println("Check");
		if (comboBoxCoco.isEnabled()) {
			switch(comboBoxCoco.getSelectedIndex()) {
			case 0:
				price = 0.00;
				break;
			case 1:
				price = baseCoco1;
				break;
			case 2:
				price = baseCoco2;
				break;
			case 3:
				price = baseCoco3;
				break;
			case 4:
				price = baseCoco4;
				break;
			case 5:
				price = baseCoco5;
				break;
			}
		}
		
		else if (comboBoxCoffee.isEnabled()) {
			switch(comboBoxCoffee.getSelectedIndex()) {
			case 0:
				price = 0.00;
				break;
			case 1:
				price = baseCoffee1;
				break;
			case 2:
				price = baseCoffee2;
				break;
			case 3:
				price = baseCoffee3;
				break;
			case 4:
				price = baseCoffee4;
				break;
			case 5:
				price = baseCoffee5;
				break;
			}
		}
		
		//calculate topping price
		for(JCheckBox top:Toppings) {
			if (top.isSelected() && (top.equals(chckbxPearl)||top.equals(chckbxGjelly)||top.equals(chckbxChia)||top.equals(chckbxCoconut)||top.equals(chckbxPudding)||top.equals(chckbxOreo)))
				price += 1.10;
			else if (top.isSelected() && (top.equals(chckbxAloe)||top.equals(chckbxRedbean)))
				price += 1.60;
			else if (top.isSelected() && top.equals(chckbxGoldPearl))
				price += 2.20;
			else if (top.isSelected() && top.equals(chckbxCreamFoam))
				price += 3.50;
		}
		
		//calculate cup size price
		if(rdbtnLarge.isSelected()) {
			if(!(comboBoxCoco.getSelectedIndex()==5 || comboBoxCoffee.getSelectedIndex()==1))
				price += 1.50;
		}
		
		//calculate unit price
		price *= unit;
		double out = Math.round(price * 100.0) / 100.0;
		lblShowPrice.setText(String.valueOf(df.format(out)));
	}
	
	public void submitOrder() {
		addOrder order = new addOrder();
		
		String si="",fl="",sl="",mOrder;
		
		//set main order (combobox + flavor + size)
		if (rdbtnRegular.isSelected())
			si = "Regular";
		else if (rdbtnLarge.isSelected())
			si = "Large";

		if (comboBoxCoco.isEnabled()) {
			switch(comboBoxCoco.getSelectedIndex()) {
			case 1:
				sl = "Superior Coco";
				break;
			case 2:
				sl = "Hazelnut Coco";
				break;
			case 3:
				sl = "Horlicks Malty Coco";
				break;
			case 4:
				sl = "Strawberry Coco";
				break;
			case 5:
				sl = "Coco Smoothies with Oreo Cookie Pieces";
				break;
			}
		}
		
		else if (comboBoxCoffee.isEnabled()) {
			switch(comboBoxCoffee.getSelectedIndex()) {
			case 1:
				sl = "Coffee Smoothies";
				break;
			case 2:
				sl = "Americano";
				break;
			case 3:
				sl = "Wake-me-up Latte";
				break;
			case 4:
				sl = "Cocoa Mocha";
				break;
			case 5:
				sl = "Specialty Latte";
				if (rdbtnFVanilla.isSelected())
					fl = "Vanilla";
				else if(rdbtnFHazelnut.isSelected())
					fl = "Hazelnut";
				else if(rdbtnFCaramel.isSelected())
					fl = "Caramel";
				break;
			}
		}
		
		mOrder = sl + " " + fl + " - " + si;
		System.out.println(mOrder);
		order.setmainOrder(mOrder);
		
		int n=0;
		String[] tp = new String[4];
		for(JCheckBox top:Toppings) {
			if (top.isSelected()) {
				tp[n] = top.getText();
				n++;
			}
		}
		order.addToppings(tp);
		
		order.setUnit(unit);
		order.setPrice(price);
		
		oList.add(order);
		
		//MainFrame mf = new MainFrame();
		MainFrame.printOrder(oList);
	}
	
	public boolean validate() {
		if (comboBoxCoco.isEnabled() && (comboBoxCoco.getSelectedIndex() >= 1 && comboBoxCoco.getSelectedIndex() <= 5))
			return true;
		else if (comboBoxCoffee.isEnabled() && (comboBoxCoffee.getSelectedIndex() >= 1 && comboBoxCoffee.getSelectedIndex() <= 5))
			return true;
		else
			return false;
	}
}
