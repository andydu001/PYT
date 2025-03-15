package org.example;

import org.python.core.Py;

public class Main {
    public static void main(String[] args){
        PY0 py0 = new PY0();
        //System.out.println(py0.readable());
        System.out.println(py0.mode);
        System.out.println(py0.writable());
        //System.out.println(py0.bit_length());
        py0.write(Py.newString("hello world"));
    }
}