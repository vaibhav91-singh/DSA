// make file threw command  
// type nul > LinearSearch.java
import java.util.*;

public class LinearSearch{
    // Main Function
    public static void main(String[] args) {
        int arr[]={2,3,4,1,23,45,23,67,87};
        int elem=23;
        int index = LSearch(arr,elem);
        // printing the sorted array
        if(index==-1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found at index "+index);
        }
        
    }

// Function for Linear Search

    public static int LSearch(int[] arr,int elem){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elem){
                return i;
            }
        }
        return -1;
    }
}

