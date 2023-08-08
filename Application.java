
// Java program to find a leap year
// Importing Classes/Files
import java.io.*;
  
// Class for leap-year dealing
public class GeeksforGeeks {
    // Method to check leap year
    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;
  
        // If year is divisible by 4
        if (year % 4 == 0) {
            is_leap_year = true;
  
            // To identify whether it is a
            // century year or not
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
  
        // We land here when corresponding if fails
        // If year is not divisible by 4
        else
  
            // Flag dealing-  Non leap-year
            is_leap_year = false;
  
        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
  
    // Driver Code
    public static void main(String[] args)
    {
        // Calling our function by
        // passing century year not divisible by 400
        isLeapYear(2000);
  
        // Calling our function by
        // passing Non-century year
        isLeapYear(2002);
    }

    # new changes commit by other person 
    hjbwdfhbjf
    jkbdcwbhj
    jdebjh
    

    #feature201 changes by irfan in aug 0
    import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;
  
public class Decrypt_pdf {
    public static void main(String[] args)
        throws IOException
    {
  
        // select a file for Decryption operation
        File file = new File("D:\\Bluetooth\\Encrypted.pdf");
  
        // Load the PDF file
        PDDocument pdd = PDDocument.load(file, "12345");
  
        // removing all security from PDF file
        pdd.setAllSecurityToBeRemoved(true);
  
        // Save the PDF file
        pdd.save(file);
  
        // Close the PDF file
        pdd.close();
        System.out.println("Decryption Done...");
    }
}

}
