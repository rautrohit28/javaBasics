import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class collectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<>();
ar.add(23);
System.out.println(ar.getClass());
ar.add(2);
ar.add(3);
ar.add(2);
ar.add(4);
System.out.println(ar);
System.out.println(ar.indexOf(2));
System.out.println(ar.lastIndexOf(2));
ar.remove(3);
System.out.println(ar);

//LinkedList<Integer> l=new LinkedList<>();
HashSet<Integer> set=new HashSet<>();
set.add(1);
set.add(2);
set.add(76);
set.add(4);
//System.out.println(set.hashCode());
System.out.println(set);
Iterator<Integer> i=set.iterator();
while(i.hasNext())
{ System.out.println(i.next()); }

TreeSet<String> st=new TreeSet<>();
st.add("bhula");
st.add("zebra");
st.add("arsh");
st.add("aakash");
System.out.println(st);
st.h
	}

}
