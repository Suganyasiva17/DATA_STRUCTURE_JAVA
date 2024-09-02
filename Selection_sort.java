import java.util.*
public class Main{
    public static void Selectionsort(int[] arr,int start,int size){
        int min_index,temp;
        for(int i=start;i<size-1;i++){
            min_index=i;
            for(int j=i+1;j<size;j++){// the values before i are sorted so it is started from i+1 
                if(arr[j]<arr[min_index]){// finding minimum index
                    min_index=j;
                    }
            }
            temp=arr[min_index];// swapping
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int arr[]={5,3,1,9,8,2,4,7};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        Selectionsort(arr,0,n);
        System.out.println(Arrays.toString(arr));
        
    }
}
