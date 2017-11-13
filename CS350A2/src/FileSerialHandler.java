import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSerialHandler {

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	private static final String FILE_HEADER = "TFQuestion, MCQuestion, SAQuestion, EssayQuestion, MatchingQuestions, RankingQuestion ";

	public FileSerialHandler() {

	}

	public void save(Survey s) {
	try {
		String filename = s.SurveyName;
		FileOutputStream file = new FileOutputStream(filename + ".ser");
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Method for serialization of object
		out.writeObject(s);

		out.close();
		file.close();

		System.out.println("Object has been serialized");

	}catch(IOException ex)
	{
		System.out.println("IOException is caught");
	}
	}


	// String fileName = s.SurveyName;
	//
	// FileWriter fileWriter = null;
	//
	// try {
	// fileWriter = new FileWriter(s.SurveyName);
	//
	// // Write the CSV file header
	// fileWriter.append(FILE_HEADER.toString());
	//
	// // Add a new line separator after the header
	// fileWriter.append(NEW_LINE_SEPARATOR);
	//
	// // Write a new student object list to the CSV file
	// for (String loop : s.TFQuestions) {
	// fileWriter.append(loop);
	// fileWriter.append(COMMA_DELIMITER);
	// }
	//
	// for (String loop : s.MCQQuestions) {
	// fileWriter.append(loop);
	// fileWriter.append(COMMA_DELIMITER);
	// }
	//
	// for (String loop : s.ShortAnswerQuestions) {
	// fileWriter.append(loop);
	// fileWriter.append(COMMA_DELIMITER);
	// }
	// for (String loop : s.Essayquestions) {
	// fileWriter.append(loop);
	// fileWriter.append(NEW_LINE_SEPARATOR);
	// }
	//
	//// fileWriter.append(String.valueOf(student.getId()));
	//// fileWriter.append(COMMA_DELIMITER);
	//// fileWriter.append(student.getFirstName());
	//// fileWriter.append(COMMA_DELIMITER);
	//// fileWriter.append(student.getLastName());
	//// fileWriter.append(COMMA_DELIMITER);
	//// fileWriter.append(student.getGender());
	//// fileWriter.append(COMMA_DELIMITER);
	//// fileWriter.append(String.valueOf(student.getAge()));
	//// fileWriter.append(NEW_LINE_SEPARATOR);
	//
	//
	// System.out.println("CSV file was created successfully !!!");
	//
	// } catch (Exception e) {
	// System.out.println("Error in CsvFileWriter !!!");
	// e.printStackTrace();
	// } finally {
	//
	// try {
	// fileWriter.flush();
	// fileWriter.close();
	// } catch (IOException e) {
	// System.out.println("Error while flushing/closing fileWriter !!!");
	// e.printStackTrace();
	// }
	//
	// }
	// }

	// try{ // Catch errors in I/O if necessary.
	// // Open a file to write to.
	// FileOutputStream file=new FileOutputStream(s.SurveyName + ".ser");
	//
	// // Create an ObjectOutputStream to put objects into file.
	// ObjectOutputStream save = new ObjectOutputStream(file);
	//
	// // Now we do the save.
	// save.writeObject(s);
	//
	// // Close the file.
	// save.close(); // This also closes saveFile.
	// file.close();
	// }
	// catch(Exception exc){
	// exc.printStackTrace(); // If there was an error, print the info.
	// }
	// System.out.println("Done Saving");
	// }

	// public void saveTest(Test t)
	// {
	// try{
	// FileOutputStream fout = new FileOutputStream(t. + ".ser");
	// ObjectOutputStream oout = new ObjectOutputStream(fout);
	// oout.writeObject(t);
	// oout.close();
	// fout.close();
	// }
	// catch(IOException e)
	// {
	// System.out.println("IOException in save");
	// e.printStackTrace();
	// }
	// }

	public void load(String path) {
		try
        {   
			String filename = path + ".ser";
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
          //  object1 = (Demo)in.readObject();
            Survey s = (Survey)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
            System.out.println(s);
     
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
	}

	// //Student attributes index
	// private static final int STUDENT_ID_IDX = 0;
	// private static final int STUDENT_FNAME_IDX = 1;
	// private static final int STUDENT_LNAME_IDX = 2;
	// private static final int STUDENT_GENDER = 3;
	// private static final int STUDENT_AGE = 4;
	//
	// String fileName = path + ".csv";
	//
	// BufferedReader fileReader = null;
	//
	// try {
	//
	// //Create a new list of student to be filled by CSV file data
	//
	// ArrayList<String> TFQuestions = new ArrayList<String>();
	// List students = new ArrayList();
	//
	// String line = "";
	//
	// //Create the file reader
	// fileReader = new BufferedReader(new FileReader(fileName));
	//
	// //Read the CSV file header to skip it
	// fileReader.readLine();
	//
	// //Read the file line by line starting from the second line
	// while ((line = fileReader.readLine()) != null) {
	// //Get all tokens available in line
	// ArrayList<String> tokens = line.split(COMMA_DELIMITER);
	// if (tokens.length > 0) {
	// //Create a new student object and fill his data
	//
	// Survey s = new Survey(tokens[TFQUESTIONS]);
	// TFQuestions.add(e)
	// Student student = new Student(Long.parseLong(tokens[STUDENT_ID_IDX]),
	// tokens[STUDENT_FNAME_IDX], tokens[STUDENT_LNAME_IDX], tokens[STUDENT_GENDER],
	// Integer.parseInt(tokens[STUDENT_AGE]));
	// students.add(student);
	// }
	// }
	//
	// //Print the new student list
	// for(String loop: TFQuestions) {
	// System.out.println(loop.toString());
	// }
	//
	// for (Student student : students) {
	// System.out.println(student.toString());
	// }
	// }
	// catch (Exception e) {
	// System.out.println("Error in CsvFileReader !!!");
	// e.printStackTrace();
	// } finally {
	// try {
	// fileReader.close();
	// } catch (IOException e) {
	// System.out.println("Error while closing fileReader !!!");
	// e.printStackTrace();
	// }
	// }
	//
	// }

	// try {
	// byte[] buffer = new byte[1000];
	// FileInputStream fin = new FileInputStream(path + ".ser");
	// ObjectInputStream oin = new ObjectInputStream(fin);
	// Survey s = (Survey) oin.readObject();
	// int total = 0;
	// int nRead = 0;
	// while ((nRead = fin.read(buffer)) != -1) {
	// System.out.println(new String(buffer));
	// total += nRead;
	// }
	// oin.close();
	// fin.close();
	// return s;
	// } catch (IOException e) {
	// System.out.println("IOException in load");
	// e.printStackTrace();
	// return null;
	// } catch (ClassNotFoundException c) {
	// System.out.println("IOException in save");
	// c.printStackTrace();
	// return null;
	// }

	// // The name of the file to open.
	// String fileName = path + ".txt";
	//
	// try {
	// // Use this for reading the data.
	// byte[] buffer = new byte[1000];
	//
	// FileInputStream inputStream =
	// new FileInputStream(fileName);
	//
	// // read fills buffer with data and returns
	// // the number of bytes read (which of course
	// // may be less than the buffer size, but
	// // it will never be more).
	// int total = 0;
	// int nRead = 0;
	// while((nRead = inputStream.read(buffer)) != -1) {
	// // Convert to String so we can display it.
	// // Of course you wouldn't want to do this with
	// // a 'real' binary file.
	//
	// System.out.println(new String(buffer));
	// total += nRead;
	//
	// }
	//
	// // Always close files.
	// inputStream.close();
	//
	// System.out.println("Read " + total + " bytes");
	//
	// }
	// catch(FileNotFoundException ex) {
	// System.out.println(
	// "Unable to open file '" +
	// fileName + "'");
	// }
	// catch(IOException ex) {
	// System.out.println(
	// "Error reading file '"
	// + fileName + "'");
	// // Or we could just do this:
	// // ex.printStackTrace();
	// }
	// }
	//
	// public Test loadTest(String path) {
	// try {
	// FileInputStream fin = new FileInputStream(path + ".ser");
	// ObjectInputStream oin = new ObjectInputStream(fin);
	// Test t = (Test) oin.readObject();
	// oin.close();
	// fin.close();
	// return t;
	// } catch (IOException e) {
	// System.out.println("IOException in load");
	// e.printStackTrace();
	// return null;
	// } catch (ClassNotFoundException c) {
	// System.out.println("IOException in save");
	// c.printStackTrace();
	// return null;
	// }
	// }

}
