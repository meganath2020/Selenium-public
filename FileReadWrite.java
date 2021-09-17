package j8selenium;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileReadWrite {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
String Location ="filewritersample.txt";
String content = "using file writer i wrote this ";
FileWriter filevar= new FileWriter(Location);
filevar.write(content);
filevar.close();
System.out.println("testingmain");

  fileiostreamwriter(); bufferexm(); pathwriter(); 
 
Filereadmthd();
  
	}
	
	// aftergithub
	// aftergithub1
	public static void bufferexm() throws IOException
	{
		System.out.println("testing12");
		String Location ="bufferexmsample.txt";
		String content = "using buffer writer i wrote this ";
		String content2 = "Second line in buffer ";
		FileWriter filevar= new FileWriter(Location);
BufferedWriter filebuffvar = new BufferedWriter(filevar);
		filebuffvar.write(content);
		filebuffvar.write("\n");
		filebuffvar.write(content2);
		filebuffvar.write("\n"+"new line2");
		filebuffvar.write("\n"+"new line3");
		filebuffvar.write("\n"+"new line4");
		filebuffvar.close();
		filevar.close();
		
	}
	
	public static void fileiostreamwriter() throws IOException
	{
		System.out.println("testing1");
		String Location ="fileiostreamwritersample.txt";
		String content = "using file io stream i wrote this ";
	FileOutputStream filevarostrm = new FileOutputStream(Location);
	byte[] bytevar=content.getBytes();
	filevarostrm.write(bytevar);
	filevarostrm.close();
		
	}

	public static void pathwriter() throws IOException
	{
		String Location ="pathwritersample.txt";
		String content = "using pathwriter i wrote this ";
		//System.out.println("testing123");
		Path pathvar = Paths.get(Location);
			Files.write(pathvar, content.getBytes());
		
	}
	public static void Filereadmthd() throws IOException
	{
		String Location ="bufferexmsample.txt";
		FileReader Filereadvar = new FileReader(Location);
		BufferedReader Buffreadvar = new BufferedReader(Filereadvar);
		String strsample=Buffreadvar.readLine();
		while (strsample!=null)
		{
			
			System.out.println(strsample);
			strsample=Buffreadvar.readLine();
		
		}
		Buffreadvar.close();
		
	}
}
