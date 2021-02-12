package se.lexicon.g34.bl;

import se.lexicon.g34.bl.Model.ListToTextfile;

import java.util.ArrayList;
import java.util.List;

/**
 * Java I/O and Serialization practices
 * 3. In Java create a Collection that contains at least five String objects.
 * a. Then create a method that write each String object from the collection into a textfile.
 */
public class App {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Teal");
        colors.add("Maroon");
        ListToTextfile.writeList("colors.txt", colors);
    }
}
