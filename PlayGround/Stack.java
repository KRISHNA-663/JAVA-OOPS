import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Stack<Integer> stk = new Stack<>();
        Boolean n = stk.empty();
        System.out.println("Stack is : "+n);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        System.out.println("Stack size : "+stk.size());
        System.out.println("Top element : "+stk.peek());
        System.out.println("===============================");
        n=stk.empty();
        System.out.println("Stack is : "+n);
        while(!stk.isEmpty())
        {
            System.out.println("Stack element poped : "+stk.pop());
        }
        System.out.println("===============================");
        n=stk.empty();
        System.out.println("Stack is : "+n);
    }
}
