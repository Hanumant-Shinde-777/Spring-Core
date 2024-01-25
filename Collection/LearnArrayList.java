import java.util.ArrayList;

public class LearnArrayList{
public static void main(String args[]){

 ArrayList <Integer> list =new ArrayList<>();
 list.add(10);
 list.add(20);
 list.add(30);
 list.add(40);
 //System.out.println(list);
 
 list.add(50);
//System.out.println(list);
//alternate option
 //pass the integer value to the next parameter after the list
  ArrayList<Integer> list1= new ArrayList<>();
		Collections.addAll(list1, 1, 2 ,3, 4, 5,6, 6);

 list.add(0,0);
  //System.out.println("old list ");
 //System.out.println(list);
 ArrayList <Integer> newlist = new ArrayList<>();
 newlist.add(17);
 newlist.add(18);
 newlist.add(19);

 //System.out.println("New list ");
 //System.out.println(newlist);
 //System.out.println("Mearge all Element in One list ");
 list.addAll(newlist);


 //System.out.println(list);
 //System.out.println("Second Element of 1st list " +list.get(2));
//System.out.println("Second Element of 1st list " +list.get(3));

//list.remove(1);
// System.out.println(list);

 //newlist.remove(Integer.valueOf(17));
// //System.out.println(newlist);
// //System.out.println(list.remove(Integer.valueOf(17)));
// //System.out.println(list);

// System.out.println(newlist);
// newlist.remove(Integer.valueOf(18));
// System.err.println(newlist);

// newlist.set(0, 33);
//System.out.println(newlist);

//System.out.print(newlist.contains(18));

// for(int i=0; i< list.size(); i++){
//     System.out.println("the element are " + list.get(i));
// }
  }    
}
