/**
 * CSC 112 Lab3 (Exceptionally Unique Inventory) Spring 2023
 * This program reads an inventory file and creates a database (list)
 * of unique ID numbers. Statistics about the database and file contents
 * are then displayed. The maximum list size and file name are read
 * from the user.
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Jan. 28, 2023
 */
import java.util.Scanner;

public class Inventory1 {
    public static void main(String[] args) {
        int maxListSize;       // physical (maximum) size of the database
        String inFileName;     // inventory file name

        // read listSize and inFileName from the user

        var list = new int[maxListSize];  // the database
        int size = 0;                     // database logical size

        // open file (if possible) and process
        size = readInventoryFile(inFileName, list);

        // print in ascending order the unique IDs stored in list
    }


    /**
     * Reads the contents of inFileName and stores the unique IDs in
     * list. Maintains statistics about the items read.
     *
     * @param inFileName String is the inventory file name
     * @param list int[] is the static list of unique IDs
     * @return size is int logical size of list
     */
    private static int readInventoryFile(String inFileName, int[] list) {
        int size = 0;  // number of items stored in list (logical size)

        // more code would follow...

        return size;
    }
}

