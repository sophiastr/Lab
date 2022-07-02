package codeanalyzer.analyzer;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import codeanalyzer.reader.Local;
import codeanalyzer.reader.Reader;

public class AnalyzerTest {
	
	@Test
	public void testSetContentReader() {
		CodeAnalyzer analyzer = new StrComp();
		Reader expectedReader = new Local(); // any reader can be used
		
		analyzer.setReader(expectedReader);
		Reader reader = analyzer.getReader();
		
		assertSame(expectedReader, reader);
	}
}
