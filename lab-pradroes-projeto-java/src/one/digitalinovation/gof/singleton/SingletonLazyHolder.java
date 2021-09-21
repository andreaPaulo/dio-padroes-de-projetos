package one.digitalinovation.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href= "https://stackoverflow.com/a/24018148"> Refer�ncia</a>
 * 
 * @author Andr�a
 */
public class SingletonLazyHolder {
	
	public static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}	
	
	private SingletonLazyHolder() {}
	
	public static SingletonLazyHolder getInstancia() {
			return InstanceHolder.instancia;
	}
	}
	
