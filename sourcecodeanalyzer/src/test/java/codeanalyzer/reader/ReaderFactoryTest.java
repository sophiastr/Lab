package codeanalyzer.reader;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReaderFactoryTest {
	
	private static String LOCAL_TYPE = "local";
	private static String WEB_TYPE = "web";
	ReaderFactory factory = new ReaderFactory();
	
	@Test
	public void testCreateLocalFileReader() {
		Reader reader = factory.createContentReader(LOCAL_TYPE);
		assertTrue(reader instanceof Local);
	}
	
	@Test
	public void testCreateWebFileReader() {
		Reader reader = factory.createContentReader(WEB_TYPE);
		assertTrue(reader instanceof Web);
	}
	
	@Test
	public void testCreateNullFileReader() {
		Reader reader = factory.createContentReader("any-non-existing-type");
		assertTrue(reader instanceof NullReader);
	}

}
