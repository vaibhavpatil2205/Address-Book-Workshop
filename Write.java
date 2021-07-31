package com.addressbook;
	
	import java.io.*;

	public class Write {
		
		

			public static void main(String[] args) 
				throws FileNotFoundException,IOException{
				
		        FileOutputStream fos = new FileOutputStream("src/com/AddressBook/");
		        
		        fos.write(PersonInfo);
		        
		        System.out.println("data is saved");
		        
		        fos.close();
		        
		        }
			}


