module MediaPlayer {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.media;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
