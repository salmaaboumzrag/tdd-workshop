package io.fizbuzz.test;


import io.fizzbuzz.Displayer;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DisplayerTest {

    Displayer displayer = new Displayer();
    @Test
    public void displayer_should_call_sout_with_great_parameters() throws IOException {

        List<Integer> actual_list = new ArrayList<>();
        for(int j=1;j<=3;j++){
            actual_list.add(j);
        }
        displayer.display(actual_list);

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        displayer.display(actual_list);
        bo.flush();
        String allWrittenLines = new String(bo.toByteArray());
        assertTrue(allWrittenLines.contains("1"+"\n"+"2"+"\n"+"3"+"\n"));

    }

}