package ejercicioJavaLibro;
import encapsuladoras.*;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente 
		Piscina piscinaCasa=new Piscina();
		piscinaCasa.setPiscina(true);	
		Persona persona1=new Persona( 23, 1,piscinaCasa);
		System.out.println(persona1.getEdad());
		System.out.println(persona1.getCasa());
		if(persona1.getPiscina().isPiscina())
		System.out.print("tiene piscina");

	}

}
