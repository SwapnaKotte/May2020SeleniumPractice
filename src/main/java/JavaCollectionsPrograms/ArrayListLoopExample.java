package JavaCollectionsPrograms;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListLoopExample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		ArrayList<Integer> alist= new ArrayList<Integer>();
		
		
al.add(12);
al.add(25);
al.add(234567);

System.out.println(al.size());
System.out.println(al.get(1));

for(Integer num : al)
  System.out.println(num);

//to check if element(value) exists in ArrayList?

if(al.contains(234567))
  System.out.println("value is part of AL");
else 
	System.out.println("Value is not part of AL");

al.add(10);
al.add(2, 33);
al.addAll(alist);
Object obj=al.clone();
System.out.println(" OBJ    " +obj);

al.ensureCapacity(3);

//Iterator- which we can traverse a List or Set in forward

Iterator<Integer> it= al.iterator();
   while(it.hasNext())
	   System.out.println(it.next());
   
   
   Iterator<Integer> it1= al.iterator();
   while(it.hasNext())
   {
	   System.out.println(it1.next());
   it1.remove();
   
   }
  // ListIterator that allows us to traverse the list in both directions (forward and backward).

   System.out.println(" by using ListIterator - ");

   ListIterator<Integer> lstItr=al.listIterator();
   
   System.out.println("Forward traversing--- ");
   while(lstItr.hasNext())
	   System.out.print( "   " +lstItr.next());
   
   System.out.println("\nBACKWARD Traversing\n");
   while(lstItr.hasPrevious())
	   System.out.print( "    "+lstItr.previous());
   
  
al.clear();

//ArrayList or LinkedList can be convrted into Array by using toArray MEthod

al.toArray();

System.out.println(al);
System.out.println(al.size());

//how to traverse or iterate hashset
//we can traverse by using iterator or without using iterator also we can


HashSet<Integer> hs= new HashSet<Integer>();

hs.add(90);
hs.add(90);
hs.add(80);
hs.add(95);

System.out.println(hs.size()); // 3
System.out.println(hs);   // doesn’t maintain any order. - [80, 90, 95]
//LinkedHashSet (It maintains the elements in insertion order).
//Set doesn’t allow duplicate elements.
//Set implementations: HashSet, LinkedHashSet, TreeSet 
//Set can have only a single null value at most.
//we can use Iterator (It works with List too) to traverse a Set.
//Set interface does not have any legacy class.




ArrayList < Integer> al1= new ArrayList<Integer>();
al1.add(90);
al1.add(90);
al1.add(80);
al1.add(95);
al1.set(2, 88);

al1.remove(3);
al1.add(2, 77);

System.out.println(al1.size()); //4



Collections.sort(al1);

System.out.println(al1); //same insertion order,  - [90, 90, 80, 95]
//List allows duplicates 
//List implementations: ArrayList, LinkedList etc
//List allows any number of null values
// ListIterator can be used to traverse a List in both the directions(forward and backward) 
//List interface has one legacy class called Vector 

al1.clear();
/**
 * When to use Set and When to use List?
it is completely based on our usgae

 */

//List<Integer> list = new ArrayList<Integer>();




Set<String> hs1= new HashSet<String>();
hs1.add("WA");
hs1.add("NC");
hs1.add("OR");
hs1.add("CA");
hs1.add("");

Set<String> ts1= new TreeSet<String>();
ts1.add("");
ts1.add(" ");

System.out.println("Set : "+ts1.size() +"  "+ts1);




	}

}
