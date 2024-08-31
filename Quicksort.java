// quick short
import java.util.*;
class Main{
    public static void quicksort(int[] arr,int low, int high){
        if(low<high){
            int Partition_index=Partition(arr,low,high);
            quicksort(arr,low,Partition_index-1);
            quicksort(arr,Partition_index+1,high);
        }
    }
    public static void Swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int Partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int SwapIndex=low-1;
        for(int j=low;j<high;j++){// loop ends before pivot elt
            if(arr[j]<pivot){
                SwapIndex++;
                Swap(arr,j,SwapIndex);
            }
        }
        Swap(arr,SwapIndex+1,high);// atlast swapping pivot with position SwapIndex++ for Partition
        return SwapIndex+1; // returning the index for Partition_index
    }
    public static void main(String[] args){
        int arr[]={70,90,10,30,50,20,60};
        int len=arr.length;
        quicksort(arr,0,len-1);// giving the high  index value not the size of Arrays
        System.out.println(Arrays.toString(arr));
    }
}
