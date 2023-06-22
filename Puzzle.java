package din.jin;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Puzzle puzzleobj = new Puzzle();
puzzleobj.dplan();
	}

	private void dplan() {
		// TODO Auto-generated method stub
		int day =1;
		int pm=1;
		int savings=0;
		
		while(day<10)
		{
			savings = savings + pm;
				System.out.println(savings);
				day=day+1;
		}
		
	}

}
