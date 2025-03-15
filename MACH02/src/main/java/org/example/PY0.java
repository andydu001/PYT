/*
 * This Java class reads a file and prints its contents.
 *
 * @author andyd
 * @version 1.0
 * @since 2023-08-16
 * @see org.python.core.Py
 */
package org.example;

import org.python.core.Py;

import org.python.modules._io.OpenMode;

import org.python.modules._io.PyFileIO;

public class PY0 extends PyFileIO{
    PY0() {
        super(Py.newString("C:\\Users\\andyd\\OneDrive\\Documents\\place101.txt"), new OpenMode(readall_doc), true);

        Py.writeMessage("error", " writing");

        Py.println(Py.newFloat(2.0));

        Py.println(Py.newString("I cant write enough"));

        String string  = Py.fileSystemDecode(Py.newString("C:\\Users\\andyd\\OneDrive\\Documents\\place101.txt"));

        System.out.println(string);

        //System.out.println(__len__());

    }
}
