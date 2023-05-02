import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

class register implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    Readers readers;

    public register(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event) {
        Image backgroundImage = new Image("login.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(backgroundImg);
        GridPane registerPane = new GridPane();
        registerPane.setBackground(background);
        registerPane.setAlignment(Pos.CENTER);
        registerPane.setPadding(new Insets(10, 10, 10, 10));
        registerPane.setVgap(10);
        registerPane.setHgap(10);
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

        Label confirmPasswordLabel = new Label("Confirm Password:");
        confirmPasswordLabel.setFont(Font.font(20));
        PasswordField confirmPasswordField = new PasswordField();
        confirmPasswordField.setPromptText("Confirm your password");
        confirmPasswordField.setFont(Font.font(20));
        GridPane.setConstraints(confirmPasswordLabel, 0, 2);
        GridPane.setConstraints(confirmPasswordField, 1, 2);

        Label firstNameLabel = new Label("First Name:");
        firstNameLabel.setFont(Font.font(20));
        TextField firstNameField = new TextField();
        firstNameField.setPromptText("Enter your first name");
        firstNameField.setFont(Font.font(20));
        GridPane.setConstraints(firstNameLabel, 0, 3);
        GridPane.setConstraints(firstNameField, 1, 3);
        Label lastNameLabel = new Label("Last Name:");
        lastNameLabel.setFont(Font.font(20));
        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Enter your last name");
        lastNameField.setFont(Font.font(20));
        GridPane.setConstraints(lastNameLabel, 0, 4);
        GridPane.setConstraints(lastNameField, 1, 4);
        Label phoneNumberLabel = new Label("Phone Number:");
        phoneNumberLabel.setFont(Font.font(20));
        TextField phoneNumberField = new TextField();
        phoneNumberField.setPromptText("Enter your phone number");
        phoneNumberField.setFont(Font.font(20));
        GridPane.setConstraints(phoneNumberLabel, 0, 5);
        GridPane.setConstraints(phoneNumberField, 1, 5);
        Label addressLabel = new Label("Address:");
        addressLabel.setFont(Font.font(20));
        TextField addressField = new TextField();
        addressField.setPromptText("Enter your address");
        addressField.setFont(Font.font(20));
        GridPane.setConstraints(addressLabel, 0, 6);
        GridPane.setConstraints(addressField, 1, 6);

        Button registerButton = new Button("Register");
        registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 5px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 10px;");
        registerButton.setOnMouseEntered(e -> registerButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 5px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 10px;")
        );
        registerButton.setOnMouseExited(e -> registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 5px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 10px;")
        );
        registerButton.setFont(Font.font(20));
        GridPane.setConstraints(registerButton, 1, 7);
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String email = emailField.getText();
                String password = passwordField.getText();
                String confirmPassword = confirmPasswordField.getText();
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String phoneNumber = phoneNumberField.getText();
                String address = addressField.getText();
                if (email.equals("") || password.equals("") || confirmPassword.equals("") || firstName.equals("") || lastName.equals("") || phoneNumber.equals("") || address.equals("")) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please fill in all the fields");
                    alert.showAndWait();
                } else if (!password.equals(confirmPassword)) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Passwords do not match");
                    alert.showAndWait();
                } else if (email.contains("@") == false || email.contains(".com") == false) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Invalid email");
                    alert.showAndWait();
                } 
                else {
                    Library.addReaders(new Readers(password, firstName, lastName, address, phoneNumber, email,false));
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("Success");
                    alert.setContentText("You have successfully registered\n"+"Your Username is: "+ Library.readers.get(Library.readers.size()-1).getID() );
                    alert.showAndWait();
                    login LOG = new login(primaryStage);
                    LOG.handle(event);        
                    
                }   
                
            }
        });

        registerPane.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, confirmPasswordLabel, confirmPasswordField, firstNameLabel, firstNameField, lastNameLabel, lastNameField, phoneNumberLabel, phoneNumberField, addressLabel, addressField, registerButton);
        Scene registerScene = new Scene(registerPane, 800, 600);
        primaryStage.setMaximized(true);
        primaryStage.setScene(registerScene);
    }
}