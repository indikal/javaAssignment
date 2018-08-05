/*
 * This class will read all sub folders and the .txt and .java files
 * placing the no of lines in each file to the console.
 * <p>
 * <a href="FileReader.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author inli
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Assignment4 {
    private String folderPath; //place holder for the folder path
    private String fileType; //file type to be used to read the files
    private long totalNoOfLines = 0;
    
    /**
     * Fetch the  file, and return total no of lines.
     * 
     * @param aFile is a file to be read.
     */
    public int countLines(File file) {
        //...checks on aFile are elided
        StringBuffer contents = new StringBuffer();

        //declared here only to make visible to finally clause
        BufferedReader input = null;
        int lines = 0; //not declared within while loop
        
        try {
            //use buffering
            //this implementation reads one line at a time
            input = new BufferedReader(new FileReader(file));
            while (input.readLine() != null) {
                lines++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Given file not found in the folder!");
        } catch (IOException ex) {
            System.out.println("Unable to read the file!");
        } finally {
            try {
                if (input != null) {
                    //flush and close both "input" and its underlying
                    // FileReader
                    input.close();
                }
            } catch (IOException ex) {
                System.out.println("Unable to clean the memory used!");
            }
        }
        return lines;
    }

    /**
     * Go through all folders under the given parent folder till it finds no more
     * folders under it. Same time get the no of lines in each file.
     * @param file folder location
     */
    public void getDirectories(File dir) {
        int totalNoOfLinesInCurrFolder = 0;
        try {
            //get all files that matched with the file type given in the given folder
            File[] files = dir.listFiles(new FileFilter() {
                public boolean accept(File path) {
                    return path.getName().endsWith(fileType);                
                }});
            //process all files in the given folder
            if (files.length > 0) {
                for (int i=0; i<files.length; i++)
                    totalNoOfLinesInCurrFolder += this.countLines(files[i]);
            }
            //print the no of lines in the current folder
            System.out.println("Total number of lines in folder, " + 
                    dir.getName() + ": " + totalNoOfLinesInCurrFolder);
            
            //add this amount to the total no of lines in all folders
            totalNoOfLines += totalNoOfLinesInCurrFolder;
            
            //get all sub folders
            File[] folders = dir.listFiles(new FileFilter() {
                public boolean accept(File path) {
                    return path.isDirectory();                
                }});
            if (folders.length > 0) {
                //recursively call the same method
                for (int i=0; i<folders.length; i++)
                    getDirectories(folders[i]);
            }
        } catch (SecurityException e) {
            System.out.println("Unable to read files/folders. " +
                    "Please, check the access rights.");
        }
    }
    
    /**
     * @return Returns the fileType.
     */
    public String getFileType() {
        return fileType;
    }
    /**
     * @param fileType The fileType to set.
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    /**
     * @return Returns the folderPath.
     */
    public String getFolderPath() {
        return folderPath;
    }
    /**
     * @param folderPath The folderPath to set.
     */
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }
    
	/**
     * return the total no of lines in the given folder and its sub folders
	 * @return Returns the totalNoOfLines.
	 */
	public long getTotalNoOfLines() {
		return totalNoOfLines;
	}
    public static void main(String[] args) {
        Assignment4 asg = new Assignment4();
        try {
            //no validation were done to check the path and file type
            asg.setFolderPath(args[0]); //read directory path
            asg.setFileType(args[1]); //read file type
            asg.getDirectories(new File(asg.getFolderPath()));
            
            //print the total no of lines in all folders
            System.out.println("Total number of lines in folder, " + 
                    asg.getFolderPath() + ": " + asg.getTotalNoOfLines());
        } catch (Exception e) {
            System.out.println("Wrong no of parameters were passed. Correct syntax is 'java Assignment4 .\\ .java'");
        }
    }
}