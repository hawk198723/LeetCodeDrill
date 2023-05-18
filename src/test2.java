public class test2{
    public static void main(String args[]){
        String string = "Hello World";

        int length = string.length();

        char[] reversedString = new char[length];

        for(int i = 0 ; i<length ; i++){

            reversedString[length - 1 - i] = string.charAt(i);
        }

        System.out.println(reversedString);
    }
}