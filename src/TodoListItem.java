
public class TodoListItem {

	String description;
	int priority;
	boolean isDone = false;
	
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
		
		
		// TODO Auto-generated constructor stub
	}

	public Object getDescription() {
		
		return this.description;
		
	
		// TODO Auto-generated method stub
		
	}

	public Object getPriority() {
		return this.priority;
	
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return isDone;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		isDone = true;  
		
			
	}

}
