package codeanalyzer.analyzer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.Test;

import codeanalyzer.reader.Reader;

public class RegexAnalyzerTest {
	
	private CodeAnalyzer analyzer = new RegexAnalyzer();
	private static String TEST_FILEPATH = "src/test/resources/TestClass.java";
	private String EXPECTED_SOURCESTRING;
	private Reader contentReader = mock(Reader.class);
	public RegexAnalyzerTest() {
		
		try {
			EXPECTED_SOURCESTRING = readTestFileContentIntoString(TEST_FILEPATH);
			when(contentReader.readFileRegex(TEST_FILEPATH)).thenReturn(EXPECTED_SOURCESTRING);
			analyzer.setReader(contentReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testCalculateLOC() throws IOException {
		int expectedLoc = 21;
		int actualLoc = analyzer.calcLOC(TEST_FILEPATH);
		assertEquals(expectedLoc, actualLoc);
	}
	
	@Test
	public void testCalculateNOM() throws IOException {
		int expectedNom = 3;
		int actualNom = analyzer.calcNOM(TEST_FILEPATH);
		assertEquals(expectedNom, actualNom);
	}
	
	@Test
	public void testCalculateNOC() throws IOException {
		int expectedNoc = 3;
		int actualNoc = analyzer.calcNOC(TEST_FILEPATH);
		assertEquals(expectedNoc, actualNoc);		
	}
	
	private String readTestFileContentIntoString(String filepath) throws IOException {
		StringBuilder sb = new StringBuilder();
	    try (Stream<String> stream = Files.lines( Paths.get(filepath), StandardCharsets.UTF_8)) 
	    {
	        stream.forEach(s -> sb.append(s).append("\n"));
	    }
	    catch (IOException e) 
	    {
	        e.printStackTrace();
	    }
	    return sb.toString();
	}
}
