package breakerPackage;

import javax.swing.JFrame;

public class MainClass {
    public static void main(String args[]){
    
    //creating object of jFrame;        
    JFrame obj=new JFrame();
    GamePlay gamePlay=new GamePlay();
    obj.setBounds(20,20,700,600);
    //give title;
    obj.setTitle("Brick Breaker Game");
    obj.setResizable(false);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj.add(gamePlay);
   }
}
