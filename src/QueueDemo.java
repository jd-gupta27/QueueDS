import java.util.Scanner;

public class QueueDemo {
	int[] queue = new int[5];
	int front = 0, rear = 0;
	int qSize = queue.length;
	Scanner scan;

	public static void main(String[] args) {
		QueueDemo queueDemo = new QueueDemo();
		queueDemo.scan = new Scanner(System.in);
		queueDemo.operation();
	}

	private void enqueue(int value) {
		if (!isQueueFull()) {
			queue[rear] = value;
			rear = rear + 1;
		} else {
			System.out.println("Overflow");
		}
		operation();
	}

	private void dequeue() {
		if (isEmpty()) {
			System.out.println("Underflow");
		} else {
			queue[front] = 0;
			front = front + 1;
		}
		operation();
	}

	private boolean isQueueFull() {
		if (rear == qSize) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isEmpty() {
		if (rear == front) {
			return true;
		} else {
			return false;
		}
	}

	private void operation() {
		System.out.println(
				"Do you want to insert data. press \n 1 to insert\n 0 to delete\n 2 to show data\n -1 to end \n 3 to show top value \n 4 size of queue \n 5 to check queue isEmpty \6 to show last value");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("Please enter value to insert.");
			int value = scan.nextInt();
			enqueue(value);
			break;
		case 0:
			dequeue();
			break;
		case -1:
			System.exit(0);
			break;
		case 2:
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
			operation();
			break;
		case 3:
			if(isEmpty()) {
				System.out.println("Queue is empty");
			}else {
				System.out.println(queue[front]);
			}
			operation();
			break;
		case 4:
			System.out.println(rear-front);
			operation();
			break;
		case 5:
			if(isEmpty()) {
				System.out.println("Queue is empty");
			}else {
				System.out.println("Queue is not empty");
			}
			operation();
			break;
		case 6:
			if(isEmpty()) {
				System.out.println("Queue is empty");
			}else {
				System.out.println(queue[rear]);
			}
			operation();
			break;
		default:
			break;
		}
	}
}
