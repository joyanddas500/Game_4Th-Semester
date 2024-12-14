public class Main {

     
    public Main(){
        Computerchoice ob = new Computerchoice();

  
        
        System.out.println("\n"+ob.getSpace50() + "      ROCK PAPER SCISSORS      ");
        System.out.println(ob.getSpace50() + "================================\n\n");
        
        System.out.print(" ".repeat(25) + "ENTER YOUR NAME : ");    
        String plname = ob.getInput().nextLine().toUpperCase();

        System.out.println("\n" + " ".repeat(25) + "PREPARING GAME \n");

        try {
            for (int i = 0; i <= 100; i++) 
            {
                System.out.print("\r" + " ".repeat(60) + "\u001B[31m" + i +"%"+ ob.getRemove());
                if(i == 100)
                {
                    System.out.print("\r" + " ".repeat(60)+"Go! Go! Go!");
                    Thread.sleep(1500);
                    System.out.print("\r"+" ".repeat(55) + ob.getBold()+"IT'S A PLEASURE TO HAVE YOU HERE MR " +ob.getRemove()+ ob.getColorrad()+ plname + ob.getRemove() +"!");
                    Thread.sleep(2000);
                }
                Thread.sleep(20);
            }


        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        Game gamest = new Game(plname);

        
        
        while (true) 
        {

            gamest.gamestart();
  

                System.out.print("\n\n"+ob.getSpace()+"IF YOU WANT TO EXIT TYPE \u001B[31m \" 0 \" \u001B[0m OTHERWISE CLICK \" ENTER \" ");
                String exit = ob.getInput().nextLine();
                if(exit.equals("0"))
                {
                    break;
                }


        }
        
        

    }
    
}