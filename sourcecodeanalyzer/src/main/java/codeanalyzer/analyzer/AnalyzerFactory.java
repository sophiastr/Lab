package codeanalyzer.analyzer;


/**
 * This class initiates a specific type of SourceCodeAnalazyer
 * 
 * @author sophiastr
 */
public class AnalyzerFactory {

	public CodeAnalyzer createSourceCodeAnalyzer(String type) {
		CodeAnalyzer ca;
		if (type.equals("regex")) {
			ca = new RegexAnalyzer();
			return ca;
		} else if (type.equals("strcomp")) {
			ca = new StrComp();
			return ca;
		} else {
			return new NullAnalyzer();
		}
	}
}
