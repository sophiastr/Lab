package gradeshistogram;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/***
 * 
 * @author sophiastr The purpose of this class is to read a file with students’
 *         grades and generate its histogram.
 */
public class HistogramGenerator {

	/***
	 * Receives an ArrayList of integers. From this ArrayList, calculates grades
	 * frequency. Grades frequency is the dataset that will be used for the
	 * visualization. Finally, the chart is generated with the use of the
	 * aforementioned dataset and then presented in the screen.
	 * 
	 * @param dataValues Single dimension integer ArrayList.
	 */
	public void generateChart(ArrayList<Integer> dataValues) {
		/*
		 * The XYSeriesCollection object is a set XYSeries series (dataset) that can be
		 * visualized in the same chart.
		 */
		XYSeriesCollection dataset = new XYSeriesCollection();
		/*
		 * The XYSeries that are loaded in the dataset. There might be many series in
		 * one dataset.
		 */
		XYSeries data = new XYSeries("random values");
		/*
		 * Grades frequency.
		 */
		int[] frequency = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// calculates grades frequency
		for (int i = 0; i < dataValues.size(); i++) {
			for (int j = 0; j <= 10; j++) {
				if (dataValues.get(i) == j) {
					frequency[j]++;
				}
			}
		}
		/*
		 * Populating the XYSeries data object from the frequency.
		 */
		for (int k = 0; k <= 10; k++) {
			data.add(k, frequency[k]);
		}
		// add the series to the dataset
		dataset.addSeries(data);

		boolean legend = false; // do not visualize a legend
		boolean tooltips = false; // do not visualize tooltips
		boolean urls = false; // do not visualize urls

		// Declare and initialize a createXYLineChart JFreeChart
		JFreeChart chart = ChartFactory.createXYLineChart("Grades Histogram", "Grades", "Frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		/*
		 * Initialize a frame for visualizing the chart and attach the previously
		 * created chart.
		 */
		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		// makes the previously created frame visible
		frame.setVisible(true);
	}

	/***
	 * Receives the path of a file, reads the grades file and stores the values in
	 * an ArrayList.
	 * 
	 * @param The path of the grades file.
	 * @return An Arraylist of Integers.
	 */
	public static ArrayList<Integer> readGrades(String file) {
		ArrayList<Integer> grades = new ArrayList<Integer>();

		// reads the grades from the file
		try {
			File myObj = new File(file);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				grades.add(Integer.parseInt(data));
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return grades;
	}

	public static void main(String[] args) {
		String file = args[0];
		ArrayList<Integer> grades = readGrades(file);

		HistogramGenerator demo = new HistogramGenerator();
		demo.generateChart(grades);
	}
}
