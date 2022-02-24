import processing.core.PApplet;

public class Sketch extends PApplet {
  
  public void settings() {

   //size of the picture
    size(400, 400);
  
  public void setup() {
    
    //background coloring
    background(0, 210, 252);
  }
 
  public void draw() {

    //sun
    fill(240, 252, 0);
    ellipse((float) (width * 0.175), (float) (height * 0.175), (float) (width * 0.25), (float) (height * 0.25));

    //house
    fill(207, 76, 33);
    triangle((float) (width * 0.25), (float) (height * 0.5), (float) (width * 0.75), (float) (height * 0.5), (float) (width * 0.5), (float) (height * 0.25));

    fill(240, 235, 182);
    rect((float) (width * 0.25), (float) (height * 0.5), (float) (width * 0.5), (float) (height * 0.375));

    //ground
    fill(31, 191, 76);
    rect((float) (width * 0), (float) (height * 0.85), (float) (width), (float) (height));

    //door an doorknob
    fill(82, 79, 53);
    rect((float) (width * 0.475), (float) (height * 0.575), (float) (width * 0.2), (float) (height * 0.275));

    fill(240, 252, 0);
    ellipse((float) (width * 0.6375), (float) (height * 0.75), (float) (width * 0.0375), (float) (height * 0.0375));
    
    //windows
    fill(145, 229, 242);
   rect((float) (width * 0.275), (float) (height * 0.575), (float) (width * 0.175), (float) (height * 0.15));
    }
}