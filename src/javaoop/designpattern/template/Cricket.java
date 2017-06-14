package javaoop.designpattern.template;

public class Cricket extends Game {
    
    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }
    
    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
    
    @Override
    public void endPlay() {
        System.out.println("Criket Game Finished!");
    }
}
