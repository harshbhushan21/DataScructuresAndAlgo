package Arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static int[] Revarray(int a[]){
        int f=0,l=(a.length)-1;
        while (f<l) {
            //swap
            int temp=a[f];
            a[f]=a[l];
            a[l]=temp;
            f++;
            l--;
            
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Reversed Array is"+Revarray(a));
    }
}
