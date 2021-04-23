package c19381781;

    import processing.core.*;

// This is an example of a visual that uses the audio bands
public class ColourSpheres 
{
    JoshsVisual jv;

    public ColourSpheres(JoshsVisual jv)
    {
        this.jv = jv;
    }

    float angle = 0;

    public void render()
    {
        jv.pushMatrix();
        jv.translate(1000, 750, -400);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
        jv.box(350);
        jv.sphere(jv.getSmoothedAmplitude()*500); 
        jv.popMatrix();
    
        jv.pushMatrix();
        jv.translate(500, 250, -400);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
        jv.box(350);
        jv.sphere(jv.getSmoothedAmplitude()*500);    
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(1000, 250, -400);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.box(350);
        jv.sphere(jv.getSmoothedAmplitude()*500);    
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(500, 750, -400);
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.box(350);
        jv.sphere(jv.getSmoothedAmplitude()*500);    
        jv.popMatrix();

        angle += jv.getSmoothedAmplitude()/8;

    }
}

