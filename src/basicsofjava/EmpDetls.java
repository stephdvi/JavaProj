package basicsofjava;

import java.util.Scanner;

public class EmpDetls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in); 
		int eno=1;
		String ename="jack";
		float sal=70000;
		System.out.println("Enter eno");
		eno=x.nextInt();
		System.out.println("Enter ename");
		ename=x.next();
		System.out.println("Enter sal");
		sal=x.nextFloat();
		System.out.println("...................");
        System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("sal="+sal);
		
	  

	}

}
