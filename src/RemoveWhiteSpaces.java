public class RemoveWhiteSpaces{
    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

    public static void main(String args[]){
        String result = removeWhiteSpaces("hello I am Jason");
        System.out.println(result);
    }
}