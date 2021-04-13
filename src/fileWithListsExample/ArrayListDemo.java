package fileWithListsExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		String textFilePath = "C:\\test\\TextFile_1.txt";
		String csvFilePath = "C:\\test\\SVFile_1.csv";
		
		File textFile = createFile(textFilePath);
		File csvFile =  createFile(csvFilePath);
		
		try
		{
			FileWriter fw = new FileWriter(textFile);
			fw.write("This is an example\r ");
			fw.write("This is another  example\r ");
			fw.write("This is yet one more example\r ");
			fw.close();
			
			FileWriter csvWriter = new FileWriter(csvFile);
			csvWriter.write("Course Code,Course Name,Instructor");
			csvWriter.write("\nCIS123,OOP I,Michael Mikenson");
			csvWriter.write("\nCIS 233,OOP II,Jim Jame");
			csvWriter.close();
				
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
		readFileToArrayList(textFile);
		readCSVFileToArrayList(csvFile);
		readCSVFileToCourse(csvFile);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		
		
		

	}
	/*
	 * accepts a string filePath and returns a new file if no exists, or file if already exists
	 * returns: File
	 * 
	 */
	private static File createFile(String filePath)
	{
		
		File testFile = new File(filePath);
		try {
			if(testFile.createNewFile())
			{
				System.out.println("File created: "+ testFile.getName());
			}
			else {
				System.out.println("File is either already created or you do not have permission to create a file");
		
			}
			
		}catch(IOException e){
			System.out.println("Error"+e);
			
		}
		return testFile;
	}
	
	

	//Reads data from a file  into a List  and prints the List to  the console
	private static void readFileToArrayList(File file) throws FileNotFoundException
	{
		Scanner sc = new Scanner(file);
		List<String> data  = new  ArrayList<String>();
		while(sc.hasNextLine()) {
			data.add(sc.nextLine());
		}
		for(String line : data) {
			System.out.println(line);
		
		}
		
		sc.close();
	}
	
	/*
	 * Reads data from a file  into a List,  splits lines by the deliminator  ","
		and prints the List to  the console with "|" as deliminator
	 */
	private static void readCSVFileToArrayList(File file) throws FileNotFoundException
	{
		Scanner sc = new Scanner(file);
		ArrayList<String[]> data  = new  ArrayList<String[]>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			data.add(line.split(","));
		}
		for(String[] line : data) {
			System.out.println(line[0]+ " | "+ line[1]+ " | "+ line[2]);
		
		}
		sc.close();
	}
	/*
	 * Reads data from a file  into an object type Course,  splits course values by the deliminator "," 
		and prints the courses attributes to  the console with "|" as deliminator
	 */
	private static void readCSVFileToCourse(File file) throws FileNotFoundException
	{
		
		Scanner sc = new Scanner(file);
		ArrayList<Course> data  = new  ArrayList<Course>();
		while(sc.hasNextLine()) {
			String[] line = sc.nextLine().split(",");
			data.add(new Course(line[0],line[1],line[2]));
		}
		for(Course course : data) {
			System.out.format("%-15s | %-35s | %-25s\n",
					course.getCode(),course.getName(),course.getInstructor());
		
		}
		sc.close();
	}

}
