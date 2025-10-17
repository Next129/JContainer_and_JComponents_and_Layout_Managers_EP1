import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
	public Microwave() {
		//Call the method: MicrowaveComponents
		this.MicrowaveComponents();
		
		//Set JFrame
		this.setTitle("The Front View of a Microwave Oven");
		this.setSize(550,250);
		this.setVisible(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	public void MicrowaveComponents() {
		//Create the first panel of MicrowaveLayout to position its components
		JPanel panel01_MicrowaveLayout = new JPanel(new BorderLayout());
		
		
		
		//Add the first panel into the EAST of MicrowaveLayout
		this.add(panel01_MicrowaveLayout,BorderLayout.EAST);

		
		//Create a button to place foods at the CENTER of MicrowaveLayout
		JButton button_Foods = new JButton("Food to place here");
		this.add(button_Foods,BorderLayout.CENTER);

		
		//Create the second panel and set GridLayout for adding the button's numbers
		JPanel panel02_NumberLayout = new JPanel();
		panel02_NumberLayout.setLayout(new GridLayout(4,3));

		

		

		//At the first panel, Create a textfield to display its time at the NORTH of MicrowaveLayout
		JTextField textfield_TimeDisplay = new JTextField("Microwave Time Display");
		panel01_MicrowaveLayout.add(textfield_TimeDisplay,BorderLayout.NORTH);
		//Use a FOR loop to add the button's numbers into the NumberLayout
		for (int i=1; i<=9; i++) {
			panel02_NumberLayout.add(new JButton(" "+i));
		}
		
		//Create three button(Stop, 0, Start) and add them into the second JPanel
		JButton button_Stop = new JButton("Stop");
		JButton button_Zero = new JButton("0");
		JButton button_Start = new JButton("Start");
		panel02_NumberLayout.add(button_Stop);
		panel02_NumberLayout.add(button_Zero);
		panel02_NumberLayout.add(button_Start);

		
		//Add the second JPanel to the first panel at the CENTER of MicrowaveLayout
		panel01_MicrowaveLayout.add(panel02_NumberLayout,BorderLayout.CENTER);

		
	}
}