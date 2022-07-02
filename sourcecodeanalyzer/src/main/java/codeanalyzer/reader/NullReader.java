package codeanalyzer.reader;

import java.io.IOException;
import java.util.List;

/**
 * This class is for when the process of reading can not be execute.
 * 
 * @author sophiastr
 *
 */
public class NullReader implements Reader{
	
	
	@Override
	public String readFileRegex(String filePath) {
		throw new IllegalArgumentException("Cannot execute process due to unknown file reader type. Process terminated.");
	}

	@Override
	public List<String> readFileStrComp(String filePath) {
		throw new IllegalArgumentException("Cannot execute process due to unknown file reader type. Process terminated.");
	}
}
