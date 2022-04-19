package com.bpal.abstraction;

import java.util.Scanner;

public class Movie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Mymovie mymovie = new Mymovie();
        mymovie.setTitle(title);

        System.out.println("The title is: "+mymovie.getTitle());
    }
}

abstract class Name{
    String title;
    abstract void setTitle(String s);
}

class Mymovie extends Name{

    @Override
    void setTitle(String s) {
        title = s;
    }

    String getTitle(){
        return title;
    }

}
