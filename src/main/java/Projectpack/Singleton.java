package Projectpack;

public class Singleton {
	public static Singleton b=null;
	private Singleton() {}
	public static Singleton method() {
		if(b==null) {
			b=new Singleton();
		}
		return b;
	}
	public static void main(String[] args) {
		Singleton a= method();
		Singleton a1 = method();
		Singleton a2 = method();
		Singleton a3 = method();
			System.out.println(System.identityHashCode(a));
		    System.out.println(System.identityHashCode(a1));
		    System.out.println(System.identityHashCode(a2));
		    System.out.println(System.identityHashCode(a3));
		
		
		    
		    
		    
		    
		    
		}
	}


