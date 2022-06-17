package codeanalyzer.writer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WriterFactoryTest {
	
	WriterFactory factory = new WriterFactory();
	
	@Test
	public void testCreateCsvExporter() {
		Writer writer = factory.createMetricsExporter("csv");
		assertTrue(writer instanceof CSV);
	}
	
	@Test
	public void testCreateJsonExporter() {
		Writer writer = factory.createMetricsExporter("json");
		assertTrue(writer instanceof JSON);
	}
	
	@Test
	public void testCreateNullExporter() {
		Writer writer = factory.createMetricsExporter("any-non-existing-export-type");
		assertTrue(writer instanceof NullWriter);
	}

}
