package gr.regenerationcodingschool.singleton;

public class SingletonRuntimeDemo {

	public static void main(String args[]) {
		Runtime singletonRuntime = Runtime.getRuntime();
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance);

		areSameObjects(singletonRuntime, anotherInstance);
	}

	private static void areSameObjects(Runtime singletonRuntime, Runtime anotherInstance) {
		if(singletonRuntime == anotherInstance) {
			System.out.println("Same instance");
		}
	}


}
