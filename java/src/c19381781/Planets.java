package c19381781;

    import processing.core.*;

// This is an example of a visual that uses the audio bands
public class Planets
{
    JoshsVisual jv;
    float cy=0;

    public Planets(JoshsVisual jv)
    {
        this.jv = jv;
    }

    float angle = 0;

    public void render()
    {
        //planets orbit speed and growth is according to smoothed amplitude of song
        //sun, center piece
        jv.translate(700, 400, -400);
        jv.rotateY(angle);
        jv.fill( 15+jv.getSmoothedAmplitude()*35, 255, 255);
        jv.lights();
        jv.stroke(28, 255, 255);
        jv.sphere(250+jv.getSmoothedAmplitude()*200);

        //mercury, rotates around the sun
        jv.translate(300, 0, -300);
        jv.rotateX(angle);
        jv.fill( 30, 100, 100);
        jv.lights();
        jv.noStroke();
        jv.sphere(40+jv.getSmoothedAmplitude()*150);

        //venus, rotates around mercury to give the appearance of orbiting the sun
        jv.translate(250, 0, -300);
        jv.rotateX(angle);
        jv.fill( 10, 255, 255);
        jv.lights();
        jv.stroke(10, 255, 255);
        jv.sphere(80+jv.getSmoothedAmplitude()*150);

        //earth, rotates around venus
        jv.translate(350, 0, -300);
        jv.rotateX(angle);
        jv.fill( 145, 255, 255);
        jv.lights();
        jv.noStroke();
        jv.sphere(125+jv.getSmoothedAmplitude()*150);

        //mars, same as others just next step up
        jv.translate(400, 0, -300);
        jv.rotateX(angle);
        jv.fill( 0, 255, 255);
        jv.lights();
        jv.noStroke();
        jv.sphere(140+jv.getSmoothedAmplitude()*150);

        //jupiter, same as others but next step up
        jv.translate(600, 0, -300);
        jv.rotateX(angle);
        jv.fill( 34, 255, 255);
        jv.lights();
        jv.stroke(32, 110, 110); //added stroke to jupiter to give appearance of it's cloudy surface
        jv.sphere(200+jv.getSmoothedAmplitude()*150);

        angle += jv.getSmoothedAmplitude()/25;

    }
}

