package com.dominators;

import com.birdbrain.Finch;

public class DanceFinch extends Finch {
    
    //Intro Method
    public void intro() {
        setMotors(30, 30); //Moves Forward
        pause(1); //Pause 
        setMotors(-30, -30); //moves backwards
        pause(1); //Pause 
        setMotors(30, 30);
        pause(1); //Pause 
        setMotors(-30, -30);  //moves backwards
        pause(1); //Pause 
        setTurn("R", 360, 200);
        setTurn("L", 760, 200);
        setMotors(30, 30);
        pause(1); //Pause 
        setTurn("R", 180, 200);
        setMotors(30, 30);
        pause(1); //Pause 
        setMotors(-30, 30); // spins
        pause(2);//Pause 2 seconds 
        setTail("all",100,0,0);
        pause(0.5); //Pause .5
    }

    // Marry Had A Litle Lamb Song
    public void song() {
        playNote(75, 0.3);
        pause(0.5); //Pause .5
        playNote(73, 0.3);
        pause(0.5); //Pause .5
        playNote(71, 0.3);
        pause(0.5); //Pause .5
        playNote(73, 0.3);
        pause(0.5); //Pause .5
        playNote(75, 0.3);
        pause(0.5); //Pause .5
        playNote(75, 0.3);
        pause(0.5); //Pause .5
        playNote(75, 0.3);
        pause(1); //Pause 1
        playNote(73, 0.3);
        pause(0.5);//Pause .5
        playNote(73, 0.3);
        pause(0.5); //Pause .5
        playNote(73, 0.3);
        pause(0.7); //Pause .7
        playNote(75, 0.3);
        pause(0.6); //Pause .6
        playNote(75, 0.3);
        pause(0.6); //Pause .6
        playNote(75, 0.3);
        pause(0.7); //Pause .7
        playNote(75, 0.3);
        pause(0.5); //Pause .5
        playNote(73, 0.3);
        pause(0.5); //Pause .5
        playNote(71, 0.3);
        pause(0.5); //Pause .5
        playNote(73, 0.3);
        pause(0.5);//Pause .5
        playNote(75, 0.3);
        pause(0.5);//Pause .5
        playNote(75, 0.3);
        pause(0.5);//Pause .5
        playNote(75, 0.3);
        pause(0.7);//Pause .7
        playNote(75, 0.3);
        pause(0.5);//Pause .5
        playNote(73, 0.3);
        pause(0.5);//Pause .5
        playNote(73, 0.3);
        pause(0.5);//Pause .5
        playNote(75, 0.3);
        pause(0.5);//Pause .5
        playNote(73, 0.3);
        pause(0.5);//Pause .5
        playNote(71, 1);
        pause(0.5);//Pause .5
    }

    //Disco Lights
    public void disco() {
        setTail(4, 100, 0, 0); // sets tail red
        setBeak(100, 0, 0);// sets beak red
        pause(0.1);//Pause .1
        setTail(3, 0, 100, 0);// sets tail blue
        setBeak(0, 100, 0);// sets beak blue
        pause(0.1);//Pause .1
        setTail(2, 0, 0, 100); //sets tail green 
        setBeak(0, 0, 100);// sets beak green 
        pause(0.1);//Pause .1
        setTail(1, 100, 100, 0); //sets tail yellow
        setBeak(100, 100, 0);//sets beak yellow
        pause(0.2);//Pause .2
        setTail(1, 100, 0, 0);// sets tail red
        setBeak(100, 0, 0);// sets beak red
        pause(0.1);//Pause .1
        setTail(2, 0, 100, 0); // sets tail blue
        setBeak(0, 100, 0);// sets beak blue
        pause(0.1);//Pause .1
        setTail(3, 0, 0, 100);//sets tail green
        setBeak(0, 0, 100);//sets beak green
        pause(0.1);//Pause .1
        setTail(4, 100, 100, 0);//sets tail yellow
        setBeak(100, 100, 0);//sets beak yellow
        pause(0.1);//Pause .1
        setTail(4, 100, 0, 0); // sets tail red
        setBeak(100, 0, 0);// sets beak red
        pause(0.1);//Pause .1
        setTail(3, 0, 100, 0);// sets tail blue
        setBeak(0, 100, 0);// sets beak blue
        pause(0.1);//Pause .1
        setTail(2, 0, 0, 100); //sets tail green 
        setBeak(0, 0, 100);// sets beak green 
        pause(0.1);//Pause .1
        setTail(1, 100, 100, 0); //sets tail yellow
        setBeak(100, 100, 0);//sets beak yellow
        pause(0.2);//Pause .2
        setTail(1, 100, 0, 0);// sets tail red
        setBeak(100, 0, 0);// sets beak red
        pause(0.1);//Pause .1
        setTail(2, 0, 100, 0); // sets tail blue
        setBeak(0, 100, 0);// sets beak blue
        pause(0.1);//Pause .1
        setTail(3, 0, 0, 100);//sets tail green
        setBeak(0, 0, 100);//sets beak green
        pause(0.1);//Pause .1
        setTail(4, 100, 100, 0);//sets tail yellow
        setBeak(100, 100, 0);//sets beak yellow
        pause(0.1);//Pause .1
        setTail(4, 100, 0, 0); // sets tail red
        setBeak(100, 0, 0);// sets beak red
        pause(0.1);//Pause .1
        setTail(3, 0, 100, 0);// sets tail blue
        setBeak(0, 100, 0);// sets beak blue
        pause(0.1);//Pause .1
        setTail(2, 0, 0, 100); //sets tail green 
        setBeak(0, 0, 100);// sets beak green 
        pause(0.1);//Pause .1
        setTail(1, 100, 100, 0); //sets tail yellow
        setBeak(100, 100, 0);//sets beak yellow
        pause(0.2);//Pause .2
        setTail(1, 100, 0, 0);// sets tail red
        setBeak(100, 0, 0);// sets beak red
        pause(0.1);//Pause .1
        setTail(2, 0, 100, 0); // sets tail blue
        setBeak(0, 100, 0);// sets beak blue
        pause(0.1);//Pause .1
        setTail(3, 0, 0, 100);//sets tail green
        setBeak(0, 0, 100);//sets beak green
        pause(0.1);//Pause .1
        setTail(4, 100, 100, 0);//sets tail yellow
        setBeak(100, 100, 0);//sets beak yellow
        pause(0.1);//Pause .1
    }

    //Shimmy Dance
    public void shimmy() {
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);
        setTurn("L", 5, 200);
        setTurn("R", 5, 200);

        setTail("all", 0, 0, 0);
        setBeak( 0, 0, 0);
    }
        

}