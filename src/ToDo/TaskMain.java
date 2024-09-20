package ToDo;

public class TaskMain {
	
	public static void main(String[] args) {
	  
	    Task lab = new Task("finish 1068 lab", 3, 120, 0);
	    Task IH = new Task("finish IH annotations", 1, 50, 0);

	    Task MC = new Task("study for discrete math quiz", 2, 30, 0);

	    System.out.print(lab);
	    System.out.print(IH);
	    System.out.print(MC);
	}
}
