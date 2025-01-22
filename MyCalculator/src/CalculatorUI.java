import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorUI extends JFrame implements ActionListener{
	
	static int value1;
	static int value2;
	static int equals;
	
	JPanel topPanel;
	JPanel midPanel;
	JPanel bottomPanel;
	JPanel extraPanel;
	JPanel displayPanel;
	
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonAdd;
	JButton buttonSub;
	JButton buttonDiv;
	JButton buttonEquals;
	JButton buttonDecimal;
	JButton buttonErase;
	
	JLabel textDisplay;
	JLabel catLabel;
	
	ImageIcon catIcon = new ImageIcon("images.jpg");
	ImageIcon catIcon2 = new ImageIcon("images (1).jpg");
	
	CalculatorUI(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setTitle("Simple Calculator");
		this.setLayout(new FlowLayout());
		this.setIconImage(catIcon.getImage());
		
		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(500,80));
		topPanel.setBackground(Color.PINK);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		catLabel = new JLabel();
		catLabel.setIcon(catIcon2);

		displayPanel = new JPanel();
		displayPanel.setPreferredSize(new Dimension(350,70));
		displayPanel.setForeground(new Color(0x1B03A3));
		displayPanel.setBackground(Color.BLACK);
		displayPanel.setLayout(new BorderLayout());
		
		textDisplay = new JLabel();
		textDisplay.setFont(new Font("Monospaced",Font.BOLD, 30));
		textDisplay.setForeground(Color.pink);
		textDisplay.setBackground(Color.blue);
		
		displayPanel.add(textDisplay, BorderLayout.EAST);
		
		
		topPanel.add(catLabel);
		topPanel.add(displayPanel);
		
		
		midPanel = new JPanel();
		midPanel.setPreferredSize(new Dimension(500,295));
		midPanel.setBackground(Color.PINK);
		midPanel.setLayout(new GridLayout(4,4,3,3));
		
		buttonAdd = new JButton("+");
		buttonAdd.setForeground(Color.pink);
		buttonAdd.setBackground(Color.black);
		buttonAdd.setFocusable(false);
		buttonAdd.setFont(new Font("Monospaced",Font.PLAIN ,30));
		buttonAdd.addActionListener(this);
		
		buttonSub = new JButton("-");
		buttonSub.setForeground(Color.pink);
		buttonSub.setBackground(Color.black);
		buttonSub.setFocusable(false);
		buttonSub.setFont(new Font("Monospaced",Font.PLAIN ,30));
		buttonSub.addActionListener(this);
		
		buttonDiv = new JButton("/");
		buttonDiv.setForeground(Color.pink);
		buttonDiv.setBackground(Color.black);
		buttonDiv.setFocusable(false);
		buttonDiv.setFont(new Font("Monospaced",Font.PLAIN ,30));
		buttonDiv.addActionListener(this);
		
		buttonEquals = new JButton("=");
		buttonEquals.setForeground(Color.pink);
		buttonEquals.setBackground(Color.black);
		buttonEquals.setFocusable(false);
		buttonEquals.setFont(new Font("Monospaced",Font.PLAIN ,30));
		buttonEquals.addActionListener(this);
		
		buttonDecimal = new JButton(".");
		buttonDecimal.setForeground(Color.pink);
		buttonDecimal.setBackground(Color.black);
		buttonDecimal.setFocusable(false);
		buttonDecimal.setFont(new Font("Monospaced",Font.PLAIN ,30));
		buttonDecimal.addActionListener(this);
		
		buttonErase = new JButton("Clear");
		buttonErase.setForeground(Color.pink);
		buttonErase.setBackground(Color.black);
		buttonErase.setFocusable(false);
		buttonErase.setFont(new Font("Monospaced",Font.BOLD , 20));
		buttonErase.addActionListener(this);
		
		button1 = new JButton("1");
		button1.setForeground(Color.pink);
		button1.setBackground(Color.black);
		button1.setFocusable(false);
		button1.setFont(new Font("Monospaced",Font.BOLD ,20));
		button1.addActionListener(this);
		
		button2 = new JButton("2");
		button2.setForeground(Color.pink);
		button2.setBackground(Color.black);
		button2.setFocusable(false);
		button2.setFont(new Font("Monospaced",Font.BOLD ,20));
		button2.addActionListener(this);
		
		button3 = new JButton("3");
		button3.setForeground(Color.pink);
		button3.setBackground(Color.black);
		button3.setFocusable(false);
		button3.setFont(new Font("Monospaced",Font.BOLD ,20));
		button3.addActionListener(this);
		
		button4 = new JButton("4");
		button4.setForeground(Color.pink);
		button4.setBackground(Color.black);
		button4.setFocusable(false);
		button4.setFont(new Font("Monospaced",Font.BOLD ,20));
		button4.addActionListener(this);
		
		button5 = new JButton("5");
		button5.setForeground(Color.pink);
		button5.setBackground(Color.black);
		button5.setFocusable(false);
		button5.setFont(new Font("Monospaced",Font.BOLD ,20));
		button5.addActionListener(this);
		
		button6 = new JButton("6");
		button6.setForeground(Color.pink);
		button6.setBackground(Color.black);
		button6.setFocusable(false);
		button6.setFont(new Font("Monospaced",Font.BOLD ,20));
		button6.addActionListener(this);
		
		button7 = new JButton("7");
		button7.setForeground(Color.pink);
		button7.setBackground(Color.black);
		button7.setFocusable(false);
		button7.setFont(new Font("Monospaced",Font.BOLD ,20));
		button7.addActionListener(this);
		
		button8 = new JButton("8");
		button8.setForeground(Color.pink);
		button8.setBackground(Color.black);
		button8.setFocusable(false);
		button8.setFont(new Font("Monospaced",Font.BOLD ,20));
		button8.addActionListener(this);
		
		button9 = new JButton("9");
		button9.setForeground(Color.pink);
		button9.setBackground(Color.black);
		button9.setFocusable(false);
		button9.setFont(new Font("Monospaced",Font.BOLD ,20));
		button9.addActionListener(this);
		
		button0 = new JButton("0");
		button0.setForeground(Color.pink);
		button0.setBackground(Color.black);
		button0.setFocusable(false);
		button0.setFont(new Font("Monospaced",Font.BOLD ,20));
		button0.addActionListener(this);
		
		midPanel.add(button1);
		midPanel.add(button2);
		midPanel.add(button3);
		midPanel.add(buttonAdd);
		midPanel.add(button4);
		midPanel.add(button5);
		midPanel.add(button6);
		midPanel.add(buttonSub);
		midPanel.add(button7);
		midPanel.add(button8);
		midPanel.add(button9);
		midPanel.add(buttonDiv);
		midPanel.add(buttonDecimal);
		midPanel.add(button0);
		midPanel.add(buttonErase);
		midPanel.add(buttonEquals);
		
		JLabel patata = new JLabel();
		patata.setText("PATATAS");
		patata.setFont(new Font("Monospaced", Font.BOLD, 50));
		patata.setForeground(Color.PINK);
		
		
		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(500,80));
		bottomPanel.setBackground(Color.BLACK);
		bottomPanel.add(patata);
		
		this.setResizable(false);
		this.add(topPanel);
		this.add(midPanel);
		this.add(bottomPanel);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button1) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("1");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("1"));
			}
		}
		
		else if (e.getSource()==button2) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("2");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("2"));
			}
		}
		
		else if (e.getSource()==button3) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("3");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("3"));
			}
		}
		
		else if (e.getSource()==button4) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("4");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("4"));
			}
		}
		
		else if (e.getSource()==button5) {
			
			if (textDisplay.getText().isEmpty()) {
				textDisplay.setText("5");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("5"));
			}
		}
		
		else if (e.getSource()==button6) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("6");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("6"));
			}
		}
		
		else if (e.getSource()==button7) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("7");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("7"));
			}
		}
		
		else if (e.getSource()==button8) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("8");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("8"));
			}
		}
		
		else if (e.getSource()==button9) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("9");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("9"));
			}
		}
		
		else if (e.getSource()==button0) {
			
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText("0");
			}
			else {
				textDisplay.setText(textDisplay.getText().concat("0"));
			}
		}
		
		else if (e.getSource()==buttonErase) {
			textDisplay.setText("");
			equals = 0;
		}
		
		else if (e.getSource()==buttonDecimal) {
			if (textDisplay.getText().isEmpty()) {
				
				textDisplay.setText(".");
			}
			else if (textDisplay.getText().contains(".") == false){
				textDisplay.setText(textDisplay.getText().concat("."));
			}
		}
		else if (e.getSource()==buttonAdd) {
			value1 = equals;
			if (value1 == 0) {
				value1 = Integer.valueOf(textDisplay.getText());
			}
			else if (value1 != 0 && value2 == 0) {
				value2 = Integer.valueOf(textDisplay.getText());
			}
			textDisplay.setText("");
		}
		
		else if (e.getSource()==buttonEquals) {
			value2 = Integer.valueOf(textDisplay.getText());
			equals = add(value1,value2);
			textDisplay.setText(String.valueOf(equals));
		}	
	}
	
	static int add(int value1, int value2) {
		
		int z = value1 + value2;
		return z;
		
	}
}
