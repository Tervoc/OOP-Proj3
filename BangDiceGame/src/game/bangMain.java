/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Scanner; //input from user

/**
 *
 * @author chris
 */
public class bangMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Bang Game Rules! \n");

        //Basic information pregame
        System.out.println("There are 12 character cards and 4 in game roles. \n");
        System.out.println("Character Cards have unique abilities in game (Some are way better then others)!  \n");
        System.out.println("Each character card has a unique number next to it that number represents the total health u have!  \n");
        System.out.println("You cannot heal above your total healthcap of the unique level and also if you reach 0 you die and your out of the game!  \n");
        System.out.println("Each player has their own goal, depending on the role they recieve. \n");
        System.out.println("Roles: Sheriff, Deputy, Outlaw, and Renegade! \n");
        System.out.println("Sheriff: needs to eliminate all outlaws and renegades to win! \n");
        System.out.println("Outlaws: must eliminate the sheriff to win! \n");
        System.out.println("Deputies: must protect and help the sheriff, if the sheriff wins they win! \n");
        System.out.println("Renegades: must be the last card in play to win! \n");
        System.out.println("If you recieve the sheriff as one of your two cards recieved you must flip it over and show all players! \n");
        System.out.println("If you recieve any of the other 3 class cards it stays down and do not show it! \n");

        //Dice Roll Info
        System.out.println("Dice Roll Information:  \n");
        System.out.println("You roll a total of 5 dice 3 times in total. If you decide to keep certain roles thats fine as well just roll the number of dice u want  \n");
        System.out.println(" - unless you role a Dynamite you must keep it!  \n");
        System.out.println("If you roll a Dynamite that dice can not be rerolled, If you roll a total of 3 dynamite your turn is completely over!  \n");
        System.out.println("If you roll an arrow unless its the last arrow causing an indians attack to everyone you pick up an arrow and reroll!  \n");
        System.out.println("If you roll a Gatling gun you need a total of 3 Gatling guns in order to do a total of 1 damge to everyone in the game.  \n");
        System.out.println("A roll of 1 or 2 does a total of (1) damage to the player thats 1 spot away for (1) and 2 spots away for (2) \n");
        System.out.println("Rolling a beer heals the player for a total of 1 health  \n");

        //Indians Attack
        System.out.println("Indians Attack information:  \n");
        System.out.println("If you roll an arrow on your dice you must pick up an arrow from the middle!  \n");
        System.out.println("If u pick up the last arrow from the middle that causes and Indians Attack to all players in the game!  \n");
        System.out.println("You then recieve damage based on the amount of arrows you have for example 4 arrows = 4 damage!  \n");
        System.out.println("Once an Indian attack is finished all arrows from all players are then returned to the middle!  \n");

        //Information from User
        Scanner info = new Scanner(System.in);
        System.out.println("How many players would you like to play with from 4 - 8? \n"); //Asks user how many players from 4-8
        String players = info.nextLine();
        System.out.println("The number of players is: " + players); //Output User Input

        //Game Summary Card Cheat Sheet for players
        System.out.println("You will also be given a game summary card! \n");
        //Add the game summary card information
    }
    
}
