package c19381781;

import processing.core.*;
import ie.tudublin.*;

public class Border
{
    JoshsVisual jv;
    float x = 0;

    public Border(JoshsVisual jv)
    {
        this.jv = jv;
        x = this.jv.height / 2;
    }

    

    public void render()
    {
        for(int i = 0 ; i < jv.getAudioBuffer().size() ; i ++)
        {
            jv.stroke(jv.map(i, 0, jv.getAudioBuffer().size(), 0, 255), 255, 255);
            jv.line(i, x, i, x + x * jv.getAudioBuffer().get(i));
        }
    } 
}

           