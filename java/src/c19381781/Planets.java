package c19381781;

    import processing.core.*;


public class Planets
{
    JoshsVisual jv;

    public Planets(JoshsVisual jv)
    {
        this.jv = jv;
    }

    float angle = 0;
    int i, j;

    public void render()
    {
        jv.strokeWeight(1);
        for(i=0; i < 1600; i = i+40)    //drawing stars using white points
        {
            for(j=0; j<1600; j = j+40)
            {   
                jv.stroke(255);
                jv.point(i, j);
            }
        }
        jv.pushMatrix();
        //planets orbit speed and growth is according to smoothed amplitude of song
        //sun, center piece
        jv.translate(700, 400, 10);  //sun is located central, forward on z axis to be in front of stars
        jv.rotateY(angle);  //all shapes only rotate using y
        jv.fill( 5+jv.getSmoothedAmplitude()*38, 255, 255);    //sun is a yellow/orange colour and changes depending on smooth amplitude
        jv.lights();
        jv.stroke(25, 255, 255);    //added stroke to some of the planets as a detail feature for aesthetics
        jv.sphere(150+jv.getSmoothedAmplitude()*200);   //size of each planet will grow depending on smoothed amplitude but sun will grow most as it is a gaseous star

        //mercury, rotates around the sun
        jv.translate(300, 0, -300);
        jv.rotateX(angle);
        jv.fill( 30, 100, 100);
        jv.lights();
        jv.noStroke();
        jv.sphere(30+jv.getSmoothedAmplitude()*150);

        //venus, rotates around mercury to give the appearance of orbiting the sun
        jv.translate(250, 0, -300);
        jv.rotateX(angle);
        jv.fill( 10, 255, 255);
        jv.lights();
        jv.stroke(10, 255, 255);
        jv.sphere(70+jv.getSmoothedAmplitude()*150);

        //earth, rotates around venus
        jv.translate(350, 0, -300);
        jv.rotateX(angle);
        jv.fill( 145, 255, 255);
        jv.lights();
        jv.noStroke();
        jv.sphere(105+jv.getSmoothedAmplitude()*150);

        //mars, same as others just next step up
        jv.translate(400, 0, -300);
        jv.rotateX(angle);
        jv.fill( 0, 255, 255);
        jv.lights();
        jv.noStroke();
        jv.sphere(120+jv.getSmoothedAmplitude()*150);

        //jupiter, same as others but next step up
        jv.translate(600, 0, -300);
        jv.rotateX(angle);
        jv.fill( 34, 255, 255);
        jv.lights();
        jv.stroke(32, 110, 110); //added stroke to jupiter to give appearance of it's cloudy surface
        jv.sphere(150+jv.getSmoothedAmplitude()*150);
        jv.popMatrix();

        angle += jv.getSmoothedAmplitude()/25; //planets orbits at smoothedamplitude divided by 25 to give a noticeable but not too fast orbital patern

    }
}

