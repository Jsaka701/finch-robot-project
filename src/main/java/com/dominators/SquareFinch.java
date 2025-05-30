package com.dominators;

import com.birdbrain.Finch;

public class SquareFinch{
    public static void main (String[] args){
        Finch bird = new Finch();

        // DO SOMETHING

        bird.setMove("F", 5, 200);
        bird.setMove("B", 5, 200);
        bird.setMove("F", 5, 200);
        bird.setMove("B", 5, 200);
        bird.setTurn("R", 360, 200);
         bird.setTurn("L", 760, 200);
        bird.setMove("F", 20,200);
        bird.setTurn("R", 180, 200);
        bird.setMove("F", 20,200);
        bird.setMove("B", 50,200);
bird.setMove("F", 50,200);
        bird.stop();
        bird.disconnect();
    }
}