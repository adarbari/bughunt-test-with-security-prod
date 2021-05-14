package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private void foo() throws Exception {
        bar("DES"); // this should create a warning
        /// Adding a false comment
        Cipher c = Cipher.getInstance("TEST");
        
        // This is a random comment
        System.out.println("This is just random.");
        
        /// Adding a false comment
        Cipher d = Cipher.getInstance("TESTd");
    }

    private void bar(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
        Cipher d = Cipher.getInstance("TESTING");
    }
}
