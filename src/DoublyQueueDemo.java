import java.util.Scanner;

public class DoublyQueueDemo {
	int doublyQueue[] = new int[5];
	int rear = 0, front = 0;
	int qSize = doublyQueue.length;
	Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyQueueDemo doublyQueueDemo = new DoublyQueueDemo();
		doublyQueueDemo.scan = new Scanner(System.in);
		doublyQueueDemo.operation();
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

	private void insertFromRear(int val) {
		if(isQueueFull()) {
			System.out.println("Overflow");
		}else {
			doublyQueue[rear] = val;
			rear++;
		}
		operation();
	}
	private void deleteFromRear() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}else {
			rear--;
			doublyQueue[rear]=0;
		}
		operation();
	}
	private void insertFromFront(int val) {
		if(isQueueFull()) {
			System.out.println("Overflow");
		}else {
			for(int i=rear;i>front;i--) {
				doublyQueue[i] = doublyQueue[i-1];
			}
			doublyQueue[front]=val;
			rear++;
		}
		operation();
	}
	private void deleteFromFront() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}else {
			doublyQueue[front] = 0;
			front=front+1;
		}
		operation();
	}
	private void operation() {
		System.out.println("Do you want to insert data. press \n 1 to insert\n 0 to delete\n 2 to show data\n -1 to end \n 3 to show top value \n 4 size of queue \n 5 to check queue isEmpty \n 6 to show last value \n 7 to insert from front \n 8 to delete from front ");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("Please enter value from rear to insert.");
			int value = scan.nextInt();
			insertFromRear(value);
			break;
		case 0:
			deleteFromRear();
			break;
		case -1:
			System.exit(0);
			break;
		case 2:
			for (int i = front; i < rear; i++) {
				System.out.println(doublyQueue[i]);
			}
			operation();
			break;
		case 3:
			if (isEmpty()) {
				System.out.println("Queue is empty");
			} else {
				System.out.println(doublyQueue[front]);
			}
			operation();
			break;
		case 4:
			System.out.println(rear - front);
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
				System.out.println(doublyQueue[rear]);
			}
			operation();
			break;
		case 7:
			System.out.println("Please enter value from front to insert.");
			int val = scan.nextInt();
			insertFromFront(val);
			break;
		case 8:
			deleteFromFront();
			break;
		default:
			break;
		}
	}
}
