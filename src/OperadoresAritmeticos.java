
public class OperadoresAritmeticos {

	public static void main(String[] args) 
	{
		/*
		 * +,-, *,/,&,++(+1),--(-1)
		 */

		
		int numero=5;
		int numeroDos=10;
		System.out.println(numero+numeroDos);
		
		int resta=numero-numeroDos;
		System.out.println(resta);
		
		int multiplicacion=numero*numeroDos;
		System.out.println(multiplicacion);
		
		int division=numeroDos/numero;
		System.out.println(division);
		
		int residuo=numeroDos%numero;
		System.out.println(residuo);
		
		
		
		System.out.println(numero++ + numeroDos);
		System.out.println(++numero + numeroDos);
		
	}

}
