package co.edu.campusucc;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class ProgramaMenu {

	public static void main(String[] args) {
		   System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		   System.out.println("-  Autor: Luisa Fernanda Palau Ramirez +");
		   System.out.println("+                                      -");
		   System.out.println("-        INGENIERIA INDUSTRIAL         +");
		   System.out.println("+                                      -");
		   System.out.println("-     HERRAMIENTAS COMPUTACIONALES     +");
		   System.out.println("+                                      -");
		   System.out.println("-      Universidad Cooperativa de      +");
		   System.out.println("+               colombia               -");
		   System.out.println("-                                      +");
		   System.out.println("+             PROGRAMA MENU            -");
		   System.out.println("-                                      +");
		   System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
	
		 	   int opcionPrograma;
		 	   char otroValor;
			   String comando = "", ruta="D:\Ucc_prog_II-2020s2ing\Menuprograma\src\co\edu\campusucc\\";
			  
			   Scanner leer = new Scanner(System.in); 
			
		do{	   
			   System.out.println("Digite 1 para el programa Ejercicio00");
			   System.out.println("Digite 2 para el programa Ejercicio01");
			   System.out.println("Digite 3 para el programa Ejercicio02");
			   System.out.println("Digite 4 para el programa Ejercicio03");
			   System.out.println("Digite 5 para el programa Ejercicio04");
			   System.out.println("Digite 6 para el programa Ejercicio05");
			   System.out.println("Digite 7 para el programa Ejercicio06");
			   System.out.println("Digite 8 para el programa Ejercicio07");
			   System.out.println("Digite 9 para el programa Ejercicio08");
			   System.out.println("Digite 10 para el programa Ejercicio09");
			   System.out.println("Digite 11 para el programa Ejercicio10");
			   System.out.println("Digite 12 para el programa Ejercicio11");
			   System.out.println("Digite 13 para el programa Ejercicio12");
			   System.out.print("Ingrese el numero del programa que desea ejecutar: ");
			   opcionPrograma=leer.nextInt();
			    
			   switch (opcionPrograma) {
			   case 1:
				   comando = "Ejer00";
				   break;
			   case 2:
				   comando = "Ejer01";
				   break;
			   case 3:
				   comando = "Ejer02";
				   break;
			   case 4:
				   comando = "Ejer03";
				   break;
			   case 5:
				   comando = "Ejer04";
				   break;
			   case 6:
				   comando = "Ejer05";
				   break;
			   case 7: 
				   comando = "Ejer06";
				   break;
			   case 8:
				   comando = "Ejer07";
				   break;
			   case 9:
				   comando = "Ejer08";
				   break;
			   case 10:
				   comando = "Ejer09";
				   break;
			   case 11:
				   comando = "Ejer10";
				   break;
			   case 12:
				   comando = "Ejer11";
				   break;
			   case 13:
				   comando = "Ejer12";
				   break;
			   case 14:
				   comando = "Ejer13";
				   break;
			  
				   
			   }
			   
			   try
			    
			   { 
				  
				   var processBuilder = new ProcessBuilder();
				   processBuilder.command("java","D:\Ucc_prog_II-2020s2ing\Menuprograma\src\co\edu\campusucc\\" +comando+ ".java");
				   var process = processBuilder.inheritIO().start();
				   var ret = process.waitFor();
				   				   
			   }
			   
			   catch (Exception e)
			   {
				   System.out.println(e);
			   }
			   	   System.out.println("QUIERE EJECUTAR EL SIGUIENTE PROGRAMA? 1 para SI 2 para NO ");
			   	   otroValor = leer.next().charAt(0);
		   		} while(otroValor=='1');
	}
}
	

