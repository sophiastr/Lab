package codeanalyzer.reader;

import java.io.IOException;
import java.util.List;


/**
 * Defines the methods that will be implemented.
 * @author sophiastr
 */
public interface Reader {
	
	public String readFileRegex(String filePath) throws IOException;

	public List<String> readFileStrComp(String filePath) throws IOException;
}
