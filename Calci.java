package com.dhanu.calci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


/**
 * 
 */
public class Calci {

	private JFrame frmCalculator;
	private JTextField textField;
	double first;
	double second;
	String operation;
	double result;
	String answer;

	ButtonGroup group =new ButtonGroup();
	void disable() {
		textField.setEnabled(false);
	
	
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmCalculator = new JFrame();
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adhan\\Downloads\\calculator.png"));
		frmCalculator.setForeground(new Color(0, 0, 0));
		frmCalculator.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 403, 471);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 368, 70);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		

		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setFont(new Font("Windings", Font.BOLD, 18));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField.getText().length() > 0 ) {
					StringBuilder sb= new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					backSpace=sb.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnBackSpace.setBounds(10, 113, 85, 57);
		frmCalculator.getContentPane().add(btnBackSpace);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);

			}
		});
		btn7.setBounds(10, 177, 85, 57);
		frmCalculator.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btn4.getText();
				textField.setText(number);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 242, 85, 57);
		frmCalculator.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 306, 85, 57);
		frmCalculator.getContentPane().add(btn1);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(10, 367, 85, 57);
		frmCalculator.getContentPane().add(btn0);
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(199, 113, 85, 57);
		frmCalculator.getContentPane().add(btn00);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();;
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(199, 177, 85, 57);
		frmCalculator.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(199, 242, 85, 57);
		frmCalculator.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(199, 306, 85, 57);
		frmCalculator.getContentPane().add(btn3);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operation == "*") {
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operation == "/") {
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operation == "%") {
					result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(199, 367, 85, 57);
		frmCalculator.getContentPane().add(btnEqual);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("", Font.BOLD, 18));
		btnClear.setBounds(104, 113, 85, 57);
		frmCalculator.getContentPane().add(btnClear);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(104, 177, 85, 57);
		frmCalculator.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btn5.getText();
				textField.setText(number);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(104, 242, 85, 57);
		frmCalculator.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String number = textField.getText() + btn2.getText();
				textField.setText(number);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(104, 306, 85, 57);
		frmCalculator.getContentPane().add(btn2);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= textField.getText()+btnDot.getText();
				textField.setText(name);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(104, 367, 85, 57);
		frmCalculator.getContentPane().add(btnDot);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(293, 113, 85, 57);
		frmCalculator.getContentPane().add(btnPercent);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(293, 177, 85, 57);
		frmCalculator.getContentPane().add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(293, 242, 85, 57);
		frmCalculator.getContentPane().add(btnSub);

		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(293, 306, 85, 57);
		frmCalculator.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(293, 367, 85, 57);
		frmCalculator.getContentPane().add(btnDivide);
		
		
		JRadioButton btnOn = new JRadioButton("ON");
		btnOn.setSelected(true);
		group.add(btnOn);
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				btn0.setEnabled(true);
				btn00.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPercent.setEnabled(true);
				btnDot.setEnabled(true);
				btnClear.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnEqual.setEnabled(true);
				

				

			}
		});
		

		btnOn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOn.setBounds(10, 86, 49, 21);
		frmCalculator.getContentPane().add(btnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(false);
		group.add(rdbtnOff);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(false);
				btn0.setEnabled(false);
				btn00.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPercent.setEnabled(false);
				btnDot.setEnabled(false);
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnEqual.setEnabled(false);
				

			}
		});
		
	
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOff.setBounds(61, 86, 54, 21);
		frmCalculator.getContentPane().add(rdbtnOff);
	}
}
