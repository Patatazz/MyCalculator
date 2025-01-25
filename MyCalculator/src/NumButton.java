import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumButton{
	
	TextLabel textLabel = new TextLabel();
	
	// Button creation optimization
	JButton[] button = new JButton[10];
	
	NumButton(){
		for (int i = 0; i < 10 ; i++) {
			button[i] = new JButton(String.valueOf(i));
			button[i].setForeground(Color.pink);
			button[i].setBackground(Color.black);
			button[i].setFocusable(false);
			button[i].setFont(new Font("Monospaced",Font.BOLD ,20));
		}
	}
	
	public JButton getButton(int x) {
		return button[x];
	}
}
