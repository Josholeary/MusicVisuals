package c19381781;

public class Menu
{
    JoshsVisual jv;

    public Menu(JoshsVisual jv)
    {
        this.jv = jv;
    }

    

    public void render()
    {   
        //main headings
        jv.textSize(32);
        jv.fill(130, 255, 255);
        jv.text("Welcome to Music Visualizer by Josh O'Leary", 400, 100);

        jv.fill(130, 255, 255);
        jv.text("Student Number: C19381781", 500, 150);

        //music controls
        jv.fill(150, 255, 255);
        jv.text("Music Controls:", 615, 200);

        jv.textSize(24);
        jv.fill(70, 255, 255);
        jv.text("Q - Play", 660, 250);

        jv.fill(0, 255, 255);
        jv.text("W - Pause", 660, 300);

        jv.fill(40, 255, 255);
        jv.text("E - Restart", 660, 350);

        //visual controls
        jv.textSize(32);
        jv.fill(150, 255, 255);
        jv.text("Visual Controls:", 615, 450);

        jv.textSize(24);
        jv.fill(210, 255, 255);
        jv.text("1 - Planets", 660, 500);

        jv.fill(210, 255, 255);
        jv.text("2 - Disco Spheres", 660, 550);

        jv.fill(210, 255, 255);
        jv.text("3 - Spinner", 660, 600);

        jv.fill(210, 255, 255);
        jv.text("4 - Bouncy Tube", 660, 650);

        jv.fill(210, 255, 255);
        jv.text("0 - Toggle Border", 660, 700);

        jv.fill(210, 255, 255);
        jv.text("9 - Return to menu", 660, 750);



    }
}

           