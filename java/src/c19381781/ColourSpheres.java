package c19381781;

    import processing.core.*;


public class ColourSpheres 
{
    JoshsVisual jv;

    public ColourSpheres(JoshsVisual jv)    //construct
    {
        this.jv = jv;
    }

    float angle = 0;    //declaring rotational angle

    public void render()
    {
        jv.strokeWeight(1);
        jv.pushMatrix();//push and pop matrix before every individual shape
        jv.translate(1000, 750, -400);  //location, each shape will have it's individual coordinates
        jv.rotateY(angle);  //y rotation
        jv.rotateX(angle);  //x rotation
        jv.noFill();    //no fill/hollow sphere and box
        jv.stroke(jv.map(jv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);  //colour reacts over outline of sphere and box are smoothed amplitude
        jv.box(350);    //box size, static
        jv.sphere(jv.getSmoothedAmplitude()*500);  //sphere is inside box and grows in size depending on smoothed amplitude
        jv.popMatrix();
    
        jv.pushMatrix();
        jv.translate(500, 250, -400);   //location
        jv.rotateY(angle);  //y rotation
        jv.rotateX(angle);  //x rotation
        jv.noFill();    //hollow shapes
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255); //smoothed amplitude *2 decides colour
        jv.box(350);    //box size
        jv.sphere(jv.getSmoothedAmplitude()*500);    //sphere size
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(1000, 250, -400); //location
        jv.rotateY(angle);  //y rotation
        jv.rotateX(angle);  //x rotation
        jv.noFill();    //hollow shapes
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255); // same as previous but *3 this time
        jv.box(350);    //box size
        jv.sphere(jv.getSmoothedAmplitude()*500);    //sphere size
        jv.popMatrix();

        jv.pushMatrix();
        jv.translate(500, 750, -400);   //location
        jv.rotateY(angle);  //y rotation
        jv.rotateX(angle);  //x rotation
        jv.noFill();   //hollow shape
        jv.stroke(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255); //*4 for final colours
        jv.box(350);    //box size
        jv.sphere(jv.getSmoothedAmplitude()*500);    //sphere size
        jv.popMatrix();

        angle += jv.getSmoothedAmplitude()/8;   //the angle the spheres all rotate at is dependant on smoothed amplitude and i divided it by 8 to suit this song best as it was a nice middleground

    }
}

