import java.util.*;

public class test{
 public static void main(String[] args){
    int [] arr={2,1,0,1,4,5,8,52};
	quickSort(arr,0,arr.length-1);
	printArr(arr);
	 System.out.println("hello");
 
 }
 public static void quickSort(int[] arr,int low,int high){
	 if(low<high){
		 int pivot=findPivot(arr,low,high);
		 quickSort(arr,low,pivot-1);
		 quickSort(arr,pivot+1,high);
		 }
	 
  }
  public static int findPivot(int[]arr,int low,int high){
	  int pivot=arr[high];
	
	  int i=low-1;
	  for(int j=low;j<high;j++){
		  if(arr[j]<pivot){
			  i++;
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
		  
	  }
	  int temp=arr[high];
	  arr[high]=arr[i+1];
	  arr[i+1]=temp;
	  return i+1;
  }
  public static void printArr(int[] arr){
	  for(int el:arr){
		  
		  System.out.print(el+" ");
	  }
  }
}
