package codeanalyzer.analyzer;

import java.io.IOException;

import codeanalyzer.reader.Reader;

/**
 * Defines the methods that will be implemented.
 * @author sophiastr
 *
 */
public abstract class CodeAnalyzer {	
	
	protected Reader reader;
	
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	
	public Reader getReader() {
		return this.reader;
	}
	
	public abstract int calcLOC(String filepath) throws IOException;
	
	public abstract int calcNOM(String filepath) throws IOException;
	
	public abstract int calcNOC(String filepath) throws IOException;
}
