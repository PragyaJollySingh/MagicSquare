
import javax.swing.JOptionPane;
public class Input {
	public String n;
	
	public Input() {
	   n= JOptionPane.showInputDialog(null,"Enter Number Please","Input", JOptionPane.QUESTION_MESSAGE);

		
	}
	
	public int getInput() {
		int number=Integer.valueOf(n);
		return number;
		
	}
	
	
}
