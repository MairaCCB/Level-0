import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hi " + name);
		String birthday = JOptionPane.showInputDialog("Enter your birthday");
		JOptionPane.showMessageDialog(null, "processing information... saving to computer");
		JOptionPane.showMessageDialog(null, "Good job " + name);
		JOptionPane.showInputDialog("Do you have a nickname?");
		JOptionPane.showInputDialog("Enter down below.");
		JOptionPane.showMessageDialog(null, "saved to the computer");
		JOptionPane.showInputDialog("Enter your credit card number down below.");
		JOptionPane.showMessageDialog(null, "Thank you. Telling everyone in the world.");
		JOptionPane.showMessageDialog(null, "Now you know not to trust computers. Ha! Ha! Ha!");
	}

}
