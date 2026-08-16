import java.util.Scanner;

public class P1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        
      for(int i = 0; i < n; i++){
        System.out.print("Enter " + (i+1) + "Element =");
        a[i] = sc.nextInt();
      }  
      int max = a[0];
      int min = a[0];
     
      for(int i = 0; i < n; i++){
          if(a[i] > max){
            max = a[i];
          }
          else if(a[i] < min){
            min = a[i];
          }
      }
      System.out.println("MAX = " + max);
       System.out.println("MIN = " + min);
      int smax = min;
      int smin = max;
      for(int i = 0; i < n; i++){
        if(smax < a[i] && max > a[i]){
          smax =  a[i];
        }
        if(smin > a[i] && min < a[i]){
          smin =  a[i];
        }
      }
      System.out.println("Second MAX = " + smax);
       System.out.println("Second MIN = " + smin);
    }
}