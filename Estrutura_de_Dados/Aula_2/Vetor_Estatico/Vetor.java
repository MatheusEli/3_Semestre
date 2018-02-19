package exercicio;

 class Vetor
{
        private long[] a; // ref to array a
        private int nElems; // number of data items
//-----------------------------------------------------------
public Vetor(int max) // constructor
{
       
        a = new long[max]; // create the array
        nElems = 0; // no items yet
       
}
//-----------------------------------------------------------
public boolean find(long searchKey){       

        int j;
        
        for(j=0; j<nElems; j++) 
            if(a[j] == searchKey) 
                break; 
        
        if(j == nElems) 
            return false; 
        else
            return true; 

}

public boolean insert(long value) // put element into array
{
        while(nElems<a.length){
            
            a[nElems] = value; // insert it

            if(a[nElems] == value){

                nElems++; // increment size
                return true;
            }else{
                return false;
            }
    }
        return false;
}
//-----------------------------------------------------------
public boolean delete(long value)
{
        int j;
        
        for(j=0; j<=nElems; j++) // look for it
            if( value == a[j] )
                break;
        
        if(j==nElems) // can't find it
            return false;
        else // found it
        {
        for(int k=j; k<=nElems; k++) // move higher ones down
        
            if(k < a.length-1){
                
                a[k] =a[k+1];
            }
            
        
        nElems--;
            
            
         // decrement size
        return true;
    }
}
public String  display() // displays array contents
{

    String saida = "";
    
    for(int j=0; j<nElems; j++){ // for each element,
    
        saida += a[j] + " "; // display it
    
    }
    
    return saida;
}
}
