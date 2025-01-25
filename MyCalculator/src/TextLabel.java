import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class TextLabel extends JLabel{
	
	TextLabel(){
		this.setText("");
		this.setFont(new Font("Monospaced",Font.BOLD, 30));
		this.setForeground(Color.pink);
	}
	
	public JLabel getTextLabel() {
		return this;
	}
}
