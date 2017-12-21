import java.util.*;
import java.io.*;
public class quickSort{


private int partition(int arr[],int low,int high){
//assign a pivot - the last element
  int pivot = arr[high];
//assign the wall
  int i = low-1;
//interate through the entire list and sort with the pivot
for(int j=low;j<high;j++){
  if(arr[j]<=pivot){
    i++;//increment the wall position each and every time you swap the current element withthe element next to the wall
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] =temp;
  }//if the current element is <=pivot , then swap the current element and the first element next to the wall
}

//after the iteration, when all the elements to the right of the list is >= pivot, swap the pivot and the element next to the wall
int temp = arr[i+1];
arr[i+1] = arr[high];
arr[high] =temp;

return i+1; //increment the wall position

}

private void displaySorted(int arr[])
{
  for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
  }
}

private void sort(int arr[],int low,int high)
{
//find the partition and then recursively sort left and right sides of the array
if(low<high){
int pi= partition(arr,low,high);
sort(arr,low,pi-1);
sort(arr,pi+1,high);
}
}

public static void main(String args[]){
int arr[] ={6,5,1,3,8,4,7,9,2};
int n =arr.length;
quickSort qs = new quickSort();
qs.sort(arr,0,n-1);
qs.displaySorted(arr);

}//main method close

}//class close
