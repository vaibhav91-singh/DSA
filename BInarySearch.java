import java.util.*;
public class BInarySearch {
    public static void main(String[] args){
        int arr[]={17,22,32,56,89,102,115,119,200};
        int elem = 200;
        int index = BinarySearch(arr,elem);
        if(index ==-1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element Found at index :: "+ index);
        }
    }
    public static int BinarySearch(int[]arr , int elem){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            System.out.println(arr[mid]);
                if(arr[mid]==elem){
                    return mid;
                }else if(arr[mid]<elem){
                    start=mid+1; //Look in right
                }else{
                    end=mid-1; //Look in Left
                }
                
        }return -1;
    }
}