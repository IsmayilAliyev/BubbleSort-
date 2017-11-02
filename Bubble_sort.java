/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

/**
 *
 * @author AliyevIs
 */
import java.util.Scanner;
import java.util.Arrays;
public class Bubble_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please Choose the Length of Array:-");
        int l=in.nextInt();
        int [] arr = new int [l];
        for(int i=0; i<arr.length; i++){
            System.out.println("Please Enter the " + (i+1) + " elements of Array :-" );
            arr[i]=in.nextInt();
        }
        String ar_str= Arrays.toString(arr);
        System.out.println("Default Array is -->>  " + Arrays.asList(ar_str));
        
        BubbleSort(arr,l);
        ar_str= Arrays.toString(arr);
        System.out.println("Sorted Array is -->>  "+ Arrays.asList(ar_str)); 
          
//         for(int i=0; i<l;i++){
//            System.out.println(arr[i]);
//            
//            
//        }
    }
    
    public static void BubbleSort(int arr[], int n){
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<(n-i)-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,(j+1));
                }
            }
        }
       
        
    }
    public static void swap(int arr [], int a , int  b){
        int d=arr[a];
        
        arr[a]= arr[b+1];
        arr[b+1]=d;
        
    }
    
}
