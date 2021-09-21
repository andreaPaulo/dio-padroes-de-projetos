package one.digitalinovation.gof.singleton;
/**
 * Singleton "Apressado"
 * 
 * @author Andr�a
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
	}
	
