package codeanalyzer.writer;

import java.util.Map;

public class NullWriter implements Writer {
	
	@Override
	public void write(String filePath, Map<String, Integer> metrics) {
		throw new IllegalArgumentException("Unknown eport type, process terminated");
	}
}
