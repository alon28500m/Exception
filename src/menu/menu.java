package menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class menu {
	private String archivo;
	
	public menu(String s) {
		archivo = s;
	}
	
	public String toString() {
		String out = " ";
		out = "/n 1. LEER";
		out += "/n 2. ESCRIBIR";
		out += "/n 3. MODIFICAR";
		out += "/n 4. CONTAR PALABRAS";
		out += "/n 0. EXIT";
		return out;
	}
	public String setArchivo(String n) {
		return archivo = n;
	}
	public void leer() {
		FileReader r = null;
		try {
			r = new FileReader(archivo);
			@SuppressWarnings("resource")
			BufferedReader b = new BufferedReader(r);
			String cadena = b.readLine();
			while(cadena != null) {
				System.out.println(cadena);
				cadena = b.readLine();
			}
		}
		catch(IOException e) {
			System.out.print(e.getMessage());
		}
		finally{
			try {
				r.close();
			}
			catch(IOException e) {
				System.out.print(e.getMessage());
			}
		}
		
	}
	@SuppressWarnings("resource")
	public void escribir(String s) {
		try {
			FileWriter r = new FileWriter(archivo);
			r.write(s);
		}
		catch(IOException e) {
			System.out.print(e.getMessage());
		}
	}
	public void modificar(String s) {
		FileWriter r = null;
		try {
			r = new FileWriter(archivo, true);
			r.write(s);
		}
		catch(IOException e) {
			System.out.print(e.getMessage());
		}
	}
	public int contarPalabras() {
		FileReader r = null;
		int num = 0;
		try {
			r = new FileReader(archivo);
			@SuppressWarnings("resource")
			BufferedReader b = new BufferedReader(r);
			String cadena = b.readLine();
			while(cadena != null) {
				String[] palabras = cadena.split(" ");
				cadena = b.readLine();
				num += palabras.length;
			}
		}
		catch (IOException e) {
			System.out.print(e.getMessage());
		}
		return num;
	}
}
