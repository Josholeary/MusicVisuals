package c19381781;

public class ShapeStorm
{
    JoshsVisual jv;

    public ShapeStorm(JoshsVisual jv)  //construct
    {
        this.jv = jv;
    }

    float x = 0;
    float y = 0;

    public void render()
    {   

        x = jv.getSmoothedAmplitude()*250;
        y = jv.getSmoothedAmplitude()*250;
        jv.translate(x, y);
        jv.stroke(255);
        jv.circle(0, 0, 20);
    } 
}

           