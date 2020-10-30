package CazaFantasmas;

import java.util.Scanner;

public class vampiros {
	public static void main(String[] args) {
		int vampiros;
		
		Scanner n666 = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa de reacción ante ataques Vampirezcos");
		System.out.println("Ingresa número de Vampiros en el ataque");
		
		vampiros = n666.nextInt();
		if (vampiros<=0) {
			System.out.println("¿qué haces aquí? si no hay vampiros, ¡NO SIRVOOO!...");
		}else {
			if (vampiros>=1&vampiros<=3) {
				System.out.println("Lanza un ajo en tu defensa");
				System.out.println("cuantos Vampiros quedan?");
				vampiros = n666.nextInt();
			}else {
				System.out.println("corre!!!!! te van a convertir o peor a COMER!!!");
			}
			if(vampiros>1) {
				System.out.println("usa una estaca");
			}else {
				System.out.println("Vampiros eliminados");
			}
		}
		
		n666.close();
	}
}