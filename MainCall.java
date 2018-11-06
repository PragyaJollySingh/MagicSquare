
public class MainCall {
	Controller c;
	Input p;
	MatchCalculator calc;
	
	public MainCall() {
		p=new Input();
		int k=p.getInput();
		calc= new MatchCalculator(k);

		c= new Controller(k, calc);
		
		c.Initialize();
		
	}
	
	public static void main(String [] args) {
		MainCall main= new MainCall();
		
	}

}
