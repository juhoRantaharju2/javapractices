public class Practice
{

    public static void main(String[] args)
    {
        int number = 1;
        int denominator = 1;
        int n= 5;
        int k = 3;

        for(int i = 2; i<=n; i++){

            number = number *i;
            
        }
        
        for(int i = 2; i<=k; i++){

            denominator = (denominator *i)  * (n-k)*i;
            
        }

        int result = number / denominator;

        System.out.println(number); 
        System.out.println(denominator); 
        System.out.println(result);  
    }

}