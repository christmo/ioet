package com.ioet.acme;

import com.ioet.acme.chain.PaymentChain;
import com.ioet.acme.data.Period;
import com.ioet.acme.process.InputProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //String fileName = "/Users/christmo/IdeaProjects/ioet/";
        //try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
        //    stream.forEach(System.out::println);
        //} catch (IOException e) {
        //    System.err.println("Error Reading the file: ");
        //}
        String line = "ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00";


    }

}
