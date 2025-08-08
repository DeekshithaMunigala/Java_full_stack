package com.wipro.fileinputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputAndOutput {

	public static void main(String[] args) {
		
		String inputFileName = "d://krishna.jpeg";
		String outputFileName = "d://krishna_new.jpeg";
		
		try {
			FileInputStream fi = new FileInputStream(inputFileName);
			FileOutputStream fo = new FileOutputStream(outputFileName);
			byte[] buffer = new byte[1024];
			int byteRead = 0;
			
			try {
				while((byteRead=fi.read(buffer))!=-1) {
					fo.write(buffer, 0, byteRead);
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
