package com.richard.home;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{ 
    
    public static void main( String[] args )
    {
	ApplicationContext context = new AnnotationConfigApplicationContext("com.richard.home");
	Player richard = (Player)context.getBean("richard");
//        for (int i = 0; i < 50000; i++){
//            	
////            Player richard = new Player("richard", 26);
//        }
        System.out.println( "Name= " + richard.getName() + " : alter=" + richard.getAlter() );
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }
    
    
}
