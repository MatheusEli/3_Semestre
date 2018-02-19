
package exercicio;
public class Exercicio {

    
    public static void main(String[] args) {
        
        int maxSize = 6; // array size
        
        Vetor arr = new Vetor(maxSize); // create the array
       
        
        System.out.println(arr.insert(77));
        System.out.println(arr.insert(99));
        System.out.println(arr.insert(44));
        System.out.println(arr.insert(55));
        System.out.println(arr.insert(35));
        System.out.println(arr.insert(88));
        arr.display(); // display items
        
        if( arr.find( 35 ) )
            System.out.println("Found " + 35);
        else
            System.out.println("Can't find " + 35);
            System.out.println(arr.delete(88));
            
            arr.display();
    }
    
}
