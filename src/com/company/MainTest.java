package com.company;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test

    public void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("F:\\Text\\text.txt");

        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }
}