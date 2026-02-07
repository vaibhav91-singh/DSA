// import java.util.ArrayList;
class DSADynamicArray{
    int size;
    int capacity = 10;
    Object[] array;
    
    public DSADynamicArray(){
        this.array=  new Object[capacity];
    }
    public  DSADynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){

    }
    public void insert(int index , Object data){

    }
    public int search(Object data){

        return -1;
    }
    public void shrink(){

    }
    public  boolean isEmpty(){
            return size==0;
    }
    public String toString(){
        return null;
    }

    // Main Function 
        public static void main(String[] args) {
        System.out.println(array);
    }
}




