package codeanalyzer.analyzer;

import java.io.IOException;

import org.junit.Test;

public class NullAnalyzerTest {
	
private CodeAnalyzer analyzer = new NullAnalyzer();
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculateLOC() throws IOException {
		analyzer.calcLOC("anypath");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculatNOM() throws IOException {
		analyzer.calcNOM("anypath");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculateNOC() throws IOException {
		analyzer.calcNOC("anypath");
	}
}
