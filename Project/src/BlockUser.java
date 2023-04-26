import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;


public class BlockUser implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    

    public BlockUser(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event) {
        ImageView background = new ImageView(new Image("login.jpg"));
        StackPane blockpage = new StackPane(background);
        blockpage.setAlignment(Pos.CENTER);
        Rectangle rect = new Rectangle(0, 0, 1200, 0);
        rect.setFill(Color.rgb(0, 0, 0, 0.7));
        double centerX = primaryStage.getWidth() / 2.0;
        double centerY = primaryStage.getHeight() / 2.0;
        rect.setLayoutX(centerX - rect.getWidth() / 2.0);
        rect.setLayoutY(centerY - rect.getHeight() / 2.0);
        blockpage.getChildren().add(rect);
        
        Text header = new Text("Block");
        header.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        header.setFill(Color.WHITE);

        Text name = new Text("Name: ");
        name.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        name.setFill(Color.WHITE);

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter username");
        usernameField.setMaxWidth(600);
        usernameField.setFont(Font.font(20));

        Button blockButton = new Button("Block");
        blockButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        blockButton.setOnMouseEntered(e -> blockButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        blockButton.setOnMouseExited(e -> blockButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        blockButton.setOnAction(e -> {
            String firstname = usernameField.getText();
            if (firstname.equals("")) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Username is empty");
                alert.setContentText("Please enter a username");
                alert.showAndWait();
            } else {
                Users user = Library.users.stream().filter(u -> u.getFirstName().equals(firstname)).findFirst().orElse(null);
                if (user != null) {
                    user.setBlocked(true);
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("User blocked");
                    alert.setContentText("User " + user.getFirstName() + " has been blocked");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("User not found");
                    alert.setContentText("User " + firstname + " does not exist");
                    alert.showAndWait();
                }
            }
        });
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        backButton.setOnMouseEntered(e -> backButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        backButton.setOnMouseExited(e -> backButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        backButton.setOnAction(new MainMenu_Librarians(primaryStage));

        VBox blockBox = new VBox(10);
        blockBox.setAlignment(Pos.CENTER);
        blockBox.setPadding(new Insets(10, 10, 10, 10));
        blockBox.getChildren().addAll(header, name, usernameField, blockButton, backButton);
        blockpage.getChildren().add(blockBox);

        Scene scene = new Scene(blockpage, 800, 600);
        primaryStage.setTitle("Library Management System");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        rect.heightProperty().bind(primaryStage.heightProperty());

    }
}
