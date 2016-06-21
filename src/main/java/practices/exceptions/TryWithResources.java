package practices.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class TryWithResources {
	
	public void printFile() {

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./trywithresources.txt")))){
			String line;
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Error regarding input stream");
		}finally{
			System.out.println("Executing finally code block");
		}
	}
	
	/**
	 * 
	 * @param file absolute path pointing at the file we need to read
	 */
	public void printFile(String file) throws IOException {

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)))){
			String line;
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
		}finally{
			System.out.println("Executing finally code block");
		}
	}
	
	
	public static void main(String[] args){
		
		TryWithResources twr = new TryWithResources();
		twr.printFile();
	}
	
	
}