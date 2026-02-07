#include<stdio.h>

    int linearsearching(int* arr,int n,int key){
for (int i =0;i<n;i++){
    // if key found
    if(arr[i]==key){
    return i;
    }
}
//  else case arwe here , can use else 
return -1;
}
// Array define 
int main(){
            // [0  1  2  3  4  5  6  7  8] Array index represention
    int arr[]={10,20,40,50,30,20,34,56,67};
int n=sizeof(arr)/sizeof(arr[0]);

// provide key , use scanf for user 
int key;
printf("Entyer the value of key : ");
scanf("%d",&key);

// int key=30;
// calling linearsearching()for arr with key=43
int i=linearsearching(arr,n,key);
if(i==-1){
    printf("key  not found");
}else{
    printf("key found at the index of : %d ",i);

}
return 0;
}