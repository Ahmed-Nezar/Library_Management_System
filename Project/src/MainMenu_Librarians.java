import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class MainMenu_Librarians implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    public MainMenu_Librarians(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event){
        Image backgroundImage = new Image("login.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(backgroundImg);
        GridPane mainMenuPane = new GridPane();
        mainMenuPane.setBackground(background);
        mainMenuPane.setAlignment(Pos.CENTER);
        mainMenuPane.setPadding(new Insets(10, 10, 10, 10));
        mainMenuPane.setVgap(10);
        mainMenuPane.setHgap(10);
        Button addBookButton = new Button("Add Book");
        addBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");   
        addBookButton.setOnMouseEntered(e -> addBookButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        addBookButton.setOnMouseExited(e -> addBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button RemoveBookButton = new Button("Remove Book");
        RemoveBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        RemoveBookButton.setOnMouseEntered(e -> RemoveBookButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        RemoveBookButton.setOnMouseExited(e -> RemoveBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button SearchForBookButton = new Button("Search for a book");
        SearchForBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        SearchForBookButton.setOnMouseEntered(e -> SearchForBookButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        SearchForBookButton.setOnMouseExited(e -> SearchForBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button addUserButton = new Button("Add User");
        addUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        addUserButton.setOnMouseEntered(e -> addUserButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        addUserButton.setOnMouseExited(e -> addUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button removeUserButton = new Button("Remove User");
        removeUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        removeUserButton.setOnMouseEntered(e -> removeUserButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        removeUserButton.setOnMouseExited(e -> removeUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button assignUserButton = new Button("Assign Books");
        assignUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        assignUserButton.setOnMouseEntered(e -> assignUserButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        assignUserButton.setOnMouseExited(e -> assignUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button rentBookButton = new Button("Rent Book");
        rentBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        rentBookButton.setOnMouseEntered(e -> rentBookButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        rentBookButton.setOnMouseExited(e -> rentBookButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button blockUserButton = new Button("Block User");
        blockUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        blockUserButton.setOnMouseEntered(e -> blockUserButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        blockUserButton.setOnMouseExited(e -> blockUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button searchUserButton = new Button("Search for User");
        searchUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        searchUserButton.setOnMouseEntered(e -> searchUserButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        searchUserButton.setOnMouseExited(e -> searchUserButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        Button logoutButton = new Button("LogoutButton");
        logoutButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        logoutButton.setOnMouseEntered(e -> logoutButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        logoutButton.setOnMouseExited(e -> logoutButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;"+
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;"));
        GridPane.setConstraints(addBookButton, 0, 0);
        GridPane.setConstraints(RemoveBookButton, 1, 0);
        GridPane.setConstraints(SearchForBookButton, 0, 1);
        GridPane.setConstraints(addUserButton, 1, 1);
        GridPane.setConstraints(removeUserButton, 0, 2);
        GridPane.setConstraints(assignUserButton, 1, 2);
        GridPane.setConstraints(rentBookButton, 0, 3);
        GridPane.setConstraints(blockUserButton, 1, 3);
        GridPane.setConstraints(searchUserButton, 0, 4);
        GridPane.setConstraints(logoutButton, 1, 4);
        mainMenuPane.getChildren().addAll(addBookButton,RemoveBookButton,SearchForBookButton,addUserButton,removeUserButton,assignUserButton,rentBookButton,blockUserButton,searchUserButton,logoutButton);
        Scene mainMenuScene = new Scene(mainMenuPane, 800, 600);
        primaryStage.setScene(mainMenuScene);
        primaryStage.show();
    }

}
