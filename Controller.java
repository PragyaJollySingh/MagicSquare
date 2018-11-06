import javax.swing.*;


public class Controller{
    public MagicSquareFrame grid;
    public MatchCalculator calc;
	public int size;
	public JButton first;
		
	
	public Controller(int k, MatchCalculator calc) {
		size=k;
		grid=new MagicSquareFrame(size);
		this.calc= calc;
		
		
	}
	


	public void Initialize() {
		
		for(int i=1; i<=size*size;i++) {
			grid.getReference().get(i).addActionListener(e -> Switch((JButton)e.getSource()));
			System.out.println(grid.getReference().size());
		}
	}
	
	public void Switch(JButton button) { 
		System.out.println("hello");
		if(first==null) {
			first=button;
		}
		else {
			JButton second=  button;
			String name1=first.getText();
			String name2=second.getText();
			first.setText(name2);
			second.setText(name1);
			first=null;
			
	}
		
	}
}
