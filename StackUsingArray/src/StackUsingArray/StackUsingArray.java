package StackUsingArray;


import java.io.*;
import java.util.*;

class stack {			
    public int top;
    int st[];
    final int max = 5;
    Scanner sc = new Scanner(System.in);
    stack()
    {
        top = -1;
        st = new int [max];
    }
    public void push(){
        if (top == max-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            System.out.println("Enter the item");
            int item = sc.nextInt();
            st[++top] = item;
        }
        
    }
    public void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return;
            
        }
        else
            { int item = st[top--];
              System.out.println("Item popped = "+item);
            }
    }
    public void display()
    {
        int i;
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return;
            
        }
        else
            {
        System.out.print("\nStack Elements are: ");
        for(i=top;i>=0;i--)
        {
            System.out.print("\t"+st[i]);
        }
        
    }
}
}


public class StackUsingArray {

    public static void main(String[] args) {
        stack st= new stack();
        int ch;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\n\n\t\tStack Using Arrays");
            System.out.println("\t\t\t<1> Push");
            System.out.println("\t\t\t<2> Pop");
            System.out.println("\t\t\t<3> Display");
            System.out.println("\t\t\t<4> Exit");
            System.out.print("\t\t\t    Enter Your Choice : ");
            ch = sc.nextInt();
            switch(ch)
            {
            case 1: 
                st.push();
                st.display();
                break;
            case 2:
                st.pop();
                st.display();
                break;
            case 3:
                st.display();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
            }
        } while(ch<=4);
    }

}









