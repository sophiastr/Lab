package codeanalyzer.writer;

import java.util.Map;
/**
 * Occurs the method that will be implemented.
 * @author sophiastr
 *
 */
public interface Writer {
	
	public void write(String filePath, Map<String,Integer> metrics);
}
