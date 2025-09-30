//You are given a linked list of strings , u need to remove all elements with length less than or equal to 3..

import java.util.*;
class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hi");
        list.add("Code");
        list.add("AI");
        list.add("Data");
        list.add("ML");

        System.out.println("Original List: " + list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.length() <= 3) {
                it.remove();
            }
        }

        System.out.println("Filtered List: " + list);
    }
}

//q2 - Add static methods biggest and thinnest to the Quantifiable interface.These methods should return the object with the biggest and thinnest quantification from an array of Quantifiable objects.
//q4 - Implement a subclass of bank account called basic account whose withdraw method will not withdraw more money than currently in account.