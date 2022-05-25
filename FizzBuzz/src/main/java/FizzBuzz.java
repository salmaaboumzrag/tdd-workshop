import io.fizzbuzz.Displayer;
import io.fizzbuzz.Generator;
import io.fizzbuzz.Transformer;
import io.fizzbuzz.Validator;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int top_list=20;
        List <Integer> generated_list = null;
        List <String> transformed_list = new ArrayList<>();


        if (new Validator().validate(top_list))  generated_list =new Generator().listGenerator(top_list);

        for (int i=0;i<generated_list.size();i++) {
            transformed_list.add(new Transformer().transform(generated_list.get(i)));
        }

        new Displayer().display(transformed_list);
    }

}
