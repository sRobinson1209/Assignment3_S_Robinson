import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String[] args){
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        //each element has a node, and a reference to the next node (pointer)
        System.out.println(namesLinkedList.get(2));// getting the third element in list
        namesLinkedList.add(1, "Jerry");// adding an element


        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Mark");
        System.out.println(namesArrayList.get(2));

        //Use an arrayList, getting an element is fast, but slower to add or delete


    }
}
