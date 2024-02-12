package Java;

class Singleton {
	
	
	private static final Singleton instanceVariable = new Singleton();

	private Singleton() 
	
	{
	
	}

	public static Singleton getInstance()
	
	{
		return instanceVariable;
	}
}