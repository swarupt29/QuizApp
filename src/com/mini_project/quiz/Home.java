package com.mini_project.quiz;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;
import com.mini_project.quiz.Score_Page;
public class Home {
	public static void main(String[] args) throws InterruptedException, SQLException, FileNotFoundException {
		String name;
		int score=0;
		String yn;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		name=sc.next();
        for(int i=0;i<100;i++)
        {
        	System.out.print("Loading "+i+"%\r");    
        	Thread.sleep(20);
        }
        System.out.println("Data Loaded");
        System.out.println("\nWelcome : "+name);
        System.out.println("\nEnter your choice");
        System.out.println("Press 1 to start Quiz");
        System.out.println("Press 2 to check your score");
        System.out.println("Press 3 for help start Quiz");
        System.out.println("Press 4 to exit");
        int choice=sc.nextInt();
		switch(choice) {
        case 1:
        	System.out.println("Starting Quiz");
        	Quiz_Menu qm=new Quiz_Menu();
        	qm.main();
        	break;
        case 2:
        	System.out.println("Entering Checking Score");
        	Score_Page sp=new Score_Page();
        	sp.main();
        	break;
        case 3:
        	System.out.println("Entering Help Menu");
        	Help_Menu hm=new Help_Menu();
        	hm.main();
        	break;
        case 4:
        	System.out.println("Exiting...");
        	System.exit(0);
        	break;
        default:
        	System.out.println("Enter a valid key");
        	break;
        }
	}
}