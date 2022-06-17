package codeanalyzer.analyzer;

import java.io.IOException;
import java.util.List;

/**
 * This class implements the calculation of source code metrics string comparison.
 * @author sophiastr
 */

public class StrComp extends CodeAnalyzer{
	
	@Override
	public int calcLOC(String filepath) throws IOException {
		List<String> sourceCodeList = reader.readFileStrComp(filepath);
		int nonCodeLinesCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); // clear all leading and trailing white spaces
			if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{")
					|| line.equals("}") || line.equals(""))
				nonCodeLinesCounter++;
		}
		int loc = sourceCodeList.size() - nonCodeLinesCounter;
		return loc;
	}
	
	@Override
	public int calcNOM(String filepath) throws IOException {
		List<String> sourceCodeList = reader.readFileStrComp(filepath);
		int methodCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim();// clear all leading and trailing white spaces
			if (((line.contains("public") || line.contains("private") || line.contains("protected"))
					|| line.contains("void") || line.contains("int") || line.contains("String")) && line.contains("(")
					&& line.contains(")") && line.contains("{"))
				methodCounter++;
		}
		return methodCounter;
	}

	@Override
	public int calcNOC(String filepath) throws IOException {
		List<String> sourceCodeList = reader.readFileStrComp(filepath);
		int classCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim();// remove leading and trailing white spaces
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				classCounter++;
			}
		}
		return classCounter;
	}

}
