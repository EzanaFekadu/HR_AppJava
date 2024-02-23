public class SimpleStartupGame {
    public static void main(String[] args){
        int numGuesses = 0;
        GameHelper helper = new GameHelper();
    
        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int)(Math.random()*5);
    
        int[] locs = {randomNum, randomNum++,randomNum+2};
        theStartup.setLocationCells(locs);
        boolean alive=true;

        while(alive){
            int guess= helper.getUserInput("Enter a guess");
            String result= thStartup.checkYourself(guess);
            numGuesses++;

            if(result.equals("kill")){
                isAlive=false;
                System.out.println("You took "+numGuesses+ " guesses");

            }// closes if
        }//closes while
    }// closes main
}// closes class
