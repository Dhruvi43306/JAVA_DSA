import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        
      for(int i = 0; i < n; i++){
        System.out.print("Enter " + (i+1) + "Element =");
        a[i] = sc.nextInt();
      }  
      int maxcount = 0;
      int currunt = a[0];
      for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j < n; j++){
            if(a[i] == a[j]){
                count++;
            }
        }
        if(count > maxcount){
            maxcount = count;
            currunt = a[i];
        }
      }
        for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j < n; j++){
            if(a[i] == a[j]){
                count++;
            }
        }
        boolean isprinted = false;
        for(int k = 0; k < i; k++){
            if(a[i] == a[k]){
                isprinted = true;
                break;
            }
        }
        if(count == maxcount && !isprinted){
            System.out.println(a[i]);
        }
    }
    }
}
