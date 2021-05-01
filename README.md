# Music Visualiser Project

*Name: Josh O'Leary*

*Student Number: C19381781*

## Intro
Welcome to the markdown for my OOP assignment, "Something beautiful to enjoy while listening to music.".
I will be writing on the following topics: 
-	Description of the assignment
-	Instructions on how to use the program
-	How it works
-	What I am most proud of in the assignment

# Description of the assignment
My assignment is a music visualizer that uses several different audio reactive visuals that respond to the amplitude of a song, these allow someone to sit back and really connect with the music as they watch the different visuals artistically portray the song they are listening to. It allows for the user to fully control what visuals they want to watch and to pause, play and restart the song at any point.

# Youtube video

[![YouTube](https://i9.ytimg.com/vi_webp/XZrCVTYcXBg/mqdefault.webp?time=1619868600000&sqp=CLj3tIQG&rs=AOn4CLB2RKIPRgC5e_7SjMni_7h0R1lKQQ)](https://www.youtube.com/watch?v=XZrCVTYcXBg)

# Instructions
|*Input*|*Result*|
|-------|--------|
| Music Controls | |
| Q | Play |
| W | Pause |
| E | Restart |
| Visual Controls | |
| 1 | Planets |
| 2 | Disco Spheres |
| 3 | Spinner |
| 4 | Rainbow speaker |
| 5 | Atom |
| 9 | Menu |
| 0 | Toggle border effect |

# How it works
The program uses a combination of object oriented programming and the minim and processing java libraries to create the visuals. The program reads in the song from the data folder in the main control file known as "JoshsVisuals.java", this file sets our window size, makes an object of each visual file and reads in the users input and calls the render function to draw the other visuals. Each visual including the main menu has it's own file which has a render() function. Each of these has a boolean variable which is toggled by key presses in the control method "JoshsVisual.java" and has a condition that two of the visuals cannot be on at the same time as they are quite intricate and will simply make a mess. This file creates an instance of each and then the render function is tied behind an if statement like as follows:

```Java
//Example of boolean menu and render calling from other files uses control file "JoshsVisuals.java" using spinner visual
boolean spin = false;
Spinner sn;


 public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("trnd.mp3");   
        colorMode(HSB);

        //class instances
        sn = new Spinner(this);
    }

if(key == '3')
        {
            spin = ! spin;  //spinner on, other visuals off
            plan = false;
            sphere = false;
            bounce = false;
            menu = false;
            ato = false;
        }
		

		if(spin)    //if bool for spin is true then render
        {
            sn.render();
        }
```

# Visuals

## Main Menu

![An image](images/MainMenu.png)

## Planets

![An image](images/Planet.png)

## Disco Spheres

![An image](images/Disco.png)

## Spinner

![An image](images/Spin.png)

## Rainbow Speaker

![An image](images/RainbowSpeaker.png)

## Atom

![An image](images/Atom.png)



# What I am most proud of in the assignment
I am most proud of my planets and rainbow speaker visuals. The planets were something I took a while to both come up with the idea for and actually create and I put a lot of effort into making it try to look somewhat to scale and in the correct colouring for example venus has a bright red stroke to give off its glowing appearance. Everything from the planet sizes to the colours to figuring out how to make them all orbit the sun and making each planet grow just enough to be noticeable but not too much to ruin the visual it overall was one of the visuals I put the most time into. I even returned to it several times for example to add in the stars through using a nested for loop to plot white points as well as adjusting some planets sizes.
The rainbow speaker on the other hand was something that took a very long time to get up and running to an acceptable degree and tuning it to react somewhat accurately to the music was quite difficult. It was tricky to make from the start requiring some maths and problem solving but also I had to stick with it and even restarted it at a stage after thinking about possibly scrapping it.
