import java.util.Scanner;

public class Examen_16M_Primo {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num;
		
		
		System.out.println("Buenos d�as Ceinmark, soy Ismael Costas");
		
		System.out.println("Introduce un n�mero para averiguar si es primo o no: ");
		num = ent.nextInt();
		
		
		if((num%2) != 0){
			System.out.println("El n�mero no es primo.");
			
			System.out.println("Los divisores del n�mero son:");
			for(int i = 1; i < num; i++) {
				
				if((num%i) == 0) {
					System.out.println(i);
				}
			}
						
		} else {
			System.out.println("El n�mero es primo.");
		}

	}

}
