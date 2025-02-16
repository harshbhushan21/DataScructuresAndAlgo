package Arrays;

import java.util.Scanner;
// Time complexity O(logn)
public class BinarySearch{
    public static int Bsearch(int key,int[] array){
        int s,e,m;
        s=0;
        e=array.length;
        while(s<e){
            m=(s+e)/2;
            if (array[m]>key) {
                e=m-1;
            }
            else if (array[m]<key) {
                s=m+1;
            }
            else if (array[m]==key) {
                return m;
            }
//hello this is something that i changed 
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no to be searched");
        int k =sc.nextInt();
        System.out.println("The index of the key is:"+Bsearch(k,a));
    }

}
