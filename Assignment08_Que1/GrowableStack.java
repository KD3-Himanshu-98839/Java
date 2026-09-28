package Assignment08_Que1;

public class GrowableStack implements Stack {
	int StackSize = 1;

	Employee[] arr = new Employee[StackSize];
	int top = -1;

	@Override
	public void push(Employee e) {
		if (top == (StackSize-1)) {
			int newSize = StackSize * 2;
			Employee newarr[] = new Employee[newSize];

			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
			StackSize = newSize;
		} 

		top++;
		arr[top] = e;
		System.out.println(e.getNameString().toUpperCase() +" Added Sucessfully");

	}

	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("Stack is empty!!");
		}
		Employee employee = arr[top];
		top--;
		return employee;
	}

	@Override
	public Employee peek() {
		if (top == -1) {
			System.out.println("Stack is empty!!");
		}
		Employee employee = arr[top];
		return employee;
	}

}
