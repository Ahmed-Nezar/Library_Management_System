package GUI;
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
        Image backgroundImage = new Image("GUI_Material/login.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        Background background = new Background(backgroundImg);
        GridPane mainMenuPane = new GridPane();
        mainMenuPane.setBackground(background);
        mainMenuPane.setAlignment(Pos.CENTER);
        mainMenuPane.setPadding(new Insets(10, 10, 10, 10));
        mainMenuPane.setVgap(10);
        mainMenuPane.setHgap(10);

        Button addBookButton = new Button("Add Book");
        addBookButton.setOnAction(new AddBook(primaryStage));
        
        
        Button SearchRemoveBookButton = new Button("Search/Remove Book");
        SearchRemoveBookButton.setOnAction(new RemoveBook(primaryStage));
        
        Button addUserButton = new Button("Add User");
        addUserButton.setOnAction(new AddUser(primaryStage));
        
        Button SearchRemoveUserButton = new Button("Search/Remove User");
        SearchRemoveUserButton.setOnAction(e -> {
            SearchUser searchUser = new SearchUser(primaryStage);
            searchUser.handle(event);
        });

        Button assignUserButton = new Button("Assign Books");
        // assignUserButton.setOnAction(new AssignUser(primaryStage));

        Button rentBookButton = new Button("Rent Book");
        // rentBookButton.setOnAction(new RentBook(primaryStage));

        Button blockUserButton = new Button("Block User");
        blockUserButton.setOnAction(new BlockUser(primaryStage));

        


        Button logoutButton = new Button("Logout");
        logoutButton.setOnAction(e -> {
            Library_Managment_System Home = new Library_Managment_System();
            Stage newPrimaryStage = new Stage();
            Home.start(newPrimaryStage);
            primaryStage.close();
        });
        
        GridPane.setConstraints(addBookButton, 0, 0);
        GridPane.setConstraints(addUserButton, 1, 0);
        GridPane.setConstraints(SearchRemoveBookButton , 0, 1);
        GridPane.setConstraints(SearchRemoveUserButton , 1, 1);
        GridPane.setConstraints(rentBookButton, 0, 2);
        GridPane.setConstraints(assignUserButton, 1, 2);
        GridPane.setConstraints(blockUserButton, 0, 3);
        GridPane.setConstraints(logoutButton, 1, 3);
        mainMenuPane.getChildren().addAll(addBookButton,SearchRemoveBookButton,addUserButton,SearchRemoveUserButton,assignUserButton,rentBookButton,blockUserButton,logoutButton);
        Scene mainMenuScene = new Scene(mainMenuPane,  primaryStage.widthProperty().doubleValue(), primaryStage.heightProperty().doubleValue());
        mainMenuScene.getStylesheets().add("GUI_Material/buttonStyle.css");
        primaryStage.setScene(mainMenuScene);
        primaryStage.show();
    }

}
