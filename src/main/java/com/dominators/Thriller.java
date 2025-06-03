package com.dominators;

import com.birdbrain.Finch;

public class SquareFinch{
    public static void main (String[] args){
        Finch bird = new Finch();

        // DO SOMETHING
       
        // bird.setMotors(30, 30);
        // bird.pause(1);
        //     bird.setMotors(-30, 30);
        //     bird.pause(1);
        //     bird.setMotors(30, 30);
        //     bird.pause(1);
        //     bird.setMotors(-30, 30);
        //     bird.pause(1);
        //     bird.setTurn("R", 360, 200);
        //     bird.setTurn("L", 760, 200);
        //     bird.setMotors(30, 30);
        //     bird.pause(1);
        //     bird.setTurn("R", 180, 200);
        //     bird.setMotors(30, 30);
        //     bird.pause(1);
        //     bird.setMotors(-30, 30);
        //     bird.pause(2);
        //     bird.setTail("all",100,0,0);
        //     bird.playNote(30, 1);
        //     bird.pause(0.5);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        //     bird.setTurn("L", 5, 200);
        //     bird.setTurn("R", 5, 200);
        bird.playNote(75, 0.3);
        bird.pause(0.5);
        bird.playNote(73, 0.3);
        bird.pause(0.5);
        bird.playNote(71, 0.3);
        bird.pause(0.5);
        bird.playNote(73, 0.3);
        bird.pause(0.5);
        bird.playNote(75, 0.3);
        bird.pause(0.5);
        bird.playNote(75, 0.3);
        bird.pause(0.5);
        bird.playNote(75, 0.3);
        bird.pause(1);
        bird.playNote(73, 0.3);
        bird.pause(0.5);
        bird.playNote(73, 0.3);
        bird.pause(0.5);
        bird.playNote(73, 0.3);
        bird.pause(0.5);
        bird.playNote(75, 0.3);
        bird.pause(0.5);
        bird.stop();
        bird.disconnect();
    }
}