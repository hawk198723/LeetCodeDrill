public class StringContainsVowels {

    public static boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {

        System.out.println(stringContainsVowels("Hello"));
        System.out.println(stringContainsVowels("wndndn"));
    }

}