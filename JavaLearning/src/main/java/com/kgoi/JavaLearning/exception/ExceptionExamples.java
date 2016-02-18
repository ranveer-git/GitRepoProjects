package com.kgoi.JavaLearning.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionExamples implements AutoCloseable{

	public static void main(String[] args) {
		try {
			//ExceptionExamples.methodA();
		} catch (Exception e) {
			System.out.println("Catch block Main Method");
		}finally{
			System.out.println("Inside Main Method Finally Block");
		}
	}
	public static void tryWithResources() throws ApplicationException, IOException{
		try(FileWriter fileWriter = new FileWriter(new File("D:\\a1.txt"))){
			System.out.println("hi1");
		}
		System.out.println("hi");
		
		try(ExceptionExamples exceptionExamples = new ExceptionExamples()){
			System.out.println("hi1");
		}
		System.out.println("hi");
	}
	public static void methodA() throws FileNotFoundException{
		try {
			System.out.println(methodB());
			
		} catch (Exception e) {
			System.out.println("Inside Catch Block of methodA");
		}
		finally{
			System.out.println("Start of finally block in methodA");
			File file = new File("D:\\a1.txt");
			FileReader fr = new FileReader(file);
			System.out.println("End of finally block in methodA");
		}
	}

	static int str = 1;
	private static int methodB() throws IOException {
		FileReader fr = null,fr1 = null;
		try {
			System.out.println("Method B Called");
			File file = new File("D:\\a.txt");
			fr = new FileReader(file);
			try {
				System.out.println("Method B Called");
				file = new File("D:\\a1.txt");
				fr1 = new FileReader(file);
			} catch (FileNotFoundException e) {
				System.out.println("Before throwing exception in methodB");
				throw e;
			}
			finally{
				fr1.close();
				str += 2;
				System.out.println(str+" Value in Finally");
				System.out.println("Start of finally block in methodB");
				System.out.println("End of finally block in methodB");
				//return str;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Before throwing exception in methodB");
		}
		finally{
			fr.close();
			str += 2;
			System.out.println(str+" Value in Finally");
			System.out.println("Start of finally block in methodB");
			System.out.println("End of finally block in methodB");
			//return str;
		}
		
		return str;
	}
	@Override
	public void close() throws ApplicationException {
		// TODO Auto-generated method stub
	}

}
