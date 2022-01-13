public class isPrime {
    

    public static void main(String[] args)
    {

        boolean isItPrime = true;
        
        int number = 19;
        
        for(int i = 2; i<number; i ++){

            if(number%i==0)
                isItPrime = false;
        }

        if(isItPrime)
        System.out.println("number is prime");
        else
        System.out.println("number is not prime");

    }

}
