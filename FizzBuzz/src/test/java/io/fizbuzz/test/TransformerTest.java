package io.fizbuzz.test;
import io.fizzbuzz.Transformer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TransformerTest {

    Transformer transformer = new Transformer();

    @Test
    public void transformer_should_return_Fizz_when_input_multiple_of_3(){
        String output = transformer.transform(6);
        assertEquals("Fizz",output);

    }
    @Test
    public void transformer_should_return_Buzz_when_input_multiple_of_5(){
        String output = transformer.transform(100);
        assertEquals("Buzz",output);

    }
    @Test
    public void transformer_should_return_FizzBuzz_when_input_multiple_of_3_and_5(){
        String output = transformer.transform(15);
        assertEquals("FizzBuzz",output);

    }
    @Test
    public void transformer_should_return_the_number_when_input_is_not_multiple_of_3_or_5(){
        String output = transformer.transform(7);
        assertEquals("7",output);

    }

}