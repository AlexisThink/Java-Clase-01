
public class OperadoresCondicionales {

	public static void main(String[] args) 
	{
		//<, >, >=, <=, ==, !=
				
				
		boolean isResultado	= 5>10;
		System.out.println(isResultado);
		
		isResultado= 5<10;
		System.out.println(isResultado);
		
		isResultado= 5==10;
		System.out.println(isResultado);
		isResultado= 5!=10;
		System.out.println(isResultado);
		isResultado= 5<=5;
		System.out.println(isResultado);
		isResultado= 5>=6;
		System.out.println(isResultado);
		
		//Operadores Logicos
		
		//AND & (Y)
		
		isResultado=!(5>=6) & 5<=5;
		System.out.println(isResultado);
		isResultado=!((!(5>=6) & 5<=5)) & 5==6;
		System.out.println(isResultado);
		// OR |
		System.out.println("****");
		isResultado=(5>=6) | 5<=5;
		System.out.println(isResultado);
		
		
		

	}

}
