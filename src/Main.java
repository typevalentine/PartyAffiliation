import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        System.out.print("Enter your party affiliation [RDI]: ");
            partyAfil = in.nextLine();

            if(partyAfil.equalsIgnoreCase("R")) //will be true if enter upper or lowercase R
            {
            System.out.println("You get a Republican elephant!");
            }
            else if(partyAfil.equalsIgnoreCase("D"))
            {
            System.out.println("You get a Democratic donkey!");
            }
            else if(partyAfil.equalsIgnoreCase("I"))
            {
            System.out.println("You get an Independent man!");
            }
        else
            System.out.println("I don't know what party you belond to!");
    }
}