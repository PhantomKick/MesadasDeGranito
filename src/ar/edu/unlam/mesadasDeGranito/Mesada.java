package ar.edu.unlam.mesadasDeGranito;

public class Mesada {
	
	private Integer ancho;
	private Integer largo;
	
	public Mesada(Mesada obj){
		this.ancho = obj.ancho;
		this.largo = obj.largo;
	}
	
	public Mesada(Integer ancho, Integer largo){
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public Mesada(){
		this.ancho = 0;
		this.largo = 0;
	}
	
	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getLargo() {
		return largo;
	}

	public void setLargo(Integer largo) {
		this.largo = largo;
	}

}
