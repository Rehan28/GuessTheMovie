package com.rehan.Game;

import java.io.File;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) throws Exception {
      String name = "-----";
        char[] show = new char[name.length()];
        for(int i=0;i<name.length();i++){
            show[i] = '_';
        }
        String rehn = show.toString();
        System.out.println(rehn);
        if (show.toString().equals(name)){
            System.out.println("rehan");
        }
    }
}
