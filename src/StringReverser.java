public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello World";
        int length = input.length();
        char[] reversedArray = new char[length];

        for (int i = 0; i < length; i++) {
            reversedArray[length - 1 - i] = input.charAt(i);
        }

        String reversed = new String(reversedArray);
        System.out.println("The reversed string is: " + reversed);
    }
}
