import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

public class MagicSquareFrame {
 public JFrame magicFrame;
 public int size;
 public ArrayList<JButton> reference;




public MagicSquareFrame (int size) {
	reference= new ArrayList<JButton>();
	 this.size=size;
	 magicFrame= new JFrame("Magic Square");
	 magicFrame.setSize(500, 500);
	 magicFrame.setLayout(new GridLayout(size,size));
	 for(int i=1;i<=size*size;i++) {
		 JButton button= new JButton(Integer.toString(i));
		 magicFrame.add(button);
		 reference.add(button);
	 }
	 
	 magicFrame.setVisible(true);
	 
 }
public int getSize() {
	return size;
}
 public ArrayList<JButton> getReference(){
	 return reference;
	 
 }
 
 


}
