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

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

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
        Label UsernameLabel = new Label("Username:");
        UsernameLabel.setFont(Font.font(20));
        TextField UsernameField = new TextField();
        UsernameField.setPromptText("Enter your Username");
        UsernameField.setFont(Font.font(20));
        GridPane.setConstraints(UsernameLabel, 0, 0);
        GridPane.setConstraints(UsernameField, 1, 0);
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
        loginButton.setOnAction(e -> {
            String username = UsernameField.getText();
            String password = passwordField.getText();
            
            
            
            if(Library.librarians.stream().anyMatch(librarian -> librarian.getID().equals(username) && librarian.getPassword().equals(password))) {
                MainMenu_Librarians mainMenu_Librarians = new MainMenu_Librarians(primaryStage);
                mainMenu_Librarians.handle(event);
            } 
            else if(Library.readers.stream().anyMatch(reader -> reader.getID().equals(username) && reader.getPassword().equals(password))) {
                MainMenu_Readers mainMenu_Readers = new MainMenu_Readers(primaryStage);
                mainMenu_Readers.handle(event);
            }
            else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Invalid Username or Password");
                alert.setContentText("Please try again");
                alert.showAndWait();
            }
            
        });
        loginButton.setFont(Font.font(20));
        GridPane.setConstraints(loginButton, 1, 2);
        loginPane.getChildren().addAll(UsernameLabel, UsernameField, passwordLabel, passwordField, loginButton);
        Scene loginScene = new Scene(loginPane, 800, 600);
        primaryStage.setMaximized(true);
        primaryStage.setScene(loginScene); 
    }
}
