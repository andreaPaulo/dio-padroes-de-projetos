package one.digitalinovation.gof.singleton;
/**
 * Singleton "Pregui�oso"
 * 
 * @author Andr�a
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	}
	
