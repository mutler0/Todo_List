package ToDo;

//java.time.LocalDateTime;

public class Task {
	private String name;
	private int priority;
	private int estMinsToComplete;
	private int whenDue;
	
	public Task(String n, int p, int m, int d) {
		name = n;
		priority = p;
		estMinsToComplete = m;
		whenDue = d;
	}
	
//	public final class LocalDateTime

	

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}
	
	public int getComplete() {
		return estMinsToComplete;
	}
	
	public int getDueDate() {
		return whenDue;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void complete(int newCompleteTime) {
		estMinsToComplete = newCompleteTime;
	}
	
	public void dueDate(int newDate) {
		whenDue = newDate;
	}
	
	public void increasePriority(int amount) {
		priority += amount;
	}
	
	public void decreasePriority(int amount) {
		priority -= amount;
		if (priority < 0) {
			priority = 0;
		}
	}
	
	public String toString() {
		return "\nDon't forget to " + name 
				+ "\nThis is a priority " + priority + ""
				+ "\nIt should take aprox " + estMinsToComplete + " minutes. "
						+ "\n"
				;
				//+ "\nThe due date is: " + whenDue;
	}
}
