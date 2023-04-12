package basicsofjava;
import  java.util.Scanner; 
public class FindBigger {

	public static void main(String[] args) {
		int a,b;
		Scanner x=new Scanner (System.in);
		System.out.println ("Enter any number"); // 10 20 10
		a=x.nextInt();
		System.out.println("Enter any number"); //20 10 10
		b=x.nextInt();
		if (a>=b)  //10>=20 (f) 20>=10 (t) 10>=10 (t)
		{
			if (a==b) // 20==10
			{
				System.out.println("both are equal");
			}
			else
			{
				System.out.println("a is greater than b");
			}
		}
		else
		{
			System.out.println("b is greater than a");
		}
			
}
}
        








