package Sorting;

import java.util.Arrays;

public class mergesort {
    // so what happens in mearge sort so it is a classical example of divide and conque 
    // basically we divide our problems in subproblems and try to solve the sub problems so 
    // so that we can solve to big problem simply by adding the solutions
    public static void merge(int a[],int low ,int mid,int high){
        int sorted[] = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid+1;
        int i = 0;
        while(idx1<= mid && idx2<= high){ // assumeing that we have elements in both the arrays
            if(a[idx1]<a[idx2]){
                sorted[i++] = a[idx1++];
            }
            else{
                sorted[i++] = a[idx2++];
                
            }
        }
        while(idx1 <= mid){
            sorted[i++] = a[idx1++];
        }
        while(idx2 <= high){
            sorted[i++] = a[idx2++];
        }

        // now we will just put it to sorted value in the sorted array
        for(int j = 0 , k = low ; j < sorted.length;k++,j++){
            a[k] = sorted[j];
        }
    }
    
    
    public static void mergesort(int a[], int low , int high ){
        
        if(low<high){
        int mid = (low+high)/2;
        mergesort(a, low, mid);  
        mergesort(a, mid+1, high);  
        merge(a,low,mid,high);
        }
    }
    public static void main(String[] args){
        int a[] = {6,9,7,3,0,1,8};
        mergesort(a, 0, a.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(a));
    }
    }
