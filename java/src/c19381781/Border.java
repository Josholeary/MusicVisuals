package c19381781;

public class Border
{
    JoshsVisual jv;

    public Border(JoshsVisual jv)   //construct
    {
        this.jv = jv;
    }

    //unfortunately the border will only fit according to the particular window which is the size of my mac sreen without the bottom app dock present
    //this means it may appear strangely on other devices but i could not use another alternative since fullscreen() was not supported on mac
    public void render()
    {   
        float gap = jv.width / (float) jv.getBands().length;    //gap between bars

        jv.noStroke();  //no outline lines
        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);   //rectangles colour, 2 * smoothed amp
            jv.rect(i * gap, jv.height, gap-60,-jv.getSmoothedBands()[i] * 0.1f);   //rectangle x value will be step * gap, y is height of instance, width is gap - 60 to give space between, height is negative smoothed bands of step to make it audio reponsive
        }

        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255);   //colour, 3* smoothed amp
            jv.rect(jv.height+585, i*gap, -jv.getSmoothedBands()[i] * 0.1f,gap-60); //swap x with y, adjust x value for screen size, swap width with height
        }


        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()*4, 0, 1, 0, 255), 255, 255);   //colour, 4 * smoothed amp
            jv.rect(jv.height-855, i*gap, jv.getSmoothedBands()[i] * 0.1f,gap-60); //swap x with y, adjust x value, use positive smoothed bands width value so it reacts in the opposite direction
        }

        for(int i = 0 ; i < jv.getBands().length ; i ++)
        {
            jv.fill(jv.map(jv.getSmoothedAmplitude()/2, 0, 1, 0, 255), 255, 255);   //colour, smoothed amp/2
            jv.rect(i * gap, jv.height-855, gap-60,jv.getSmoothedBands()[i] * 0.1f);  //x and y in original postions, y value adjusted(thanks Mac), default width value from first, positive smoothed bands for inverted height audio response
        }



        
    }
}

           