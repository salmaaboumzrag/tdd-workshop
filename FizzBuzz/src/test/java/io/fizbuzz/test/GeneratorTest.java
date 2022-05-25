package io.fizbuzz.test;

import io.fizzbuzz.Generator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

        Generator generator = new Generator();
        @Test
        public void generator_should_throws_exception_when_it_starts_by_zero(){
            Exception exception = assertThrows(RuntimeException.class,()->{
                generator.listGenerator(0);
            });
            String actual = exception.getMessage();
            assertTrue(actual.contains("zero can't be the top of the list"));
        }
        @Test
        public void generator_should_return_singleton_list_containing_one_item_when_input_is_one(){
            List<Integer> list = generator.listGenerator(1);
            assertEquals(list.size(),1);
        }
        @Test
        public void generator_should_return_list_from_one_to_the_input_value(){
            List<Integer> list = generator.listGenerator(11);
            List<Integer> actual_list = new ArrayList<>();
            for(int j=1;j<=11;j++){
                actual_list.add(j);
            }
            assertEquals(list,actual_list);



}}