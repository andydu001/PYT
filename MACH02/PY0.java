/*
 * This Java class reads a file and prints its contents.
 * register new names
 *
 * @author andyd
 * @version 1.0
 * @since 2023-08-16
 * @see org.python.core.Py
 */
package org.example;

import com.fasterxml.jackson.databind.json.JsonMapper;

import community.flock.eco.iso.country.services.CountryIsoService;

import de.sciss.desktop.Desktop;

import net.minidev.json.parser.JSONParser;

import net.minidev.json.parser.ParseException;

import org.python.core.Py;

import org.python.modules._io.OpenMode;

import org.python.modules._io.PyFileIO;

import org.python.modules.cmath;

import org.python.modules.time.Time;

import org.xerial.snappy.Snappy;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.InputStream;

import java.util.Scanner;
public class PY0 extends PyFileIO{

    PY0(File filename) throws IOException, ParseException {

        super(Py.newString(filename.getPath()), new OpenMode(readall_doc), true);

        InputStream in = new FileInputStream(filename);

        Scanner scanner = new Scanner(in);

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            Py.println(Py.newString(line));

        }

        JSONParser jsonParser = new JSONParser();

        Object ob = jsonParser.parse(Snappy.compress(new QYT().generate()));

        Py.println(Py.newBoolean(Desktop.isMac()));

        Desktop.openFile(filename);

        //  Desktop.printFile(filename);

        Object so = jsonParser.parse(in);

        System.out.println(so);

        System.out.println(ob);

        Py.writeMessage("error", " writing");

        Py.println(Py.newFloat(2.0));

        Py.println(Py.newString("I cant write enough"));

        System.out.println(Time.asctime());

        Py.println(Time.ctime());

        Py.println(cmath.atan(Py.newInteger(40)));


        JsonMapper jsonMapper = new JsonMapper();

        CountryIsoService isoService =  new CountryIsoService(jsonMapper);

    }



}
