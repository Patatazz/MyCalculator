import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorUI extends JFrame implements ActionListener{
	
	double v1 = 0, v2 = 0 , total = 0;
	char operator;
	
	NumButton buttons = new NumButton();
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton,mulButton;
	JButton decButton, equButton, clrButton;
	
	MainPanel topPanel = new MainPanel();
	MainPanel midPanel = new MainPanel();
	MainPanel botPanel = new MainPanel();
	
	DisplayPanel topTextDisplay = new DisplayPanel();
	
	TextLabel textLabel = new TextLabel();
	TextLabel patata = new TextLabel();
	
	JLabel catLabel;
	
	ImageIcon catIcon = new ImageIcon("images.jpg");
	ImageIcon catIcon2 = new ImageIcon("images (1).jpg");
	
	CalculatorUI(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setTitle("Simple Calculator");
		this.setLayout(new FlowLayout());
		this.setIconImage(catIcon.getImage());
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		topPanel.setPreferredSize(new Dimension(500,80));
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		midPanel.setPreferredSize(new Dimension(500,295));
		
		botPanel.setPreferredSize(new Dimension(500,80));
		botPanel.setBackground(Color.BLACK);
		
		catLabel = new JLabel();
		catLabel.setIcon(catIcon2);
		
		topTextDisplay.add(textLabel, BorderLayout.EAST);
		topPanel.add(catLabel);
		topPanel.add(topTextDisplay);
		
		for (int i = 0; i < 10 ; i++) {
			buttons.getButton(i).addActionListener(this);
		}
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		decButton = new JButton(".");
		equButton = new JButton("=");
		clrButton = new JButton("Clear");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = decButton;
		functionButtons[4] = equButton;
		functionButtons[5] = clrButton;
		
		for(int i =0; i < 6; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(new Font("Monospaced",Font.BOLD ,20));
			functionButtons[i].setFocusable(false);
			functionButtons[i].setForeground(Color.pink);
			functionButtons[i].setBackground(Color.black);
		}
			
		midPanel.setLayout(new GridLayout(4,4,3,3));
		midPanel.add(buttons.getButton(1));
		midPanel.add(buttons.getButton(2));
		midPanel.add(buttons.getButton(3));
		midPanel.add(addButton);
		midPanel.add(buttons.getButton(4));
		midPanel.add(buttons.getButton(5));
		midPanel.add(buttons.getButton(6));
		midPanel.add(subButton);
		midPanel.add(buttons.getButton(7));
		midPanel.add(buttons.getButton(8));
		midPanel.add(buttons.getButton(9));
		midPanel.add(mulButton);
		midPanel.add(decButton);
		midPanel.add(buttons.getButton(0));
		midPanel.add(clrButton);
		midPanel.add(equButton);

		patata.setText("PATATAS");
		patata.setFont(new Font("Monospaced", Font.BOLD, 50));
		patata.setForeground(Color.PINK);
		botPanel.add(patata);
		
		this.setResizable(false);
		this.add(topPanel.getPanel());
		this.add(midPanel.getPanel());
		this.add(botPanel.getPanel());
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (int ctr = 0 ; ctr < 10 ; ctr++) {
			if(e.getSource() == buttons.getButton(ctr)) {
				textLabel.setText(textLabel.getText().concat(String.valueOf(ctr)));
			}
		}	
		if(e.getSource()==decButton) {
			textLabel.setText(textLabel.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			v1 = Double.parseDouble(textLabel.getText());
			operator ='+';
			textLabel.setText("");
		}
		if(e.getSource()==subButton) {
			v1 = Double.parseDouble(textLabel.getText());
			operator ='-';
			textLabel.setText("");
		}
		if(e.getSource()==mulButton) {
			v1 = Double.parseDouble(textLabel.getText());
			operator ='*';
			textLabel.setText("");
		}
		if(e.getSource()==clrButton) {
			textLabel.setText("");
		}
		if(e.getSource()==equButton) {
			v2=Double.parseDouble(textLabel.getText());
			
			switch(operator) {
			case'+':
				total=v1+v2;
				break;
			case'-':
				total=v1-v2;
				break;
			case'*':
				total=v1*v2;
				break;
			case'/':
				total=v1/v2;
				break;
			}
			textLabel.setText(String.valueOf(total));
			v1=total;
		}
	}
}


// Previous Codes

//topPanel = new JPanel();
//topPanel.setPreferredSize(new Dimension(500,80));
//topPanel.setBackground(Color.PINK);
//topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

//displayPanel = new JPanel();
//displayPanel.setPreferredSize(new Dimension(350,70));
//displayPanel.setForeground(new Color(0x1B03A3));
//displayPanel.setBackground(Color.BLACK);
//displayPanel.setLayout(new BorderLayout());

//textDisplay = new JLabel();
//textDisplay.setFont(new Font("Monospaced",Font.BOLD, 30));
//textDisplay.setForeground(Color.pink);
//textDisplay.setBackground(Color.blue);

//displayPanel.add(textDisplay, BorderLayout.EAST);

//topPanel.add(catLabel);
//topPanel.add(displayPanel);


//midPanel = new JPanel();
//midPanel.setPreferredSize(new Dimension(500,295));
//midPanel.setBackground(Color.PINK);
//midPanel.setLayout(new GridLayout(4,4,3,3));

//JButton button0;
//JButton button1;
//JButton button2;
//JButton button3;
//JButton button4;
//JButton button5;
//JButton button6;
//JButton button7;
//JButton button8;
//JButton button9;
//JButton buttonAdd;
//JButton buttonSub;
//JButton buttonDiv;
//JButton buttonEquals;
//JButton buttonDecimal;
//JButton buttonErase;

//buttonAdd = new JButton("+");
//buttonAdd.setForeground(Color.pink);
//buttonAdd.setBackground(Color.black);
//buttonAdd.setFocusable(false);
//buttonAdd.setFont(new Font("Monospaced",Font.PLAIN ,30));
//buttonAdd.addActionListener(this);
//
//buttonSub = new JButton("-");
//buttonSub.setForeground(Color.pink);
//buttonSub.setBackground(Color.black);
//buttonSub.setFocusable(false);
//buttonSub.setFont(new Font("Monospaced",Font.PLAIN ,30));
//buttonSub.addActionListener(this);
//
//buttonDiv = new JButton("/");
//buttonDiv.setForeground(Color.pink);
//buttonDiv.setBackground(Color.black);
//buttonDiv.setFocusable(false);
//buttonDiv.setFont(new Font("Monospaced",Font.PLAIN ,30));
//buttonDiv.addActionListener(this);
//
//buttonEquals = new JButton("=");
//buttonEquals.setForeground(Color.pink);
//buttonEquals.setBackground(Color.black);
//buttonEquals.setFocusable(false);
//buttonEquals.setFont(new Font("Monospaced",Font.PLAIN ,30));
//buttonEquals.addActionListener(this);
//
//buttonDecimal = new JButton(".");
//buttonDecimal.setForeground(Color.pink);
//buttonDecimal.setBackground(Color.black);
//buttonDecimal.setFocusable(false);
//buttonDecimal.setFont(new Font("Monospaced",Font.PLAIN ,30));
//buttonDecimal.addActionListener(this);
//
//buttonErase = new JButton("Clear");
//buttonErase.setForeground(Color.pink);
//buttonErase.setBackground(Color.black);
//buttonErase.setFocusable(false);
//buttonErase.setFont(new Font("Monospaced",Font.BOLD , 20));
//buttonErase.addActionListener(this);
//
//button1 = new JButton("1");
//button1.setForeground(Color.pink);
//button1.setBackground(Color.black);
//button1.setFocusable(false);
//button1.setFont(new Font("Monospaced",Font.BOLD ,20));
//button1.addActionListener(this);
//
//button2 = new JButton("2");
//button2.setForeground(Color.pink);
//button2.setBackground(Color.black);
//button2.setFocusable(false);
//button2.setFont(new Font("Monospaced",Font.BOLD ,20));
//button2.addActionListener(this);
//
//button3 = new JButton("3");
//button3.setForeground(Color.pink);
//button3.setBackground(Color.black);
//button3.setFocusable(false);
//button3.setFont(new Font("Monospaced",Font.BOLD ,20));
//button3.addActionListener(this);
//
//button4 = new JButton("4");
//button4.setForeground(Color.pink);
//button4.setBackground(Color.black);
//button4.setFocusable(false);
//button4.setFont(new Font("Monospaced",Font.BOLD ,20));
//button4.addActionListener(this);
//
//button5 = new JButton("5");
//button5.setForeground(Color.pink);
//button5.setBackground(Color.black);
//button5.setFocusable(false);
//button5.setFont(new Font("Monospaced",Font.BOLD ,20));
//button5.addActionListener(this);
//
//button6 = new JButton("6");
//button6.setForeground(Color.pink);
//button6.setBackground(Color.black);
//button6.setFocusable(false);
//button6.setFont(new Font("Monospaced",Font.BOLD ,20));
//button6.addActionListener(this);
//
//button7 = new JButton("7");
//button7.setForeground(Color.pink);
//button7.setBackground(Color.black);
//button7.setFocusable(false);
//button7.setFont(new Font("Monospaced",Font.BOLD ,20));
//button7.addActionListener(this);
//
//button8 = new JButton("8");
//button8.setForeground(Color.pink);
//button8.setBackground(Color.black);
//button8.setFocusable(false);
//button8.setFont(new Font("Monospaced",Font.BOLD ,20));
//button8.addActionListener(this);
//
//button9 = new JButton("9");
//button9.setForeground(Color.pink);
//button9.setBackground(Color.black);
//button9.setFocusable(false);
//button9.setFont(new Font("Monospaced",Font.BOLD ,20));
//button9.addActionListener(this);
//
//button0 = new JButton("0");
//button0.setForeground(Color.pink);
//button0.setBackground(Color.black);
//button0.setFocusable(false);
//button0.setFont(new Font("Monospaced",Font.BOLD ,20));
//button0.addActionListener(this);

//midPanel.add(button1);
//midPanel.add(button2);
//midPanel.add(button3);
//midPanel.add(buttonAdd);
//midPanel.add(button4);
//midPanel.add(button5);
//midPanel.add(button6);
//midPanel.add(buttonSub);
//midPanel.add(button7);
//midPanel.add(button8);
//midPanel.add(button9);
//midPanel.add(buttonDiv);
//midPanel.add(buttonDecimal);
//midPanel.add(button0);
//midPanel.add(buttonErase);
//midPanel.add(buttonEquals);

//bottomPanel = new JPanel();
//bottomPanel.setPreferredSize(new Dimension(500,80));
//bottomPanel.setBackground(Color.BLACK);
//bottomPanel.add(patata);

//@Override
//public void actionPerformed(ActionEvent e) {
//	if (e.getSource()==) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("1");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("1"));
//		}
//	}
//	
//	else if (e.getSource()==button2) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("2");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("2"));
//		}
//	}
//	
//	else if (e.getSource()==button3) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("3");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("3"));
//		}
//	}
//	
//	else if (e.getSource()==button4) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("4");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("4"));
//		}
//	}
//	
//	else if (e.getSource()==button5) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			textDisplay.setText("5");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("5"));
//		}
//	}
//	
//	else if (e.getSource()==button6) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("6");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("6"));
//		}
//	}
//	
//	else if (e.getSource()==button7) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("7");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("7"));
//		}
//	}
//	
//	else if (e.getSource()==button8) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("8");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("8"));
//		}
//	}
//	
//	else if (e.getSource()==button9) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("9");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("9"));
//		}
//	}
//	
//	else if (e.getSource()==button0) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText("0");
//		}
//		else {
//			textDisplay.setText(textDisplay.getText().concat("0"));
//		}
//	}
//	
//	else if (e.getSource()==buttonErase) {
//		textDisplay.setText("");
//		equals = 0;
//	}
//	
//	else if (e.getSource()==buttonDecimal) {
//		
//		if (textDisplay.getText().isEmpty()) {
//			
//			textDisplay.setText(".");
//		}
//		else if (textDisplay.getText().contains(".") == false){
//			textDisplay.setText(textDisplay.getText().concat("."));
//		}
//	}
//	else if (e.getSource()==buttonAdd) {
//		
//		value1 = equals;
//		
//		if (value1 == 0) {
//			value1 = Integer.valueOf(textDisplay.getText());
//		}
//		else if (value1 != 0 && value2 == 0) {
//			value2 = Integer.valueOf(textDisplay.getText());
//		}
//		textDisplay.setText("");
//	}
//	
//	else if (e.getSource()==buttonEquals) {
//		value2 = Integer.valueOf(textDisplay.getText());
//		equals = add(value1,value2);
//		textDisplay.setText(String.valueOf(equals));
//	}
//	else if (e.getSource()==buttonSub) {
//		value1 = equals;
//		
//		if (value1 == 0) {
//			value1 = Integer.valueOf(textDisplay.getText());
//		}
//		else if (value1 != 0 && value2 == 0) {
//			value2 = Integer.valueOf(textDisplay.getText());
//		}
//		textDisplay.setText("");
//	}
