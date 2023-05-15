package framework.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FilesOperation {

	
	  public String getProperties(String filename , String properties) throws IOException {
		  
		 
		 
		 try (InputStream inputStream = new FileInputStream(filename)){
			 
			  Properties prop = new Properties();
			  prop.load(inputStream);
			  return prop.getProperty(properties);
				
			 }
			 	 
	   catch(IOException e) {
			 
			 System.out.print("O arquivo não foi encontrado" + e.getMessage());
			 e.printStackTrace();
		 }
		 return null;  
	  }
	  
	 
	  
}
