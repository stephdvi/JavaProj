package basicsofjava;
import java.util.ArrayList;
public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList<String> sNames = new ArrayList<String>();
		System.out.println("ArrayList size before storing elements="+sNames.size());
		sNames.add("riya");        //0
		sNames.add("pooja");    //1
		sNames.add("tani");      //2
		
		System.out.println("Array List size after storing elements="+sNames.size());
//		System.out.println(sNames.get(0));
//		System.out.println(sNames.get(1));
//		System.out.println(sNames.get(2));
		
		for(int i=0;i<sNames. size(); i++)
		{
			System.out.println(sNames.get(i));
		}
        sNames.add("jack");     //3
        sNames.add(1,"George");
        System.out.println("Array List Elements=");
        for(int i=0;i<sNames.size(); i ++)         //3<3 (f)
        {
        	System.out.println(sNames.get(i));
        	 }
        sNames.add("jack");
        sNames.add(1, "George");
        System.out.println("Array List Elements =");
        for(int i=0;i<sNames.size(); i ++) 
        {
        	System.out.println(sNames.get(i));
        }
        sNames.set(3,"roopali");
        System.out.println("ArrayList Elements=");
        for(int i=0;i<sNames.size();i++)
        {
        	System.out.println(sNames.get(i));
        }
        if(sNames.contains("jack"))         //if item exists it returns true i.e 0 else returns false 1
        {
        	System.out.println("item exists");
        }
        else
        {
        	System.out.println("Item does not exsist");
        }
	}

	
}

