package io.fizbuzz.test;
import io.fizzbuzz.RuntimeException;
import io.fizzbuzz.Validator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class ValidatorTest {
    Validator validator = new Validator();
    @Test
    public void validator_should_throw_exception_when_input_is_not_integer(){
        String expectedMessage = "the input is not Integer";
        Exception exception = assertThrows(RuntimeException.class, () -> {
            validator.validate("abc");});

        String actual = exception.getMessage();
        assertTrue(actual.contains(expectedMessage));
    }
    @Test
    public void validator_should_not_throw_exception_when_input_is_integer(){
        boolean output = validator.validate(25);
        assertTrue(output);
    }
    @Test
    public void validator_should_throw_exception_when_input_lower_than_one(){
        String expectedMessage = "input must be greater than 0";
        Exception exception = assertThrows(RuntimeException.class, () -> {
            validator.validate(-10);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void validator_should_not_throw_exception_when_input_greater_than_zero(){
        boolean output = validator.validate(700);
        assertTrue(output);
    }



}