package ar.edu.unlam.mesadasDeGranito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Apila {
	private Mesada[] mesadas;
	
	String pathIn = "C:\\Users\\Damian\\workspace\\MesadasDeGranito\\in\\";
	String pathOut = "C:\\Users\\Damian\\workspace\\MesadasDeGranito\\out\\";
	
	public void leerArchivo(String archivo){
		Scanner sc;
		try {
			sc = new Scanner(new File(this.pathIn + archivo + ".in"));
			mesadas = new Mesada[sc.nextInt()];

			for (int i = 0; i < mesadas.length; i++) {
				int ancho = sc.nextInt();
				int largo = sc.nextInt();
				this.mesadas[i] = new Mesada(ancho, largo);
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private int calculaPilas(Mesada[] mesadas){
		int cantidadPilas = 0;
		
		for(int i = 0; i < mesadas.length; i++){
			
		}
		
		return cantidadPilas;
	}
	
	public void guardarArchivo(String archivo) {

		PrintWriter salida;
		try {
			salida = new PrintWriter(new FileWriter(pathOut + archivo + ".out"));

			for (int j = 0; j < this.mesadas.length; j++) {
				salida.println(calculaPilas(mesadas));
			}

			salida.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Mesada[] getMesadas() {
		return mesadas;
	}

	public void setMesadas(Mesada[] mesadas) {
		this.mesadas = mesadas;
	}

}
