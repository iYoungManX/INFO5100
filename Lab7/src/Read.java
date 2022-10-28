import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    private static final int NUM_LINE=5;
    String[] readFromFile(String filename) {
        File file= new File(filename);
        Scanner reader;
        // catch the exception when file is not found
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // initilize the first two stringbuilder
        StringBuilder sbRead= new StringBuilder("");
        StringBuilder sbWrite= new StringBuilder("");
        // parse the input file
        for(int i=0;i<NUM_LINE;i++) {
            if (i == 0) {
                // Don't parse the first line
                String cur = reader.nextLine();
                sbRead.append(cur).append("\n");
                sbWrite.append(cur).append("\n");
            } else {
                // Parse the first three column
                String s = reader.nextLine();
                String[] splitString = s.split(",");
                sbRead.append(s).append("\n");
                sbWrite.append(splitString[0]).append(",").
                        append(splitString[1]).append(",").
                        append(splitString[2]).append("\n");
            }

        }


        reader.close();

        // use String[] as the output
        //[0] for the read [1] for write
        String[] res = new String[2];
        res[0]=sbRead.toString();
        res[1]=sbWrite.toString();
        return res;
    }



}
