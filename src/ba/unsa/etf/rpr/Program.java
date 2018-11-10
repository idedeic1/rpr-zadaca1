package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
         String komanda = new String();
         Scanner in = new Scanner(System.in);
         Board b = new Board();
    	    while(!(komanda.equals("X"))){
    	        System.out.println("White move: ");
    	        komanda = in.nextLine();

    	        komanda = "";
    	        System.out.println("Black move: ");
            }
    }
}
