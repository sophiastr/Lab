package codeanalyzer.analyzer;

import java.io.IOException;
/**
 * This class is for unknown type of files.
 * 
 * @author sophiastr
 *
 */
public class NullAnalyzer extends CodeAnalyzer{
	
	
	public int calcLOC(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown type of Analyzer, cannot calculate LOC");
	}


	public int calcNOM(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown type of Analyzer, cannot calculate NOM");
	}

	public int calcNOC(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown type of Analyzer, cannot calculate NOC");
	}
}
