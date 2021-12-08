@FunctionalInterface
public interface MyFunctionalInterface {
	
	public abstract void add();
	
	public static void multiple()
	{
		System.out.println(5*2);
	}
    default void divide()
    {
    	System.out.println(10/2);
    }

}
------------------------------

public class Demo {

	public static void main(String[] args)
	{
		MyFunctionalInterface handle = ()-> System.out.println(5+5);
		handle.add();
		handle.divide();
		MyFunctionalInterface.multiple();
	}
}
-----------------------------
10
5
10