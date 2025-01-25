import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	int panelWidth, panelHeight;
	
	MainPanel(){
		
		this.setPreferredSize(new Dimension(500,80));
		this.setBackground(Color.PINK);
		this.setLayout(new FlowLayout());
	}
	
	public JPanel getPanel() {
		return this;
	}

}
