package Operators;


class Calculate
{
	Calculate(){
		System.out.println("Constructor of Calculate class.");
	}
		
	void debug_exercise1()
	{
		int i = (42 + 45) - 48 - 5 ;
		int j = ((5 + 5) - 8) + 2;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		
		int ans = i/j ;
			
				
		System.out.println("Value of Ans = " + ans);
	}
	
	void debug_excercise2()
	{

		
	int ans = (42 + 45 - 48 - 5 -15 + 20) * 2;
	
	System.out.println("Value of Ans = " + ans);
	}
	
}

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate calculate = new Calculate();
		
		calculate.debug_exercise1();
		
		calculate.debug_excercise2();
		
	
	}

}
