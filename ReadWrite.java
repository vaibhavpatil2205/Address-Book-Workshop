package com.addressbook;

	
	import java.io.*;


	public class ReadWrite {

               public static void main(String[] args) 
	    		throws FileNotFoundException,IOException{
	            FileInputStream fis = new FileInputStream("src/com/AddressBook/");
	            
	            int data;
	            while((data = fis.read()) != -1) {
	            	System.out.println("data:"+ data +"\t"+(char)data);
	            	
	            }
	            
	            fis.close();
               }
	}
	
	

	    	



