
public class main {
	Controller c;
	Input p;
	MatchCalculator calc;
	
	public main() {
		p=new Input();
		int k=p.getInput();
		calc= new MatchCalculator(k);
		c= new Controller(k, calc);
		
		
	}
	
	public static void main(String [] args) {
		
	}

}
