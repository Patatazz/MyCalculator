import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class DisplayPanel extends JPanel{
	
	DisplayPanel(){
		this.setPreferredSize(new Dimension(350,60));
		this.setForeground(new Color(0x1B03A3));
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
	}
	
	public JPanel getDisplayPanel() {
		return this;
	}
}
