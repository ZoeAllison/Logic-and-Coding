/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a number for the horizontal axis");  //prompt the user for an x-coordinate
        x = keys.nextDouble();
        System.out.println("Enter a number for the vertical axis");  //prompt the user for a y-coordinate
         y  = keys.nextDouble();
        keys.close();
        
        //determine the quadrant in which the user's order pair lies
        if ((x>0 && y>0) || (x>=0 && y>0) || (x>0 && y>=0)){
            System.out.println("Your coordinate is in the first quadrant");
        }
        else if ((x<0 && y>0) || (x<=0 && y>0) || (x<0 && y>=0)){
            System.out.println("Your coordinate is in the second quadrant");
        }
        else if ((x<0 && y<0) || (x<=0 && y<0) || (x<0 && y<=0)){
            System.out.println("Your coordinate is in the third quadrant");
        }
        else if ((x>0 && y<0) || (x>=0 && y<0) || (x>0 && y<=0)){
            System.out.println("Your coordinate is in the fourth quadrant");
    }
    else if (x==0 && y==0){
        System.out.println("Your coordinate is the origin");
    }
}
}