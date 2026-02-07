public class Selection {

    public static void main(String[]args){
        int myarray[]= {12,43,45,67,98,4,54,2,8,1,69};
        System.out.println("Array: ");
        printarray(myarray);
        System.out.println(" ");
        selectionSort(myarray);
        System.out.println("Sorted Array: ");
        printarray(myarray);
    
    }
    public static void selectionSort(int[]myarray){
        int n = myarray.length;
        for(int i = 0 ; i< n-1 ;i++){
            int  min = myarray[i];
            for(int j = i+1; j<n; j++){
                if(min>myarray[j]){
                    min = myarray[j];
                    myarray[j]=myarray[i];
                    myarray[i]=min;
                }

            }
        }  
        }
    public static void printarray(int[]myarray){
        for(int element : myarray){
            System.out.print(" "+ element);
        }
    }

}