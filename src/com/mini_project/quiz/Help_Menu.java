package com.mini_project.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Help_Menu {

	public void main() throws FileNotFoundException {
		 File file = new File("D:\\Project\\QUIZ_PROJECT\\Help.txt");
		    try (Scanner sc = new Scanner(file)) {
				while (sc.hasNextLine())
				  System.out.println(sc.nextLine());
			}
	}

}

/*int contact;
int score=0;
char grade;
if(question.equals(answer))
{
	System.out.println("Correct answer");
	score=score+1;
}


//for updating score
update mcq.user set Scored_Marks=score where contact=score;


//for updating grade
if(score>8)
{
	update mcq.user set Grade='A' where contact=contact;
}
elseif(score>=5 && score<8)
{
	update mcq.user set Grade='B' where contact=contact;
}
else if(score>0 && score<5)
{
	update mcq.user set Grade='C' where contact=contact;
}
else if(score==0)
{
	update mcq.user set Grade='F' where contact=contace;
}


int scoreid;
int allscoreid;
System.out.println("Press 1 to check your score");
System.out.println("Press 2 to check all score");

switch(score_id)
{
case 1:
	individual score
	select * from mcq.user order where contact=-------;
	break;

case 2:
	System.out.println("Press 1 to check score in ascending order");
	System.out.println("Press 2 to check score in descending order");
	switch(allscoreid)
	{
	case 1:
		ascending order
		String query="select * from mcq.user order by asc";
		break;
	case 2:
		desending order
		select * from mcq.user order by desc;
		break
	}
   break;
}*/





































