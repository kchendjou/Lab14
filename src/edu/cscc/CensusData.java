package edu.cscc;
//kyria mba chendjou// 12/12/2019
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * CensusData
 */
public class CensusData {
    public static String[] deserialize(String fname) throws IOException, ClassNotFoundException {
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fname));
        String[] names = (String[]) objIn.readObject();
        objIn.close();
        return names;
    }
}
