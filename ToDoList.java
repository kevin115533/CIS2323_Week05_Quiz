import java.util.Scanner;
import ToDo.*;

public class ToDoList{
	public static void main(String[] args){
		boolean keepGoing  = true;
		final int MAXTODO = 10;
		int userOpt;
		String todo = "";
		
		ToDo[] userList = new ToDo[MAXTODO];
		
		while (keepGoing == true){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("==================================================");
		System.out.println("What would you like to do? Pick an option number ");
		System.out.println("1 - Show ToDo List");
		System.out.println("2 - Add to ToDo List");
		System.out.println("3 - Mark ToDo item as done ");
		System.out.println("4 - Print count of ToDos ");
		System.out.println("==================================================");
		
		userOpt = userInput.nextInt();
		userInput.nextLine();
		
		if(userOpt == 1){
			//userList.getToDo();
		}
		else if(userOpt == 2){
			System.out.println("What is your task? ");
			todo = userInput.nextLine();
			int count = ToDo.count;
			userList[count] = new ToDo();
			userList[count].addToDo(todo);
			
		}
		else if(userOpt == 3){
			
		}
		else if(userOpt == 4){
			System.out.println("You have " + ToDo.count + " ToDo items.");
		}
		}
	}
	
}