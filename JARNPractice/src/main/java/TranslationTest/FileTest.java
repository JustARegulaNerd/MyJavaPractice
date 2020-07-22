package TranslationTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author justaregularnerd
 * @desc File test so I can familiarise myself with java.io.File
 * @date 22-07-2020
 */
public class FileTest {
    public static void main(String[] args) {
        try {
            File myObj = new File("/home/justaregularnerd/NetBeansProjects/MyJavaPractice/JARNPractice/src/main/java/TranslationTest/testfile.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
