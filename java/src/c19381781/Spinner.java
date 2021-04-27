package c19381781;

public class Spinner
{
    JoshsVisual jv;

    public Spinner(JoshsVisual jv)  //construct
    {
        this.jv = jv;
    }


    public void render()
    {   
        float r = 1f;   //inital value given to r
        int NoVert = 5;      //Number of vertex on spinner     
        float prevX = jv.width / 2;     //previous x value, starts at half width
        float prevY = jv.height / 2;    //previous y value, starts at half height
        float split = jv.TWO_PI / (float) NoVert;   //6.283... / number of vertices we have on spinner
        jv.strokeWeight(1); //our stroke weight/ line thickness
        for(int i = 0 ; i < 1000 ; i += 3)  //for loop up to 1000, increments in 3, will never end as function is called 60 times a second
        {
            jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255); //colour of our spinner line
            float theta = i * (split + jv.getSmoothedAmplitude());  //value of theta is the step of for loop * our split value * smoothed amplitude to make it audio responsive
            float x = jv.width / 2 + jv.sin(theta) * r; // x value for our spinner
            float y = jv.height / 2 - jv.cos(theta) * r;    //y value for our spinner line
            r += 0.4f + jv.getSmoothedAmplitude();  //increments r to begin spinning
            jv.line(prevX, prevY, x, y);    //draws the line using our 4 values previously calculated
            prevX = x;  //sets previous to current for each iteration to update as it loops
            prevY = y;  //sets previous to current for each iteration to update as it loops
        }
        jv.noFill();    //hollow circle
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255); //circle line colour, 2 * smoothed amp
        jv.circle(jv.width/2, jv.height/2, 400+jv.getSmoothedAmplitude()*250);  //circle is central, base size 400, grows by smooth amp * 250
        jv.stroke(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);   //circle line colour equal smoothed amp
        jv.circle(jv.width/2, jv.height/2, 400+jv.getSmoothedAmplitude()*500);  //circle is central, base size 400, grows by smooth amp * 500
        jv.stroke(jv.map(jv.getSmoothedAmplitude()/2, 0, 1, 0, 255), 255, 255); //circle line colour, smoothed amp/2
        jv.circle(jv.width/2, jv.height/2, 400+jv.getSmoothedAmplitude()*750);  //circle is central, base size 400, grows by smooth amp * 750
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*6, 0, 1, 0, 255), 255, 255); //circle line colour, 6 * smoothed amp
        jv.circle(jv.width/2, jv.height/2, 400+jv.getSmoothedAmplitude()*1000); //circle is central, base size 400, grows by smooth amp * 750

        //adding accessory circles
        jv.pushMatrix();
        jv.translate(225, 150);
        jv.stroke(0,255,255);
        jv.fill(50);
        jv.circle(0, 0, 150);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*275);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*225);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*175);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(1225, 150);
        jv.stroke(140,255,255);
        jv.fill(50);
        jv.circle(0, 0, 150);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*275);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*225);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*175);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(225, 700);
        jv.stroke(100,255,255);
        jv.fill(50);
        jv.circle(0, 0, 150);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*275);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*225);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*175);
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(1225, 700);
        jv.stroke(210,255,255);
        jv.fill(50);
        jv.circle(0, 0, 150);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*275);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*225);
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);
        jv.circle(0, 0, 1+jv.getSmoothedAmplitude()*175);
        jv.popMatrix();


    } 
}

           