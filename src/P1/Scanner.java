package P1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Scanner {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String filename;
		ArrayList<String> list=listAllFileInFolder("C:\\Users\\idcadmin\\Desktop\\GetLogs\\");
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext()){
			filename=itr.next();
			System.out.println("Scanning file :"+filename+"...");
			check("C:\\Users\\idcadmin\\Desktop\\GetLogs\\"+filename);
		}
			//check("C:\\Users\\idcadmin\\Desktop\\GetLogs\\"+itr.next());
	}
	public static ArrayList listAllFileInFolder(String folderPath)
	{

		ArrayList<String> list=new ArrayList<String>();
		
		File file = new File(folderPath);  
		String[] myFiles;
		myFiles=file.list();
		for(String filename:myFiles){
			if(filename.contains("log")){
				list.add(filename);
				}
		}
		return list;
	}
	public static void check(String fileName) throws Exception{
		String sCurrentLine;
		File file=new File(fileName);
		FileReader read=new FileReader(file.getAbsoluteFile());
		BufferedReader bfr =new BufferedReader(read);
		while((sCurrentLine = bfr.readLine()) != null)
		System.out.println(sCurrentLine);
	}
	
	public static void checkLine(String line){
		
	}
	
	

}
