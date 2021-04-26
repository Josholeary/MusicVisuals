package c19381781;

import ie.tudublin.*;

public class JoshsVisual extends Visual
{ 
    //booleans for menu
    boolean sphere = false;
    boolean plan = false;
    boolean spin = false;
    boolean bounce = false;
    boolean bord = true;    //starts on by default
    boolean menu = true;    //starts on by default
    //classes
    ColourSpheres sp;
    Planets pl;
    Spinner sn;
    BounceTube bt;
    Border bd;
    Menu me;

    public void settings()
    {
        size(2560, 1600, P3D); //unfortunately fullscreen did not work on mac so I simply made the window the size of my screen
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("trnd.mp3");   
        colorMode(HSB);

        //class instances
        sp = new ColourSpheres(this);
        pl = new Planets(this);
        sn = new Spinner(this);
        bt = new BounceTube(this);
        bd = new Border(this);
        me = new Menu(this);
    }

    //menu input settings
    public void keyPressed()
    {
        if (key == 'q')
        {
            getAudioPlayer().play();    //play song
        }
        if (key == 'w')
        {
            getAudioPlayer().pause();   //pause song
        }
        if(key == 'e')
        {
            getAudioPlayer().cue(0);    //restard song
        }
        if(key == '0')
        {
            bord = ! bord;  //toggle border
        }
        if(key == '1')
        {
            plan = ! plan;  //planets on, other visuals off
            sphere = false;
            spin = false;
            bounce = false;
            menu = false;
        }
        if (key == '2')
        {
            sphere = ! sphere;  //spheres on, other visuals off
            plan = false;
            spin = false;
            bounce = false;
            menu = false;
        }
        if(key == '3')
        {
            spin = ! spin;  //spinner on, other visuals off
            plan = false;
            sphere = false;
            bounce = false;
            menu = false;
        }
        if(key == '4')
        {
            bounce = ! bounce;  //bouncetube on, other visuals off
            plan = false;
            sphere = false;
            spin = false;
            menu = false;
        }
        if(key == '9')
        {
            menu = ! menu;  //menu on, starts on by default, other visuals off
            plan = false;
            sphere = false;
            spin = false;
            bounce = false;

        }
    }

    float rot = 0;

    public void draw()
    {
        background(0);
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
        //call individual visual render functions from boolean above
        if(bord)    //if boolean for border is true then call render function for it
        {
            bd.render();
        }
        if(sphere)  //if bool for sphere true then render
        {
            sp.render();
        }
        if(plan)    //if bool for planet is true then render
        {
            pl.render();
        }        
        if(spin)    //if bool for spin is true then render
        {
            sn.render();
        }
        if(bounce)  //if bool for bounce is true then render
        {
            bt.render();
        }
        if(menu)    //if bool for menu is true then render
        {
            me.render();
        }
    }
}
