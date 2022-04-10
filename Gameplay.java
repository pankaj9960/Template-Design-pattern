class Gameplay {

    public static void main(String[] args) {

       Game game = new Cricket();
       game.play();
       System.out.println();

       game = new Volleyball();
       game.play();
       System.out.println();
    }
}