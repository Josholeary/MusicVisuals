package c19381781;

public class Spinner
{
    JoshsVisual jv;

    public Spinner(JoshsVisual jv)
    {
        this.jv = jv;
    }

    float angle = 0;

    public void render()
    {
        float r = 1f;
        int NoVert = 5;      //Number of vertex on spinner     
        float prevX = jv.width / 2; 
        float prevY = jv.height / 2;
        float split = jv.TWO_PI / (float) NoVert;
        for(int i = 0 ; i < 500 ; i ++)
        {
            jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
            float theta = i * (split + jv.getSmoothedAmplitude());
            float x = jv.width / 2 + jv.sin(theta) * r;
            float y = jv.height / 2 - jv.cos(theta) * r;
            r += 0.4f + jv.getSmoothedAmplitude();
            jv.line(prevX, prevY, x, y);
            prevX = x;
            prevY = y;
        }
    } 
}

           