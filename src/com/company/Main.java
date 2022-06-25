package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner("1");
        System.out.println("Ведите радиус круга");
        int radius=scanner.nextInt();

        Circle circle = new Circle(3.14159);

      Circle.area(circle.getPI(),radius);
       Circle.circumference(circle.getPI(),radius);
   }

    }

