import java.util.Scanner;

public class Examen_16M_Primo {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num;
		
		
		System.out.println("Buenos días Ceinmark, soy Ismael Costas");
		
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		num = ent.nextInt();
		
		
		if((num%2) != 0){
			System.out.println("El número no es primo.");
			
			System.out.println("Los divisores del número son:");
			for(int i = 1; i < num; i++) {
				
				if((num%i) == 0) {
					System.out.println(i);
				}
			}
						
		} else {
			System.out.println("El número es primo.");
		}

	}

}
