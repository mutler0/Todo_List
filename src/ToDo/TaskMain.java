package ToDo;

public class TaskMain {
	
	public static void main(String[] args) {
	    // creates a new Task object to remind you
	    // to finish your 1068 homework. It has priority 3
	    // and I anticipate that it's going to take 120 minutes
	    Task lab = new Task("finish 1068 lab", 3, 120, 0);
	    Task IH = new Task("finish IH annotations", 1, 50, 0);

	    Task MC = new Task("study for discrete math quiz", 2, 30, 0);

	    System.out.print(lab);
	    System.out.print(IH);
	    System.out.print(MC);
	
	    // if we're doing extra credit, we might instead write:
	    //Task postHW = new Task("post 1068 homework", 1, LocalDateTime.of(2023, 3, 23, 13, 0), 180);
	
	    // which would be to remind me to post the 1068 homework assignment.
	    // This has priority 1, should take me 180 minutes
	    // and it's due March 23, 2023 at 1 PM (i.e., 13:00)
	}
}
