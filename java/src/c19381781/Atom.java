package c19381781;

public class Atom
{
    JoshsVisual jv;

    public Atom(JoshsVisual jv)  //construct
    {
        this.jv = jv;
    }

    float angle = 0;

    public void render()
    {   
        jv.strokeWeight(1);
        jv.translate(jv.width/2, jv.height/2);
        jv.noFill();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*5, 0, 1, 0, 255), 255, 255);
        //atom nucleus
        jv.pushMatrix();
        jv.rotateY(angle);
        jv.rotateX(angle);
        jv.sphere(100);
        jv.popMatrix();

        jv.strokeWeight(5);
        //atom 1st orbital
        jv.pushMatrix();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
        jv.rotateY(angle/2);
        jv.circle(0, 0, 250);
        jv.popMatrix();

        //atom 2nd orbital
        jv.pushMatrix();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);
        jv.rotateX(angle);
        jv.circle(0, 0, 350);
        jv.popMatrix();

        //atom 3rd orbital
        jv.pushMatrix();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()/2, 0, 1, 0, 255), 255, 255);
        jv.rotateY(angle*2);
        jv.circle(0, 0, 450);
        jv.popMatrix();

        //atom 4th orbital
        jv.pushMatrix();
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);
        jv.rotateX(angle*3);
        jv.circle(0, 0, 550);
        jv.popMatrix();




        angle += jv.getSmoothedAmplitude()/30;

    } 
}

           