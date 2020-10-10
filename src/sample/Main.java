package sample;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();

        primaryStage.setTitle("Excalibur's quest");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
        StackPane Bot_UI = new StackPane();


        //BOTTOM RECTANGLE

        Rectangle Bot_Rec = new Rectangle(750, 100);
        Bot_Rec.setFill(Color.rgb(211, 211, 211));
        Bot_UI.getChildren().add(Bot_Rec);
        root.setBottom(Bot_UI);
        Bot_Rec.setStroke(Color.BLACK);

        //LEFT RECTANGLE
        StackPane Left_UI = new StackPane();
        Rectangle Left_Rec = new Rectangle(100, 400, Color.rgb(211, 211, 211));
        Left_Rec.setStroke(Color.BLACK);
        root.setLeft(Left_UI);
        Left_UI.getChildren().add(Left_Rec);

        //TEXT AND BUTTON's

        Group text_Group = new Group();

        int Text_coorY = 10;

        Text text1 = new Text("1) Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        Text text2 = new Text("2) sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        Text text3 = new Text("3) Ut enim ad minim veniam");
        Text text4 = new Text("4) quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat");
        text_Group.getChildren().addAll(text1, text2, text3, text4);

        //text1.setX(Text_coorX);
        //text2.setX(Text_coorX);
        //text3.setX(Text_coorX);
        //text4.setX(Text_coorX);
        text1.setY(Text_coorY);
        text2.setY(Text_coorY + 20);
        text3.setY(Text_coorY + 40);
        text4.setY(Text_coorY + 60);
        Bot_UI.getChildren().add(text_Group);


        Button butt1 = new Button("1");
        Button butt2 = new Button("2");
        Button butt3 = new Button("3");
        Button butt4 = new Button("4");
        Button butt5 = new Button("");
        butt1.setPadding(new Insets(0, 20, 0, 20));
        butt2.setPadding(new Insets(0, 20, 0, 20));
        butt3.setPadding(new Insets(0, 20, 0, 20));
        butt4.setPadding(new Insets(0, 20, 0, 20));

        Group butt_Group = new Group();
        butt_Group.getChildren().addAll(butt1, butt2, butt3, butt4, butt5);


        Bot_UI.getChildren().add(butt_Group);
        StackPane.setAlignment(butt_Group, Pos.CENTER_RIGHT);

        butt5.setLayoutX(50);
        butt5.setDisable(true);
        butt5.setVisible(true);

        butt1.setLayoutY(Text_coorY);
        butt2.setLayoutY(Text_coorY + 20);
        butt3.setLayoutY(Text_coorY + 40);
        butt4.setLayoutY(Text_coorY + 60);


        StackPane Center_UI = new StackPane();
        Image img = new Image("sample/Art/Background/Tavern.PNG", 650, 400, true, true);
        ImageView Center_ImageView = new ImageView(img);
        Center_UI.getChildren().add(Center_ImageView);
        root.setCenter(Center_UI);


    }


    public static void main(String[] args) {
        launch(args);
    }


}

