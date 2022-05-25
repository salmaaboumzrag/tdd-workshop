package io.github.benrkia;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.management.relation.InvalidRoleInfoException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {


  StringCalculator sut= new StringCalculator();
  @Test
  void should_return_zero_when_the_string_is_empty() {
    //Act
    int actual= sut.sum("");
    //
    assertEquals(0,actual);
  }
  @Test
  void should_return_zero_when_the_string_contain_one() {
    //Act
    int actual= sut.sum("3");
    //
    assertEquals(3,actual);
  }
  @Test
  void should_return_zero_when_the_string_contain_numbers_separated_by_kama() {
    //Act
    int actual= sut.sum("2,5");
    //
    assertEquals(7,actual);
  }
  @Test
  void should_return_zero_when_the_string_contain_numbers_separated_by_new_line() {
    //Act
    int actual= sut.sum("21\n5");
    //
    assertEquals(26,actual);
  }
  @Test
  void should_return_zero_when_the_string_contain_numbers_separated_by_new_line_and_kama() {
    //Act
    int actual= sut.sum("21\n5,10");
    //
    assertEquals(36,actual);
  }
  @Test
  void should_throw_exception_when_input_is_invalide() {

   String msg= assertThrows(InvalidInputException.class, () -> {sut.sum(null);}).getMessage();

   assertEquals("sum does not support null value",msg);
  }
  @ParameterizedTest
  @MethodSource
  void should_throw_exception_invalid_input_data(final String input, final Class <? extends Throwable> exception, final String exceptiinMsg) {
    String msg = assertThrows(exception, ()  -> {sut.sum(input);}).getMessage();
    assertEquals(exceptiinMsg,msg);
  }
  private static Stream<Arguments> should_throw_exception_invalid_input_data(){
    return Stream.of(
            Arguments.of("12\nabcn4",InvalidInputException.class,"delimited values must be valid numbers"),
            Arguments.of("12\n,20",InvalidInputException.class,"delimited values must be valid numbers")
    );
  }


  

}
