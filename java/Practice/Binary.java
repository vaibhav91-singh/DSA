import java.util.*;
public class Binary{
    public static void main(String[] args){
    int arr[]= {12,23,34,45,67,78,89};
    int elem = 67;
    int index = Binary(arr,elem);
    if(index == -1){
        System.out.println("Element is not found");
    
    } else {
        System.out.println("Element : "+ elem + " foound at position : "+index);
    }
    }
    public static int Binary(int [] arr,int elem){
    int start = 0;
    int end= arr.length + 1;
    
    while(start<=end){
    int mid = start+(end-start)/2;
    System.out.println("Mid element is : "+arr[mid]);
    if(arr[mid] == elem){
        // go left side 
        return mid;
    }else if(arr[mid]<=elem){
        // go to right part of the array
        start = mid +1;
        
    }else{
        end =mid -1 ;
    }
    
    }
    return -1 ;

    }
}



