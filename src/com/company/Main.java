package com.company;

import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("F:\\Text\\text.txt");

        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }
}