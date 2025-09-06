import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label helloLabel = new Label("Hello, JavaFX!");
        StackPane root = new StackPane(helloLabel);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Algorithm Visualizer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
