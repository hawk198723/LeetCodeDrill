public class ImplementStack1{

    private int[] stack;
    private int top;

    public ImplementStack1(int capacity){
        stack = new int[capacity];
        top = -1;
    }



    public void push(int item){
        if(top == stack.length -1){
            throw new RuntimeException("Stack is full");
        }

        stack[++top] = item;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return stack[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return stack[top];
    }

    public static void main(String[] args){

        ImplementStack1 stack = new ImplementStack1(5);

        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.pop();
        // stack.push(2);
        // stack.push(2);

        System.out.println(stack.peek());

    }
}