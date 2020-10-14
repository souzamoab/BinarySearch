package main;

import java.io.IOException;

import binarysearch.BinarySearch;
import file.File;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BinarySearch binarySearch = new BinarySearch();
		File file = new File();
		
		int[] vector = file.readFile();
		int size = vector.length;
		int element = file.getLastLine();
		int result = binarySearch.binarySearch(vector, 0, size - 1, element);
		
		String message;
		
		if(result == -1) {
			message = "NAO";
			file.writeFile(message, result);
		}else {
			message = "SIM";
			file.writeFile(message, result);
		}
		
	}

}
