#include<stdio.h>


int binarysearch(int arr[],int low,int high,int key){
    if(high>=low){
        int mid=low+(high-low)/2;
        if (arr[mid]==key);
        return mid;
        if(arr[mid]>key)
        return binarysearch(arr,low,mid-1,key);

    }
return -1;
}
int main(){
    int arr[]={2,3,4,5,6,3,7,2};
    int key=2;
    int n=sizeof(arr)/sizeof(arr[0]);
    int result=binarysearch(arr,0,n-1,key);
    (result==-1)?printf("Element is not present in array"):
                 printf("element present at %d",result);

return 0;
}

