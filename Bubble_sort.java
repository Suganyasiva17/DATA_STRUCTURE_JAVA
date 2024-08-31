// Bubble sort
//its a swapping algorithm
//objective- moving the largest element to rightmost
// so that in every pass the last element is fixed need not to bring for sort 
// in second for loop we mwntioned len-1-i which means for every outer for loop the rightmost is sorted 
// we can get the largest element in 1st iteration itself and smallest using tweak logic
//time complexity =o(nsquare)
// if the array is sorted na we can make it as o(n) ny assigning the swap boolean value set to false

import java.util.*;
class Main{
    public static void BubbleSort(int[] arr){
        int len=arr.length;
        int temp;
        for(int i=0;i<len;i++){// number of passes
            for(int j=0;j<len-i-1;j++){// number of iterations
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
            
        }
    }
    
    
    using swap value for sorted array to make it efficient
    public static void BubbleSort(int[] arr){
        int len=arr.length;
        int temp;
        boolean swap=false;
        for(int i=0;i<len;i++){// number of passes
            for(int j=0;j<len-i-1;j++){// number of iterations
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
            System.out.println(Arrays.toString(arr));
            
        }
    }
    
     public static void main(String[] args){
        int a[]={28,6,4,2,24};
        BubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
