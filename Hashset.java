import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> HashSet = new HashSet<>();
        LinkedHashSet<String>LinkedHashSet= new LinkedHashSet<>();
        HashSet.add("Banana");
        HashSet.add("Apple");
        HashSet.add("Mango");
        LinkedHashSet.add("Banana");
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        System.out.println("HashSet");
        for(String fruit:HashSet){
            System.out.println(fruit);
        }
        System.out.println("LinkedHashSet");
        for(String fruit:LinkedHashSet){
            System.out.println(fruit);
        }
      
        
        

    }
    
    
}
