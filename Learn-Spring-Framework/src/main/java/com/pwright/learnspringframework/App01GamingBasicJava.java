package com.pwright.learnspringframework;

import com.pwright.learnspringframework.game.GameRunner;
import com.pwright.learnspringframework.game.MarioGame;
import com.pwright.learnspringframework.game.PacManGame;
import com.pwright.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    
    public static void main(String[] args) {
        
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        
        var game = new PacManGame(); //1: Object Creation

        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();
    }
}
