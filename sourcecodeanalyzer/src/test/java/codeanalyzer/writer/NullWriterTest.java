package codeanalyzer.writer;

import org.junit.Test;

public class NullWriterTest {
	
Writer exporter = new NullWriter();
	
	@Test (expected = IllegalArgumentException.class)
	public void testEriteToFile() {
		exporter.write("any-filepath", null);
	}
	
}
