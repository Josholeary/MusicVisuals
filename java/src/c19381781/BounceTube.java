package c19381781;

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
        float prevX = jv.width / 2;
        float prevY = jv.height / 2;
        jv.noFill();
        jv.strokeWeight(2);
        for(int i = 0 ; i < 325 ; i ++)
        {
            float p = jv.map(i, 0, 300, 0, 255);    //rainbow effect scaling up tube
            jv.stroke(p, 255, 255, 100);
            float theta = i * jv.TWO_PI;
            float x = jv.width / 2 + jv.sin(theta) * r;
            float y = jv.height / 2 - jv.cos(theta) * r;
            r += jv.getSmoothedAmplitude();
            jv.ellipse(x, y, prevX, prevY);
            prevX = x;
            prevY = y;
        }
    }  
} 

           