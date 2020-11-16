package co.edu.campusucc;

import java.util.Random;

public class ExplicacionCiclos {
	public static void main(String[] args) { 
		 System.out.println(" ******************************* ");
		 System.out.println(" *  Autor: Luisa Palau         * ");
		 System.out.println(" *  Date: Noviembre 16 2020    * ");
		 System.out.println(" ******************************* ");
		 System.out.println(" *   Ingenieria industrial     * ");
		 System.out.println(" *    Ciclos condicionales     * ");
		 System.out.println(" *      Numeros primos         * ");
		 System.out.println(" ******************************* ");
		
		 
		 
			Random random = new Random();
			int numero = random.nextInt(1000);
			boolean esPrimo = verificaPrimo( numero );
			System.out.println(" +                                                   -");
			System.out.println("-                                                    +");
			System.out.println("  El numero " + numero + " es primo? " +esPrimo        );
			System.out.println("+                                                    -");
			System.out.println("-                                                    +");
	}
	
        public static boolean verificaPrimo(int numero){ 
        	boolean esPrimo = false; 
        	int numerosDivisibles = 0;
        	int numerosDivisiblesPrimos = 2;
        	
        	for(int i=1; i<=numero; i++)
        		if(numero % i ==0)
        			numerosDivisibles++;
        	
        	if(numerosDivisibles == numerosDivisiblesPrimos)
        		esPrimo = true; 
        	
        	return esPrimo;
        	
}
}

package co.edu.campusucc;

import java.util.Random;

public class ExplicacionCiclos {
	public static void main(String[] args) { 
		 System.out.println(" ******************************* ");
		 System.out.println(" *  Autor: Luisa Palau         * ");
		 System.out.println(" *  Date: Noviembre 16 2020    * ");
		 System.out.println(" ******************************* ");
		 System.out.println(" *   Ingenieria industrial     * ");
		 System.out.println(" *    Ciclos condicionales     * ");
		 System.out.println(" *      Numeros primos         * ");
		 System.out.println(" ******************************* ");
		
		 
		 
			Random random = new Random();
			int numero = random.nextInt(1000);
			boolean esPrimo = verificaPrimo( numero );
			System.out.println(" +                                                   -");
			System.out.println("-                                                    +");
			System.out.println("  El numero " + numero + " es primo? " +esPrimo        );
			System.out.println("+                                                    -");
			System.out.println("-                                                    +");
	}
	
        public static boolean verificaPrimo(int numero){ 
        	boolean esPrimo = false; 
        	int numerosDivisibles = 0;
        	int numerosDivisiblesPrimos = 2;
        	
        	for(int i=1; i<=numero; i++)
        		if(numero % i ==0)
        			numerosDivisibles++;
        	
        	if(numerosDivisibles == numerosDivisiblesPrimos)
        		esPrimo = true; 
        	
        	return esPrimo;
        	
}
}


******************************* 
 *  Autor: Luisa Palau         * 
 *  Date: Noviembre 16 2020    * 
 ******************************* 
 *   Ingenieria industrial     * 
 *    Ciclos condicionales     * 
 *      Numeros primos         * 
 ******************************* 
 +                                                   -
-                                                    +
  El numero 228 es primo? false
+                                                    -
-                                                    +