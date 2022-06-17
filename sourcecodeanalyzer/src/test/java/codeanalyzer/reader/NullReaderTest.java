package codeanalyzer.reader;

import java.io.IOException;

import org.junit.Test;

public class NullReaderTest {
	
Reader reader = new NullReader();
	
	@Test (expected = IllegalArgumentException.class)
	public void testReadFileForRegex() throws IOException {
		reader.readFileRegex("any-filepath");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testReadFileForStrComp() throws IOException {
		reader.readFileStrComp("any-filepath");
	}
}
