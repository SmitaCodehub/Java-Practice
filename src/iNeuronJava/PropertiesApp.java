package iNeuronJava;

//package iNeuronJava;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;

public class PropertiesApp {

	

			public static void main(String[] args) throws Exception {
				
				FileInputStream fis= new FileInputStream("C:\\Users\\Patil\\eclipse-workspace\\iNeuronJava\\src\\iNeuronJava\\Application.properties");
				Properties properties=new Properties();
				properties.load(fis);
				
				String url=properties.getProperty("url");
				String user=properties.getProperty("user");
				String password=properties.getProperty("password");
				
				System.out.println("URL  :"+url);
				System.out.println("User  :"+user);
				System.out.println("password  :"+password);
				
				

			}

		
	

}
