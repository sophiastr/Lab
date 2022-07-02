package codeanalyzer;


import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;



public class AnalyzerFacadeTest {
	
	 @Test
	    public void TestReadFileAndExportMetrics() {
	        String filepath = "/src/test/resources/TestClass.java";
	        String sourceCodeAnalyzerType = "regex";
	        String sourceFileLocation = "local";
	        String outputFilePath = "output_metrics";
	        String outputFileType = "csv";

	       AnalyzerFacade codeAnalyzer = new AnalyzerFacade();
	        try {
	            codeAnalyzer.analyze(filepath, sourceFileLocation, sourceCodeAnalyzerType,outputFilePath, 
	                    outputFileType);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        File outFile = new File(outputFilePath.concat(".").concat(outputFileType));
	        Assert.assertTrue(outFile.getAbsolutePath() != null);
	    
	    }

}
