public class Fib{
    public static void printFib(int count){
        int a=0;
        int b=1;
        int c=1;

        for(int i = 0; i<=count; i++){
            System.out.print(a +" , ");
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static void main(String args[]){
        printFib(9);
    }
}