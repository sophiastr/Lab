package codeanalyzer.analyzer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnalyzerFactoryTest {
	
	
	private static String REGEX_TYPE = "regex";
	private static String STRCOMP_TYPE = "strcomp";
	private AnalyzerFactory factory = new AnalyzerFactory();
	
	
	@Test
	public void testCreateRegexSourceCodeAnalyzer() {
		CodeAnalyzer analyzer = factory.createSourceCodeAnalyzer(REGEX_TYPE);
		assertTrue(analyzer instanceof RegexAnalyzer);
	}
	
	@Test
	public void testCreateStrCompSourceCodeAnalyzer() {
		CodeAnalyzer analyzer = factory.createSourceCodeAnalyzer(STRCOMP_TYPE);
		assertTrue(analyzer instanceof StrComp);
	}
	@Test
	public void testCreateNullSourceCodeAnalyzer() {
		CodeAnalyzer analyzer = factory.createSourceCodeAnalyzer("any-non-existing-type");
		assertTrue(analyzer instanceof NullAnalyzer);
	}
	
}
