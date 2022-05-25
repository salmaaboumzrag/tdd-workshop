package io.fizzbuzz;



public class Validator {
    public boolean validate(Object obj){
        if(obj instanceof Integer){
            if((Integer) obj>0){
                return true;
            }
            throw new RuntimeException("input must be greater than 0");
        }
        throw new RuntimeException("the input is not Integer");
    }


}
