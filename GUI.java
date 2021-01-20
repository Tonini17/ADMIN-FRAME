
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class GUI implements ActionListener{

	private static JLabel namelabel;
	private static JTextField userText;
	private static JLabel vectorlabel;
	private static JPasswordField vectorText;
	private static JLabel success;
	private static JButton button;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel() ;

		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		namelabel = new JLabel("ADMIN");
		namelabel.setBounds(10, 20, 100, 25);
		panel.add(namelabel);			//first name//

		userText = new JTextField(30);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		vectorlabel = new JLabel("PASSWORD");
		vectorlabel.setBounds(10, 80, 100, 25);
		panel.add(vectorlabel);

		vectorText = new JPasswordField(30);
		vectorText.setBounds(100, 80, 165, 25);
		panel.add(vectorText);		//afm//

		button = new JButton("Login");
		button.setBounds(125, 125, 80 ,25);
		button.addActionListener(new GUI());
		panel.add(button);			//enter the app//

		success = new JLabel("");
		success.setBounds(100,150,100,25);
		panel.add(success);


		frame.setVisible(true);


		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = userText.getText();
		String vector = vectorText.getText();

	if (name.equals("idunno") && vector.equals("OMG3LOL")) {
	success.setText("Login successful!");}
	else {
		success.setText("Failed.Try again!");
	}
	}

}
