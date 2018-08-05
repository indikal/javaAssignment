/*
 * 
 * <p>
 * <a href="RemortSite.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;

/**
 * @author inli
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class RemortSite {
    private final static String strUrl = "http://www.marakanda.se/default.asp";

    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlConn = null;
        
        //declared here only to make visible to finally clause
        InputStreamReader inStream = null;
        BufferedReader buff = null;
        
        try {
            // Create the URL object that points
            // at the given remort site
            url = new URL(strUrl);
            urlConn = url.openConnection();
            
            System.out.println("Printing headers ...");
            System.out.println("_________________________________________________________\n");
            //Print out the contents of various header fields.
            Map headers = urlConn.getHeaderFields(); //This will return all the headers available
            Iterator i = headers.entrySet().iterator(); //create an iterater to print them out

            //Print the headers to the console
            while (i.hasNext ())
              System.out.println (i.next ());
            
            System.out.println("_________________________________________________________\n");
            //end of headers
            
            System.out.println("Printing body content ...");
            System.out.println("_________________________________________________________\n");
            //Create a IO stream to get the body content of the remort site
            inStream = new InputStreamReader(urlConn.getInputStream());
            buff = new BufferedReader(inStream);

            // Read and print the lines from the remort site
            while (true) {
                nextLine = buff.readLine();
                if (nextLine != null) {
                    System.out.println(nextLine);
                } else {
                    break;
                }
            }
            System.out.println("_________________________________________________________\n");
            
        } catch (MalformedURLException e) {
            System.out.println("ERROR: Please, check the URL given!");
        } catch (IOException e1) {
            System.out.println("Can't read from the remort site!");
        } finally {
            
            try {
                buff.close();
                inStream.close();
            } catch (IOException e2) {
                System.out.println("Unable to clean the IO objects created!");
            }
        }
    }
}