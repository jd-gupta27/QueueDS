import java.util.Scanner;

public class StackDemo {
	Scanner scan;
	int top = -1;
	int[] stack = new int[5];
	public static void main(String[] args) {
		StackDemo stackDemo = new StackDemo();
		stackDemo.scan = new Scanner(System.in);
		stackDemo.operation();
	}

	private void operation() {
		System.out.println(
				"Do you want to insert data. press \n 1 to insert\n 0 to delete\n 2 to show data\n -1 to end \n 3 to show top value \n 4 size of stack \n 5 to check stack isEmpty \n 6 to show last value");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("Please enter value to insert.");
			int value = scan.nextInt();
			push(value);
			break;
		case 0:
			pop();
			break;
		case -1:
			System.exit(0);
			break;
		case 2:
			for (int i = 0; i <= top; i++) {
				System.out.println(stack[i]);
			}
			operation();
			break;
		case 3:
			peak();
			operation();
			break;
		case 4:

			operation();
			break;
		case 5:

			operation();
			break;
		case 6:

			operation();
			break;
		default:
			break;
		}
	}

	private void push(int val) {
		if(isFull()) {
			System.out.println("Overflow");
		}else {
			top=top+1;
			stack[top] = val;
		}
		operation();
	}

	private int peak() {
		operation();
		return stack[top];
	}

	private void pop() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}else {
			stack[top] = 0;
			top=top-1;
		}
		operation();
	}
	
	private boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean isFull() {
		if(top==stack.length-1) {
			return true;
		}else {
			return false;
		}
	}
}
