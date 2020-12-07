module com.mcj {
	requires javafx.fxml;
	requires javafx.controls;

	opens com.mcj to javafx.fxml, javafx.graphics;
}
