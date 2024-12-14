import java.util.Random;

public class Computerchoice extends Baseclass {
    private Random ran;

    public Computerchoice() 
    {
        super("Computer");
        this.ran = new Random();
    }

    @Override
    public void makech() 
    {
        int rannumber = ran.nextInt(3);

        switch (rannumber) {
            case 0:
                Handch = "R"; 
                setComputerchoise("ROCK");
                break;
            case 1:
                Handch = "P";  
                setComputerchoise("PAPER");
                break;
            case 2:
                Handch = "S";  
                setComputerchoise("SCISSOR");
                break;
        }
    }
}