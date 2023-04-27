import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Library_Management_System extends Application  {
    
    @Override
    public void start(Stage primaryStage) {
        
        ImageView background = new ImageView(new Image("books.jpg"));
        StackPane startPage = new StackPane(background);
        startPage.setAlignment(Pos.CENTER);
        Rectangle rect = new Rectangle(0, 0, 600, 0);
        rect.setFill(Color.rgb(0, 0, 0, 0.7));
        double centerX = primaryStage.getWidth() / 2.0;
        double centerY = primaryStage.getHeight() / 2.0;
        rect.setLayoutX(centerX - rect.getWidth() / 2.0);
        rect.setLayoutY(centerY - rect.getHeight() / 2.0);
        startPage.getChildren().add(rect);
        
        Text header = new Text("Welcome to our Library");
        header.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        header.setFill(Color.WHITE);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        loginButton.setOnMouseEntered(e -> loginButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );

        Button quitButton = new Button("Quit");
        quitButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        quitButton.setOnMouseEntered(e -> quitButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        quitButton.setOnMouseExited(e -> quitButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        Button registerButton = new Button("Register");
        registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        registerButton.setOnMouseEntered(e -> registerButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        registerButton.setOnMouseExited(e -> registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        loginButton.setFont(Font.font(20));
        loginButton.setOnAction(new login(primaryStage));
        registerButton.setFont(Font.font(20));
        registerButton.setOnAction(new register(primaryStage));
        quitButton.setFont(Font.font(20));
        quitButton.setOnAction(new MainMenu_Librarians(primaryStage));

        VBox vbox = new VBox(header, loginButton, registerButton, quitButton);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-padding: 20px;");
        startPage.getChildren().add(vbox);
        
        Scene scene = new Scene(startPage, 800, 600);
        primaryStage.setTitle("Library Management System");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        rect.heightProperty().bind(primaryStage.heightProperty());
    }
    public static void main(String[] args) throws Exception {
        Librarians librarian = new Librarians("testlibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", false);
        Readers reader = new Readers("testreader", "TestReader", "TestReader", "TestReader", "TestReader", "TestReader", false);
        Librarians.addReaders(reader);
        Books book1 = new Books("The Catcher in the Rye", "Fiction", "J.D. Salinger", 123456789, true);
        Books book2 = new Books("To Kill a Mockingbird", "Fiction", "Harper Lee", 234567890, true);
        Books book3 = new Books("1984", "Fiction", "George Orwell", 345678901, true);
        Books book4 = new Books("Pride and Prejudice", "Fiction", "Jane Austen", 456789012, true);
        Books book5 = new Books("The Great Gatsby", "Fiction", "F. Scott Fitzgerald", 567890123, true);
        Books book6 = new Books("Animal Farm", "Fiction", "George Orwell", 678901234, true);
        Books book7 = new Books("Brave New World", "Fiction", "Aldous Huxley", 789012345, true);
        Books book8 = new Books("The Lord of the Rings", "Fiction", "J.R.R. Tolkien", 890123456, true);
        Books book9 = new Books("The Hobbit", "Fiction", "J.R.R. Tolkien", 901234567, true);
        Books book10 = new Books("Harry Potter and the Philosopher's Stone", "Fiction", "J.K. Rowling", 123450987, true);
        Books.AddBook(book10);
        Books.AddBook(book9);
        Books.AddBook(book8);
        Books.AddBook(book7);
        Books.AddBook(book6);
        Books.AddBook(book5);
        Books.AddBook(book4);
        Books.AddBook(book3);
        Books.AddBook(book2);
        Books.AddBook(book1);
        Application.launch(args);
    }
}
