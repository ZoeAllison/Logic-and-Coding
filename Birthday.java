/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter the number of the month you were born in");  //prompt the user for a birth month
        x= keys.nextInt();
        System.out.println("Enter the year you were born in");
        y = keys.nextDouble();
        keys.close();
        
        //determine the number of days in the user's birth month
        if ((x==1)|| (x==3)||(x==5)||(x==7)|| (x==8)|| (x==10)||(x==12)){
            System.out.println("Your birth month has 31 days");
        }
        else if ((x==4) || (x==6)||(x==9)||(x==11)){
            System.out.println("Your birth month has 30 days");
        }
        else if (x==2){
            if ((y%4==0)){
            System.out.println("Your birth month had 29 days in your birth year"); 
            }
            else {
                System.out.println("Your birth month had 28 days in your birth year");
            }
        }    
                
            
            
    }
}
