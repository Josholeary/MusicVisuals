package c19381781;

import processing.core.*;
import ie.tudublin.*;

public class Spinner
{
    JoshsVisual jv;

    public Spinner(JoshsVisual jv)
    {
        this.jv = jv;
    }

    float angle = 0;

    public void render()
    {
        jv.stroke(255);
        jv.translate(800, 650, -400);
        jv.noFill();
        jv.rotateY(angle);
        jv.beginShape();
        jv.vertex(-100, -100, -100);
        jv.vertex( 100, -100, -100);
        jv.vertex(   0,  -300,  300);

        jv.vertex( 100, -100, -100);
        jv.vertex( 100,  100, -100);
        jv.vertex(   0, -300,  300);

        jv.vertex( 100, 100, -100);
        jv.vertex(-100, 100, -100);
        jv.vertex(   0,  -300,  300);

        jv.vertex(-100,  100, -100);
        jv.vertex(-100, -100, -100);
        jv.vertex(   0,  -300,  300);
        jv.endShape();

        angle += jv.getSmoothedAmplitude()/15;
         
    } 
}

           