public class Game {
    private Playerchoice x;
    private Computerchoice y;
    
    protected int cCount=0;
    protected int pcount =0;
    protected int tie = 0;
    protected int round =0;

    public Game(String name) 
    {
        this.x= new Playerchoice(name);
        this.y = new Computerchoice();
    }
        

        public void gamestart()
        {
            round ++;
            System.out.println("\n\n\n\n"+" ".repeat(50) +"--------------------------------");
            System.out.println(" ".repeat(61) +"GAME START           ");
            System.out.println(" ".repeat(50) +"--------------------------------");
            System.out.println(" ".repeat(60) +"ROUND : " + round);
            if(round >1)
            {
                System.out.println(" ".repeat(45) +"YOU WIN :" + pcount + "        TIE : " +tie+"        YOU LOST : " +cCount);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            y.makech();
            x.makech();

            System.out.println(y.getSpace()+"RESULT LOADING  .  .  .");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(x.getSpace()+"COMPUTER CHOISE : \u001B[31m \" " + y.getComputerchoise() + " \"\u001B[0m");
            winner(y.getHandch());

            

        }
        

        private void winner(String computerarmatha){
            String plchoice = x.getHandch();
            
        
            if (computerarmatha.equals(plchoice)) 
            {
                System.out.println("\n\n"+x.getSpace()+y.getSpace50()+ y.getColorrad()+"\"Ahaaa THIS IS TIE \""+ y.getRemove() + "\n\n");
                tie++;
                
            } 
            else if (plchoice.equals("R") && computerarmatha.equals("S") || plchoice.equals("P") && computerarmatha.equals("R") || plchoice.equals("S") && computerarmatha.equals("P")) 
            {   
                System.out.println( "\n\n" + x.getSpace()+y.getSpace50()+x.getColorgreen()+"\" WOW YOU WIN \"\u001B[0m "+ x.getName().split(" ")[0] + x.getRemove() + "\n\n");
                pcount++;
                
            } 
            else 
            {
                System.out.println("\n\n"+x.getSpace() +x.getSpace50()+y.getColorrad()+"\"YOU LOST \" "+ x.getRemove()+"\n\n");
                cCount++;
            }                 
            



        }
    
}