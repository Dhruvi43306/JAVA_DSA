import java.util.Scanner;

public class PROBLAM_I {
    
    int top = -1;
    int size = 100;
    int[] stack = new int[size]; 
    public void push(int x){
        if(top == size-1){
            System.err.println("OverFlow");
            return;
        }
       top = top + 1;
       stack[top] = x; 
       System.out.println(x + " pushed into stack");
    }
    
    public int pop(){
        if(top == -1){
            System.err.println("UnderFlow");
            return -1;
        }
        int y = stack[top];
        top = top - 1;

        return y;
    }

    public int peep(int i){
        if(top-i+1 < 0){
            System.out.println("Stack Underflow: Invalid position\n");
            return -1;
        }
        return stack[top-i+1];
    }
   
    public static void main(String[] args) {
        PROBLAM_I p1 = new PROBLAM_I();  
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            System.out.println("Enter a Element "+(i+1)+ ": ");
            int temp = sc.nextInt();
            p1.push(temp);
        }
        
        System.out.println("Popped element = " + p1.pop());
        System.out.println("Peek element = "+p1.peep(1));
    }
}