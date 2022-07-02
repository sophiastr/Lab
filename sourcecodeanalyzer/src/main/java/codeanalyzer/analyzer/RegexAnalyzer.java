package codeanalyzer.analyzer;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import codeanalyzer.AnalyzerFacade;
import codeanalyzer.reader.Reader;

public class RegexAnalyzer extends CodeAnalyzer{
	
	/**
	 * This class implements the calculation of source code metrics for regex.
	 * @author sophiastr
	 */
	
	@Override
	public int calcLOC(String filepath) throws IOException {
		String sourceCode = reader.readFileRegex(filepath);
		Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
		Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

		int nonCodeLinesCounter = 0;
		while (nonCodeLinesMatcher.find()) {
			nonCodeLinesCounter++;
		}

		int sourceFileLength = sourceCode.split("\n").length;
		int loc = sourceFileLength - nonCodeLinesCounter;

		return loc;
	}

	@Override
	public int calcNOM(String filepath) throws IOException {
		String sourceCode = reader.readFileRegex(filepath);
		Pattern pattern = Pattern.compile(
				".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*");
		Matcher methodSignatures = pattern.matcher(sourceCode);

		int methodCounter = 0;
		while (methodSignatures.find()) {
			methodCounter++;
		}
		return methodCounter;
	}

	@Override
	public int calcNOC(String filepath) throws IOException {
		String sourceCode = reader.readFileRegex(filepath);
		Pattern pattern = Pattern.compile(".*\\s*class\\s+.*");
		Matcher classSignatures = pattern.matcher(sourceCode);

		int classCounter = 0;
		while (classSignatures.find()) {
			classCounter++;
		}
		return classCounter;
	}

}
