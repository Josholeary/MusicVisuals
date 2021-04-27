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
        jv.text("Welcome to Music Visualizer by Josh O'Leary", 375, 100);

        jv.fill(130, 255, 255);
        jv.text("Student Number: C19381781", 475, 150);

        //music controls
        jv.fill(150, 255, 255);
        jv.text("Music Controls:", 590, 200);

        jv.textSize(24);
        jv.fill(70, 255, 255);
        jv.text("Q - Play", 635, 250);

        jv.fill(0, 255, 255);
        jv.text("W - Pause", 635, 300);

        jv.fill(40, 255, 255);
        jv.text("E - Restart", 635, 350);

        //visual controls
        jv.textSize(32);
        jv.fill(150, 255, 255);
        jv.text("Visual Controls:", 590, 450);

        jv.textSize(24);
        jv.fill(210, 255, 255);
        jv.text("1 - Planets", 635, 500);

        jv.fill(210, 255, 255);
        jv.text("2 - Disco Spheres", 635, 550);

        jv.fill(210, 255, 255);
        jv.text("3 - Spinner", 635, 600);

        jv.fill(210, 255, 255);
        jv.text("4 - Rainbow speaker", 635, 650);

        jv.fill(210, 255, 255);
        jv.text("5 - Atom", 635, 700);

        jv.fill(210, 255, 255);
        jv.text("6 - Return to menu", 635, 750);

        jv.fill(210, 255, 255);
        jv.text("0 - Toggle Border", 635, 800);

    }
}

           