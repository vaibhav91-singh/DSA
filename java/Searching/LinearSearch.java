// make file threw command  
// type nul > LinearSearch.java
public class LinearSearch{
    // Main Function
    public static void main(String[] args) {
        int arr[]={2,3,4,1,23,45,23,67,87};
        int elem=23;
        int index = LinearSearch(arr,elem);
        System.out.println(index);
    }
// Function for Linear Search

    public static int LinearSearch(int arr[],int elem){
        for(int i=0;i<arr.length();i++){
            if(arr[i]==elem){
                return i;
            }else{
                return -1;
            }
        }
    }
}







