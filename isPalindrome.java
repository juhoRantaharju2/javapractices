public class isPalindrome {

    public static void main(String[] args)
    {

        String palindrome = "121313121";
        boolean isItPalindrome = true;
        int palindromeLength= palindrome.length()-1;

        System.out.println(palindromeLength);

        for(int i = 0; i<palindrome.length(); i ++){

            if(palindrome.charAt(i)!=palindrome.charAt(palindromeLength))
                isItPalindrome=false;

            palindromeLength = palindromeLength -1;
            
             

        }

        if(isItPalindrome)
        System.out.println("it is palindrome");
        else
        System.out.println("it is not palindrome");

        
    }

    
}
