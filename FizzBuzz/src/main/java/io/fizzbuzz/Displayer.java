package io.fizzbuzz;

import java.util.List;

public class Displayer {

    public void display(List list) {
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
