import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		CalcuButton test = new CalcuButton();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());

		// to be use on CalculatorUI class
		frame.add(test.getButton(4));
	
//		CalculatorUI test = new CalculatorUI();
		

	}

}
