package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList s = new ArrayList();
		s.add(67);
		s.add("ugjgds");
		System.out.println(s);
		System.out.println("size "+s.size());
		System.out.print(s.remove(1));
		System.out.print(s.toArray());
		System.out.print(s.get(4));
		System.out.print(s.hashCode());
		System.out.print(s.isEmpty());
		System.out.println(s.indexOf(3));
		Iterator it = s.iterator(); 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(Object t:s){
			System.out.print(s);
		}
		
	}

}
