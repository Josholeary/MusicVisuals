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
        jv.text("Music controls:", 625, 200);

        jv.textSize(24);
        jv.fill(70, 255, 255);
        jv.text("Q - Play", 675, 250);

        jv.fill(0, 255, 255);
        jv.text("W - Pause", 675, 300);

        jv.fill(40, 255, 255);
        jv.text("E - Restart", 675, 350);

        //visual options
        jv.textSize(32);
        jv.fill(150, 255, 255);
        jv.text("Visuals:", 675, 450);

        jv.textSize(24);
        jv.fill(210, 255, 255);
        jv.text("1 - Planets", 650, 500);

        jv.fill(210, 255, 255);
        jv.text("2 - Disco Spheres", 650, 550);

        jv.fill(210, 255, 255);
        jv.text("3 - Spinner", 650, 600);

        jv.fill(210, 255, 255);
        jv.text("4 - Bouncy tube", 650, 650);

        jv.fill(210, 255, 255);
        jv.text("0 - Toggle Border", 650, 700);

        jv.fill(210, 255, 255);
        jv.text("9 - Return to menu", 650, 750);



    }
}

           