package codeanalyzer.writer;
/**
 * This class creates and initialize an object.
 * @author sophiastr
 *
 */
public class WriterFactory {
	
	public Writer createMetricsExporter(String type) {
		if (type.equals("csv")) {
			return new CSV();
		} else if(type.equals("json")) {
			return new JSON();
		} else {
			return new NullWriter();
		}
	}
}
