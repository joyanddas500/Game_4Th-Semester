    import java.util.Scanner;

    public abstract class Baseclass {


        public abstract void makech();

        
    protected String Name;
    protected String Handch;
    protected String Space;
    protected String Bold;
    protected String Colorrad;
    protected String Space50;
    protected String Remove;
    protected String Computerchoise;
    protected String Colorgreen;
    protected Scanner input;
   
    public Baseclass(String name) 
    {
        this.Name = name;
        this.input = new Scanner(System.in);
    }
    public void setComputerchoise(String anything)
    {
        this.Computerchoise = anything;
    }
    public Scanner getInput()
    {
        return input ;
    }
   
    public String getComputerchoise()
    {
        return Computerchoise;
    }

    public String getName() 
    {
        return Name;
    }
     public interface InnerBaseclass {
     
        
     }

    public String getHandch() 
    {
        return Handch;
    }
    public String getSpace()
    {
        return " ".repeat(25);
    }
    public String getSpace50()
    {
        return " ".repeat(50);
    }
    public String getColorrad()
    {
        return "\u001B[31m" ;
    }
    public String getColorgreen()
    {
        return "\u001B[32m" ;
    }
    public String getRemove()
    {
        return "\u001B[0m";
    }
    public String getBold()
    {
        return "\u001B[1m";
    }
   

}