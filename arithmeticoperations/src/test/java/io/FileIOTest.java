package io;

import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {
	FileIO fileio = new FileIO();

	
	
	@Test
	public void test_read_file_Valid_Input() {
		
		String resourceName = "numbers_valid";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String filepath = file.getAbsolutePath();
		
		int[] expectedNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int [] num = fileio.readFile(filepath);
		
		Assert.assertArrayEquals(expectedNumbers, num);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_readFile_file_not_found() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("Input file does not exist");
		 fileio.readFile("src/test/resources/wrongNameFile");
	}
	
	@Test
	public void test_readFile_empty_file() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("Given file is empty");
		 fileio.readFile("src/test/resources/emptyFile.txt");
	}
	
	@Test
	public void testReadFileContainsInvalidEntries() {
		String resourceName = "notOnlyNumbers";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String filepath = file.getAbsolutePath();
		
		int[] expectedNumbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int [] num = fileio.readFile(filepath);
		
		Assert.assertArrayEquals(expectedNumbers, num);
	}

}