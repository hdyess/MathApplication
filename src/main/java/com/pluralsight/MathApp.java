package com.pluralsight;
import java.lang.Math;

public class MathApp {
    public static void main(String[] args){

        // Question 1:

        // declare variables here
        int garySalary = 75_000;
        int bobSalary = 77_000;
        int highestSalary = Math.max(garySalary, bobSalary);

        // then code solution
        // n/a

        // then use System.out.println() to display results
        System.out.println("The highest salary is... " + highestSalary + "!");

        // ex: System.out.println("The answer is " + answer);

        // REPEAT FOR NEXT EXERCISE


        // Question 2:

        // declare variables here
        double carPrice  = 15_000;
        double truckPrice = 20_000;

        // then code solution
        // n/a

        // then use System.out.println() to display results
        System.out.println("The cheaper vehicle is priced at: " + Math.min(carPrice, truckPrice));


        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


        // Question 3:

        // declare variables here
        double radius = 7.25;
        double area;

        // then code solution
        area = Math.PI * Math.pow(radius, 2);

        // then use System.out.println() to display results

        System.out.printf(
                "The area of a circle with a radius of %.2f is %.2f.\n",
                radius,
                area
        );

        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


        // Question 4:

        // declare variables here
        double asdf;
        double root;

        // then code solution
        asdf = 5.0;
        root = Math.sqrt(asdf);

        // then use System.out.println() to display results
        System.out.println(root);

        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


        // Question 5:

        // declare variables here
        double dist;

        double point1x;
        double point1y;
        double point2x;
        double point2y;

        double xdist;
        double ydist;

        // then code solution
        point1x = 5;
        point1y = 10;

        point2x = 85;
        point2y = 50;

        //finds the distance between the points
        xdist = Math.abs(point1x - point2x);
        ydist = Math.abs(point1y - point2y);

        //pythagorean theorem
        dist = Math.sqrt(Math.pow(xdist, 2) + Math.pow(ydist, 2));

        // then use System.out.println() to display results
        System.out.printf("The distance between [5, 10] and [85, 50] is %.8f.\n", dist);

        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


        // Question 6:

        // declare variables here
        double preAbsoluteNumber;
        double postAbsoluteNumber;

        // then code solution
        preAbsoluteNumber = -3.58;
        postAbsoluteNumber = Math.abs(preAbsoluteNumber);

        // then use System.out.println() to display results
        System.out.printf("The absolute value is %.2f.\n", postAbsoluteNumber);

        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


        // Question 7:

        // declare variables here
        double randomDouble;

        // then code solution
        randomDouble = Math.random();

        // then use System.out.println() to display results
        System.out.printf("Random number: %.2f\n", randomDouble);

        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


        // Question 8:

        // declare variables here
        int days;
        int hours;
        int minutes;
        int seconds;
        int milliseconds;

        // then code solution
        days = 24;
        hours = days*24;
        minutes = hours*60;
        seconds = minutes*60;
        milliseconds = seconds*1000;

        // then use System.out.println() to display results
        System.out.printf("Seconds in %d days: %d\nMilliseconds: %d\n", days, seconds, milliseconds);

        // ex: System.out.println("The answer is " + answer);


        // REPEAT FOR NEXT EXERCISE


    }
}
