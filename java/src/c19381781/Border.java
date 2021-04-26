package c19381781;

import processing.core.*;
import ie.tudublin.*;

public class Border
{
    JoshsVisual jv;

    public Border(JoshsVisual jv)
    {
        this.jv = jv;
    }

    

    public void render()
    {   
        float gap = jv.width / (float) jv.getBands().length;

        jv.noStroke();
        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
            jv.rect(i * gap, jv.height, gap-60,-jv.getSmoothedBands()[i] * 0.1f); 
        }

        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
            jv.rect(jv.height+585, i*gap, -jv.getSmoothedBands()[i] * 0.1f,gap-60); 
        }


        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);
            jv.rect(jv.height-855, i*gap, jv.getSmoothedBands()[i] * 0.1f,gap-60); 
        }

        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()/2, 0, 1, 0, 255), 255, 255);
            jv.rect(i * gap, jv.height-855, gap-60,jv.getSmoothedBands()[i] * 0.1f); 
        }



        
    }
}

           