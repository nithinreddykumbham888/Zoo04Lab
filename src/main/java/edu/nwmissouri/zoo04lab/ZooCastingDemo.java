package edu.nwmissouri.zoo04lab;

import java.util.Arrays;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Illustrate exception handling in Java.
 *
 * In production, half your code might be error handling.
 *
 * See also http://www.cs.fsu.edu/~myers/cop3331/notes/javaexcept.html See also
 * https://www.edureka.co/blog/java-exception-handling See also
 * https://devqa.io/java-exception-handling/
 */
public class ZooCastingDemo {

    private static final Logger log = LogManager.getLogger(ZooCastingDemo.class);

    public static void main(String[] args) {
        log.info("Starting main() with args=" + args);

        // create some local variables of different types
        int i = 2;
        int j = 0;
        double x = 42.9;
        var aard = new Aardvark("Ardy");
        var aardSpecial = new AardvarkPregnant("Alice", true, 3);

        // try some polymorphic substitutions
        System.out.println("===============================");
        System.out.println("CASTING");
        System.out.println("===============================");
        System.out.println("Cast to simple int from double: " + (int) x);
        System.out.println("Cast to double from simple int: " + (double) i);
        System.out.println("Cast to simple Aard from Special Aard: " + (Aardvark) aardSpecial);
        //System.out.println("Cast to Special Aard from simple Aard: " + (AardvarkPregnant) aard);
        System.out.println("===============================");

        System.out.println("==========================================");
        System.out.println("DIVIDING with possible ArithmeticException");
        System.out.println("==========================================");
        try {
            System.out.printf("About to divide %d by %d...", i, j);
            System.out.println();
            var result = i / j;

        } catch (ArithmeticException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }

        System.out.println("==========================================");
        System.out.println("OPENING FILE and handling exceptions");
        System.out.println("==========================================");

        // declare variables in try-catch-finally outside the blocks
        FileReader reader = null;
        String filename = "ROOT_FILEZ.txt";

        try {
            reader = new FileReader(filename);
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: FileNotFoundException for " + filename);
        } catch (IOException e) {
            System.out.println("ERROR: Other IOException. " + e.toString());
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("ERROR: can't call close() on something that doesn't exist (null). " + e.toString());
            }
        }

        // catching & handling an exception thown by a function
        try {
            int result = tryReadingFile(filename);
            System.out.println("SUCCESS: read " + filename + " result:" + result);

        } catch (IOException ex) {
            System.out.println("ERROR: could not read file " + filename);
        }
        log.info("Exiting main() ");

    }

    /**
     * A function is a clean way to wrap up a bit of processing code. Often, the
     * function doesn't know how exceptions should be handled, so if they get an
     * exception they just throw it up to the calling method.
     *
     * @param fn - the file name to be read
     * @return - int result of reading the file
     * @throws FileNotFoundException - Cannot find that path and file
     * @throws IOException - other read/write exception
     */
    private static int tryReadingFile(String fn) throws FileNotFoundException, IOException {
        System.out.println("==========================================");
        System.out.println("THROWING EXCEPTIONS FROM FUNCTION");
        System.out.println("==========================================");
        FileReader reader;
        reader = new FileReader(fn);
        var result = reader.read();
        reader.close();
        return result;
    }
}
