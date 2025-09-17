
import java.util.*;
class arraylist{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        if(list.contains("Ashish")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(list);

        try{
            System.out.println(list.get(4));
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }

        // Iterator itr = list.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
    }
}