package ToDo;

public class HoneyDoListMain {

	public static void main(String[] args) {
		   // create a new empty list
		   HoneyDoList honeydo = new HoneyDoList();
		   
		    
		   
		   honeydo.addTask(new Task("take aspirin", 1, 5, 0));
		   honeydo.addTask(new Task("laundry", 5, 10, 0));
		   honeydo.addTask(new Task("dishes", 3, 20, 0));
		   honeydo.addTask(new Task("clean room", 4, 30, 0));
		   
		  	   
		   System.out.println(honeydo);

		   // print the item in the list which should
		   // take the least amount of time
		   //
		   // this looks like a mouthful, but we first get the index of the Task
		   // that takes the least amount of time, get a reference to it
		   // call toString( ) on it, and print the String
		   // representation to the screen
		  
		   
		   System.out.println(honeydo.totalTime());
		   
		   System.out.println(honeydo.find("dishes"));

		   System.out.println(honeydo.shortestTime());
		   
		   honeydo.completeTask(1);
		   System.out.println(honeydo);
		   
		   
		   
		   System.out.println(honeydo.getTask(2));
		   
		   System.out.println(honeydo.find("clean room"));
	}

}
