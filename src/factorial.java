

public class factorial {

	public static void main(String[] args) {
		int fact=1,i;
		for(i=5;i>0;i--)
		{
			fact=fact+fact*i;
		}
		System.out.println("Factorial of 5: "+fact);
	}

}
