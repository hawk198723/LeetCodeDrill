public class PalindromeCheck{

    public static boolean isPalindrome(String string){


        int i=0;
        int j=string.length()-1;

        string = string.toLowerCase(); // Remember to changeto LowerCase

        while(i<j){
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }

            i++;
            j--;

        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("123421"));
        System.out.println(isPalindrome("mammam"));
        System.out.println(isPalindrome("racecar"));
    }

}