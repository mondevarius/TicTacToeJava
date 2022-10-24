import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameLayout.fxml"));
        Parent root = fxmlLoader.load();
        Scene window = new Scene(root);

        primaryStage.setTitle("Jogo da Velha Thiago");
        primaryStage.setScene(window);
        primaryStage.show();

    }
}

