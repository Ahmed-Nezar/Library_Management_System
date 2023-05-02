import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
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



public class MainMenu_Readers implements EventHandler<ActionEvent>{
    private Stage primaryStage;

    public MainMenu_Readers(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @Override
    public void handle(ActionEvent event) {
        Image backgroundImage = new Image("login.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(backgroundImg);
        GridPane MainMenuPane = new GridPane();
        MainMenuPane.setBackground(background);
        MainMenuPane.setAlignment(Pos.CENTER);
        MainMenuPane.setPadding(new Insets(10, 10, 10, 10));
        MainMenuPane.setVgap(10);
        MainMenuPane.setHgap(10);
        Button SearchForBook = new Button("Search for a book");
        SearchForBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        SearchForBook.setOnMouseEntered(e -> SearchForBook.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-pref-width: 300px;"+
        "-fx-font-size: 30px;" +
        "-fx-pref-height: 50px;")
        );
        SearchForBook.setOnMouseExited(e -> SearchForBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;" +
        "-fx-pref-height: 50px;")
        );
        Button AddBook = new Button("Add a book");
        AddBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        AddBook.setOnMouseEntered(e -> AddBook.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        AddBook.setOnMouseExited(e -> AddBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        Button RemoveBook = new Button("Remove a book");
        RemoveBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        RemoveBook.setOnMouseEntered(e -> RemoveBook.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        RemoveBook.setOnMouseExited(e -> RemoveBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        Button RentBook = new Button("Rent a book");
        RentBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        RentBook.setOnMouseEntered(e -> RentBook.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        RentBook.setOnMouseExited(e -> RentBook.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        Button logOut = new Button("Log out");
        logOut.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;");
        logOut.setOnMouseEntered(e -> logOut.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        logOut.setOnMouseExited(e -> logOut.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 300px;"+
        "-fx-pref-height: 50px;")
        );
        logOut.setOnAction(e -> {
            Library_Managment_System Home = new Library_Managment_System();
            Home.start(primaryStage);
        });
        Label welcomeLabel = new Label("Welcome Reader");
        welcomeLabel.setStyle("-fx-font-size: 60px;" +
        "-fx-text-align: center;"+ 
        "-fx-text-fill:rgba(50,50,50);"+
        "-fx-font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"+
        "-fx-font-weight: bold" );
        
        VBox MainMenuButtons = new VBox(welcomeLabel,SearchForBook, AddBook, RemoveBook, RentBook,logOut);
        MainMenuButtons.setSpacing(10);
        MainMenuButtons.setAlignment(Pos.CENTER);
        MainMenuPane.getChildren().addAll(MainMenuButtons);
        Scene MainMenuScene = new Scene(MainMenuPane, 800, 600);
        primaryStage.setScene(MainMenuScene);
        primaryStage.show();
    }
}
    