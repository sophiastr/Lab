package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import codeanalyzer.AnalyzerFacade;
import codeanalyzer.analyzer.AnalyzerFactory;
import codeanalyzer.analyzer.CodeAnalyzer;
import codeanalyzer.reader.Reader;
import codeanalyzer.reader.ReaderFactory;
import codeanalyzer.writer.Writer;
import codeanalyzer.writer.WriterFactory;

/**
 * A class that calculates and exports metrics.
 * @author sophiastr
 *
 */
public class AnalyzerFacade {
	
	private ReaderFactory readerFactory = new ReaderFactory();
	private AnalyzerFactory analyzerFactory = new AnalyzerFactory();
	private WriterFactory exporterFactory = new WriterFactory();
	
	
	
	public AnalyzerFacade() {
		readerFactory = new ReaderFactory();
		analyzerFactory = new AnalyzerFactory();
		exporterFactory = new WriterFactory();
	}
	
	
	/**
	 * Performs the operations of the system, 
	 * in the context of code analysis.
	 * @param sourceCodeAnalyzerType the type of the source code analyzer
	 * @param sourceFileLocation the location of the source code file
	 * @param sourceFilepath the path of the file
	 * @param outputFileType the type of the output file
	 * @param outputFilepath the path of the output file
	 * @throws IOException
	 */
	public void analyze(String sourceFilepath, String sourceFileLocation, String sourceCodeAnalyzerType, String outputFilepath, String outputFileType) throws IOException {
		Reader reader = readerFactory.createContentReader(sourceFileLocation);
		CodeAnalyzer analyzer = analyzerFactory.createSourceCodeAnalyzer(sourceCodeAnalyzerType);
		analyzer.setReader(reader);
		int loc = analyzer.calcLOC(sourceFilepath);
		int nom = analyzer.calcNOM(sourceFilepath);
		int noc = analyzer.calcNOC(sourceFilepath);
		Map<String,Integer> metrics = new HashMap<>();
		metrics.put("loc", loc);
		metrics.put("nom", nom);
		metrics.put("noc", noc);
		Writer writer = exporterFactory.createMetricsExporter(outputFileType);
		writer.write(outputFilepath, metrics);
		
	}
}
