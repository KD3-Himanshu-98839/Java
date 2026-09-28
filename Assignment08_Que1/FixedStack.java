package Assignment08_Que1;

public class FixedStack implements Stack {
	Employee[] arr;
	int StackSize;
	int top = -1;

	public FixedStack(int size) {
		this.StackSize = size; 
		this.arr = new Employee[size];
	}

	@Override
	public void push(Employee e) {
		if (top == (StackSize-1)) {
			System.out.println("Stack is full.");
		}
		else {
			top++;
			arr[top] = e;
			System.out.println(e.getNameString().toUpperCase() +" Added Sucessfully");
		}

	}

	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("Stack is empty!!");
			return null;
		}
		Employee e = arr[top];
		top--;
		return e; 
	}

	@Override
	public Employee peek() {
		if (top == -1) {
			System.out.println("Stack is empty!!");
			return null;
		} 
		Employee employee = arr[top];
		return employee;
	}

}
