package org.example;

import net.minidev.json.parser.ParseException;

import org.python.core.Py;

import java.io.File;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        String path = "C:\\Users\\andyd\\OneDrive\\Documents\\place101.txt";

        File file = new File(path);

        PY0 py0 = new PY0(file);

        System.out.println(py0.mode);

        System.out.println(py0.writable());

        new QYT();

        py0.write(Py.newString(new QYT().generate()+"\t"));


    }
}