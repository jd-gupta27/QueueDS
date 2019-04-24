import java.util.Scanner;

public class CircularQueueDemo {
	int circularQueue[] = new int[6];
	int rear = 0, front = 0;
	int qSize = circularQueue.length;
	int count = 0;
	Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("git");

		System.out.println("today");

		CircularQueueDemo circularQueueDemo = new CircularQueueDemo();
		circularQueueDemo.scan = new Scanner(System.in);
		circularQueueDemo.operation();
	}

	private boolean isQueueFull() {
		if (count == qSize) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void insertFromRear(int val) {
		if (isQueueFull()) {
			System.out.println("Overflow");
		} else {
			circularQueue[rear] = val;
			rear = (rear + 1) % qSize;
			count++;
		}
		operation();
	}

	private void deleteFromFront() {
		if (count == 0) {
			System.out.println("Underflow");
		} else {
			circularQueue[front] = 0;
			front = (front + 1) % qSize;
			count--;
		}
		operation();
	}

	private void operation() {
		System.out.println(
				"Do you want to insert data. press \n 1 to insert\n 0 to delete\n 2 to show data\n -1 to end \n 3 to show top value \n 4 size of queue \n 5 to check queue isEmpty \n 6 to show last value \n 7 to insert from front \n 8 to delete from front ");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("Please enter value from rear to insert.");
			int value = scan.nextInt();
			insertFromRear(value);
			break;
		case 0:
			deleteFromFront();
			break;
		case -1:
			System.exit(0);
			break;
		case 2:
			if (isEmpty()) {
		        System.out.println("Queue is Empty!");
		    } else if (rear <= front) {
		        for (int i = front; i < count; i++) {
		            System.out.println(circularQueue[i]);
		        }
		        for (int i = 0; i < rear; i++) {
		            System.out.println(circularQueue[i]);
		        }
		    } else if (rear>front) {
		        for (int i = front; i != rear;) {
		            System.out.println(circularQueue[i]);
		            i = (i+1)%qSize;
		        }
		    }
			/*
			 * else if(rear<front) { for() }
			 */

			operation();
			break;
		case 3:
			if (isEmpty()) {
				System.out.println("Queue is empty");
			} else {
				System.out.println(circularQueue[front]);
			}
			operation();
			break;
		case 4:
			System.out.println(count);
			operation();
			break;
		case 5:
			if (isEmpty()) {
				System.out.println("Queue is empty");
			} else {
				System.out.println("Queue is not empty");
			}
			operation();
			break;
		case 6:
			if (isEmpty()) {
				System.out.println("Queue is empty");
			} else {
				System.out.println(circularQueue[rear]);
			}
			operation();
			break;
		default:
			break;
		}
	}
}
