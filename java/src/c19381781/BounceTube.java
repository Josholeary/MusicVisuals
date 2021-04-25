package c19381781;

import processing.core.*;
import ie.tudublin.*;

public class BounceTube
{
    JoshsVisual jv;

    public BounceTube(JoshsVisual jv)
    {
        this.jv = jv;
    }

    public void render()
    {
        float r = 1f;                
        float lastX = jv.width / 2;
        float lastY = jv.height / 2;
        jv.noFill();
        jv.strokeWeight(2);
        for(int i = 0 ; i < 350 ; i ++)
        {
            float p = jv.map(i, 0, 300, 0, 255);    //rainbow effect scaling up tube
            jv.stroke(p, 255, 255, 100);
            float theta = i * jv.TWO_PI;
            float x = jv.width / 2 + jv.sin(theta) * r;
            float y = jv.height / 2 - jv.cos(theta) * r;
            r += 0.35f + jv.getAmplitude();
            jv.ellipse(x, y, lastX, lastY);
            lastX = x;
            lastY = y;
        }
    }  
} 

           