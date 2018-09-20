import java.util.Scanner;
import ToDo.*;

public class ToDoList{
	public static void main(String[] args){
		boolean keepGoing  = true;
		final int MAXTODO = 10;
		int userOpt;
		String todo = "";
		
		ToDo[] userList = new ToDo[MAXTODO];
		Scanner userInput = new Scanner(System.in);
		while (keepGoing == true){
		
		userOpt= printMenu();
		
		
		if(userOpt == 1){
			for (int i = 0;i<ToDo.count; i++){
			System.out.println((i+1) + " ToDo: " + userList[i].getToDo());
			}
		}
		else if(userOpt == 2){
			System.out.println("What is your task? ");
			todo = userInput.nextLine();
			int count = ToDo.count;
			userList[count] = new ToDo();
			userList[count].addToDo(todo);
			
		}
		else if(userOpt == 3){
			System.out.println("What do you want to mark done? ");
			userOpt = userInput.nextInt();
			userInput.nextLine();
			userList[(userOpt-1)].markDone();
		}
		else if(userOpt == 4){
			System.out.println("You have " + ToDo.count + " ToDo items.");
		}
		}
	}
	
	private static int printMenu(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("What would you like to do? Pick an option number ");
		System.out.println("1 - Show ToDo List");
		System.out.println("2 - Add to ToDo List");
		System.out.println("3 - Mark ToDo item as done ");
		System.out.println("4 - Print count of ToDos ");
		System.out.println("==================================================");
		
		int userOpt = userInput.nextInt();
		userInput.nextLine();
		
		return userOpt;
		
	}
}