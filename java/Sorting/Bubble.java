public class Bubble{
    

    public static void main(String[] args){
    // int arr[]= {12,23,34,45,8,67,89,90};
    int[] arr={34,23,67,45,3,98,1,10};
    // int arr[]={12,23,34,45,56,67,78,89,90};
    System.out.println("Arrray length is : "+arr.length);
    printarray(arr);
    Bubble(arr);
    System.out.print("Sorted Array is : ");
    printarray(arr);//Sorted Array
    }

    public static void Bubble(int[]arr){
        int n = arr.length;
        for(int j=0 ; j< n-1;j++){
        for(int i=0 ; i< n-i-1 ;i++){
        
            if(arr[i]>arr[i+1]){
                // No Swaapping
                int Temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=Temp;
            }
        }  
    }
}
    // printing 
    public static void printarray(int[]arr){
    for(int j =0 ;j<=arr.length-1;j++){
            System.out.print( arr[j]+" ");
        }System.out.println(" ");
    }
    
}



