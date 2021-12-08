@FunctionalInterface
public interface MyFunctionalInterface 
{	
	public abstract int add(int a, int b);
}

------------------------------


public class Demo {

	public static void main(String[] args)
	{
		MyFunctionalInterface handle = (int no1,int no2)-> no1+no2;
		int result = handle.add(40,50);	
		System.out.println(result);
	}
}

------------------------------
90