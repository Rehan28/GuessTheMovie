//package com.rehan.Game;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
public class Process  {

   Process1 Random = new  Process1();
     String Movie = getRandom();

    public Process() throws Exception {
    }

    public boolean pro(char x) throws Exception{
        String name = Movie;
        boolean y = false;
        char[] rehan = name.toCharArray();
        for(int i=0;i<name.length();i++){
            if(rehan[i] == x){
                y = true;
            }
        }
        return y;
    }
    public int getValue(char z) throws Exception {
        String name = Movie;
        int y;
        //int y = name.indexOf(z);
        char[] rehan = name.toCharArray();
        for(int i=0;i<name.length();i++){
            if(rehan[i] == z){
                y = i;
            }
        }
        return y;
    }
    public int getLength() throws Exception{
        int x = Movie.length();
        return x;
    }
    //public String getRandom() throws Exception{
        //return Random.getRandom();
    //}

}
