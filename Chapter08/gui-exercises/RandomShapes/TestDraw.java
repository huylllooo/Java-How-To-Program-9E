/*
 *       Filename:  TestDraw.java
 *
 *    Description:  8.20 - Creating a JFrame to display a DrawPanel
 *
 *        Created:  26/10/15 18:13:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class TestDraw{
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(600, 600);
        application.setVisible(true);
    }
}
