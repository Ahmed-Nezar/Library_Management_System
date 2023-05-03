package GUI;
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
        Image backgroundImage = new Image("../GUI_Material/login.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(backgroundImg);
        GridPane MainMenuPane = new GridPane();
        MainMenuPane.setBackground(background);
        MainMenuPane.setAlignment(Pos.CENTER);
        MainMenuPane.setPadding(new Insets(10, 10, 10, 10));
        MainMenuPane.setVgap(10);
        MainMenuPane.setHgap(10);
        Button SearchForBook = new Button("Search");
        
        
        Button AdditionToOrderList = new Button("Add to Order List");
        
       
        
        Button RentBook = new Button("Rent a book");

        Button logOut = new Button("Log out");
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
        
        VBox MainMenuButtons = new VBox(welcomeLabel,SearchForBook, AdditionToOrderList, RentBook,logOut);
        MainMenuButtons.setSpacing(10);
        MainMenuButtons.setAlignment(Pos.CENTER);
        MainMenuPane.getChildren().addAll(MainMenuButtons);
        Scene MainMenuScene = new Scene(MainMenuPane,  primaryStage.widthProperty().doubleValue(), primaryStage.heightProperty().doubleValue());
        MainMenuScene.getStylesheets().add("../GUI_Material/buttonStyle.css");
        primaryStage.setScene(MainMenuScene);
        primaryStage.show();
    }
}
    