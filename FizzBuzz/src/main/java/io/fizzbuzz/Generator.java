package io.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    public List<Integer> listGenerator(int top_list){
        List<Integer> integers = new ArrayList<>();
        if(top_list==0){
            throw new IllegalStateException("zero can't be the top of the list");
        }
        for(int j=1;j<=top_list;j++){
            integers.add(j);
        }
        return integers;
    }

}
