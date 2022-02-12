package com.rehan.Game;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String name = Random();
        System.out.println("You have to guess the name : ");
        System.out.println("You have to 5 chance to win!");
        Scanner input = new Scanner(System.in);
        char[] show = new char[name.length()];
        for(int i=0;i<name.length();i++){
               show[i] = '_';
        }
        int chance = 5;
        while (chance>0){
            ;
            System.out.print("Your guess : ");
            char x = input.next().charAt(0);
            int pro = pro(x,name);

            //System.out.println("index : "+pro);
            if(pro != 100){
              show [pro] = x;

            }
            else if (pro == 100){
                chance--;
            }
            System.out.print("The word is :");
            for (int i=0;i<name.length();i++){
                System.out.print(show[i]);
            }
            System.out.println();
            if (show.toString().equals(name)){
                System.out.println("You win the game");
                break;
            }

            System.out.println("You have left "+chance+" chance!");
        }
        System.out.println("You lose the game!");

    }
    public static String Random() throws Exception{

        File file = new File("movie");
        Scanner input = new Scanner(file);

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
    public static int pro(char x,String name) throws Exception{

        int y = 100;
        char[] rehan = name.toCharArray();
        for(int i=0;i<name.length();i++){
            if(rehan[i] == x){
                y = i;
                break;
            }
        }
        return y;
    }
}
