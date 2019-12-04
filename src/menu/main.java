package menu;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		String s = " ";
		menu men = new menu(s);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int op = -1;
		while(op != 0) {
			System.out.print(men);
			op = in.nextInt();
			
			if (op == 1) {
				System.out.println(" Nombre del archivo: ");
				String arch = in.next();
				men.setArchivo(arch);
				men.leer();
			}
			else if (op == 2) {
				System.out.println(" Como quieres llamar al archivo bb: ");
				String arch = in.next();
				men.setArchivo(arch);
				System.out.println("Escribe: ");
				String esc = in.next();
				men.escribir(esc);
			}
			else if (op == 3) {
				System.out.println(" Nombre del archivo: ");
				String arch = in.next();
				men.setArchivo(arch);
				System.out.println("Escribe: ");
				String esc = in.next();
				men.escribir(esc);
			}
			else if (op == 4) {
				System.out.println(" Nombre del archivo: ");
				String arch = in.next();
				men.setArchivo(arch);
				men.contarPalabras();
			}
			
		}
	}
}
