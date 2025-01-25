import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class FuncButton{
	JButton[] button = new JButton[9];
	
	FuncButton(){
		for (int i = 0; i < 6 ; i++) {
			button[i] = new JButton();
			button[i].setForeground(Color.pink);
			button[i].setBackground(Color.black);
			button[i].setFocusable(false);
			button[i].setFont(new Font("Monospaced",Font.BOLD ,20));
		}
	}
	public JButton getFuncButton(int x) {
		return button[x];
	}

}
