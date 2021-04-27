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
        float a = 1f;   //elipse 1 growth val
        float b = 1f;   //elipse 2 growth val
        float c = 1f;   //elipse 3 growth val 
        float elw1 = jv.width / 2;   //ellipse 1 width
        float elh1 = jv.height / 2;  //ellipse 1 height

        float elw2 = jv.width / 2;   //ellipse 2 width
        float elh2 = jv.height / 2;  //ellipse 2 height

        float elw3 = jv.width / 2;   //ellipse 3 width
        float elh3 = jv.height / 2;  //ellipse 3 height

        jv.noFill();    //hollow tube
        jv.strokeWeight(2); //heavier lines
        for(int i = 0 ; i < 325 ; i ++)
        {
            float p = jv.map(i, 0, 300, 0, 255);    //colour effect scaling up tube
            float theta = i * jv.TWO_PI;    //theta value is step * 6.238..

            float x1 = jv.width / 2 + jv.sin(theta) * a;    //x val for ellipse 1
            float y1 = jv.height / 2 - jv.cos(theta) * a;   //y val for ellipse 1
            a += jv.getSmoothedAmplitude();                 //increment growth val by smoothed amp to make audio reponsive

            float x2 = jv.width / 2 + jv.sin(theta) * b;    //x val for ellipse 2
            float y2 = jv.height / 2 - jv.cos(theta) * b;   //y val for ellipse 2
            b += jv.getSmoothedAmplitude()*2;               //increment growth val by smoothed amp * 2 making it grow more when reacting

            float x3 = jv.width / 2 + jv.sin(theta) * c;    //x val for ellipse 3
            float y3 = jv.height / 2 - jv.cos(theta) * c;   //y val for ellipse 3
            c += jv.getSmoothedAmplitude()*3;               //increment growth val by smooth amp *3 making it grow even faster than the other 2


            jv.stroke(p, 255, 255, 100);    //colour of elipse lines

            jv.ellipse(x1, y1, elw1, elh1); //create ellipse 1

            jv.ellipse(x2, y2+25, elw2-125, elh2);  //create ellipse 2
            
            jv.ellipse(x3, y3+50, elw3-250, elh3);  //create ellipse 3

            //width/height values = new x/y values allowing it to climb with each iteration depending on value of a,b,c
            elw1 = x1;
            elh1 = y1;

            elw2 = x2;
            elh2 = y2;

            elw3 = x3;
            elh3 = y3;
        }

        //adding box that grows with smoohted amplitude on left side
        jv.pushMatrix();
        jv.strokeWeight(1);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
        jv.translate(225, jv.height/2);
        jv.box(50, 20+ jv.getSmoothedAmplitude()*1000, 50);
        jv.fill(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jv.box(25, 20+ jv.getSmoothedAmplitude()*500, 25);
        jv.popMatrix();

        //adding box that grows with smoothed amplitude on right side
        jv.pushMatrix();
        jv.strokeWeight(1);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
        jv.translate(1225, jv.height/2);
        jv.box(50, 20+ jv.getSmoothedAmplitude()*1000, 50);
        jv.fill(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jv.box(25, 20+ jv.getSmoothedAmplitude()*500, 25);
        jv.popMatrix();
    }  
} 

           