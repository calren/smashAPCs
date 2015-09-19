import gpdraw.*;

/**
 * Write a description of class TheHouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheHouse
{   
    public static void main(String[] args) {
            DrawingTool pencil;
            SketchPad paper;

            paper = new SketchPad(800, 800);
            pencil = new DrawingTool(paper);
            
            // draw the house
            pencil.forward(200);
            pencil.turn(45);
            pencil.forward(150);
            pencil.turn(90);
            pencil.forward(150);
            pencil.turn(45);
            pencil.forward(200);
            pencil.turn(90);
            pencil.forward(210);
    }
}
