package codeanalyzer.reader;

/**
 * This class is responsible for instantiating and returning 
 * a concrete type of Reader
 * 
 * @author sophiastr
 */
public class ReaderFactory {
	
	public Reader createContentReader(String type) {
		if (type.equals("local")) {
			return new Local();
		} else if (type.equals("web")) {
			return new Web();
		} else {
			return new NullReader();
		}
	}
}
