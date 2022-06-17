package codeanalyzer.reader;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class WebTest {
	
	private static List<String> expectedList;
	private static String expectedString;
	private final static String TEST_CLASS_LOCAL = "src/test/resources/TestClass.java";
	private final static String TEST_CLASS_WEB ="https://drive.google.com/uc?export=download&id=1z51FZXqPyun4oeB7ERFlOgfcoDfLLLhg";

	@BeforeClass
	public static void setUp() throws IOException {
		expectedList = Files.readAllLines(new File(TEST_CLASS_LOCAL).toPath(), Charset.defaultCharset());
		expectedString = String.join("\n", expectedList) + "\n";
	}

	Reader reader = new Web();

	@Test
	public void testReadFileForRegex() throws IOException {
		String actuals = reader.readFileRegex(TEST_CLASS_WEB);
		assertEquals(expectedString, actuals);
	}

	@Test
	public void testReadFileForStrComp() throws IOException {
		List<String> actualList = reader.readFileStrComp(TEST_CLASS_WEB);

		String[] expecteds = expectedList.stream().toArray(String[]::new);
		String[] actuals = actualList.stream().toArray(String[]::new);
		assertArrayEquals(expecteds, actuals);
	}
	
}
