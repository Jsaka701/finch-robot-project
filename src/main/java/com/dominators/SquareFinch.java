package com.dominators;

import com.birdbrain.Finch;

public class SquareFinch{
    public static void main (String[] args){
        Finch bird = new Finch();

        // DO SOMETHING

        bird.setMove("F", 20, 100);

        bird.stop();
        bird.disconnect();
    }
}