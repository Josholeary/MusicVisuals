package c19381781;

import ie.tudublin.*;

public class JoshsVisual extends Visual
{ 
    boolean sphere = false;
    boolean plan = false;
    ColourSpheres sp;
    Planets pl;

    public void settings()
    {
        size(2560, 1600, P3D); //unfortunately fullscreen did not work on mac so I simply made the window the size of my screen
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(processing.core.PConstants.P3D, SPAN); 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("poison.mp3");   
        colorMode(HSB);

        sp = new ColourSpheres(this);
        pl = new Planets(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
        if(key == '1')
        {
            plan = ! plan;
            sphere = false;
        }
        if (key == '2')
        {
            sphere = ! sphere;
            plan = false;
        }
    }

    float rot = 0;

    public void draw()
    {
        background(0);
        text("Amplitude:" + getAmplitude(), 50, 50);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();   
        surface.setResizable(true);  
        if(sphere)
        {
        sp.render();
        }
        if(plan)
        {
            pl.render();
        }        
    }
}
