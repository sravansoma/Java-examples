public class DotComTest{
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom test = new DotCom();
        

        int randomNum  = (int)(Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        test.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = test.checkTheGuess(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("Yout took " + numOfGuesses + " guesses");
            }
        }
        
    }
}