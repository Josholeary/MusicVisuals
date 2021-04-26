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
        float a = 1f;   
        float b = 1f;   
        float c = 1f;         
        float elw1 = jv.width / 2;   //ellipse width
        float elh1 = jv.height / 2;  //ellipse height

        float elw2 = jv.width / 2;   //ellipse width
        float elh2 = jv.height / 2;  //ellipse height

        float elw3 = jv.width / 2;   //ellipse width
        float elh3 = jv.height / 2;  //ellipse height

        jv.noFill();    //hollow tube
        jv.strokeWeight(2);
        for(int i = 0 ; i < 325 ; i ++)
        {
            float p = jv.map(i, 0, 300, 0, 255);    //colour effect scaling up tube
            float theta = i * jv.TWO_PI;

            float x1 = jv.width / 2 + jv.sin(theta) * a;
            float y1 = jv.height / 2 - jv.cos(theta) * a;
            a += jv.getSmoothedAmplitude();

            float x2 = jv.width / 2 + jv.sin(theta) * b;
            float y2 = jv.height / 2 - jv.cos(theta) * b;
            b += jv.getSmoothedAmplitude()*2;

            float x3 = jv.width / 2 + jv.sin(theta) * c;
            float y3 = jv.height / 2 - jv.cos(theta) * c;
            c += jv.getSmoothedAmplitude()*3;


            jv.stroke(p, 255, 255, 100);
            jv.ellipse(x1, y1, elw1, elh1);


            jv.ellipse(x2, y2+25, elw2-125, elh2);
            
            jv.ellipse(x3, y3+50, elw3-250, elh3);

            elw1 = x1;
            elh1 = y1;

            elw2 = x2;
            elh2 = y2;

            elw3 = x3;
            elh3 = y3;
        }
    }  
} 

           