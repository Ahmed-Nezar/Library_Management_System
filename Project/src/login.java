import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class login implements EventHandler<ActionEvent>{
    private Stage primaryStage;

    public login(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event) {
        Image backgroundImage = new Image("login.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(backgroundImg);
        GridPane loginPane = new GridPane();
        loginPane.setBackground(background);
        loginPane.setAlignment(Pos.CENTER);
        loginPane.setPadding(new Insets(10, 10, 10, 10));
        loginPane.setVgap(10);
        loginPane.setHgap(10);
        Label emailLabel = new Label("Email:");
        emailLabel.setFont(Font.font(20));
        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");
        emailField.setFont(Font.font(20));
        GridPane.setConstraints(emailLabel, 0, 0);
        GridPane.setConstraints(emailField, 1, 0);
        Label passwordLabel = new Label("Password:");
        passwordLabel.setFont(Font.font(20));
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setFont(Font.font(20));
        GridPane.setConstraints(passwordLabel, 0, 1);
        GridPane.setConstraints(passwordField, 1, 1);
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 5px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 10px;");
        loginButton.setOnMouseEntered(e -> loginButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 5px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 10px;")
        );
        loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 5px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
         "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 10px;")
        );
        loginButton.setFont(Font.font(20));
        GridPane.setConstraints(loginButton, 1, 2);
        loginPane.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, loginButton);
        Scene loginScene = new Scene(loginPane, 800, 600);
        primaryStage.setScene(loginScene); 
    }
}
