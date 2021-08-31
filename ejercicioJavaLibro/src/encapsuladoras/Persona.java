package encapsuladoras;


public class Persona {
	private int edad;
	private int casa;
	private Piscina piscina;
	
	public Persona(int edad,int casa,Piscina piscina){
		this.edad=edad;
		this.casa=casa;
		this.piscina=piscina;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCasa() {
		return casa;
	}
	public void setCasa(int casa) {
		this.casa = casa;
	}
	public Piscina getPiscina() {
		return piscina;
	}
	public void setPiscina(Piscina piscina) {
		this.piscina = piscina;
	}
	

}
