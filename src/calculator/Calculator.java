package calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	double frist;
	double second;
	double result;
	String operation;
	String answer;
	int zero;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 528);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textField.setBounds(14, 32, 327, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.BLUE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn1.setBounds(10, 364, 74, 57);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.BLUE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn2.setBounds(99, 364, 74, 57);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.BLUE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn3.setBounds(183, 364, 74, 57);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.BLUE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn4.setBounds(10, 293, 74, 57);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.BLUE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn5.setBounds(99, 293, 74, 57);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.BLUE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn6.setBounds(183, 293, 74, 57);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.BLUE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn7.setBounds(10, 220, 74, 57);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.BLUE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn8.setBounds(99, 220, 74, 57);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.BLUE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn9.setBounds(183, 220, 74, 57);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.BLUE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btn0.setBounds(10, 432, 163, 57);
		contentPane.add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setBackground(Color.BLUE);
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnPoint.getText();
				textField.setText(number);
			}
		});
		btnPoint.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnPoint.setBounds(183, 432, 74, 57);
		contentPane.add(btnPoint);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.GREEN);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=frist+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=frist-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=frist/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=frist*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=frist%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}

				
				
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnEqual.setBounds(267, 364, 74, 125);
		contentPane.add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.GREEN);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnPlus.setBounds(267, 293, 74, 57);
		contentPane.add(btnPlus);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.GREEN);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="×";
			}
		});
		btnMul.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMul.setBounds(267, 220, 74, 57);
		contentPane.add(btnMul);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(Color.GREEN);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMinus.setBounds(267, 151, 74, 57);
		contentPane.add(btnMinus);
		
		JButton btnZero = new JButton("C");
		btnZero.setBackground(Color.RED);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnZero.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnZero.setBounds(267, 83, 74, 57);
		contentPane.add(btnZero);
		
		JButton btnDel = new JButton("DEL");
		btnDel.setBackground(Color.RED);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
				}
						
				
			}
		});
		btnDel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnDel.setBounds(149, 83, 108, 57);
		contentPane.add(btnDel);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(Color.GREEN);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnDivide.setBounds(183, 151, 74, 57);
		contentPane.add(btnDivide);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setBackground(Color.GREEN);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPercentage.setBounds(99, 152, 74, 57);
		contentPane.add(btnPercentage);
		
		JButton btnSquare = new JButton("√");
		btnSquare.setBackground(Color.GREEN);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="√";
			}
		});
		btnSquare.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnSquare.setBounds(10, 151, 74, 57);
		contentPane.add(btnSquare);
		
		JRadioButton rdbtnon = new JRadioButton(" on");
		rdbtnon.setBackground(Color.ORANGE);
		rdbtnon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnDel.setEnabled(true);
				btnZero.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMinus.setEnabled(true);
				btnPlus.setEnabled(true);
				btnMul.setEnabled(true);
				btnSquare.setEnabled(true);
				btnPoint.setEnabled(true);
				btnPercentage.setEnabled(true);
				btnEqual.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnon);
		rdbtnon.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rdbtnon.setBounds(14, 79, 101, 33);
		contentPane.add(rdbtnon);
		
		JRadioButton rdbtnoff = new JRadioButton(" off");
		rdbtnoff.setBackground(Color.ORANGE);
		rdbtnoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnDel.setEnabled(false);
				btnZero.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMinus.setEnabled(false);
				btnPlus.setEnabled(false);
				btnMul.setEnabled(false);
				btnSquare.setEnabled(false);
				btnPoint.setEnabled(false);
				btnPercentage.setEnabled(false);
				btnEqual.setEnabled(false);
				textField.setEnabled(false); 
				
			}
		});
		buttonGroup.add(rdbtnoff);
		rdbtnoff.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rdbtnoff.setBounds(14, 112, 101, 33);
		contentPane.add(rdbtnoff);
	}
}
