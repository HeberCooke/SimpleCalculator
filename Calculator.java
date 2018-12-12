package calculator;
// Heber Cooke			12/11/2018

//Calculator for final OOP project

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String screenStyle = new String( // screen styles
				"-fx-background-color:lightgrey;" + "-fx-background-radius:3px;" + "-fx-border-radius:10px;"
						+ "-fx-border-color:black;" + "-fx-border-width:3px;" + "-fx-border-style: solid outside;");

		String btnStyle = new String(// button styles
				"-fx-background-color: linear-gradient(to bottom right, silver, slategrey);"
						+ "-fx-background-radius:15px;" + "-fx-border-color:grey;" + "-fx-border-width: 2px;"
						+ "-fx-border-radius:15px;" + "-fx-font-family: Times New Roman, Times, serif;"
						+ "-fx-font-weight: bold;" + " -fx-font-size: 30px;" + "-fx-font-color:black");

		BorderPane pane = new BorderPane(); // main pane
		VBox boxForView = new VBox(); // vBox for views

		TextField tf1 = new TextField(); // text field for main display
		tf1.setFont(new Font("Times", 35));
		tf1.setAlignment(Pos.TOP_RIGHT);
		tf1.setEditable(false);
		tf1.setStyle(screenStyle);

		TextField tf2 = new TextField();// text field for history
		tf2.setMaxHeight(15);
		tf2.setStyle(screenStyle);
		tf2.setFont(new Font("Times", 14));
		tf2.setDisable(true);
		tf2.setAlignment(Pos.BASELINE_LEFT);
		GridPane btnPane = new GridPane(); // pane for buttons
		btnPane.setStyle("-fx-background-color:grey;" + "-fx-padding: 15;" + "-fx-hgap: 15;" + "-fx-vgap: 10;");

		Button btn0 = new Button("<--");
		Button btn01 = new Button("C");
		Button btn02 = new Button("%");
		Button btn03 = new Button("*");
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		Button btnDivide = new Button("/");
		Button btnSubtract = new Button("-");
		Button btnAdd = new Button("+");
		Button btn00 = new Button("0");
		Button btnDec = new Button(".");
		Button btnEquals = new Button("=");
		GridPane.setColumnSpan(btnEquals, 2); // double size for =

		btn0.setStyle("-fx-background-color: linear-gradient(to bottom right, silver, slategrey);"// special font for
																									// the <-- button
				+ "-fx-background-radius:15px;" + "-fx-border-color:grey;" + "-fx-border-width: 2px;"
				+ "-fx-border-radius:15px;" + "-fx-font-family: Times New Roman, Times, serif;"
				+ "-fx-font-weight: bold;" + " -fx-font-size: 25px;");

		btn1.setStyle(btnStyle);
		btn2.setStyle(btnStyle);
		btn3.setStyle(btnStyle);
		btn4.setStyle(btnStyle);
		btn5.setStyle(btnStyle);
		btn6.setStyle(btnStyle);
		btn7.setStyle(btnStyle);
		btn8.setStyle(btnStyle);
		btn9.setStyle(btnStyle);
		btn00.setStyle(btnStyle);
		btn01.setStyle(btnStyle);
		btn02.setStyle(btnStyle);
		btn03.setStyle(btnStyle);
		btnDivide.setStyle(btnStyle);
		btnSubtract.setStyle(btnStyle);
		btnAdd.setStyle(btnStyle);
		btnDec.setStyle(btnStyle);
		btnEquals.setStyle(btnStyle);
		// -------------------------------
		btnEquals.setPrefSize(180, 80);
		btnDec.setPrefSize(80, 80);
		btn00.setPrefSize(80, 80);
		btnAdd.setPrefSize(80, 80);
		btnSubtract.setPrefSize(80, 80);
		btnDivide.setPrefSize(80, 80);
		btn0.setPrefSize(80, 80);
		btn01.setPrefSize(80, 80);
		btn02.setPrefSize(80, 80);
		btn03.setPrefSize(80, 80);
		btn1.setPrefSize(80, 80);
		btn2.setPrefSize(80, 80);
		btn3.setPrefSize(80, 80);
		btn4.setPrefSize(80, 80);
		btn5.setPrefSize(80, 80);
		btn6.setPrefSize(80, 80);
		btn7.setPrefSize(80, 80);
		btn8.setPrefSize(80, 80);
		btn9.setPrefSize(80, 80);
		btn9.setPrefSize(80, 80);
		// ---------------------------------
		GridPane.setConstraints(btn0, 0, 0);
		GridPane.setConstraints(btn01, 1, 0);
		GridPane.setConstraints(btn02, 2, 0);
		GridPane.setConstraints(btn03, 3, 0);
		GridPane.setConstraints(btn7, 0, 1);
		GridPane.setConstraints(btn8, 1, 1);
		GridPane.setConstraints(btn9, 2, 1);
		GridPane.setConstraints(btnDivide, 3, 1);
		GridPane.setConstraints(btn4, 0, 2);
		GridPane.setConstraints(btn5, 1, 2);
		GridPane.setConstraints(btn6, 2, 2);
		GridPane.setConstraints(btnSubtract, 3, 2);
		GridPane.setConstraints(btn1, 0, 3);
		GridPane.setConstraints(btn2, 1, 3);
		GridPane.setConstraints(btn3, 2, 3);
		GridPane.setConstraints(btnAdd, 3, 3);
		GridPane.setConstraints(btn00, 0, 4);
		GridPane.setConstraints(btnDec, 1, 4);
		GridPane.setConstraints(btnEquals, 2, 4);

		// ---------------------------------------

		btn1.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "1");
		});
		btn2.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "2");
		});
		btn3.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "3");
		});
		btn4.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "4");
		});
		btn5.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "5");
		});
		btn6.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "6");
		});
		btn7.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "7");
		});
		btn8.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "8");
		});
		btn9.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "9");
		});
		btn00.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText("");
			}
			tf1.setText(tf1.getText() + "0");

		});
		btn01.setOnAction(e -> { // setting the clear button
			tf1.setText("");

		});
		btn02.setOnAction(e -> {
			if (tf1.getText().contains("+") || tf1.getText().contains("-") || tf1.getText().contains("/")
					|| tf1.getText().contains("*")) {
				tf1.setText(tf1.getText() + "%");
			}

		});
		btn03.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText(tf1.getText().substring(1));
			}
			if (!tf1.getText().contains("*")) {
				tf1.setText(tf1.getText() + "*");
			}
		});
		btn0.setOnAction(e -> {
			if (tf1.getText().length() > 0) {
				tf1.setText(tf1.getText().substring(0, tf1.getText().length() - 1));
			}
		});
		btnDivide.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText(tf1.getText().substring(1));
			}
			if (!tf1.getText().contains("/")) {
				tf1.setText(tf1.getText() + "/");
			}
		});
		btnAdd.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText(tf1.getText().substring(1));
			}
			if (!tf1.getText().contains("+")) {
				tf1.setText(tf1.getText() + "+");
			}
		});
		btnSubtract.setOnAction(e -> {
			if (tf1.getText().contains("=")) {
				tf1.setText(tf1.getText().substring(1));
			}
			if (!tf1.getText().contains("-")) {
				tf1.setText(tf1.getText() + "-");
			}
		});
		btn00.setOnAction(e -> {
			tf1.setText(tf1.getText() + "0");

		});
		btnDec.setOnAction(e -> {

			if (!tf1.getText().contains(".")) { // Decimal set to do one decimal per number

				tf1.setText(tf1.getText() + ".");
			}

			else if (!tf1.getText().endsWith(".")) {

				tf1.setText(tf1.getText() + ".");
			}

		});
		btnEquals.setOnAction(e -> { // EQUALS Button And Call calculate method
			if (tf1.getText().contains("%")) { // percent calculations
				if (tf1.getText().contains("/") || tf1.getText().contains("*") || tf1.getText().contains(("-"))
						|| tf1.getText().contains("+")) {
					tf2.setText(tf2.getText() + tf1.getText() + "=" + Calculations.calculationsForPercent(tf1.getText())
							+ "      "); // setting the history screen

					tf1.setText("=" + Calculations.calculationsForPercent(tf1.getText())); // calculations and setting
																							// to the main screen

				}
			}
			// // EQUALS Button And Call calculate method NON percent calculations
			if (tf1.getText().contains("/") || tf1.getText().contains("*") || tf1.getText().contains(("-"))
					|| tf1.getText().contains("+")) {
				// setting the history screen
				if(tf2.getText().length() > 40) {	// setting the history screen to remove old calculations
					tf2.setText(tf2.getText().substring(40));
				}
				tf2.setText(tf2.getText() + tf1.getText() + "=" + Calculations.calculation(tf1.getText()) + "      ");

				tf1.setText("=" + Calculations.calculation(tf1.getText())); // calculations and setting to the main
																				// screen

			}

		});

		boxForView.setStyle("-fx-background-color:grey");
		boxForView.getChildren().addAll(tf2, tf1); // add text view to VBox

		btnPane.getChildren().addAll(btn0, btn01, btn02, btn03, // adding all buttons
				btn7, btn8, btn9, btnDivide, btn4, btn5, btn6, btnSubtract, btn1, btn2, btn3, btnAdd, btn00, btnDec,
				btnEquals);

		pane.setTop(boxForView); // view screen to pane
		pane.setCenter(btnPane);// set buttons to pane
		pane.setStyle("-fx-background-color: grey;");

		VBox.setMargin(tf1, new Insets(10, 20, 10, 20)); // borders on the panes
		VBox.setMargin(tf2, new Insets(10, 20, 10, 20));

		Scene scene = new Scene(pane, 400, 600);

		primaryStage.setResizable(false); // resize false
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}// end main ---------------------------------------------
