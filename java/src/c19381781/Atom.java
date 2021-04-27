package c19381781;

public class Atom
{
    JoshsVisual jv;

    public Atom(JoshsVisual jv)  //construct
    {
        this.jv = jv;
    }


    public void render()
    {   
        jv.translate(jv.width/2, jv.height/2);
        jv.noFill();
        jv.stroke(255);
        jv.sphere(200);

    } 
}

           