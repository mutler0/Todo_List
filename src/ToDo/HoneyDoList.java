package ToDo;

import java.util.Arrays;

public class HoneyDoList{
	
	private Task []tasks;
	private int numTasks;
	private int INITIAL_CAPACITY = 5;
	
	public HoneyDoList() {
		tasks = new Task[INITIAL_CAPACITY];
		numTasks = 0;	
	}


	public String toString() {
		return Arrays.toString(tasks);
	}
	
	public int find(String name) {
		for (int i = 0; i < numTasks; i++) {
			String temp = tasks[i].getName();
			if (temp.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addTask(Task newTask) {
		if (numTasks == tasks.length) {
			 resizeArray();
		} else {
			tasks[numTasks] = newTask;
			numTasks++; 
		}
		
	}
	public void resizeArray() {
		int newCapacity = tasks.length + 1;
		Task[] newTasks = Arrays.copyOf(tasks,newCapacity);
        tasks = newTasks;
	}

	public int totalTime() {
		int total = 0;
		for (int i = 0; i < numTasks; i++) {
			total += tasks[i].getComplete();
		}
		return total;
	}
	
	public int shortestTime() {
		int index = 0;
		int shortestTime = tasks[0].getComplete();
		
		for (int i = 1; i < numTasks; i++) {
			if (tasks[i].getComplete() < shortestTime) {
				index = i;
				shortestTime = tasks[i].getComplete();
			}
		}
			
		if (shortestTime == 0) {
			return -1;
		} else {	
			return index;
		}
			
	}
	
	public Task completeTask(int index) {
		if (index < 0 || index > INITIAL_CAPACITY) {
			return null;
		}
		
		Task []newTask = new Task[INITIAL_CAPACITY];
		Task completedTask = tasks[index];
		
		for (int i = index; i < numTasks - 1; i++) {
			tasks[i] = tasks[i+1];
		}
		
		numTasks -= 1;
		tasks[numTasks] = null;
		
		return completedTask;
	
	}
	
	public Task getTask(int index) {
		if (index < 0 || index > INITIAL_CAPACITY) {
			return null;
		} else {
			return tasks[index];
		}
	}

//	extra credit: overdueTasks() returns an array of Task consisting of only the items in tasks[] that are overdue.
	
	

	
}
