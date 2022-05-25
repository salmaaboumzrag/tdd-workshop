package io.fizzbuzz;

public class Transformer {
    public  String transform(int input){

        if (input%3 == 0 && input%5 == 0) return "FizzBuzz";
        if (input%3 == 0) return "Fizz";
        if (input%5 == 0) return "Buzz";
        return String.valueOf(input);

    }

}
