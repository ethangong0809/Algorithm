package singleton;

class Singleton {
	
	private static Singleton singleton_instance = null;
	
	public String s;
	
	private Singleton() {
		s = "Hello world!!!";
	}
	
	public static Singleton getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}
	
}

public class Singleton_with_getInstance {
	public static void main (String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		
		x.s = (x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
	}
}
