package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Main {
    public static Robot robot = null;
    public static void main(String[] args) throws IOException, AWTException {
        try{
            robot = new Robot();
        }catch(AWTException e){
            e.printStackTrace();
        }

        while(true){
            robot.delay(15000);
            //bags to 100m cash unpacking
            for(int i = 1; i < 11; i++){
                Klick(584, 354);
                robot.delay(1500);
            }

            //Klick shop
            robot.delay(5000);
            Klick(257, 175);

            //Move mouse to cannonballs
            robot.delay(2000);
            Klick(424, 303);


            for(int i = 1; i < 200; i++){
                //Right klick
                robot.delay(1000);
                RKlick(429, 299);

                //Klick buy 1000 cannonballs
                robot.delay(1000);
                Klick(423, 399);
            }

            //Clouse the shop
            robot.delay(2000);
            Klick(450, 163);







        }

    }
    public static void Klick(int x, int y){
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
    }
    public static void RKlick(int x, int y){
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(MouseEvent.BUTTON3_MASK);
        robot.mouseRelease(MouseEvent.BUTTON3_MASK);
    }
}
