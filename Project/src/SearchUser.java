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



public class SearchUser implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    

    public SearchUser(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event) {
        ImageView background = new ImageView(new Image("login.jpg"));
        StackPane searchPage = new StackPane(background);
        searchPage.setAlignment(Pos.CENTER);
        Rectangle rect = new Rectangle(0, 0, 1200, 0);
        rect.setFill(Color.rgb(0, 0, 0, 0.7));
        double centerX = primaryStage.getWidth() / 2.0;
        double centerY = primaryStage.getHeight() / 2.0;
        rect.setLayoutX(centerX - rect.getWidth() / 2.0);
        rect.setLayoutY(centerY - rect.getHeight() / 2.0);
        searchPage.getChildren().add(rect);
        
        Text header = new Text("Search");
        header.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        header.setFill(Color.WHITE);

        Button searchButton = new Button("Search");
        searchButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        searchButton.setOnMouseEntered(e -> searchButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        searchButton.setOnMouseExited(e -> searchButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        TextField searchField = new TextField();
        searchField.setPromptText("Search");
        searchField.setFont(Font.font(20));
        searchField.setMaxWidth(600);
        
        Text searchResults = new Text("Search Results");
        searchResults.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        searchResults.setFill(Color.WHITE);

        
        Text searchResultsText = new Text();
        searchResultsText.setFont(Font.font(20));
        searchResultsText.setFill(Color.WHITE);
                
        searchButton.setFont(Font.font(20));
        searchButton.setOnAction(e -> {
            String search = searchField.getText();
            if (search.equals("")) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Search Error");
                alert.setContentText("Please enter a search term.");
                alert.showAndWait();
            } 
            else {
                List<Users> results = Librarians.searchMembers(search);
                
                String resultsText = "";
                for (Users user : results) {
                    resultsText += user.toString()+ "\n";
                }
                if (resultsText.equals("")) {
                    searchResultsText.setText("No results found.");
                }
                else {
                    searchResultsText.setText(resultsText);
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
        

        VBox vbox = new VBox(header, searchField ,searchButton, searchResults, searchResultsText, backButton);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-padding: 20px;");
        searchPage.getChildren().add(vbox);

        Scene scene = new Scene(searchPage, 800, 600);
        primaryStage.setTitle("Library Management System");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        rect.heightProperty().bind(primaryStage.heightProperty());
    }
}