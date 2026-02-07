class Insertion{
    public static void main(String[] args){
    int[] myarray = {12,23,32,14,34,65,76,54,1,9,78,10,1};
    Insertion(myarray);
    printarray(myarray);

}
public static void Insertion(int[]myarray){
    int n = myarray.length;
    for(int i =0; i<n ; i++){
        int key = myarray[i];
        int j = i-1;
        while(j>=0 && myarray[j]>key){
            myarray[j+1]=myarray[j];
            j=j-1;
            
        }
        myarray[j+1]=key;
    }
}
public static void printarray(int[]myarray){
    int n = myarray.length;
    for(int i =0 ; i<n ; i++){
        System.out.print(" "+ myarray[i]);
    }
}
}

