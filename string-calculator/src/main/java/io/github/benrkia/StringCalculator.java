package io.github.benrkia;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

    public static final String COMMA_NEWLINE_REGEX = "[,\n]";
    int c=0;

    public int sum(final String input)  {
        if (input == null) throw new InvalidInputException("sum does not support null value");
        if (input.isEmpty())
            return  0;


        String[] numbers =input.split(COMMA_NEWLINE_REGEX);
        List<Integer> parsedNumbers = Stream.of(numbers)
                .map(this::parse)
                .collect(Collectors.toList());

        ToIntFunction<String> stringToIntFunction = number -> parse(number);
        return Stream.of(numbers)
                .mapToInt(stringToIntFunction)
                .sum();
    }

    private int parse(final String number){
        try{
            return  Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("delimited values must be valid numbers");
        }
    }
}
