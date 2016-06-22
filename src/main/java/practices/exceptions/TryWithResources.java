package practices.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

/**
 * This class tries to demonstrate how works try-with-resources block construction
 * Two methods are included one with a BufferedREader and other with a Autoclosable
 * object wich tries to demonstrate the order of execution when an Exception is
 * thrown.
 * 
 *  The order is:
 *  
 *     - closing resources declared in the try-with-resources block.
 *     - catch block
 *     - finally block
 *  
 * @author blesa
 *
 */
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
	 * This method uses an autoclosable object as a wrapper of a 
	 * BufferedReader
	 * 
	 * @param file absolute path pointing at the file we need to read
	 * @throws IOException 
	 */
	public void printFile(String file) throws IOException {

		try(MyClosableClass myCC = new MyClosableClass(file)){
			String line;
			while((line = myCC.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException ioe){
			System.out.println("Executing catch block");
			throw ioe;
		}finally{
			System.out.println("Executing finally block");
		}
	}
	
	
	public static void main(String[] args){
		
		TryWithResources twr = new TryWithResources();
		try {
		twr.printFile("./trywithresources.txt");
		} catch (IOException ioe){
			System.out.println("handling the propagated IOException from main method");
		}
	}
}
	
class MyClosableClass implements AutoCloseable {
	
	private final BufferedReader br;
	
	public MyClosableClass(String file) throws IOException {
		this.br = new BufferedReader(new FileReader(new File(file)));
	}
	
	public String readLine() throws IOException{
		
		if(true)
			throw new IOException("Houston!!! We have a problem!!!");
		return br.readLine();
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("closing buffer reader...");
		br.close();
	}
}