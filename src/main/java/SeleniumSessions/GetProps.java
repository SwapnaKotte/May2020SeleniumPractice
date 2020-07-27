package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProps {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("/Users/surendra/eclipse-workspace/May2020SeleniumSessions/config.properties");
		
		prop.load(ip);
		
		System.out.println(prop);
		
	}

}
