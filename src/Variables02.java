
public class Variables02 {

	public static void main(String[] args) 
	{
		String apellido="Olveres";
		//Todos los valores de tipo String van entre comillas dobles
		
		String apellidoMaterno;
		//Declarando una variable sin inicializar
		
		String anio="2017";
		System.out.println(anio);
		
		int edad=20;
		int numero=2,numeroDos=8;
		
		boolean isCondicion=true;
				
		char caracter='@';
		//El valor de char siempre va entre comillas sencillas, simples
				
		float decimales=25.5f;
		//Para crear bien la variable tipo flotante es importante tener f al final de la cifra
		
		double dob=3.1416d;
		
		double resultado=decimales*dob;
		System.out.println(resultado);
		
		edad=numero*(int)decimales;
		System.out.println(edad);
		//Esto es un cast explicito
		//Casteo, cambio de un tipo de dato a otro
		//Parser: De String a otro tipo de dato
		
		edad=(int)dob;
		System.out.println(edad);
		
		//Parseo
		
		int anioDos=Integer.parseInt(anio);
		
		System.out.println(anioDos+1);
		//
		
		int ch1=caracter;
		System.out.println(ch1);
		
		//Variable tipo objeto o wrappers AQUI ABAJO
		
		Integer num=2;
		int numDos=3;
		
		num.compareTo(numDos);
		System.out.println(num.compareTo(numDos));
		
		System.out.println(num+numDos);
		
		
		Float flo=25.5F;

	}

}
