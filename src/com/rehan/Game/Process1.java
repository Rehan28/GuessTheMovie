package com.rehan.Game;

import java.io.File;
import java.util.Scanner;

public class Process1 {

    public String tRandom() throws Exception{

        File file = new File("movie");
        Scanner input = new Scanner(file);
        int count = 0;
        String[] rehan = new String[25];
        int i = 0;
        while (input.hasNextLine()) {
            String name = input.nextLine();
            rehan[i] = name;
            i++;
        }
        int x = (int)(Math.random()*25);
        return rehan[x];
    }

}
