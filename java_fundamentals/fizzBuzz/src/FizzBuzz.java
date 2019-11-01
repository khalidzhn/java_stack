public class FizzBuzz {
    public String fizzBuzz(int num){
        if(num%3==0) {
            if (num % 5 == 0)
                return "FizzBuzz";
            return "Fizz";
        }
        else if (num % 5 == 0)
            return "Buzz";

        return num+"";
    }

}
