// Template Design Pattern


/* We are going to create a Game abstract class defining operations with a template method 
set to be final so that it cannot be overridden. Cricket and Volleyball are concrete classes
 that extend Game and override its methods.
 Gameplay, our demo class, will use Game to demonstrate use of template pattern.  */


 abstract class Game {

    public void play() {

        initialize();
        startgame();
        noofplayer();
        endgame();
        EstimatedFans();

    }

    void initialize() {
        System.out.println("Game process is initialize !! you can start the game");
    }

    abstract void noofplayer();

    abstract void startgame();

    abstract void endgame();

    abstract void EstimatedFans();

}


