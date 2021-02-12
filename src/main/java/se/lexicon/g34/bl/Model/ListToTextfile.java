package se.lexicon.g34.bl.Model;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ListToTextfile {
    public static void writeList(String dest, List<String> toWrite) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
                for(String stw:toWrite){
                    writer.write(stw+"\n");
                }
            writer.flush();

        }  catch (IOException e) {
        }

    }
}

