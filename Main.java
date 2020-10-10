package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		// Defining the x axis
		// (where it begins, where it ends, the incrementation)
		// Write the axis name
		NumberAxis xAxis = new NumberAxis(0, 100, 10);
		xAxis.setLabel("Input");

		// Defining the y axis
		// (where it begins, where it ends, the incrementation)
		// Write the axis name
		NumberAxis yAxis = new NumberAxis(-100, 1000, 50);
		yAxis.setLabel("Time (nanoseconds)");

		// Creating the line chart
		LineChart linechart = new LineChart(xAxis, yAxis);

		// Prepare XYChart.Series objects by setting data
		XYChart.Series series = new XYChart.Series();
		series.setName("Fibonacci result");

		series.getData().add(new XYChart.Data(5, 0));
		series.getData().add(new XYChart.Data(15, 100));
		series.getData().add(new XYChart.Data(30, 300));
		series.getData().add(new XYChart.Data(60, 500));
		series.getData().add(new XYChart.Data(90, 600));

		// Setting the data to Line chart
		linechart.getData().add(series);

		// Creating a Group object
		Group root = new Group(linechart);

		// Creating a scene object
		Scene scene = new Scene(root, 600, 400);

		// Setting title to the Stage
		stage.setTitle("Line Chart");

		// Adding scene to the stage
		stage.setScene(scene);

		// Displaying the contents of the stage
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);

		long total = 0;
		long startTime = System.nanoTime();
		for (long i = 0; i < total; i++) {
			System.out.println();
		}

		long endTime = System.nanoTime();

		System.out.println("It took: " + total + (startTime - endTime) + " nanoseconds");
	}
}
