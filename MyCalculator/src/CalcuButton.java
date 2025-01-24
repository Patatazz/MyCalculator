import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalcuButton implements ActionListener{
	
	// Button creation optimization
	JButton[] button = new JButton[20];
	String[] name = 	{"1", "2", "3", "+", 
					 	 "4", "5", "6", "-", 
					 	 "7", "8", "9", "/", 
					 	 ".", "0", "Clear", "="};
	
	int counter = name.length;
	CalcuButton(){
		for (int i = 0; i < counter ; i++) {
			button[i] = new JButton(name[i]);
			button[i].setForeground(Color.pink);
			button[i].setBackground(Color.black);
			button[i].setFocusable(false);
			button[i].setFont(new Font("Monospaced",Font.BOLD ,20));
			button[i].addActionListener(this);
		}
	}
	
	public JButton getButton(int x) {
		
		return button[x];
	}
	
	public int buttonCounter() {
		
		return counter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getSource()==button[0]) {
				System.out.println("Test");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	// Test 
//	 private JButton lastButton = null;
//	 private JButton previousButton = null;
//     private JTextField lastButtonsText = new JTextField();
//     private JTextField previousButtonsText = new JTextField();
//	
//	ActionListener listener = e -> {
//        previousButton = lastButton;
//        lastButton = (JButton) e.getSource();
//        previousButtonsText.setText(lastButtonsText.getText());
//        lastButtonsText.setText(e.getActionCommand());
//    };


}
