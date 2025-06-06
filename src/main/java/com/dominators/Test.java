package com.dominators;

import com.birdbrain.Finch;

public class Test {
    public static void main (String[] args){
        DanceFinch bird = new DanceFinch();

        bird.intro();
        bird.song();
        bird.disco();
        bird.shimmy();



        bird.disconnect();
    }
}